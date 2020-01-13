using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            UnOrderedArray ua = new UnOrderedArray(50);
            ua.addLast(23);
            ua.addLast(9);
            ua.addLast(-2);
            ua.addLast(98);
            ua.addLast(3);
            ua.addLast(1);
            ua.addLast(8);
            ua.addLast(75);
            ua.addLast(-54);
            ua.addLast(185);
            ua.listItems();
            ua.seletionSortAsc();
            ua.listItems();
            Console.ReadKey();
        }
    }
}
