//time complexity is O(n2)
//space complexity is O(1) ->inplace algorithm and stable 

import java.util.Scanner;
public class BubbleSort {
    public static  void bubbleSort(int a[]){
        int n= a.length;
     for(int i=0; i<n;i++){
        for(int j=1; j<n-i;j++)
        {
            if (a[j-1]>a[j]){ 
                //swaping two adjacent elements
                int temp= a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
            }
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
        bubbleSort(a);
        System.out.println("the sorted array is :");
        for (int i : a) {
        System.out.print(i+" ");
            
        }
}}
