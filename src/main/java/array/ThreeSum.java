package array;

import common.Printer;

import java.util.*;

/**
 * @author wang hao
 * @created 2019/12/26 21:25
 * @contact 14274493
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        Sort.quickSort(nums, 0, length - 1);
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length - 2; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                int left = i + 1;
                int right = length - 1;
                int point = nums[i];
                int temp = 0 - point;
                Set<Integer> data = new HashSet<>();
                while (left < right) {
                    if (nums[left] + nums[right] < temp) {
                        left++;
                    } else if (nums[left] + nums[right] > temp) {
                        right--;
                    } else {
                        if (!data.contains(nums[left])) {
                            List<Integer> element = new ArrayList<>();
                            element.add(point);
                            element.add(nums[left]);
                            element.add(nums[right]);
                            result.add(element);
                            data.add(nums[left]);
                            data.add(nums[right]);
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        Printer.print(result);
    }
}
