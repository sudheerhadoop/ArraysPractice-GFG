class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
    int currentsum = arr[0];
    int start = 0;
    int end;
    ArrayList<Integer> al = new ArrayList<Integer>();
    
    for(end = 1;end<= n;end++)
    {
        
        while(currentsum > s && start < end-1)
        {
            currentsum = currentsum - arr[start];
            start++;
        }
        
        if(currentsum == s)
        {
            int p = end-1;
            al.add(start+1);
            al.add(p+1);
            return al;
        }
 
        if(end < n)
        {
         currentsum = currentsum + arr[end];
        }
    }
    
    if( currentsum != s)
    {
        al.add(-1);
        
    }
  return al;  
  
    
    }
}
