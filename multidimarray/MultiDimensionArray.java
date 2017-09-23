package multidimarray;
public class MultiDimensionArray {
	// This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
    	Long value = null;
        //... 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   // Your resolution 
   // Time complexity:  
   // Space complexity: 
    Long sum = new Long(0);
    for (int i = 0; i < lengthOfDeminsion.length; i ++) {
    	Long val = mArray.getValue(lengthOfDeminsion[i]);
    	sum = sum + val;
    }
    return sum;
    }
}
