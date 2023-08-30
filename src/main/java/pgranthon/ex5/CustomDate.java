package pgranthon.ex5;

import java.util.Calendar;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate (int day, int month, int year) {
        if (validateDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public CustomDate() {
        Calendar calendar = Calendar.getInstance();
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public int getDay() { return this.day; }
    public int getMonth() { return this.month; }
    public int getYear() { return this.year; }

    public void setDay(int day) {
        if (validateDate(day, this.month, this.year)) this.day = day;
        else throw new IllegalArgumentException("Dia inválido.");
    }

    public void setMonth(int month) {
        if (validateDate(this.day, month, this.year)) this.month = month;
        else throw new IllegalArgumentException("Mês inválido.");
    }

    public void setYear(int year) {
        if (validateDate(this.day, this.month, year)) this.year = year;
        else throw new IllegalArgumentException("Ano inválido.");
    }

    public void nextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    @Override public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    private boolean validateDate(int day, int month, int year) {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysNoMonth(month, year)) return false;
        if (year < 1) return false;
        return true;
    }

    private int daysNoMonth(int month, int year) {
        int[] daysPorMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return 29;
        }
        return daysPorMonth[month];
    }

}
