//BRUTE FORCE
package Kadane_Algo;

public class KadanesAlgo {
    public static int MaxSubArray(int nums[],int n){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0 ; i< n;i++){
            int sum = 0;
            for(int j = i ;j < n ;j++){
                sum = sum+ nums[j];

                maximum = Math.max(maximum, sum);
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
       
        int arr []= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = MaxSubArray(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
