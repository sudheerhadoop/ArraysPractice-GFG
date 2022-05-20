/** Using Dutch National flag algorithm **/

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        if(a.length < 3)
        {
            return;
        }
        
        
        while(mid <= high)
        {
            if(a[mid] == 0)
            {
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {
            mid++;
            }
            else
            {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
            
        }
        
        
    }
}
