package week12d05;

public class CovidFromIndexMain {
    public static void main(String[] args) {
        CovidFromIndex covidFromIndex = new CovidFromIndex();
        int lines = covidFromIndex.WordInFileLine("koronavírus", "index.html");
        System.out.println("koronavírus-t tartalmazó sorok száma: " + lines);
    }
}
