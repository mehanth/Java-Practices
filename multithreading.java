package javawithmehanth;

class mythrd extends Thread {
  public   void run() {
        while (true) {
            System.out.println("Good mrng");
        }
    }
//}
//class mythrd2 extends Thread{
//  public   void run(){
//        while (true){
//            try{
//               Thread.sleep(500);
//            }
//            catch( Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
//    }
//}
//public class multithreading {
    public static void main(String[] args) {
////     mythrd m1 = new mythrd();
//     mythrd2 m2 = new mythrd2();
////     m1.start();
//     m2.start();
        mythrd m1 = new mythrd();
        m1.start();
    }
}
