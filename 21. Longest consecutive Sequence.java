Step1: Copy all elements to set 
Step2: find the element that previous number is not there. So that is the starting point of the Sequence then checking continiously for the next element 
Step3: Finally check then length of the sequence with the Max length.

https://www.techiedelight.com/find-longest-subsequence-formed-by-consecutive-integers/



class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   HashSet<Integer> hset = new HashSet<Integer>();
	   
	   int maxLen = 0;
	   for(int i=0;i<N;i++)
	   {
	       hset.add(arr[i]);
	   }
	   
	  for(int e: arr)
	  {
	      if(!hset.contains(e-1))
	      {
	          int len =1;
	          while(hset.contains(e+len))
	          {
	              len++;
	          }
	      maxLen = Math.max(maxLen, len);
	  }
	 }
	  return maxLen;
	   
	}
}
