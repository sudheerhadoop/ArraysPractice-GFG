class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        
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
          if(hmap.get(arr[i]) == 1)
          {
              return arr[i];
          }
      }
      return -1;
        
    }  
    
}
