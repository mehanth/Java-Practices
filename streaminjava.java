package javawithmehanth;

import java.util.stream.Stream;

public class streaminjava {
    public static void main(String[] args) {
        Stream<Integer> mystream = Stream.of(10,30,40,50,60,70,80,20);
        mystream.forEach(number -> System.out.println(number));
    }
}
