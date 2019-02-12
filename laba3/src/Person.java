public class Person{
    private static int id;
    public static int counter=1;

    public  Person(){
        id=counter++;
    }
    public static void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}