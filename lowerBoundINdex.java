// sorted array Lowerbinary search time complexity O(logn),space complexity O(1)
import java.util.Scanner;
public class lowerBoundINdex {
    static int lowerBinarysearch(int a[],int x)
    {
        int first=0 ,last=a.length-1,mid=0,result =-1;
        int i=0;
        while(first<=last)
        {
              mid= first+(last-first)/2;// can be used mid=(first+last)/2;
            if (a[mid]==x){
             result = mid;
             //traverse to the left side of the array
              last = mid-1;
            }
            else if(a[mid]<x){
                first= mid+1;
            }
            else
            last=mid-1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. of elements in the array");
        int n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the elements of the array(should be sorted)");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int x= sc.nextInt();
        int result= lowerBinarysearch(a,x);
        if (result == -1){
        System.out.println("targeted element is  not found in the array");
        }
        else
       System.out.println(" binear search elements found at the   "+ result);
      
    }

}
