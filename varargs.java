package javawithmehanth;

public class varargs {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += 0;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 2 and 3 is:" + sum(1));

    }
}