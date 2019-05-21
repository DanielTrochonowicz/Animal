package Animal.Utils;


import org.joda.time.Days;
import org.joda.time.*;

public class FeedingDate {
    private LocalDate date;

    public FeedingDate(){
        this.setCurrentDateAsFeedignDate();
    }

    private void setCurrentDateAsFeedignDate(){
        this.date =  LocalDateTime.now().toLocalDate();
    }

    public int calculateHowManyDaysWasFed(){
        return Days.daysBetween(date, LocalDateTime.now().toLocalDate()).getDays();
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
