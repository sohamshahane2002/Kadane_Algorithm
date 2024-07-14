//OPTIMZED SOLUTION
package Kadane_Algo;
public class KadaneAlgo {
    public static int MaxSubArray(int nums[]){
        int sum = 0;
        int maximum = nums[0];
        for( int i = 0 ; i < nums.length ;i++){
            sum = sum + nums[i];
            if(sum > maximum){
                maximum = sum;
            }
            if(sum < 0){
                sum = 0;
            }

        }return maximum;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,-1,-5,5,6,-4,2,1,-4};
        System.out.println("The maximum Subarray sum is of : " + MaxSubArray(arr) );
    }
    
}
