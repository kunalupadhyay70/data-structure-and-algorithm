//program to find the power of the numbers
import java.util.Scanner;
public class powerOfNum{
   //aproach 1 time coplexity O(b)-> depends on the power 
    static int power(int a,int b){
        if(b==1) //base case 
        return a;
        return a* power(a, b-1); // recursive + self work
    }
    //approach 2
    // time complexity O(log b)
    static int power2(int a,int b){
        if(b==1) //base case 
        return a;
        int result;
        if(b%2==0){
       result=power(a, b/2); //if power is even 
       return result*result;        
        }
        else{
            result= power(a, b-1);  // if power is odd 
            return a*result;
        }      
    }
    public static void main(String[] args) {
     System.out.println("enter the number and their power that is to be found out");
     Scanner sc = new Scanner(System.in);
     int a= sc.nextInt();
     int b= sc.nextInt();
     sc.close();
     System.out.println( power2(a,b));
    }
}