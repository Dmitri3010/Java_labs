import java.util.Scanner;

public class Main {
private static int yyyy, mm,dd;
    public static void main(String[] args) {
        AAA student = new AAA();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя студента:");
        student.SetName(in.nextLine());
        System.out.println("Введите отчество студента:");
        student.SetFatherName(in.nextLine());
        System.out.println("Введите фамилию студента:");
        student.SetSurname(in.nextLine());
        System.out.println("Введите год рождения студента:");
        yyyy=(in.nextInt());
        System.out.println("Введите месяц рождения студента:");
        mm=(in.nextInt());
        System.out.println("Введите день рождения студента:");
        dd=(in.nextInt());
        student.SetBirthDay(yyyy,mm,dd);

        System.out.println("Введите университет студента:");
        student.SetUniversity(in.nextLine());
        System.out.println("Введите год студента:");

        System.out.println(student.GetName());
        System.out.println(student.GetFatherName());
        System.out.println(student.GetSurname());
        System.out.println(student.GetBirthday());
        System.out.println(student.GetUniversity());


    }
}
