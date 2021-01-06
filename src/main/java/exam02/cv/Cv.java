package exam02.cv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cv {
    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public void addSkills(String... skills) {
        int pos;
        String levelStr;
        String name;

        for (String skill : skills) {
            pos = skill.indexOf('(');
            name = skill.substring(0, pos - 1);
            levelStr = skill.substring(pos, skill.length());
            // ????
            this.skills.add(new Skill(name, 0));
        }
    }


    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int findSkillLevelByName(String name) {
        if (!name.equals("")) {
            //            try {
//                throw new SkillNotFoundException("");
//            } catch (SkillNotFoundException e) {
//                e.printStackTrace();
//            }

            throw new IllegalArgumentException("");


        }
        {
            return 0;
        }
    }
}
