/** Using hash map 
**/

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i], hmap.get(arr[i])+1);
            }
            else
            {
                hmap.put(arr[i],1);
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            if(hmap.get(arr[i]) > 1)
            {
                return i+1;
            }
        }
        return -1;
    }
}
