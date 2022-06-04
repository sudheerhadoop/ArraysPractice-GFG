class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        
        int low = 0;
        int high = 1;
        
    while(low < high && high < n)
    {
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
        high += 2;
        low += 2;
    }
    }
}
