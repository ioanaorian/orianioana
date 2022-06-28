using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;
using System.Web.Services;

namespace WebService
{

    /// <summary>
    /// Summary description for WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]

    public class WebService1 : System.Web.Services.WebService
    {


        [WebMethod]
        public int loginMedic(string iusername, string ipassword, string icnp)
        {
            datamedic medic = new datamedic();

            using (MedicDBEntities3 db = new MedicDBEntities3())
            {
                medic = db.datamedics.Where(x => x.cnp == icnp).FirstOrDefault();
                if (medic == null) return -1;//medic==null => utilizatorul nu exista in baza de date;
                else
                {
                    if ( medic.username == iusername) 
                    {
                        if (medic.password == ipassword)
                            return 1;    //medicul exista si parola e buna => access granted;
                        else return -2;  //parola gresita 
                    }
                }
                return 0;//medicul exista, dar parola si username sunt gresite

            }
        }//loginMedic


        [WebMethod]
        public int registerMedic(string username, string password, string cnp, string email, string lastname, string firstname, string address, string dateofbirth, string specializare)
        {
            datamedic medic1 = new datamedic();
            datamedic m1 = new datamedic();//m1 se foloseste pentru cautare in baza de date
                                           //daca medicul nu exista in baza de date, atunci am fi avut un null pointer in medic
                                           //si intr-un null pointer nu se pot insera date (throws NullPointerException)

            MedicDetail detail = new MedicDetail();
            detail.lastname = lastname;
            detail.firstname = firstname;
            detail.address = address;
            detail.dateofbirth = dateofbirth;
            detail.cnp = cnp;
            detail.specializare = specializare;

            using (MedicDBEntities3 db = new MedicDBEntities3())
            {
                m1 = db.datamedics.Where(x => x.cnp == cnp).FirstOrDefault();
                if (m1 != null) return 0;//it means that the given CNP already exists, registration is not possible
                //otherwise we create the medic object and insert it into the datamedic tabel
                medic1.username = username;
                medic1.password = password;
                medic1.cnp = cnp;
                medic1.email = email;
                try
                {
                    db.datamedics.Add(medic1);
                    db.SaveChanges();
                }

                catch
                {
                    return -1;
                }

                try
                {
                    db.MedicDetails.Add(detail);
                    db.SaveChanges();
                }
                catch
                {
                    return -2;
                }

                return 1;

            }//using
        }//registerMedic

        [WebMethod]
        public void getMedicData(ref string username, ref string password, string cnp, ref string email, ref string lastname, ref string firstname, ref string address, ref string dateofbirth, ref string specializare)
        {
            datamedic medic = new datamedic();
            MedicDetail detail = new MedicDetail();
            using (MedicDBEntities3 db = new MedicDBEntities3())
            {
                medic = db.datamedics.Where(x => x.cnp == cnp).FirstOrDefault();
                password = medic.password;
                cnp = medic.cnp;
                email = medic.email;
                //search in datamedics by cnp
                detail = db.MedicDetails.Where(x => x.cnp == medic.cnp).FirstOrDefault();
                lastname = detail.lastname;
                firstname = detail.firstname;
                address = detail.address;
                dateofbirth = detail.dateofbirth;
                specializare = detail.specializare;
                //search in medicdetails based on cnp
            }
        }


        [WebMethod]
        public int changeMedicData(string username, string password, string cnp, string email, string lastname, string firstname, string address, string dateofbirth, string specializare)
        {
            datamedic medic = new datamedic();
            MedicDetail detail = new MedicDetail();

            using (MedicDBEntities3 db = new MedicDBEntities3())
            {
                try
                {
                    medic = db.datamedics.Where(x => x.cnp == cnp).FirstOrDefault();

                    medic.password = password;
                    //changing cnp is prohibited, because this is key information (for identifying)
                    medic.email = email;
                    medic.username = username;

                    db.Entry(medic).State = System.Data.Entity.EntityState.Modified;
                    db.SaveChanges();

                    detail = db.MedicDetails.Where(x => x.cnp == medic.cnp).FirstOrDefault();
                    detail.lastname = lastname;
                    detail.firstname = firstname;
                    detail.address = address;
                    detail.dateofbirth = dateofbirth;
                    detail.specializare = specializare;
                    db.Entry(detail).State = System.Data.Entity.EntityState.Modified;
                    db.SaveChanges();
                }
                catch
                {
                    return -1;
                }
                return 1;


            }//using
        }//changeMedicData()

        [WebMethod]
        public int deleteMedicAccount(string username,string cnp)
        {
            datamedic medic = new datamedic();
            MedicDetail detail = new MedicDetail();

            try
            {
                using (MedicDBEntities3 db = new MedicDBEntities3())
                {
                    medic = db.datamedics.Where(x => x.username == username).FirstOrDefault();
                    if (medic.cnp != cnp) return -1;
                    
                    detail = db.MedicDetails.Where(x => x.cnp == medic.cnp).FirstOrDefault();
                    var entry = db.Entry(detail);
                    if (entry.State == System.Data.Entity.EntityState.Detached)
                        db.MedicDetails.Attach(detail);
                    db.MedicDetails.Remove(detail);
                    db.SaveChanges();

                    var entry1 = db.Entry(medic);
                    if (entry1.State == System.Data.Entity.EntityState.Detached)
                        db.datamedics.Attach(medic);
                    db.datamedics.Remove(medic);
                    db.SaveChanges();

                }//using
            }//try
            catch
            {
                return -2;
            }//catch
            return 1;

        }//function

        [WebMethod]

        public int logInPacient(string pUser, string pPass, string pCNP)
        {
            Pacienti p = new Pacienti();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                p = md.Pacientis.Where(x => x.pacient_cnp == pCNP).FirstOrDefault();

                if (p == null) return -1; //pacientul nu e in baza de date
                else
                {
                   if (p.username == pUser)
                    {
                        if (p.password == pPass)
                            return 1; //se logheaza pacientul
                        else
                            return -2;  //parola gresita
                    }
                    
                }
                return 0; //username si parola gresite
            }
        }  //logInPacient

        [WebMethod]

        public int registerPacient(string pUser, string pPass, string pCNP, string pEmail, string pLName, string pFName, string pBirth, string pAddress)
        {
            Pacienti p = new Pacienti();
            Pacienti p1 = new Pacienti();  //variabila temporara de cautare

            PacientDetail detail = new PacientDetail();

            detail.address = pAddress;
            detail.dateofbirth = pBirth;
            detail.firstname = pFName;
            detail.lastname = pLName;
            detail.pacient_cnp = pCNP;


            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                p1 = md.Pacientis.Where(x => x.pacient_cnp == pCNP).FirstOrDefault();
                
                if(p1 != null)  //cnp exista deja
                {
                    return 0;
                }
                else
                {
                    p.username = pUser;
                    p.password = pPass;
                    p.email = pEmail;
                    p.pacient_cnp = pCNP;
                    try
                    {
                        md.Pacientis.Add(p);
                        md.SaveChanges();

                    }
                    catch
                    {
                        return -1;
                    }
                    try
                    {
                        md.PacientDetails.Add(detail);
                        md.SaveChanges();
                    }
                    catch
                    {
                        return -2;
                    }
                }
                return 1;
            }
        }

        [WebMethod]

        public void getPacientDetails(ref string pUser, ref string pPass, string pCNP, ref string pEmail, ref string pLName, ref string pFName, ref string pBirth,ref string pAddress)
        {
            PacientDetail detail = new PacientDetail();
            Pacienti pacient = new Pacienti();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                //cautare date de login in tabelul pacienti
                pacient = md.Pacientis.Where(x => x.pacient_cnp == pCNP).FirstOrDefault();
              
                pUser = pacient.username;
                pPass = pacient.password;
                pCNP = pacient.pacient_cnp;
                pEmail = pacient.email;

                //cautare date personale in tabelul pacientDetail

                detail = md.PacientDetails.Where(x => x.pacient_cnp == pacient.pacient_cnp).FirstOrDefault();
                pAddress = detail.address;
                pLName = detail.lastname;
                pFName = detail.firstname;
                pBirth = detail.dateofbirth;


            }
        }

        [WebMethod]
        public int updatePacientData(string pUser, string pPass, string pCNP, string pEmail, string pLName, string pFName, string pBirth, string pAddress)
        {
            Pacienti pacient = new Pacienti();
            PacientDetail detail = new PacientDetail();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                try
                {

                    pacient = md.Pacientis.Where(x => x.pacient_cnp == pCNP).FirstOrDefault();

                    pacient.username = pUser;
                    pacient.password = pPass;
                    pacient.email = pEmail;

                    //nu vom schimba cnp-ul pentru ca este o informatia esentiala pt cautare

                    md.Entry(pacient).State = System.Data.Entity.EntityState.Modified;
                    md.SaveChanges();

                    detail = md.PacientDetails.Where(x => x.pacient_cnp == pacient.pacient_cnp).FirstOrDefault();
                    detail.lastname = pLName;
                    detail.firstname = pFName;
                    detail.address = pAddress;
                    detail.dateofbirth = pBirth;

                    md.Entry(detail).State = System.Data.Entity.EntityState.Modified;
                    md.SaveChanges();

                }
                catch
                {
                    return -1;
                }
                return 1;
            }
        }

        [WebMethod]

        public int deletePacient(string pUser, string pCNP)
        {
            Pacienti pacient = new Pacienti();
            PacientDetail detail = new PacientDetail();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                try
                {
                    pacient = md.Pacientis.Where(x => x.username == pUser).FirstOrDefault();

                    if (pacient.pacient_cnp != pCNP) return -1;
                    detail = md.PacientDetails.Where(x => x.pacient_cnp == pacient.pacient_cnp).FirstOrDefault();
                    var entry = md.Entry(detail);
                    if (entry.State == System.Data.Entity.EntityState.Detached)
                        md.PacientDetails.Attach(detail);
                    md.PacientDetails.Remove(detail);
                    md.SaveChanges();

                    var entry1 = md.Entry(pacient);
                    if (entry1.State == System.Data.Entity.EntityState.Detached)
                        md.Pacientis.Attach(pacient);
                    md.Pacientis.Remove(pacient);
                    md.SaveChanges();
                }
                catch
                {
                    return -2;
                }
                return 1;
            }
        }

        [WebMethod]
        public int programari(string pCNP, string pLName, string pFName, string descriere, string date, string mFName, string mLName)
        {
            Programare programare = new Programare();
            PacientDetail p_detail = new PacientDetail();
            MedicDetail m_detail = new MedicDetail();
            Programare p1 = new Programare();


            using (MedicDBEntities3 md = new MedicDBEntities3())
            {

                try
                {
                    p_detail = md.PacientDetails.Where(x => x.pacient_cnp == pCNP).FirstOrDefault();
                    m_detail = md.MedicDetails.Where(x => x.lastname == mLName && x.firstname == mFName).FirstOrDefault();

                    programare = md.Programares.Where(x => x.data == date &&  x.m_lastname == m_detail.lastname && x.m_firstname == m_detail.firstname).FirstOrDefault();
                    
                    if (programare != null)
                        return 0; //exista o programare 
                    else
                    {
                        p1.pacient_cnp = pCNP;
                        p1.p_lastname = pLName;
                        p1.p_firstname = pFName;
                        p1.descriere = descriere;
                        p1.data = date;
                        p1.m_firstname = mFName;
                        p1.m_lastname = mLName;

                        md.Programares.Add(p1);
                        md.SaveChanges();
                    }

                }
                catch
                {
                    return -1;
                }
                return 1;
            }
            
        }
        [WebMethod]

        public void DoctorsfromSpecialization(string specializare, ref List<string> list)
        {
            MedicDetail detail = new MedicDetail();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                List<MedicDetail> mList = new List<MedicDetail>();

                mList = md.MedicDetails.Where(x => x.specializare == specializare).ToList();

                foreach(var det in mList)
                {
                    list.Add(det.lastname +" " + det.firstname);
                }
            }
            
        }

        [WebMethod]

        public void listSpecialization(ref List<string> list)
        {
           

            using (MedicDBEntities3 md = new MedicDBEntities3())
            {
                List<MedicDetail> mList = new List<MedicDetail>();

                mList = md.MedicDetails.ToList();

               
                foreach (var det in mList)
                {
                    list.Add( det.specializare);
                    
                }
            }
           
        }

        [WebMethod]

        public void dataProgramarii( ref List<string> list )
        {
            Programare prog = new Programare();
            List<Programare> plist = new List<Programare>();
            using (MedicDBEntities3 md = new MedicDBEntities3())
            {
                plist = md.Programares.ToList();

                foreach(var det in plist)
                {
                    list.Add(det.data+" " + det.m_lastname +" " +det.m_firstname +" "+ det.p_lastname+" "+det.p_firstname);
                }

            }
        }

        [WebMethod]

        public void listPacienti( string pCnp, ref string pFName, ref string pLName )
        {
            PacientDetail pacient = new PacientDetail();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                pacient = md.PacientDetails.Where(x => x.pacient_cnp == pCnp).FirstOrDefault();

               pFName = pacient.firstname;
               pLName = pacient.lastname;
                
            }
        }

        [WebMethod]

        public void listaPacientiProgramati(string mLNume, string mFNume, ref List<string> list)
        {
            
            List<Programare> pList = new List<Programare>();
            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                pList = md.Programares.Where(x => x.m_firstname == mFNume && x.m_lastname == mLNume).ToList();

                foreach(var el in pList)
                {
                    list.Add(el.p_lastname + " " + el.p_firstname + " " + el.data);
                }
            }
        }

        [WebMethod]
        public void dateMedic(string mCNP, ref string mLName, ref string mFName)
        {
            MedicDetail medic = new MedicDetail();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                medic = md.MedicDetails.Where(x => x.cnp == mCNP).FirstOrDefault();
                mLName = medic.lastname;
                mFName = medic.firstname;
            }
        }

        [WebMethod]

        public void antecedenteMedicale(string pLname, string pFname, ref List<string> list, string mLname, string mFname)
        {
            List<Programare> pList = new List<Programare>();
            using (MedicDBEntities3 md = new MedicDBEntities3())
            {
                pList = md.Programares.Where(x => x.p_firstname == pFname && x.p_lastname == pLname && x.m_firstname != mFname && x.m_lastname != mLname).ToList();

                foreach (var el in pList)
                {
                    list.Add(el.descriere);
                }
            }
        }


        [WebMethod]

        public int fisaMedicala(string pCNP, string descriere, string data, string numeD)
        {
            FisaMedicala fs = new FisaMedicala();
            FisaMedicala fs1 = new FisaMedicala();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
               
                try
                {
                    fs1 = md.FisaMedicalas.Where(x => x.data == data && x.nume_doctor == numeD).FirstOrDefault();
                    if (fs1 != null)
                        return 0;
                    fs.pacient_cnp = pCNP;
                    fs.descriere = descriere;
                    fs.nume_doctor = numeD;
                    fs.data = data;

                    md.FisaMedicalas.Add(fs);
                    md.SaveChanges();
                }
                catch
                {
                    return -1;
                }
                return 1;
            }
        }

        [WebMethod]

        public void datePacient(string lastname, string firstname, ref string cnp)
        {
            PacientDetail pacient = new PacientDetail();

            using(MedicDBEntities3 md = new MedicDBEntities3())
            {
                pacient = md.PacientDetails.Where(x => x.firstname == firstname && x.lastname == lastname).FirstOrDefault();
                cnp = pacient.pacient_cnp;
            }
        }

        [WebMethod]
        public void problemaCurenta(string pLname, string pFname, string mLname, string mFname, ref string descriere)
        {
            Programare prog = new Programare();
            using (MedicDBEntities3 md = new MedicDBEntities3())
            {
                prog = md.Programares.Where(x => x.p_firstname == pFname && x.p_lastname == pLname && x.m_firstname == mFname && x.m_lastname == mLname).FirstOrDefault();
                descriere = prog.descriere;
            }
        }

    }
}
