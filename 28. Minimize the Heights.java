/** 
Step1:  Sort the given array 
Step2:  take tempmin as first element , tempmax as last element, take diff as arr[n-1]-arr[0];
step3:  check if any element - k is negative then we need to move to next element 
step4:  add the k to first element and decrease k to each element and finding min element in that
step5:  remove k from last element and add k to every element and finding max in that.
Step: compare the diff with tempmax-tempmin and get the max from it.



class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        
        int diff = arr[n-1] - arr[0];
        
        int tempmin = arr[0];
        int tempmax = arr[n-1];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k < 0)
            {
                continue;
            }
            
            tempmin = Math.min(arr[0]+k, arr[i]-k);
            tempmax = Math.max(arr[i-1]+k, arr[n-1]-k);
            
            diff = Math.min(diff, tempmax-tempmin);
            
        }
        
        
        return diff;
        
    }
}
