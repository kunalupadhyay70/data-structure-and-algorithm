import java.util.Scanner;
// to find the one missing elememts in the array from all continuous elemts 
public class MIssingNumber {
    public static void main(String[] args) {
    //  approach1 , for the continuos elements in the array 
    // time complexity is O(n) space complexity is constant 
    System.out.println("apprpach 1");
       int a[]= new int [5];
        System.out.println("enter the(continuos) elements of the array ");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++){
            a[i]= sc.nextInt();
         } 
        for ( int i=0; i<a.length;i++)
        {
            if (a[i]!= i+a[0])
            {
            System.out.println("the missing elem. found ::   "+ (i+a[0]));
            break ;
            }
        }
      System.out.println("mamla ready hai \n");
      System.out.println("***********************************************");

     //approach 2 , starting array from k till length of the array ,no number is repeated 
     // sum of the series starting with k and ends on lets suppose m  , common differrnce is  d=1
     // is n(k+m)/2  where n  is length of the array 
    //   time complexity is O(n)
    System.out.println("approach 2");
    int b[]= new int [5];
    System.out.println("enter the  (continuos)elements of the array ");
    for (int i=0;i<5;i++){
        b[i]= sc.nextInt();
     } 
       int n = b.length,idx=0 ,ArraySum=0;
       int Apsum =  (n+1) *(b[0]+b[n-1])/2;
       while(idx<n){
        ArraySum+=b[idx];
         idx++;
       }
       if ( ArraySum==Apsum){
        System.out.println("every contiguos element is there");
       }
       else
       System.out.println("the missing elements is " + Math.abs(Apsum-ArraySum));
    sc.close(); 
    }
    
}
