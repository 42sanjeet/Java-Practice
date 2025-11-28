package BasicOFJava;

public class Doubledatatype {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       float  a =5;
        int b = 7;
       float c = a/b;
        System.out.println(c);
        System.out.println((double)c);

       /**
        int  x =10;
        int y = 4;
        double z = x/y;
        System.out.println(z); //2.0
        System.out.println((double)z);//2.0   **/
        int  x =10;
        int y = 4;
        double z = (double )x/y;
        System.out.println(z);//2.5

     /**  double l = 10;
        double m = 4;
        double o = 10/4;
        System.out.println(o);//2.0
        System.out.println((double)o);//2.0
 */
        double l = 102;
        double m = 4;
        double o = l/m;
        System.out.println(o);
        System.out.println(o);

    double xx = 30;
    double yy= 4;
     double zxy = xx/yy;//7.5 becoz xx and  yy is double and 30/4 is int type
     //double zz =  30/4;  7.0
     double zz = 40 / 3;//13.0
        System.out.println("zxy is " + zxy);//
        System.out.println("zz is " + zz);



    }
}
