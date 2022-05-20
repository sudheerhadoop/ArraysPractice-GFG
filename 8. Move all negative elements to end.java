/** take temp array store all positive elements first then store all negative elements finally copy the temp array to original array **/
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
    int[] temp = new int[n];
    
    int j =0;
    
    for(int i=0;i<n;i++)
    {
        if(arr[i] >= 0)
        {
        temp[j] = arr[i];
        j++;
        }
    }
    
    for(int i=0;i<n;i++)
    {
        if(arr[i] < 0)
        {
        temp[j] = arr[i];
        j++;
        }
    }
    
    
    for(int i=0;i<n;i++)
    {
        arr[i] = temp[i];
    }
        
    }
}
