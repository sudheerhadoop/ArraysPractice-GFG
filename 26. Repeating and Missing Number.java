class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int result[] = new int[2];
        
        for(int i=0;i<n;i++)
        {
            int abs_val = Math.abs(arr[i]);
            if(arr[abs_val -1] < 0)
            {
                result[0] = Math.abs(arr[i]);
            }
            else
            {
                arr[abs_val-1] = -arr[abs_val-1];
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
            {
                result[1] = i+1;
            }
        }
        
        return result;
        
    }
}
