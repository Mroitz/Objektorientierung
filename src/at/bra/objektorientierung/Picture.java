package at.bra.objektorientierung;

import java.sql.Date;

public class Picture {
    private int id;
    private String name;
    private Date date;
    private double size;

    public Picture(String name, Date date, double size) {

    }

    public int getId() {
        return this.id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;

    }

    public double getSize() {
        return size;
    }
}