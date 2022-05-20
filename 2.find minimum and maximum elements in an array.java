class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        int small = 0;
        int largest = 0;
        
        for(int i=1;i<n;i++)
        {
            if(a[i] < a[small])
            {
                small = i;
            }
            
            if(a[i] > a[largest])
            {
                largest = i;
            }
            
        }
        
        return new pair(a[small], a[largest]);
        
        }
    }
