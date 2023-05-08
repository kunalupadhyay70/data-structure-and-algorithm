// 0 1  1 2 3 5 8 13 .......... fibonacci series
import java.util.Scanner;
public class FibonacciSeries {
    //appraoach 1 
    //time complexity is O(n),space complexity O(N)
    static void fibbonaciSum(int a,int b,int n){
       if (n==0||n==1) //base case condition 
       return;
        int c=a+b;             //self work 
        System.out.print(c+" ");  
       fibbonaciSum(b, c, n-1);  //recursive work
    }
    //approach 2 
    //time complexity O(2^N), space complexity O(n)
    static int fibbonaciSum(int n){
        int result;
        if (n==0||n==1){    // base case condition 
            return n;    
        }
        else{
           result= fibbonaciSum(n-1)+fibbonaciSum(n-2);  //recursive +self work
        }
        return result; 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the lenght of the fiboonacii series ");
        int n=sc.nextInt();
        sc.close();
        System.out.print("your fibonacci series is :-"+"\n");
        // System.out.print("0  1 ");
        // fibbonaciSum(0,1,n);
        System.out.println(fibbonaciSum(n));
        


    }
}
