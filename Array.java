//write a program on 2D array

public class Array{
    public static void main(String[] args) {
        
        int[][] arr = new int[3][2];

        arr[0][0]=10;
        arr[0][1]=12;
        arr[1][0]=34;
        arr[1][1]=23;
        arr[2][0]=76;
        arr[2][1]=89;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}