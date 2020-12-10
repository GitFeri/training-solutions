package week07d04;

import java.time.LocalDate;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completed = true;
        this.completedAt = completedAt;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void complete() {
        this.completed = true;
        this.completedAt = LocalDate.now();
    }

    public void complete(LocalDate completedAt) {
        this.completed = true;
        this.completedAt = completedAt;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        if (completed) {
            return getTitle() + " " + completedAt;
        }
        return getTitle() + " folyatban";
    }
}
