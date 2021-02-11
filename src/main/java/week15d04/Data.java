package week15d04;

public class Data {
    private String year_week;
    private int cases_weekly;
    private String countries;

    public Data(String year_week, int cases_weekly, String countries) {
        this.year_week = year_week;
        this.cases_weekly = cases_weekly;
        this.countries = countries;
    }

    public String getYear_week() {
        return year_week;
    }

    public int getCases_weekly() {
        return cases_weekly;
    }

    public String getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Data{" +
                "year_week='" + year_week + '\'' +
                ", cases_weekly=" + cases_weekly +
                ", countries='" + countries + '\'' +
                '}';
    }
}
