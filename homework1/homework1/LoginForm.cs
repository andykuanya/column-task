using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace homework1
{
    public partial class LoginForm : Form
    {
        private UserDAO dao = null;
        public LoginForm()
        {
            InitializeComponent();
            init();
        }

        public void init()
        {
            Console.WriteLine("正在初始化...\n");
            dao = new UserDAO();
        }

        public void display()
        {
            this.Visible = true;
        }

        public void vaildate()
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (dao != null)
                dao.findUser("123", "123");
        }

        private void LoginForm_Load(object sender, EventArgs e)
        {
            Console.WriteLine("窗口启动成功！\n");
        }
    }
}
