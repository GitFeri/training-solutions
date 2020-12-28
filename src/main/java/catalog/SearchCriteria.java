package catalog;

public class SearchCriteria {

    public final String title;
    public final String contributor;

    private SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        if (title == null || contributor == null) {
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title, contributor);
    }

    public static SearchCriteria createByContributor(String contributor) {
        return createByBoth("", contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        return createByBoth(title, "");
    }

    public boolean hasContributor() {
        return !Validators.isBlank(contributor);
    }

    public boolean hasTitle() {
        return !Validators.isBlank(title);
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
