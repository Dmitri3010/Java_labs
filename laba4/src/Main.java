public class Main {

    public static void main(String[] args) {
        CCC noParams = new CCC();
        System.out.println("x="+noParams.x);
        CCC withParams = new CCC(4,2);
        System.out.println("sum="+withParams.Summ());
        System.out.println("sub="+withParams.Ssub(4,1));

        DDD noParamsD = new DDD();
        System.out.println("x="+noParamsD.x);

        DDD withParamsD = new DDD(8,9);
        System.out.println("x="+withParams.x);
        System.out.println("sum="+withParamsD.Sum());
        System.out.println("Calc="+withParamsD.Calc());
    }
}

