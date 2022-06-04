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
