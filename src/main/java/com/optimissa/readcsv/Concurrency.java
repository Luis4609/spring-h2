package com.optimissa.readcsv;

import com.opencsv.bean.CsvBindByPosition;

public class Concurrency {

    @CsvBindByPosition(position = 0)
    private String concurrencyId;

    @CsvBindByPosition(position = 1)
    private String year;

    @CsvBindByPosition(position = 2)
    private String month;

    @CsvBindByPosition(position = 3)
    private String dayOfMonth;

    public String getConcurrencyId() {
        return this.concurrencyId;
    }

    public void setConcurrencyId(String concurrencyId) {
        this.concurrencyId = concurrencyId;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    @Override
    public String toString() {
        return "{" +
                " concurrencyId='" + getConcurrencyId() + "'" +
                ", year='" + getYear() + "'" +
                ", month='" + getMonth() + "'" +
                ", dayOfMonth='" + getDayOfMonth() + "'" +
                "}";
    }

    public Concurrency() {
    }

    public Concurrency(String concurrencyId, String year, String month, String dayOfMonth) {
        this.concurrencyId = concurrencyId;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

}
