package javawithmehanth;

public class relandlogicalope {
    public static void main(String[] args) {
        boolean a = true;
        boolean b= true;
        if (a && b){
            System.out.println("Y is true");
        }
        else{
            System.out.println("N is false");
        }
        boolean c = true;
        boolean d= false;
        if (c || d){
            System.out.println("Y is true");
        }
        else{
            System.out.println("N is false");
        }
        boolean m= true;
        boolean h = false;
        System.out.println(!m);
        System.out.println(!h);
    }
}
