package array;

/**
 * @author wang hao
 * @created 2019/12/25 21:49
 * @contact 14274493
 */
public class MaxArea {

    /**
     * 双指针法
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max = area > max ? area : max;
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }
}
