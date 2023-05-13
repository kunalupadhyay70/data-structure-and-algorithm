//tiling problem mai pta kre ki agar value n enter ki toh kitne no 
// of the way se  tile fit kre ki vah rectangle hi bane 
// for n tile =n-1+ n-2 , can be done by the using concept of the fibbonaci series
//time  complexity is O(2^n)
import java.util.Scanner;
public class TillingProblem{
     static int getWays(int n ){
        if (n<=3) // base case condition 
        return n ;
        return getWays(n-1)+getWays(n-2);
     }
    public static void main(String[] args) {
        System.out.println("enter the no. of the tile to be arranged ");
        Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      System.out.println("the no. of the ways is  :->  "+getWays(n));
    }
}
