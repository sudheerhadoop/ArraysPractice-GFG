
/** we need t0 remember this formula **/ 
//currentValue += sumElements - n*A[n-i]
//https://www.ideserve.co.in/learn/maximum-value-of-index-element-product-sum-with-only-rotations 

class GfG
{
public static int max_sum(int A[], int n)
    {
	// Your code here
    	
    int currentValue = 0; 
    int maxProductSum = 0;
    int sumElements = 0;
    
    for(int i=0;i<n;i++)
    {
        sumElements += A[i];
        currentValue += i*A[i];
    }
    
    maxProductSum = currentValue;
    
       for (int i = 1; i < n; i++)
        {
            currentValue += sumElements - n*A[n-i];
        
        if(currentValue > maxProductSum)
        {
            maxProductSum = currentValue;
        }
    }
    
    return maxProductSum;
}

}
