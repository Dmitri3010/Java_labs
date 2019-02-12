import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a please:");
        char a= in.next().charAt(0);
        System.out.println("Enter b please:");
        char b= in.next().charAt(0);
        GetSumm(a,b);
        Getsubtraction(a,b);
    }

    public static void GetSumm(char a, char b){
        int summ =a+b;
        System.out.println("a+b="+summ);

    }
    public static void Getsubtraction(char a, char b){
        int subtraction =a-b;
        System.out.println("a-b="+subtraction);

    }
}
