// sorted array binary search time copl O(logn),space complexity O(1)
import java.util.Scanner;
public class BinearySearch {
    static int Binarysearch(int a[],int x)
    {
        int first=0 ,last=a.length-1,mid;
        int i=0;
        while(i<a.length)
        {
              mid=( first+(last-first))/2;// can be used mid=(first+last)/2;
            if (a[mid]==x){
               return mid;
            }
            else if(a[mid]<x){
                first= mid+1;
            }
            else
            last=mid-1;
            i++;
        }
        return -1;
    }
    // linear search O(n)
    public static  void linearSearch(int a[],int x){
        for (int i=0;i<a.length;i++){
            if (a[i]==x){
                System.out.println("elemetn found at "+ (i+1));
                return ;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the elemtnes of the array");
        int n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the elemts of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int x= sc.nextInt();
       //System.out.println(" binear search elements found at the   "+ Binarysearch(a,x));
      linearSearch(a,x);
    }

}
