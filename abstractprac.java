package javawithmehanth;

import org.w3c.dom.ls.LSOutput;

//abstract class pen {
//    abstract void write();
//    abstract void refill();
//}
//class fountainpen extends pen{
//    void write(){
//        System.out.println("write");
//    }
//    void refill(){
//        System.out.println("refill");
//    }
//    void changenib(){
//        System.out.println("change pen nib");
//    }
//}
//public class abstractprac {
//    public static void main(String[] args) {
//        pen p = new fountainpen();
//
//        p.refill();
//        p.write();
////     p.changenib();
//
//    }
//}
//interface basicanimal{
//    void eat();
//    void sleep();
//
//}
//class monkey{
//    public void jump(){
//        System.out.println("jumping");
//    }
//    void bite(){
//        System.out.println("bite");
//    }
//}
//class human extends monkey implements basicanimal{
//    void speak(){
//        System.out.println(" yo bruh");
//    }
//    public void eat(){
//        System.out.println("eating");
//    }
//    public void sleep(){
//        System.out.println("sleeping");
//    }
//}
//public class abstractprac {
//    public static void main(String[] args) {
////        human h = new human();
////        h.eat();
////        h.sleep();
////       monkey m = new human();
////       m.bite();
////        m.jump();
////        m.bite();
//        basicanimal b = new human();
//        b.eat();
//
//
//    }}
//abstract class telephone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//class  androidphone extends telephone{
//    public void ring(){
//        System.out.println("ringing");
//    }
//    public void lift(){
//        System.out.println("lift");
//    }
//    public void disconnect(){
//        System.out.println("disconnecting");
//    }
//    void camera(){
//        System.out.println("opening camera");
//    }
//
//}
//public class abstractprac {
//    public static void main(String[] args) {
//        telephone t =new androidphone();
//        t.disconnect();
//        t.lift();
//        t.ring();
//        androidphone a = new androidphone();
//        a.camera();
//
//    }
//}
interface  tvremote{
    void channels();
    void volume();
}
interface smartremote extends tvremote{
    void apps();
    void voiceassistant();
    }

public class abstractprac {
    public static void main(String[] args) {
        tvremote t = new tvremote() {
            @Override
            public void channels() {
                System.out.println("channels are .....");
            }

            @Override
            public void volume() {
                System.out.println("volume up and down");

            }
        };
        t.channels();
        t.volume();
        smartremote s = new smartremote() {
            @Override
            public void apps() {
                System.out.println("netflix");
            }

            @Override
            public void voiceassistant() {
                System.out.println("hello bruh");

            }

            @Override
            public void channels() {
                System.out.println("channels are .....");
            }

            @Override
            public void volume() {
                System.out.println("up and down");

            }
        };
        s.apps();
        s.voiceassistant();
    }
}