package string;

/**
 * @author wang hao
 * @created 2019/12/25 20:59
 * @contact 14274493
 */
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        String result = "";
        String temp;
        for (int center = 0; center < s.length(); center++) {
            String s1 = expandCenter(s, center, center);
            String s2 = expandCenter(s, center, center + 1);
            temp = s1.length() > s2.length() ? s1 : s2;
            result = temp.length() > result.length() ? temp : result;
        }
        return result;
    }

    /**
     * 中心扩散法
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    public static String expandCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    /**
     * 动态规划法（优化）
     *
     * @param s
     * @return
     */
    public static String dynamic(String s) {
        int length = s.length();
        int[][] arr = new int[length][length];
        String reverse = new StringBuffer(s).reverse().toString();
        int max = 0;
        String result = "";
        // 寻找公共子串
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < reverse.length(); j++) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                // 并要求子串倒置后的索引和倒置前要匹配上
                int afterReverse = length - 1 - i;
                if (afterReverse + arr[i][j]-1 == j && arr[i][j] > max) {
                    max = arr[i][j];
                    result = s.substring(i - max + 1, i + 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abaabc";
        System.out.println(longestPalindrome(s));
        System.out.println(dynamic(s));
    }
}
