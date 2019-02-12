public class Main {

    public static void main(String[] args) {
        StringWork stringWork = new StringWork();
        stringWork.GetString();
        Day current =Day.SUNDAY;
        System.out.println("Current enum field is = "+current);
        Groups isit = Groups.Isit;
        System.out.println("course of group is = "+ isit.course+" and number of group is =" + isit.group);
    }
}
