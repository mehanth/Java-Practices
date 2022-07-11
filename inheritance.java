package javawithmehanth;

class parent{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    parent(){
        System.out.println("mehanth hi bruh!!!!");
    }

}
class child extends parent{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

}
public class inheritance {
    public static void main(String[] args) {
//       parent me = new parent();
//       child you =new child();
//       me.setX(20);
//       System.out.println(me.getX());

 child me = new child();
 me.setY(20);
    }
}
