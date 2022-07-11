package javawithmehanth;

public class arraybasics {
    public static void main(String[] args) {
        int []marks ={90,80,70,60,50};
        String []names = {"mehanth", "rahul", "honey"};
//        System.out.println(marks[0]);
//        System.out.println(names[2]);
//        System.out.println(marks.length);
//
//        for(int i=names.length-1; i>=0; i--){
//            System.out.println(names[i]);
//        }
        for(String element: names){
            System.out.println(element);
        }
    }
}
