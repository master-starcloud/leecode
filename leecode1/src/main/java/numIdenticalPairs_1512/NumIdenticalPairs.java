package numIdenticalPairs_1512;

/**
 * @author starcloud on 2020/7/26
 * link https://leetcode-cn.com/problems/number-of-good-pairs/
 * 好数对的数目
 */
public class NumIdenticalPairs {

    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0]=0;
        nums[1]=1;
        nums[2]=2;
        nums[3]=3;
        nums[4]=4;
        nums[5]=5;
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }


    /**
     * 暴力法直接两层循环
     * @param nums
     * @return
     */
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0;i< nums.length;i++){
            int compare = nums[i];
            for (int j=i+1;j<nums.length;j++) {
                if(compare == nums[j]) {
                   result = result +1;
                }
            }
        }
        return result;
    }
}