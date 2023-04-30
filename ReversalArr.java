//  reversal of the array 
// time complexity is ~= O(n), space complexity is O(1)
class ReversalArr{
//    static void swap( int arr1,int arr2){
//         int temp= arr1;
//         arr1= arr2; 
//        arr2= temp;
//    }
    public static void main(String []args){
        int []arr={1,2,34,33,4};
        int n= arr.length;
         for (int  i=0; i<n/2;i++){
            int temp= arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            //  function sr change nhi hui value  swap(arr[i],arr[n-i-1]);
         }
         System.out.println(" reversal of the array is ");
         for (int i : arr) {
            System.out.print(i +"\t");
            
         }
    }

}