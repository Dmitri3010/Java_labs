import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
        int a,b;
        float aa,bb;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter int a: ");
        a = in.nextInt();
        System.out.println("Enter int b: ");
        b = in.nextInt();

        System.out.println("Enter float a: ");
        aa = in.nextFloat();
        System.out.println("Enter float b: ");
        bb = in.nextFloat();

        System.out.println("Enter double a: ");
        double aaa = in.nextDouble();
        System.out.println("Enter double b: ");
        double bbb = in.nextDouble();

        GetIntsubtraction(a,b);
        GetFloatsubtraction(aa,bb);
        GetDoublesubtraction(aaa,bbb);
    }

   public static void GetIntsubtraction(int a, int b){
        int subtraction = a*a - b*b;
        System.out.println("a^2-b^2="+subtraction);
    }

    public static void GetFloatsubtraction(float a, float b){
        float subtraction=a*a*a - b*b*b;
        System.out.println("a^3-b^3="+subtraction);
    }

    public static void GetDoublesubtraction(double a, double b){
        double subtraction=a*a*a*a - b*b*b*b;
        System.out.println("a^4-b^4="+subtraction);
    }
}
