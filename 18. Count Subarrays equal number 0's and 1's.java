/** Using hashmap **/

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
        
        for(int i =0; i< n;i++)
        {
            if(arr[i] == 0)
            {
                arr[i] = -1;
            }
            
            sum = sum + arr[i];
            
            if(sum == 0)
            {
                count++;
            }
            
            if(hmap.containsKey(sum))
            {
                count = count + hmap.get(sum);
            }
            
            if(!hmap.containsKey(sum))
            {
                hmap.put(sum, 1);
            }
            else
            {
                hmap.put(sum, hmap.get(sum)+1);
            }
        }
        
             return count;
    }
}
