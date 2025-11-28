package BasicOFJava;

public class Variable {
    public static void main(String[] args) {
        System.out.println("Hello, ");
        int x = 5;
        int y = 6;
        System.out.println( x-y);// o/p is -1
        x+=5;//x=x+5   that is x = 10
        System.out.println(x);//10
        int z;
        z=9;
        System.out.println(z);
        System.out.println("hello " +x+y+z);//output is 1069
        System.out.println(x++);// output is 10
        System.out.println(x);//11
        System.out.println(++x);//12

    }
}
