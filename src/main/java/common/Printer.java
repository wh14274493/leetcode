package common;

import java.util.List;
import java.util.Optional;

/**
 * @author wang hao
 * @created 2019/12/26 21:49
 * @contact 14274493
 */
public class Printer {

    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
    }

    public static void print(List<List<Integer>> result) {
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + "\t");
            }
            System.out.println();
        }
    }


}
