// find the no. of ways going on the stairs when we can only jump one step or two step
import java.util.Scanner;
public class staircaseProblem {
    static int stairWays(int n){
        int result;
        if (n==0||n==1){    // base case condition 
            return n;    
        }
        else{
           result= stairWays(n-1)+stairWays(n-2);  //recursive +self work
        }
        return result; 
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the lenght of the stairs ");
    int n=sc.nextInt();
    sc.close();
    System.out.print("no. of the ways of the stairs is :-"+"\n");
    // fibbonaci series and step problem ke relation ki wajah se apn sum n+1 se krenge
      int result= stairWays((n+1));
    System.out.println(result);
}
}
