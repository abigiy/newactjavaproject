import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int x = 7;
        int y= x;
        byte k= 1;
        short w=29000;
        long z= 200;
        float weight =1.45F;
        double height  =1.45;
        char grade ='A';// only one character
        boolean paidStatus =false ;
        System.out.println(paidStatus);
       System.out.println("your age is "+ z+y+w);
        System.out.println(x + y);
        System.out.println(x*y);
        System.out.println("    x + y = " + (x + y));;
        System.out.println(x / y);\  System.out.println( x - y);
        // non permitive always start on capital
        Point coordinate = new Point(2,4);// we type only the num , it is added automatically x and y not us
        Point coordinate2= coordinate;
        coordinate.x =45 ;
        coordinate.y= 66;
        String  name= "hanna";//immutable
        System.out.println(name );

        int a = 7;
        int m= a;
        x=9;
        System.out.println(a);
        System.out.println(m);
        System.out.println(coordinate2);
        System.out.println(coordinate);


    }
}