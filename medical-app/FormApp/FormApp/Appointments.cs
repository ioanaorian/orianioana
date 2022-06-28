using FormApp.ServiceReference2;
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
    public partial class Appointments : Form
    {
        FormApp.ServiceReference2.WebService1SoapClient service =
            new FormApp.ServiceReference2.WebService1SoapClient();
        private MedicInterface mainform = null;
        private string cnp;
        public Appointments(Form callingform, string cnp)
        {
            InitializeComponent();
            this.cnp = cnp;
            mainform = callingform as MedicInterface;
            this.cnp = mainform.cnp;
            med_btn.Visible = false;
            int ora1, ora2;

            for (int i = 0; i < 8; i++)
            {
                ora1 = 8 + i;
                ora2 = 9 + i;
                string ore = ora1.ToString() + ":" + ora2.ToString();
                dataGridView1.Rows.Add(ore, " ", " ", " ", " ", " ");
            }

            populateDataGridView();

        }
        public void populateDataGridView()
        {
           
            List<string> list = new List<string>();
            ArrayOfString array = new ArrayOfString();
            array.AddRange(list);
            service.dataProgramarii(ref array);
            string day, hour, data1;
            int positionCol = 0, positionRow = 0;
            foreach (var el in array)
            {
                string[] data = el.Split(' ');
                day = data[0];
                hour = data[1];
                for (int i = 1; i < 6; i++)
                {
                    if (dataGridView1.Columns[i].Name == day)
                    {
                        positionCol = i;
                    }
                }
                for (int i = 0; i < 8; i++)
                {
                    if (dataGridView1.Rows[i].Cells[0].Value.ToString() == hour)
                    {
                        positionRow = i;
                    }
                }
                string recuperata = dataGridView1.Rows[positionRow].Cells[positionCol].Value.ToString();
                data1 =recuperata+"\n"+ "dr. " + data[2] + " " + data[3] + "\nPacient: " + " " + data[4] + " " + data[5];
                dataGridView1.Rows[positionRow].Cells[positionCol].Value = data1;
                dataGridView1.Rows[positionRow].Cells[positionCol].Style.BackColor = changeColor();
            }

        }
        private void Appointments_Load(object sender, EventArgs e)
        {
            
        }

        private void spec_btn_Click(object sender, EventArgs e)
        {
            if (spec_groupBox.Visible == false)
            {

                List<string> list = new List<string>();
                ArrayOfString arrString = new ArrayOfString();
                arrString.AddRange(list);
                service.listSpecialization(ref arrString);

                listBox1.DataSource = arrString;
                med_btn.Visible = true;
                m_groupBox.Visible = false;
                spec_groupBox.Visible = true;

            }
            else if (spec_groupBox.Visible == true)
                spec_groupBox.Visible = false;
        }

        private void med_btn_Click(object sender, EventArgs e)
        {
            if (m_groupBox.Visible == false)
            {
                List<string> list = new List<string>();
                ArrayOfString arrString = new ArrayOfString();
                arrString.AddRange(list);
                string spec = listBox1.SelectedItem.ToString();
                service.DoctorsfromSpecialization(spec, ref arrString);

                m_list.DataSource = arrString;

                spec_groupBox.Visible = false;
                m_groupBox.Visible = true;

            }
            else if (m_groupBox.Visible == true)
               m_groupBox.Visible = false;
        }

        private void prog_btn_Click(object sender, EventArgs e)
        {
            string descriere, data, m_lName, m_fName, p_Lname=" ", p_fName= " ", pCnp= this.cnp;
            descriere = desc_txtBox.Text;
            data = date_txtBox.Text;
            service.listPacienti(pCnp, ref p_fName, ref p_Lname);
            string []numeMedic = m_list.SelectedItem.ToString().Split(' ');
            m_lName = numeMedic[0];
            m_fName = numeMedic[1];
            int opt;
            opt = service.programari(pCnp, p_Lname, p_fName, descriere, data, m_fName, m_lName);
            if (opt == 1)
            {
                MessageBox.Show("Programarea a fost realizata cu succes!");
                populateDataGridView();
            }
            else if(opt == 0)
            {
                MessageBox.Show("Doctorul " + m_lName + " " + m_fName + " este ocupat la data aleasa!");
            }
            else
            {
                MessageBox.Show("ERROR -1: Nu se poate realiza programarea! Au aparut probleme de sistem.");
            }
        }

        private void Appointments_FormClosing(object sender, FormClosingEventArgs e)
        {
            Properties.Settings.Default.Save();
        }
        private Color changeColor()
        {
            Random r = new Random();
            int R, G, B;
            R = r.Next(0, 255);
            G = r.Next(0, 255);
            B = r.Next(0, 255);
            Color myRGB = new Color();
            myRGB = Color.FromArgb(R, G, B);

            return myRGB;
        }

    }
}
