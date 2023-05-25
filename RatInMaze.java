// ratmaze problems 
// 1 means the ways is there and 0 means the walls there 
// rat allow to move right and down only , we follow lexitography means alphabteically down then right  
public class RatInMaze {
    //function to print the last soln 
    void Printsoln(int soln[][]){
   for (int a[]:soln) {
    for (int is : a) {
        System.out.print(is+" ") ;
    }
    System.out.println();
    
   }
    }
    // check wheather the current pointed position is safe to go or not further ahead 
     boolean isSafe(int arr[][],int x,int y ,int n){
        if (x<n && y<n&& arr[x][y]==1){
            return true;
        }
        return false;
        
    }
    boolean solveRatinmaze(int arr[][],int x, int y, int n ,int soln[][])
    {
        if( x==n-1 && y==n-1 && arr[x][y]==1) // base case conditions if rat has reached to the last or destination 
        { 
            soln[x][y]=1;
            return true;
        }
        if (isSafe(arr, x, y, n)){
           soln[x][y]=1;
           if(solveRatinmaze(arr,x+1,y,n,soln))  // we check if there is way in down  x is row 
           {
            return true;
           }
           if(solveRatinmaze(arr, x, y+1, n, soln)) //check wheather there is right , y is coloumn 
           {
            return true;
           }
           soln[x][y]=0;//backtracking , if there is no solution on both down and right side 
         return false;
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[][]={ 
        { 1, 1, 1, 1 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 1 },
        { 1, 1, 1, 1 } };
        int n =arr.length;
        int soln[][]=new int [n][n];
        RatInMaze obj= new RatInMaze();
        if (obj.solveRatinmaze(arr,0,0,n,soln))
        {
         obj. Printsoln(soln);
        }
        else
        System.out.println("there is no solution ");

    }
}
