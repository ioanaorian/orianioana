using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormApp
{
   


    public partial class MedicInterface : Form

    {
        FormApp.ServiceReference2.WebService1SoapClient service =
            new FormApp.ServiceReference2.WebService1SoapClient();

        public string username;
        public string cnp;

        private Form1 mainForm = null;
        public MedicInterface(string username, Form callingForm, string cnp)
        {
            InitializeComponent();
            this.username = username;
            this.cnp = cnp;

            mainForm = callingForm as Form1;      //accesam elemente din Form1, 
                                                  //dupa ce le-am modificat vizibilitatea in public
            if (mainForm.m_radioBtn.Checked == true)
            {
                label1.Text = "Welcome, dr. " + username.ToString() + "!";
                button7.Visible = false;
            }
            else if(mainForm.p_radioBtn.Checked == true)
            {
                label1.Text = "Welcome, " + username.ToString() + "!";
                spec_lab.Visible = false;
                spec_txtBox.Visible = false;
                button8.Visible = false;
            }

            groupbox_personal_medic.Visible = false;
        }

        private void MedicInterface_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'medicDBDataSet1.MedicDetail' table. You can move, or remove it, as needed.
            this.medicDetailTableAdapter.Fill(this.medicDBDataSet1.MedicDetail);
            // TODO: This line of code loads data into the 'medicDBDataSet.PacientDetail' table. You can move, or remove it, as needed.
            this.pacientDetailTableAdapter.Fill(this.medicDBDataSet.PacientDetail);



        }

        private void personaldata_Btn_Click(object sender, EventArgs e)
        {   
           
            if(groupbox_personal_medic.Visible == false)
                groupbox_personal_medic.Visible = true;
            else if(groupbox_personal_medic.Visible==true)
                groupbox_personal_medic.Visible = false;
            string username=this.username, password="", cnp=this.cnp, email="";
            string lastname="", firstname="", address="", dateofbirth="", specializare = "";

            if (mainForm.m_radioBtn.Checked == true)
            {
                service.getMedicData(ref username, ref password, this.cnp, ref email, ref lastname, ref firstname, ref address, ref dateofbirth, ref specializare);
                txt_username.Text = username;
                txt_password.Text = password;
                txt_email.Text = email;
                txt_CNP.Text = cnp;

                txt_nume.Text = lastname;
                txt_prenume.Text = firstname;
                txt_address.Text = address;
                txt_data.Text = dateofbirth;
                spec_txtBox.Text = specializare;
            }
            else
            {
                service.getPacientDetails(ref username, ref password, this.cnp, ref email, ref lastname, ref firstname, ref dateofbirth, ref address);
                txt_username.Text = username;
                txt_password.Text = password;
                txt_email.Text = email;
                txt_CNP.Text = cnp;

                txt_nume.Text = lastname;
                txt_prenume.Text = firstname;
                txt_address.Text = address;
                txt_data.Text = dateofbirth;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            groupbox_personal_medic.Visible = false;//date personale
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (pacient_dataGridView.Visible == false)
            {
                pacient_dataGridView.Visible = true;
                medic_dataGridView.Visible = false;
            }
            else if (pacient_dataGridView.Visible == true)
                pacient_dataGridView.Visible = false;
                

        }

  

        private void signUp_btn_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Va rugam introduceti datele noi!");

            button3.Visible = true;
            update_Btn.Visible = false;
            txt_password.ReadOnly = false;
            txt_email.ReadOnly = false;
            txt_nume.ReadOnly = false;
            txt_prenume.ReadOnly = false;
            txt_address.ReadOnly = false;
            txt_data.ReadOnly = false;

        }

        private void button3_Click(object sender, EventArgs e)
        {
            button3.Visible = false;
            update_Btn.Visible = true;

            
            string username = txt_username.Text.ToString();
            string password = txt_password.Text.ToString();
            string cnp = txt_CNP.Text.ToString();
            string email = txt_email.Text.ToString();

            string lastname = txt_nume.Text.ToString();
            string firstname = txt_prenume.Text.ToString();
            string address = txt_address.Text.ToString();
            string dateofbirth = txt_data.Text.ToString();
            string specializare = spec_txtBox.Text.ToString();

            if (mainForm.m_radioBtn.Checked == true)
            {
                int opt = service.changeMedicData(this.username, password, cnp, email, lastname, firstname, address, dateofbirth, specializare);
                if (opt == -1)
                {
                    MessageBox.Show("A aparut o problema la actualizare.");
                }
                else
                {
                    MessageBox.Show("Actualizare reusita.");
                    this.medicDetailTableAdapter.Fill(this.medicDBDataSet1.MedicDetail);
                

                }//else
                
            }
            else if(mainForm.p_radioBtn.Checked == true)
            {
                int opt_p = service.updatePacientData(username, password, cnp, email, lastname, firstname, dateofbirth, address);
                if (opt_p == -1)
                {
                    MessageBox.Show("A aparut o problema la actualizare.");
                }
                else
                {
                    MessageBox.Show("Actualizare reusita.");
                    this.pacientDetailTableAdapter.Fill(this.medicDBDataSet.PacientDetail);
                }//else
            }

            txt_password.ReadOnly = true;
            txt_email.ReadOnly = true;
            txt_nume.ReadOnly = true;
            txt_prenume.ReadOnly = true;
            txt_address.ReadOnly = true;
            txt_data.ReadOnly = true;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult = MessageBox.Show("Sunteti sigur ca doriti sa iesiti din program?", "Atentie", MessageBoxButtons.YesNo);
            if (dialogResult == DialogResult.Yes)
            {
                Form1 loginWindow = new Form1();
                this.Close();
            }
            else if (dialogResult == DialogResult.No)
            {
                //do something else
            }
           
            
            

        }

        private void button5_Click(object sender, EventArgs e)
        {
            int opt = 0;
            string username = "", password = "", cnp = this.cnp, email = "";
            string lastname = "", firstname = "", address = "", dateofbirth = "", specializare = "";

            if (mainForm.m_radioBtn.Checked == true)
                service.getMedicData(ref username, ref password, this.cnp, ref email, ref lastname, ref firstname, ref address, ref dateofbirth, ref specializare);
            else if (mainForm.p_radioBtn.Checked == true)
                service.getPacientDetails(ref username, ref password, this.cnp, ref email, ref lastname, ref firstname, ref dateofbirth, ref address);
            
            txt_username.Text = username;
            txt_password.Text = password;
            txt_email.Text = email;
            txt_CNP.Text = cnp;

            txt_nume.Text = lastname;
            txt_prenume.Text = firstname;
            txt_address.Text = address;
            txt_data.Text = dateofbirth;
            DialogResult dialogResult = MessageBox.Show("Sunteti sigur ca doriti sa stergeti acest utilizator?", "Atentie", MessageBoxButtons.YesNo);
            if (dialogResult == DialogResult.Yes)
            {
                if (mainForm.m_radioBtn.Checked == true)
                {
                    opt = service.deleteMedicAccount(this.username, this.cnp);
                  
                    this.medicDetailTableAdapter.Fill(this.medicDBDataSet1.MedicDetail);
                }
                else if (mainForm.p_radioBtn.Checked == true)
                {
                    opt = service.deletePacient(this.username, this.cnp);
                   this.pacientDetailTableAdapter.Fill(this.medicDBDataSet.PacientDetail);
                }

                if (opt == -1 || opt == -2)
                    MessageBox.Show("Problema la stergerea utilizatorului");
                else
                {
                    MessageBox.Show("Stergerea a avut loc cu succes!");

                    Form1 form = new Form1();
                    form.Show();
                    this.Close();
                }
            }
            else if (dialogResult == DialogResult.No)
            {
                //do something else
            }
            
            
        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (medic_dataGridView.Visible == false)
            {
                medic_dataGridView.Visible = true;
                pacient_dataGridView.Visible = false;
                medic_dataGridView.DataSource = this.medicDBDataSet1.Tables[0];
            }

            else if (medic_dataGridView.Visible == true)
            {
                medic_dataGridView.Visible = false;
                
            }
            

        }

        private void button7_Click(object sender, EventArgs e)
        {
            if(mainForm.p_radioBtn.Checked == true)
            {
                Appointments app = new Appointments(this, cnp);
                app.Show();
            }
            
        }

        private void button8_Click(object sender, EventArgs e)
        {
            if (mainForm.m_radioBtn.Checked == true)
            {
                MedicProgram app1 = new MedicProgram(cnp, this);
                app1.Show();
            }
        }

    }
}
