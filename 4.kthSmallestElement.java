class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
      
     Arrays.sort(arr);
     
     return arr[k-1];
      
    } 
}

/** Apart from above approach we can use Quick Select also for finding the kth smallest. 
Min heap and Max heap can also be used. **/
