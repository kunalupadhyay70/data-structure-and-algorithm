//time complexity O(n2),space complexity O(1),statble sorting
//insertion sort usd when array is almost sort so time complexity is less
import java.util.*;
class insertionSort{
    public static void  insertionSort(int a[])
   {
         int n=a.length;
         for(int i=1;i<n;i++){//comparison start with first index or second element 
          int j=i;//updating the value of j
          while(j>0&&a[j-1]>a[j]){
              int temp=a[j];
              a[j]=a[j-1];
              a[j-1]=temp;
              j--; //decrement the value of j
          }
         }
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. of the elemtnes of the array");
        int n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the elemts of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //function calling 
        insertionSort(a);
        System.out.println("the sorted array is :");
       System.out.println( Arrays.toString(a));//printing the arrray in well defined manner 
        // for (int i : a) {
        // System.out.print(i+" ");  
        //     }
        
}
}