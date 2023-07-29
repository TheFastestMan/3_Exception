package finalTask;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String name;
    private int number;
    private LocalDate createdDate;

    public User(String name, int number, LocalDate createdDate) {
        this.name = name;
        this.number = number;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getNumber() == user.getNumber() && Objects.equals(getName(),
                user.getName()) && Objects.equals(getCreatedDate(), user.getCreatedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber(), getCreatedDate());
    }

    @Override
    public String toString() {
        return name + number + createdDate;
    }
}
