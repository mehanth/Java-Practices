package javawithmehanth;

public class multidimensionalarray {
    public static void main(String []args){
        int [][]flat= new int[2][3];
        flat[0][0]=111;
        flat[0][1]=222;
        flat[0][2]=333;
        flat[1][0]=444;
        flat[1][1]=555;
        flat[1][2]=666;

        for(int i=0; i<flat.length; i++){
            for(int j=0;j<flat[i].length;j++){
                System.out.print(flat[i][j]);
                System.out.print("_");
            }
            System.out.println("\n");
        }
    }
}
