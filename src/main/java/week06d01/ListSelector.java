package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {
      public String secondItem(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("list is null!");
        }

        if (list.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder("[" + list.get(0));
        for (int i = 2; i < list.size(); i = i + 2) {
            result.append("," + list.get(i));
        }

        return result.append("]").toString();
    }

}


