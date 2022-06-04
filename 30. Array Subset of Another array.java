class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
      Set<Long> s = new HashSet<Long>();
      
      for(int i=0;i<n;i++)
      {
          if(!s.contains(a1[i]))
          {
              s.add(a1[i]);
          }
      }
      
      for(int j=0;j<m;j++)
      {
          if(!s.contains(a2[j]))
          {
              return "No";
          }
      }
      
      return "Yes";
      
        
    }
}

/**** Using Two pointers *****/

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
     Arrays.sort(a1);
     Arrays.sort(a2);
     
     int i=0;
     int j=0;
     
     while(i<n && j < m)
     {
         if(a1[i] < a2[j])
         {
             i++;
             
         }
         else if(a1[i] == a2[j])
         {
             i++;
             j++;
         }
         else if(a1[i] > a2[j])
         {
             return "No";
         }
     }
     
     if(j<m)
     {
         return "No";
     }
     else
     {
         return "Yes";
     }
    }  
}
