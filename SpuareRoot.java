//approach : modified bineary search
//time coplexity is O(logn),space complexity O(1)
import java.util.Scanner;
public class SpuareRoot {
    public static int FinndSquareRoot(int num){
        int low=0,high=num,result=-1;
        //modified binary search;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val= mid*mid;
            if(val==num){
                //perfect square root
                return mid;
            }
            else if(val<num){
                //store the floor value in case the no. is not perfect square, we can print the floor value
                result=mid;
                low=mid+1;
            }
            else 
            high=mid-1;
        }
        return result;
    }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ente the element of which square root you want");
    int num= sc.nextInt();
    
    
    int result= FinndSquareRoot(num);
    System.out.println("the square root of given no. is   "+result);
}  

}
