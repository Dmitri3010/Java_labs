import p1.AAA;
import p1.p2.BBB;
import p1.p2.CCC;
import p1.p2.p3.DDD;
import p1.p2.p3.FFF;

public class Main {

    public static void main(String[] args) {
        p1.AAA aaa = new AAA(2);
        aaa.GetKey();
        p1.p2.BBB bbb =new BBB(3);
        bbb.GetKey();
        p1.p2.CCC ccc = new CCC(4);
        ccc.GetKey();
        p1.p2.p3.DDD ddd = new DDD(5);
        ddd.GetKey();
        FFF fff = new FFF(6);
        fff.GetKey();
    }
}
