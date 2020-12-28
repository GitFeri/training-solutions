package catalog;

import java.util.List;

public class Validators {

    private Validators() {
    }

    public static boolean isBlank(String st) {
        return st == null || "".equals(st.trim());
    }

    public static boolean isEmpty(List<String> list) {
        return (list == null) || list.isEmpty();
    }
}
