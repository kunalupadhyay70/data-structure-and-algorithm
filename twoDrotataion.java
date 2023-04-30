import java.util.Arrays;
public class twoDrotataion {
    public static void RoatetedMatrix(int arr[][]){
        // transpose of the matrix 
        int m= arr.length; // no.of rows
        int n= arr[0].length; //no. of cloumns 
        for(int i=0; i<m;i++){
            for (int j=i; j<n;j++){ //j start with i because to avoid double swap an element 
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // swaping of the elements of the coloumns
        for(int i=0;i<m;i++){
           int LeftIndex=0;
           int RightIndex=n-1;//no. of cloumns -1
       while (LeftIndex<RightIndex) {
            //swaping the coloumn elements
            int temp=arr[i][LeftIndex]; // swaping the Left row ,column elemnt till fi=li
            arr[i][LeftIndex]=arr[i][RightIndex];
            arr[i][RightIndex]=temp;
            LeftIndex++;
            RightIndex--;
        
       }}

    
    }
   public static void main(String[] args) {
    int arr[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    System.out.println("the arra before rotation is");
    for (int []m : arr) {
        System.out.println(Arrays.toString(m));
       }
    RoatetedMatrix(arr);
    System.out.println("and after 90 degree clockwise rotation");
  for (int []m : arr) {
   System.out.println(Arrays.toString(m));
  }
   }}
