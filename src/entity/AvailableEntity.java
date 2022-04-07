package entity;

import java.time.LocalDate;

public class AvailableEntity {
    private boolean available;
    private LocalDate startDate;
    private LocalDate endDate;

    public AvailableEntity(){}

    public AvailableEntity(boolean available){
        this.available = available;
    }

    public AvailableEntity(boolean available, LocalDate startDate){
        this.available = available;
        this.startDate = startDate;
    }

    public AvailableEntity(boolean available, LocalDate startDate, LocalDate endDate) {
        this.available = available;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Available{" +
                ", available=" + available +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
