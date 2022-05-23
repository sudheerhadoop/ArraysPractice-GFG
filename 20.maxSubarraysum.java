class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int maxSum = arr[0];
        int currentSum = 0;
        int i =0;
        while(i < n)
        {
            currentSum = currentSum + arr[i];
            
            maxSum = Math.max(maxSum, currentSum);
            
            if(currentSum < 0)
            {
                currentSum = 0;
            }
            i++;
        }
        return maxSum;
        
    }
    
}
