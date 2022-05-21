/** Using HashMap we are getting the second value and count the pairs **/
/** using Brute force approach the Time Limit Exception is coming **/

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        if(arr.length == 0)
        {
            return 0;
            
        }
        
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
        
        for(int i=0;i<n;i++)
        {
        if(hmap.containsKey(k-arr[i]))
        {
            count = count + hmap.get(k-arr[i]);
        }
        
        hmap.put(arr[i], hmap.getOrDefault(arr[i],0)+1);
        
        }
        return count;
        
    }
}
