import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReturnLongestLineInterface text = (a, strs) -> {
//            ArrayList <String> list = new ArrayList<>(List.of(lines));
//            Collections.sort(list, (c, b) -> Integer.compare(c.length(), b.length()));
            String st = "";
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].substring(0, a.length()).equals(a)) {
                    if (strs[i].length() > st.length()) {
                        st = strs[i];
                    }
                }
            }
            return st;
        };
        System.out.println(text.longestLine("g", "ghh", "sfddfsdfv", "ggggg"));

    }
}