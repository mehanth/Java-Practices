package javawithmehanth;

import java.util.Scanner;

public class exceptionclass {
    static class Myexception extends Exception{
        @Override
        public String toString() {
            return "I am string";
        }

        @Override
        public String getMessage() {
            return "I am Getmessage";
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<10){
            try {
                throw new Myexception();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("yepp");


            }
        }
    }
}