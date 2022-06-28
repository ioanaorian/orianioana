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
    public partial class MedicProgram : Form
    {

        FormApp.ServiceReference2.WebService1SoapClient service =
            new FormApp.ServiceReference2.WebService1SoapClient();

        MedicInterface mainform = null;
        public string cnp;
        public MedicProgram(string cnp, Form callingForm)
        {
            InitializeComponent();
            this.cnp = cnp;
            mainform = callingForm as MedicInterface;
            populatedataGridView();
        }

       public void populatedataGridView()
        {
            string mLName = " ", mFName = " ", mcnp= this.cnp;
            service.dateMedic(mcnp, ref mLName, ref mFName);
            
            List<string> list = new List<string>();
            ArrayOfString array = new ArrayOfString();
            array.AddRange(list);
            service.listaPacientiProgramati(mLName, mFName, ref array);
            string[] data;
            string date;
           
            foreach(var el in array)
            {
                
                data = el.Split(' ');
                date = data[2] +" "+ data[3];
                dataGridView1.Rows.Add(data[0], data[1],date);
            }
        }


        private void dataGridView1_CellMouseDoubleClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            string pLname, pFName, mLname = " ", mFname = " ", descriere = " ";
            service.dateMedic(this.cnp, ref mLname, ref mFname);
            pLname = dataGridView1.Rows[e.RowIndex].Cells[0].Value.ToString();
            pFName = dataGridView1.Rows[e.RowIndex].Cells[1].Value.ToString();
            List<string> list = new List<string>();
            ArrayOfString array = new ArrayOfString();
            array.AddRange(list);
            service.antecedenteMedicale(pLname, pFName, ref array, mLname, mFname);
            //  var l = array.Take(array.Count - 1).ToList();
            service.problemaCurenta(pLname, pFName, mLname, mFname, ref descriere);
            listBox1.DataSource = array;
            textBox1.Text = descriere;


        }

        private void button2_Click(object sender, EventArgs e)
        {
            string numep = textBox2.Text;
            string prenumep = textBox3.Text;

            string descriere = richTextBox1.Text;
            string data = textBox4.Text;
            string pcnp = " ";
            string numem = " ", prenumem = " ";
            service.datePacient(numep, prenumep, ref pcnp);
            service.dateMedic(cnp, ref numem, ref prenumem);

            int opt;
            opt = service.fisaMedicala(pcnp, descriere, data, numem);
            if(opt == 0)
            {
                MessageBox.Show("S-au mai introdus date la aceasta programare!");
            }
            else if(opt == 1)
            {
                MessageBox.Show("Date introduse cu succes!");
            }
            else
            {
                MessageBox.Show("ERROR -1: Eroare de sistem!");
            }
        }
    }
}
