class GFG {
	public static void main (String[] args) {
		//code
		int[] arr = {1,2,3,4};
		    
		int revarr[] =  reverse(arr,4);
		
		for(int e: revarr)
		{
		    System.out.print(e+" ");
		}
	
	}
	
	public static int[] reverse(int arr[] , int n)
	{
	    if(n==1)
	    {
	        return arr;
	    }
	    
	    int start = 0;
	    int end = n-1;
	    
	    while(start <= end)
	    {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        
	        start++;
	        end--;
	    }
	    return arr;
	}
	
}
