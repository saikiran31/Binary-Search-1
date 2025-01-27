class SearchInInfiniteArray
{
	public int search(ArrayReader reader, int target)
	{
	    int low=0;
	    int high=1;
	    while(reader.get(high)<target)
	    {
	        low=high;
	        high=high*2;
	    }
	    while(low<=high)
	    {
	        int mid = low+(high-low)/2;
	        if(reader.get(mid)==target)
	        return mid;
	        if(reader.get(mid) > target)
	        high = mid-1;
	        else
	        low = mid+1;
	    }
	   	return -1;
	}

}

//Time Complexity: O(log k) where k is the index of the target or the largest index where the target could be.
//Space Complexity: O(1)