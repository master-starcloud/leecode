package shuffle_1470;

/**
 * @author starcloud on 2020/7/26
 * link https://leetcode-cn.com/problems/shuffle-the-array/
 * 重新排列数组
 */
public class Shuffle {

    public static void main(String[] args) {
        int n =4;
        int[] nums = new int[2*n];
        nums[0] = 2;
        nums[1] = 5;
        nums[2] = 1;
        nums[3] = 3;
        nums[4] = 4;
        nums[5] = 7;
        nums[6] = 6;
        nums[7] = 7;


        int[] ints = shuffle(nums,n);

        for (int i = 0;i< ints.length;i++){
            System.out.print(ints[i] +" ");
        }
        System.out.println();
    }

    /**
     * 直接判断位置
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0, j = nums.length / 2;
        int t = 0;
        while(i < nums.length / 2 && j < nums.length){
            result[t++] = nums[i];
            result[t++] = nums[j];
            i++;
            j++;
        }
        return result;


    }
}
