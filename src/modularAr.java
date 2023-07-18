
public class modularAr {
    public int power(int a,int n,int p){
        int  sum=1;
        for(int i=0;i<n;i++){
         sum*=a;
        }
        return sum%p;
    }
    public static void main(String[] args) {
        modularAr answer=new modularAr();
        System.out.println(answer.power(5,2,4));
    }
}