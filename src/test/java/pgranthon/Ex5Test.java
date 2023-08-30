package pgranthon;

import org.junit.jupiter.api.Test;

import pgranthon.ex5.CustomDate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

public class Ex5Test {

    @Test public void testCustomDateInitialization() {
        CustomDate date1 = new CustomDate(29, 2, 2024);
        assertEquals(29, date1.getDay());
        assertEquals(2, date1.getMonth());
        assertEquals(2024, date1.getYear());

        CustomDate date2 = new CustomDate();
        Calendar calendar = Calendar.getInstance();
        assertEquals(calendar.get(Calendar.DAY_OF_MONTH), date2.getDay());
        assertEquals(calendar.get(Calendar.MONTH) + 1, date2.getMonth());
        assertEquals(calendar.get(Calendar.YEAR), date2.getYear());
    }

    @Test public void testSetDay() {
        CustomDate date = new CustomDate(15, 8, 2023);
        date.setDay(10);
        assertEquals(10, date.getDay());
    }

    @Test public void testSetMonth() {
        CustomDate date = new CustomDate(15, 8, 2023);
        date.setMonth(12);
        assertEquals(12, date.getMonth());
    }

    @Test public void testSetYear() {
        CustomDate date = new CustomDate(15, 8, 2023);
        date.setYear(2022);
        assertEquals(2022, date.getYear());
    }

    @Test public void testNextDay() {
        CustomDate date = new CustomDate(30, 12, 2023);
        date.nextDay();
        assertEquals(31, date.getDay());
        assertEquals(12, date.getMonth());
        assertEquals(2023, date.getYear());

        date = new CustomDate(31, 12, 2023);
        date.nextDay();
        assertEquals(1, date.getDay());
        assertEquals(1, date.getMonth());
        assertEquals(2024, date.getYear());
    }

    @Test public void testToString() {
        CustomDate date = new CustomDate(15, 8, 2023);
        assertEquals("15/08/2023", date.toString());
    }

    @Test public void testInvalidDay() {
        assertThrows(IllegalArgumentException.class, () -> new CustomDate(32, 8, 2023));
    }

    @Test public void testInvalidMonth() {
        assertThrows(IllegalArgumentException.class, () -> new CustomDate(15, 13, 2023));
    }

    @Test public void testInvalidYear() {
        assertThrows(IllegalArgumentException.class, () -> new CustomDate(15, 8, -2023));
    }
}

