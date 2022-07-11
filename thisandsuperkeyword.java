package javawithmehanth;


class hey{
    int n;
     hey(int n){
         System.out.println("first one");
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
     }

     }
     class  hi extends hey {
    hi(int m){
super(m);
        System.out.println("this");

    }

     }

public class thisandsuperkeyword {
    public static void main(String[] args) {
//        hey h = new hey(5);
hi h = new hi(550);
        System.out.println(h.getN());


    }
}
