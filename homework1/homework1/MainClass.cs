using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace homework1
{
    class MainClass
    {
        static void Main(string[] args)
        {
            Console.WriteLine("正在启动窗口...\n");
            Application.Run(new LoginForm());
        }
    }
}
