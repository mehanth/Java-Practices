package javawithmehanth;

class circle{
    public int radius;
    circle(){
        System.out.println("im dont have parameter");
    }
    circle(int r){
        System.out.println("im have parameter");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder (){
        System.out.println("i dont have paramter");
    }
    cylinder(int r , int h){
        super(r);
        System.out.println("i have parameter in cylinder");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class inheritsnceprac {
    public static void main(String[] args) {


//    circle obj = new circle();
    cylinder ojc= new cylinder();

}}
