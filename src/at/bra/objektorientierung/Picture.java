package at.bra.objektorientierung;

import java.sql.Date;
import java.time.LocalDate;

public class Picture {
    private String name;
    private LocalDate date;
    private int size;

    public Picture(String name, LocalDate date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;

    }

    public double getSize() {
        return size;
    }
}