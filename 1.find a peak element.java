/** Using Binary Search **/

//TC:O(logn)


class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       if(arr.length == 0)
       {
           return 0;
       }
       
       if(arr.length == 1)
       {
           return 0;
       }
       
       return findpeakUtil(arr, 0, n-1,n);
       
    }
    
    
    public static int findpeakUtil(int arr[], int low, int high, int n)
    {
        
        int mid = low+(high-low)/2;
        
        
        if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
        {
            
            return mid;
            
        }
        else if(mid > 0 && arr[mid-1] > arr[mid])
        {
            
         return findpeakUtil(arr, low, mid-1, n);
            
        }
        else
        {
            return findpeakUtil(arr, mid+1, high, n);
        }
    }
}
