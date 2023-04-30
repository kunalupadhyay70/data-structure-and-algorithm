import java.util.*;

public class transposeApp1 {
 public static void main(String[] args) {
    int a[][]={
    {3,4,5},{6,7,8},{9,10,11}};
    System.out.println("your array is");
    for (int i[] : a) {
        System.out.println(Arrays.toString(i));
     }
    // transposing of the array approach 1
    for(int i=0;i<a.length;i++){
        for(int j=0;j<i;j++){
            int temp=a[i][j];
           a[i][j]=a[j][i];
            a[j][i]=temp;
      }
     }
     System.out.println("transpoted array is");
     for (int i[] : a) {
        System.out.println(Arrays.toString(i));
     }
 }
}
