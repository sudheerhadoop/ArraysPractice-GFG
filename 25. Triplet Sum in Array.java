class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       
       Arrays.sort(A);
       
       for(int i=0;i<n-2;i++)
       {
           int low = i+1;
           int high = n-1;
           
           while(low < high)
           {
               if(A[i]+A[low]+A[high] < X)
               {
                   low++;
               }
               else if(A[i]+A[low]+A[high] > X)
               {
                   high --;
               }
               else
               {
                   return true;
               }
               
           }
       }
       return false;
    
    }
}
