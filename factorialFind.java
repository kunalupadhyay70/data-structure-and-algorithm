//time complexity is O(n)
//space complextiy O(n)
class factorialFind{
    static int factorialFinding(int n){
        int result;
  if (n==0||n==1){
    return 1;
  }
  else
  {
    result= n*factorialFinding(n-1);
  }
 return result;
    }
    public static void main(String[] args) {
       System.out.println( factorialFinding(5));
        
    }
}