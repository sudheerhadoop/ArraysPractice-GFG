Step1: Sort the arrays
Step2: MergeSort process to check both arrays element by element and increment and decrement num of platforms.

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1;
        int j=0;
        
        int platform_needed = 1; 
        int result = 1;
        
        while(i<n && j<n)
        {
            
            if(arr[i] <= dep[j])
            {
                platform_needed++;
                i++;
            }
           
           else if(arr[i] > dep[j])
            {
                platform_needed--;
                j++;
            }
            
           if(platform_needed > result)
           {
               result = platform_needed;
           }
        }
        
        return result;
    }
    
}

