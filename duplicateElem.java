//finding the duplicate elements in the array
//time complexity O(n^2) 
public class duplicateElem {
    public static void main(String[] args) {
        int arr[]={ 1,2,3,3,4,54,4};
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n; j++)
            {
                if ( arr[i]==arr[j]){
                    System.out.println("element found    "+arr[i] );
                }
            }
        }
    }
}
