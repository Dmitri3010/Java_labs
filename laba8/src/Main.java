public class Main {

    public static void main(String[] args) {

        try{
            AAA aaa = new AAA(4);
            aaa.method(-3);
        }
        catch (ExceptionAAA1 ex){
            System.out.println("value cannot be null");
            ex.printStackTrace();
            ex.getMessage();
            ex.toString();
        }
        catch (ExceptionAAA2 ex){
            System.out.println("value cannot be 0");
        }
        catch (ExceptionAAA3 ex){
            System.out.println("value must be more 0");
        }
    }
}
