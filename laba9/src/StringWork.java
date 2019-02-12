public class StringWork {

    public void GetString(){
        String s1 = new String();
        System.out.println("s1.length = "+ s1.length());

        char[] c = {'1','2','3','4','5'};
        String s2 = new String(c);
        System.out.println("s2.length = "+ s2.length()+" s2= "+ s2);

        String s3 = new String(c, 2, 2);
        System.out.println("s3.length = "+ s3.length()+" s3= "+ s3);

        System.out.println("123456.length="+"123456".length());

        String s4 = "123456";
        String s5 = "123456";
        System.out.println("s4==s5? "+(s4==s5));
        System.out.println("s4 equals s5? "+(s4.equals(s5)));

        System.out.println("index of '4' "+s4.indexOf("4"));

        String s6 = "StringBuffer  - класс очень похожий на String, но допускает изменение, удаление и расширение  содержимого";
        System.out.println("substring from 40 sumbol= "+s6.substring(40));
        System.out.println("substring from 40 sumbol to 60 symbol= "+s6.substring(40,60));
        System.out.println("ToUpperCase = "+s6.toUpperCase());

        StringBuffer s7 = new StringBuffer(" класс очень похожий на String");
        s7.insert(1,"но допускает изменение ");
        String s8 = s7.toString();
        System.out.println(s8);
    }
}

