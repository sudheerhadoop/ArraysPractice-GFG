/******* Bruteforce Approach: ********/

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        
        int matrixMax = 0;
        int index = -1;
        
        for(int i=0;i<n;i++)
        {
            int rowMax = 0;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j] == 1)
                {
                    rowMax++;
                }
                
            }
        if(rowMax > matrixMax)
        {
            matrixMax = rowMax;
            index = i;
        }
      
        }
        
        return index;
        
    }
}
