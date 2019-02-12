public class DDD extends CCC {
    public int x;
    private int y;
    public DDD(){
        super();
        this.x=1;
        this.y=1;
    }

    public DDD(int x, int y){
        super(x,y);
        this.x=3;
        this.y=3;
    }

    public int Sum(){
        int superSum = super.Summ();
        return superSum+x+y;
    }

    public int Calc(){
        int superCalc= super.Calc();
        return superCalc+(x*y);
    }
}
