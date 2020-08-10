package labex2;

import java.util.Scanner;

/**
 *
 * @author Desktop Pc
 */
public class invoice {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        invoiceprogram1 a1 = new invoiceprogram1("One", "Grade1", 100, 780);
        System.out.println(a1.getid());
        System.out.println(a1.getdesc());
        System.out.println(a1.getqty());
        a1.setqty(90);
        System.out.println(a1.getunitprice());
        a1.setunitprice(1670);
        System.out.println(a1.gettotal());
        System.out.println(a1);

        invoiceprogram1 a2 = new invoiceprogram1("Two", "Grade2", 30, 850);
        System.out.println(a2.getid());
        System.out.println(a2.getdesc());
        System.out.println(a2.getqty());
        a1.setqty(880);
        System.out.println(a2.getunitprice());
        a1.setunitprice(30);
        System.out.println(a2.gettotal());
        System.out.println(a2);
    }

}

class invoiceprogram1 {

    String id;
    String desc;
    int qty;
    double unitprice;

    invoiceprogram1(String a, String b, int c, double d) {
        id = a;
        desc = b;
        qty = c;
        unitprice = d;
    }

    String getid() {
        return id;
    }

    String getdesc() {
        return desc;
    }

    int getqty() {
        return qty;
    }

    void setqty(int n1) {
        qty = n1;
    }

    double getunitprice() {
        return unitprice;
    }

    void setunitprice(double m1) {
        unitprice = m1;
    }

    double gettotal() {
        return unitprice * qty;
    }

    public String tostring() {
        return "\nID" + id + "Desc" + desc + "Qty" + qty + "Unitprice" + unitprice;
    }
}
