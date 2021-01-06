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
        int level;
        String name;

        for (String skill : skills) {
            pos = skill.indexOf('(');
            name = skill.substring(0, pos - 1);
            level = Integer.parseInt(skill.substring(pos + 1, skill.length() - 1));
            this.skills.add(new Skill(name, level));
        }
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int findSkillLevelByName(String name) {
        for (Skill skill : skills) {
            if (skill.getName().equals(name)) {
                return skill.getLevel();
            }
        }
        throw new IllegalArgumentException("");
    }
}

