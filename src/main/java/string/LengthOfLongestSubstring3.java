package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang hao
 * @created 2019/12/23 23:06
 * @contact 14274493
 */
public class LengthOfLongestSubstring3 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0, i = 0, j = 0, length = s.length();
        while (j < length) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            map.put(s.charAt(j), j + 1);
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(new LengthOfLongestSubstring3().lengthOfLongestSubstring(s));
    }
}
