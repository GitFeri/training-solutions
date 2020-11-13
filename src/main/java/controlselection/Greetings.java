package controlselection;

public class Greetings {
    public String greet(int hour, int minute) {
        int dayMinutes = 60 * hour + minute;
        if (dayMinutes <= 5 * 60) {
            return "jó éjt";
        } else if (dayMinutes <= 9 * 60) {
            return "jó reggelt";
        } else if (dayMinutes <= 18 * 60 + 30) {
            return "jó napot";
        } else if (dayMinutes <= 20 * 60) {
            return "jó estét";
        } else return "jó éjt";
    }
}
