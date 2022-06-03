class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int row_start = 0;
        int row_end = r-1;
        int column_start = 0;
        int column_end = c-1;
        
        int count = 0;
        int total = r*c;
        
        while(row_start < r && column_start < c)
        {
        for(int i=column_start;i<=column_end && count < total;i++)
        {
            result.add(matrix[row_start][i]);
            count++;
        }
        row_start++;
        
        for(int i=row_start;i<=row_end && count < total;i++)
        {
            result.add(matrix[i][column_end]);
             count++;
        }
        column_end--;
        
        for(int i=column_end;i>=column_start && count < total;i--)
        {
            result.add(matrix[row_end][i]);
             count++;
        }
        row_end--;
        
         for(int i=row_end;i>=row_start && count < total; i--)
        {
            result.add(matrix[i][column_start]);
             count++;
        }
        column_start++;
        }
        return result;
    }
}
