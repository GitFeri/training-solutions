package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    private Day nextDay(Day day) {
        int i = day.ordinal();
        if (i < 6) {
            return Day.values()[i+1];
        } else {
            return Day.values()[0];
        }
    }

    List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> dayT = new ArrayList<>();
        Day day = firstDay;
        for (int i = 0; i < numberOfDays; i++) {
            dayT.add(day.getDayType());
            day = nextDay(day);
        }
        return dayT;
    }
}
