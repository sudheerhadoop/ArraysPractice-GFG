class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low < high)
        {
        
    int pivotElement = partition(arr, low, high);
    quickSort(arr, low, pivotElement-1);
    quickSort(arr, pivotElement+1, high);
    
    }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
     int pivot = arr[high];
     int i = low-1;
     
     for(int j = low;j<=high-1;j++)
     {
         if(arr[j] < pivot)
         {
             i++;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }
     
     int temp = arr[i+1];
     arr[i+1] = arr[high];
     arr[high] = temp;
    
    return i+1;
        
    } 
}
