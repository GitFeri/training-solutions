package week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> progList = new ArrayList<>();

        progList.add("Java");
        progList.add("Phyton");
        progList.add("JavaScript");

        for (String prog : progList) {
            if (prog.length() > 5) {
                System.out.println(prog);
            }

        }
    }
}
