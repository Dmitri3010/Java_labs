import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lenght of array:");
        int lenghtOfArray = in.nextInt();
        GetArray(lenghtOfArray);

        System.out.println("Enter x of multy array:");
        int x=in.nextInt();
        System.out.println("Enter y of multy array:");
        int y=in.nextInt();

        GetMultidimensionalArray(x,y);
        LogicOperation();
        Conditions();

        Person Jake = new Person();
        Person Fred = new Person();
        Person.displayId();
    }

    public static void GetArray(int x){
      int[] array = new int[x];
      for (int i=0; i<array.length; i++){
          array[i]=i;
          System.out.println(array[i]);
      }
    }
    public static void GetMultidimensionalArray(int x, int y){
        int [][] multyArray =new int[x][y];
        for (int i=0;i<multyArray.length;i++){
            System.out.println(" ");
            for(int j=0;j<multyArray[i].length;j++) {
                multyArray[i][j]=i+j;
                System.out.print(multyArray[i][j]);
            }
        }
    }

    public static void LogicOperation(){
        System.out.println(" ");

        int a1 = 2;
        int b1 = 5;
        System.out.println("a1&b1="+(a1&b1));

        byte a = 12;
        System.out.println("~a="+(~a));

        int b2 = 4;
        int a2=8;
        System.out.println("a>>>b="+(a2>>>b2));

        b2<<=a;
        System.out.println(" b2<<=a ="+b2);

        int number = 45;
        int key = 102;
        number^=key;
        System.out.println(" a^=b ="+number);
    }

    public  static void Conditions(){
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        System.out.println("5 > 6) || (4 < 6) "+a1);
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
        System.out.println("5 > 6) || (4 > 6) "+a2);
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается false
        System.out.println("5 > 6) && (4 < 6) "+a3);
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
        System.out.println("50 > 6) && (4 /2< 3) "+a4);
        boolean a5 = (5 > 6) ^ (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        System.out.println("5 > 6) ^ (4 < 6) "+a5);
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
        System.out.println("50 > 6) ^ (4/2 < 3) "+a6);
    }
public void ConditionOperations(){
    int num1 = 6;
    int num2 = 8;
    if(num1>num2){
        System.out.println("Первое число больше второго");
    }
    else if(num1<num2){
        System.out.println("Первое число меньше второго");
    }
    else{
        System.out.println("Числа равны");
    }
    switch(num1){

        case 6:
            System.out.println("число равно 6");
            break;
        case 8:
            System.out.println("число равно 8");
            num1++;
            break;
        case 9:
            System.out.println("число равно 9");
            break;
        default:
            System.out.println("число не равно 6, 8, 9");
    }
}
}


