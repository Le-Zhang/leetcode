import java.util.Arrays;


public class ThreeSumClosest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1, 1, -1, -1, 3};
		System.out.println(threeSumClosest(a, 3));
 	}
	
	
	public static int threeSumClosest (int[] num, int target) {
        if (num.length < 3) return 0; //?
      
        Arrays.sort(num);
        
        int dif = Integer.MAX_VALUE;
        int ret = target;
        
        for (int i=0; i < num.length-2; i++) {
            
            int start = i + 1, end = num.length - 1;
            
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                
                if (sum < target) {
                    if (target - sum < dif) {
                        ret = sum;
                        dif = target - sum;
                    }
                    start ++;
                    
                } else if (sum > target) {
                    
                    if (sum - target < dif) {
                        ret = sum;
                        dif = sum - target;
                    }
                    
                    end --;
                    
                } else { // sum == target
                    return sum;
                }
            }
        }
        
        return ret;
    }

}
