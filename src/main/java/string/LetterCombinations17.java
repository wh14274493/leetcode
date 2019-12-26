package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang hao
 * @created 2019/12/26 23:55
 * @contact 14274493
 */
public class LetterCombinations17 {

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || "".equals(digits)) {
            return result;
        }
        combine(result, "", digits);
        return result;
    }

    public static void combine(List<String> result, String element, String s) {
        if (s == null || "".equals(s)) {
            result.add(element);
        }else{
            char[] charArray = getCharArray(s.charAt(0));
            for (int i = 0; i < charArray.length; i++) {
                String temp = element + charArray[i];
                combine(result, temp, s.substring(1));
            }
        }
    }

    public static char[] getCharArray(char s) {
        switch (s) {
            case '2':
                return new char[]{'a', 'b', 'c'};
            case '3':
                return new char[]{'d', 'e', 'f'};
            case '4':
                return new char[]{'g', 'h', 'i'};
            case '5':
                return new char[]{'j', 'k', 'l'};
            case '6':
                return new char[]{'m', 'n', 'o'};
            case '7':
                return new char[]{'p', 'q', 'r', 's'};
            case '8':
                return new char[]{'t', 'u', 'v'};
            case '9':
                return new char[]{'w', 'x', 'y', 'z'};
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        String s = "23";
        List<String> strings = letterCombinations(s);
        strings.forEach(e -> System.out.print(e + "\t"));
    }
}
