package array;

import common.Printer;

/**
 * @author wang hao
 * @created 2019/12/26 21:26
 * @contact 14274493
 */
public class Sort {

    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int L = left, R = right, point = nums[L];
            while (L < R) {
                while (L < R && nums[R] >= point) {
                    R--;
                }
                if (L < R) {
                    nums[L] = nums[R];
                }
                while (L < R && nums[L] <= point) {
                    L++;
                }
                if (L < R) {
                    nums[R] = nums[L];
                }
            }
            nums[L] = point;
            quickSort(nums, left, L - 1);
            quickSort(nums, L + 1, right);
        }
    }

    public static void bubbleSort(int[] nums) {
        int length = nums.length, temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {-1, 0, 1, 2, -1, -4};
        quickSort(nums, 0, nums.length - 1);
        Printer.print(nums);
        bubbleSort(nums2);
        Printer.print(nums2);
    }
}
