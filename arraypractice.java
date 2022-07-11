package javawithmehanth;

public class arraypractice {
    public static void main(String[] args){
//        problem 1
//        float [] points ={9.0f,8.0f,7.0f,6.0f};
//        float sum =0;
//        for (float total : points){
//             sum = sum +total;
//
//        } System.out.println(sum);

//        problem 2
//        int []value = {2,3,4,5,6,7};
//        int num =1;
//        boolean isinarray =false;
//        for (int element: value){
//            if(num==element){
//                isinarray= true;
//                break;}
//
//            }
//            if(isinarray){
//                System.out.println("yes present ");
//            }
//            else{
//                System.out.println("not present");
//            }
//        problem 3
//        int[]physicsmarks = {23,44,55,66,77,88};
//        int sum =0;
//        for(int element: physicsmarks){
//            sum = sum +element;
//
//        }
//        System.out.println("the average value is " + sum/ physicsmarks.length);

//        problem 4;
//        int [][]mat1 ={{2,2,2},{3,3,3}};
//        int [][]mat2 ={{3,3,3},{2,2,2}};
//        int[][]result ={{0,0,0},{0,0,0}};
//
//        for(int i=0;i<mat1.length;i++){                        learn this later not understood
//            for(int j=0;j<mat1[j].length;j++){
//                System.out.println(result[i][j] + " ");
//                result[i][j]= mat1[i][j] + mat2 [i][j];
//
//            }
//            System.out.print(" ");
//
//        }
//        problem 5;
//        int arr[]= {1,2,3,4,5,6};
//        int l=arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i=0; i<n;i++){
//            temp = arr[i];
//            arr[i] =arr[l-1-i];
//            arr[l-1-i]= temp;
//
//        }
//        for (int element: arr            ) {
//            System.out.print(element+ " ");
//
//        }
//        problem 6;
//        int arr[]= {1,2,-34,55,667,6};
//        int min  =Integer.MIN_VALUE;
//        for (int e: arr ) {
//            if(e<=min){
//                min =e;
//            }
//        } System.out.println(min);

//        problem 8
        int arr[] ={1,2,4,5,6};
        boolean issorted =true;
        for (int i=0; i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                issorted= false;
                break;
            }}
            if(issorted){
                System.out.println("sorted");
            }
            else{
                System.out.println("not sorted");
            }







    }
}
