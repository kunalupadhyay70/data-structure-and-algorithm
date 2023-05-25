import java .util.Scanner;
public class Nqueen {
     boolean isSafe(int arr[][],int x,int y,int N){
         for ( int i =0;i<x; i++) //checking the row of the current position 
         if(arr[i][y]==1)
         return false ;
         
         int row =x; 
         int col=y;
         // checking the left diagonal 
         while (row>=0 && col>=0){
            if (arr[row][col]==1){
                return false ;
            }
            row--;
            col--;
         }
         row =x; col=y;
         // checking the right diagonal  row toh ghat rhi hai pr coloumn badh rhi hai
         while (row>=0 && col<N){
            if (arr[row][col]==1){
                return false ;
            }
            row--;
            col++;
         }
         return true ; 
     }
 // queen soln func , x  denote the current position index where we are hovering 
      boolean  NqueenSolution(int arr[][], int N, int x){
    // base condition 
      if(x>=N){
        return true ;
     }   
     for ( int col=0;col<N;col++)// traversing through each coloumn element 
    {
        if(isSafe(arr, x, col, N)){
            arr[x][col]=1;
        if (NqueenSolution(arr, N, x+1)) // recursion 
        {
            return true ;
        }
        arr[x][col]=0;// backtracking
    }
    }
     return false ;
}
    public static void main(String[] args) {
        System.out.println("enter the size of the chess board ");
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
         int arr[][]= new int [N][N];
         Nqueen obj= new Nqueen();
        if (obj.NqueenSolution(arr, N, 0))
        {
          // for printing in the string format
          //   System.out.println(Arrays.deepToString(arr));
        // print the solution of the n queen 
        for (int[] is : arr) {
            for (int i : is) {
                System.out.print(i+" ");  
            } 
            System.out.println();
        }
        }
    }
}