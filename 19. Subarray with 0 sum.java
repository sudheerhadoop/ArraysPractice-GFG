class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> s = new HashSet<Integer>();
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
            
            if(sum == 0)
            {
                return true;
            }
            
            if(s.contains(sum))
            {
                return true;
            }
            else
            {
                s.add(sum);
            }
        }
        
       return false;
    }
}
