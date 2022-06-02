class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        
        return binarySearch(arr, 0, n-1);
    }
    
    public static int binarySearch(int[] a, int low, int high)
    {
    
    int mid = (low+high)/2;
    
    if(a[mid] > a[high])
    {   
        return binarySearch(a, mid+1, high);
    }
    else if(a[mid] < a[high])
    {
        return binarySearch(a, low, mid);
    }
    else
    {
        return a[mid];
    }
        
    }
}
