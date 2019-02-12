public class CCC {
    public int x;
    private int y;

   public CCC(){
       this.x=0;
       this.y=0;
   }

   public CCC(int x, int y){
       this.x=x;
       this.y=y;
   }

   public int Summ(){
       return x+y;
   }
    public int Ssub(int x, int y){
       return x-y;
    }
    public int Calc(){
       return x*y;
    }


}
