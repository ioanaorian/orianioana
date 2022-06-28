using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormApp
{
    public partial class Form1 : Form
    {
        FormApp.ServiceReference2.WebService1SoapClient service = new FormApp.ServiceReference2.WebService1SoapClient();

       
        public Form1()
        {
            InitializeComponent();
        }

        public String GetUsername()
        {
            return txtUsername.Text;
        }

        private void signUp_btn_Click(object sender, EventArgs e)
        {
            //submit registration button

            //datamedic:
            string username = txt_username.Text.ToString();
            string password = txt_password.Text.ToString();
            string cnp = txt_CNP.Text.ToString();
            string email = txt_email.Text.ToString();

            //MedicDetails:
            //cnp as foreign key
            string lastname = txt_nume.Text.ToString();
            string firstname = txt_prenume.Text.ToString();
            string address = txt_address.Text.ToString();
            string dateofbirth = txt_data.Text.ToString();
            string specializare = sp_txt.Text.ToString();

            if (username == "" || password=="" || cnp=="")
            {
                MessageBox.Show("Va rugam sa completati toate campurile obligatorii!");
            }
            else
            {
                if (m_radioBtn.Checked == false && p_radioBtn.Checked == false)
                {
                    MessageBox.Show("Va rugam alegeti o optiune: PACIENT/MEDIC!");
                    groupbox_register.Visible = false;
                    groupbox_login.Visible = true;
                }
                else if (m_radioBtn.Checked == true)
                {
                    int opt = service.registerMedic(username, password, cnp, email, lastname, firstname, address, dateofbirth, specializare);
                    if (opt == 1)
                    {
                        MessageBox.Show("Contul a fost creat. Bine ati venit!");
                        MedicInterface medicInf = new MedicInterface(username, this, cnp);

                        medicInf.Show();
                        this.Visible = false;

                    }
                    else if (opt == -1) MessageBox.Show("Error code: -1. Could not insert to DataMedics");
                    else if (opt == -2) MessageBox.Show("Error code: -2. Could not insert to MedicDetail");
                    else
                    {
                        MessageBox.Show("Acest CNP exista deja in baza de date. Va rugam sa va autentificati");
                        groupbox_register.Visible = false;
                        groupbox_login.Visible = true;
                    }
                }
                else if (p_radioBtn.Checked == true)
                {
                    int opt_p = service.registerPacient(username, password, cnp, email, lastname, firstname, dateofbirth, address);
                    if (opt_p == 1)
                    {
                        MessageBox.Show("Contul a fost creat. Bine ati venit!");
                        MedicInterface medicInf = new MedicInterface(username, this, cnp);

                        medicInf.Show();
                        this.Visible = false;
                    }
                    else if (opt_p == -1) MessageBox.Show("Error code: -1. Could not insert to Pacienti.");
                    else if (opt_p == -2) MessageBox.Show("Error code: -2. Could not insert to PacientDetail.");
                    else
                    {
                        MessageBox.Show("Acest CNP exista deja in baza de date. Va rugam sa va autentificati!");
                        groupbox_register.Visible = false;
                        groupbox_login.Visible = true;
                    }
                }
            }
        } 

        private void button2_Click(object sender, EventArgs e)
        {
            //register button from login group
            groupbox_login.Visible = false;//hide the login window => flawless swap between the interfaces
            groupbox_register.Visible = true; //make sure to show the registration window
            if (p_radioBtn.Checked == true)
            {
                sp_txt.Visible = false;
                sp_label.Visible = false;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //login button from login group
            string iusername, ipassword, icnp;
            iusername = txtUsername.Text.ToString();
            ipassword = txtPassword.Text.ToString(); //preluam datele de la fereastra Login
            icnp = cnp_log.Text.ToString();

            if (iusername == "" || ipassword == "" || icnp == "")
            {
                MessageBox.Show("Va rugam completati toate campurile");
            }
            else
            {
                if (m_radioBtn.Checked == false && p_radioBtn.Checked == false)
                {
                    MessageBox.Show("Va rugam sa alegeti o optiune: PACIENT/MEDIC!");
                }
                else if (m_radioBtn.Checked == true)
                {
                    int opt = service.loginMedic(iusername, ipassword, icnp);
                    if (opt == -1)
                    {
                        MessageBox.Show("Acest CNP nu exista in baza de date.");
                    }
                    else
                    {
                        if (opt == -2) MessageBox.Show("Nume de utilizator si CNP existente, dar parola e gresita.");
                        else if (opt == 1)
                        {
                            //MessageBox.Show("Bine ati venit!");
                            MedicInterface medicInf = new MedicInterface(iusername, this, icnp);

                            medicInf.Show();
                            this.Visible = false;

                        }
                        else
                        {
                            MessageBox.Show("Nume de utilizator gresit!");
                        }
                    }//else


                }
                else if (p_radioBtn.Checked == true)
                {
                    int opt_p = service.logInPacient(iusername, ipassword, icnp);
                    if (opt_p == -1)
                    {
                        MessageBox.Show("Acest CNP nu exista in baza de date.");
                    }
                    else
                    {
                        if (opt_p == -2) MessageBox.Show("Nume de utilizator si CNP existente, dar parola e gresita.");
                        else if (opt_p == 1)
                        {
                            //MessageBox.Show("Bine ati venit!");
                            MedicInterface medicInf = new MedicInterface(iusername, this, icnp);

                            medicInf.Show();
                            this.Visible = false;

                        }
                        else
                        {
                            MessageBox.Show("Nume de utilizator gresit!");
                        }
                    }

                }
                txtUsername.Text = ""; txtPassword.Text = ""; cnp_log.Text = "";

            }
        }

       
    }
}
