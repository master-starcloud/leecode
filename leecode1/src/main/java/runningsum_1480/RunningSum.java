package runningsum_1480;

/**
 * @author starcloud on 2020/7/26
 *
 * link https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * 一维数组的动态和
 */
public class RunningSum {

    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 4;
        nums[5] = 5;
        int[] ints = runningSum(nums);

        for (int i = 0;i< ints.length;i++){
            System.out.print(ints[i] +" ");
        }
        System.out.println();

    }

    public static int[] runningSum(int[] nums) {
        int[] result  = new int[nums.length];

        for (int i = 0;i< nums.length;i++){
            if(i == 0){
                result[i] = nums[0];
            }else {
                result[i] = result[i-1] +nums[i];
            }
        }
        return result;
    }
}
