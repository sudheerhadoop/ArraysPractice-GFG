class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int nsum = n*(n+1)/2;
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum = sum +array[i];
        }
        return nsum - sum;
    }
}
