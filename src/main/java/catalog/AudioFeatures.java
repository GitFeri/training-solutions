package catalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AudioFeatures implements Feature {

    private final String title;
    private final int length;
    private final List<String> performers;
    private final List<String> composer;

    public AudioFeatures(String title, int length, List<String> performers) {
        this(title, length, performers, Collections.emptyList());
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if ("".equals(title) || length <= 0) {
            throw new IllegalArgumentException("");
        }

        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>(composer);
        result.addAll(performers);
        return result;
    }
}
