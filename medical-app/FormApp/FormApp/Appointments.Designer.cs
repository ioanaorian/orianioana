namespace FormApp
{
    partial class Appointments
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.ora = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Luni = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Marti = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Miercuri = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Joi = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Vineri = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.desc_txtBox = new System.Windows.Forms.TextBox();
            this.date_txtBox = new System.Windows.Forms.TextBox();
            this.prog_btn = new System.Windows.Forms.Button();
            this.monthCalendar1 = new System.Windows.Forms.MonthCalendar();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.programareBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.spec_btn = new System.Windows.Forms.Button();
            this.med_btn = new System.Windows.Forms.Button();
            this.listBox1 = new System.Windows.Forms.ListBox();
            this.spec_groupBox = new System.Windows.Forms.GroupBox();
            this.m_list = new System.Windows.Forms.ListBox();
            this.m_groupBox = new System.Windows.Forms.GroupBox();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.programareBindingSource)).BeginInit();
            this.spec_groupBox.SuspendLayout();
            this.m_groupBox.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.DodgerBlue;
            this.label1.Location = new System.Drawing.Point(954, 485);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(80, 19);
            this.label1.TabIndex = 11;
            this.label1.Text = "Simptome:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.DodgerBlue;
            this.label2.Location = new System.Drawing.Point(917, 525);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(143, 19);
            this.label2.TabIndex = 12;
            this.label2.Text = "Data(Ziua hh1:hh2):";
            // 
            // dataGridView1
            // 
            this.dataGridView1.AllowUserToAddRows = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ora,
            this.Luni,
            this.Marti,
            this.Miercuri,
            this.Joi,
            this.Vineri});
            this.dataGridView1.Location = new System.Drawing.Point(11, 31);
            this.dataGridView1.Margin = new System.Windows.Forms.Padding(2);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 51;
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(803, 216);
            this.dataGridView1.TabIndex = 15;
            // 
            // ora
            // 
            this.ora.HeaderText = "ora";
            this.ora.MinimumWidth = 6;
            this.ora.Name = "ora";
            this.ora.Width = 125;
            // 
            // Luni
            // 
            this.Luni.HeaderText = "Luni";
            this.Luni.MinimumWidth = 6;
            this.Luni.Name = "Luni";
            this.Luni.Width = 125;
            // 
            // Marti
            // 
            this.Marti.HeaderText = "Marti";
            this.Marti.MinimumWidth = 6;
            this.Marti.Name = "Marti";
            this.Marti.Width = 125;
            // 
            // Miercuri
            // 
            this.Miercuri.HeaderText = "Miercuri";
            this.Miercuri.MinimumWidth = 6;
            this.Miercuri.Name = "Miercuri";
            this.Miercuri.Width = 125;
            // 
            // Joi
            // 
            this.Joi.HeaderText = "Joi";
            this.Joi.MinimumWidth = 6;
            this.Joi.Name = "Joi";
            this.Joi.Width = 125;
            // 
            // Vineri
            // 
            this.Vineri.HeaderText = "Vineri";
            this.Vineri.MinimumWidth = 6;
            this.Vineri.Name = "Vineri";
            this.Vineri.Width = 125;
            // 
            // desc_txtBox
            // 
            this.desc_txtBox.Location = new System.Drawing.Point(1067, 484);
            this.desc_txtBox.Name = "desc_txtBox";
            this.desc_txtBox.Size = new System.Drawing.Size(148, 20);
            this.desc_txtBox.TabIndex = 8;
            // 
            // date_txtBox
            // 
            this.date_txtBox.Location = new System.Drawing.Point(1066, 526);
            this.date_txtBox.Name = "date_txtBox";
            this.date_txtBox.Size = new System.Drawing.Size(148, 20);
            this.date_txtBox.TabIndex = 9;
            // 
            // prog_btn
            // 
            this.prog_btn.BackColor = System.Drawing.Color.Firebrick;
            this.prog_btn.Font = new System.Drawing.Font("Times New Roman", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.prog_btn.ForeColor = System.Drawing.Color.White;
            this.prog_btn.Location = new System.Drawing.Point(958, 579);
            this.prog_btn.Name = "prog_btn";
            this.prog_btn.Size = new System.Drawing.Size(180, 45);
            this.prog_btn.TabIndex = 14;
            this.prog_btn.Text = "Programare";
            this.prog_btn.UseVisualStyleBackColor = false;
            this.prog_btn.Click += new System.EventHandler(this.prog_btn_Click);
            // 
            // monthCalendar1
            // 
            this.monthCalendar1.Location = new System.Drawing.Point(954, 292);
            this.monthCalendar1.Margin = new System.Windows.Forms.Padding(7);
            this.monthCalendar1.Name = "monthCalendar1";
            this.monthCalendar1.TabIndex = 16;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::FormApp.Properties.Resources.rsz_30239367;
            this.pictureBox2.Location = new System.Drawing.Point(495, 294);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(396, 264);
            this.pictureBox2.TabIndex = 18;
            this.pictureBox2.TabStop = false;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::FormApp.Properties.Resources._20532180_501;
            this.pictureBox1.Location = new System.Drawing.Point(844, 22);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(488, 225);
            this.pictureBox1.TabIndex = 17;
            this.pictureBox1.TabStop = false;
            // 
            // programareBindingSource
            // 
            this.programareBindingSource.DataMember = "Programare";
            // 
            // spec_btn
            // 
            this.spec_btn.BackColor = System.Drawing.Color.RoyalBlue;
            this.spec_btn.Font = new System.Drawing.Font("Times New Roman", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.spec_btn.ForeColor = System.Drawing.Color.White;
            this.spec_btn.Location = new System.Drawing.Point(69, 601);
            this.spec_btn.Name = "spec_btn";
            this.spec_btn.Size = new System.Drawing.Size(141, 42);
            this.spec_btn.TabIndex = 6;
            this.spec_btn.Text = "Specializari";
            this.spec_btn.UseVisualStyleBackColor = false;
            this.spec_btn.Click += new System.EventHandler(this.spec_btn_Click);
            // 
            // med_btn
            // 
            this.med_btn.BackColor = System.Drawing.Color.RoyalBlue;
            this.med_btn.Font = new System.Drawing.Font("Times New Roman", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.med_btn.ForeColor = System.Drawing.Color.White;
            this.med_btn.Location = new System.Drawing.Point(273, 601);
            this.med_btn.Name = "med_btn";
            this.med_btn.Size = new System.Drawing.Size(141, 42);
            this.med_btn.TabIndex = 7;
            this.med_btn.Text = "Medici";
            this.med_btn.UseVisualStyleBackColor = false;
            this.med_btn.Click += new System.EventHandler(this.med_btn_Click);
            // 
            // listBox1
            // 
            this.listBox1.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listBox1.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(64)))));
            this.listBox1.FormattingEnabled = true;
            this.listBox1.ItemHeight = 19;
            this.listBox1.Location = new System.Drawing.Point(1, 16);
            this.listBox1.Name = "listBox1";
            this.listBox1.Size = new System.Drawing.Size(193, 289);
            this.listBox1.TabIndex = 4;
            // 
            // spec_groupBox
            // 
            this.spec_groupBox.Controls.Add(this.listBox1);
            this.spec_groupBox.Location = new System.Drawing.Point(39, 278);
            this.spec_groupBox.Name = "spec_groupBox";
            this.spec_groupBox.Size = new System.Drawing.Size(194, 312);
            this.spec_groupBox.TabIndex = 5;
            this.spec_groupBox.TabStop = false;
            this.spec_groupBox.Text = "Specializari";
            this.spec_groupBox.Visible = false;
            // 
            // m_list
            // 
            this.m_list.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.m_list.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(0)))), ((int)(((byte)(64)))));
            this.m_list.FormattingEnabled = true;
            this.m_list.ItemHeight = 19;
            this.m_list.Location = new System.Drawing.Point(0, 16);
            this.m_list.Margin = new System.Windows.Forms.Padding(2);
            this.m_list.Name = "m_list";
            this.m_list.Size = new System.Drawing.Size(199, 289);
            this.m_list.TabIndex = 2;
            // 
            // m_groupBox
            // 
            this.m_groupBox.Controls.Add(this.m_list);
            this.m_groupBox.Location = new System.Drawing.Point(248, 278);
            this.m_groupBox.Margin = new System.Windows.Forms.Padding(2);
            this.m_groupBox.Name = "m_groupBox";
            this.m_groupBox.Padding = new System.Windows.Forms.Padding(2);
            this.m_groupBox.Size = new System.Drawing.Size(199, 312);
            this.m_groupBox.TabIndex = 3;
            this.m_groupBox.TabStop = false;
            this.m_groupBox.Text = "Lista Medici";
            this.m_groupBox.Visible = false;
            // 
            // Appointments
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(1356, 726);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.m_groupBox);
            this.Controls.Add(this.spec_groupBox);
            this.Controls.Add(this.monthCalendar1);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.prog_btn);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.date_txtBox);
            this.Controls.Add(this.desc_txtBox);
            this.Controls.Add(this.med_btn);
            this.Controls.Add(this.spec_btn);
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "Appointments";
            this.Text = "Appointments";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Appointments_FormClosing);
            this.Load += new System.EventHandler(this.Appointments_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.programareBindingSource)).EndInit();
            this.spec_groupBox.ResumeLayout(false);
            this.m_groupBox.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.DataGridView dataGridView1;
       // private MedicDBDataSet2 medicDBDataSet2;
        private System.Windows.Forms.BindingSource programareBindingSource;
       // private MedicDBDataSet2TableAdapters.ProgramareTableAdapter programareTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn ora;
        private System.Windows.Forms.DataGridViewTextBoxColumn Luni;
        private System.Windows.Forms.DataGridViewTextBoxColumn Marti;
        private System.Windows.Forms.DataGridViewTextBoxColumn Miercuri;
        private System.Windows.Forms.DataGridViewTextBoxColumn Joi;
        private System.Windows.Forms.DataGridViewTextBoxColumn Vineri;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.TextBox desc_txtBox;
        private System.Windows.Forms.TextBox date_txtBox;
        private System.Windows.Forms.Button prog_btn;
        private System.Windows.Forms.MonthCalendar monthCalendar1;
        private System.Windows.Forms.Button spec_btn;
        private System.Windows.Forms.Button med_btn;
        private System.Windows.Forms.ListBox listBox1;
        private System.Windows.Forms.GroupBox spec_groupBox;
        private System.Windows.Forms.ListBox m_list;
        private System.Windows.Forms.GroupBox m_groupBox;
    }
}