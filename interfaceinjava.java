package javawithmehanth;
//
//interface  bicycle{
//    int a =45;
//    void applybrake(int decrement);
//    void speedup(int increment);
//}
//interface  cycle{
//    void applyhorn(int decrement);
//    void stopbaby(int increment);
//}
//class hercules implements bicycle, cycle{
//    public void applybrake(int decrement){
//        System.out.println("appply brake");
//    }
//    public void speedup(int increment){
//        System.out.println("apply speedup");
//    }
//   public void applyhorn(int decrement){
//        System.out.println("poi poi");
//    }
//    public void stopbaby(int increment){
//        System.out.println("po po poi");
//    }
//}
//
//public class interfaceinjava {
//    public static void main(String[] args) {
//        hercules h = new hercules();
//        h.applybrake(1);
//        h.speedup(2);
//        System.out.println(hercules.a);
//        h.applyhorn(1);
//        h.stopbaby(3);
//    }
//}
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class interfaceinjava {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}