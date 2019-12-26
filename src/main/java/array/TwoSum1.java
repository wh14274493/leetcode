package array;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            int temp = target - nums[index];
            for (int j = index + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    return new int[]{index, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums,target));
    }
}
