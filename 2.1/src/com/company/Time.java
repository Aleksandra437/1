package com.company;

public class Time {
    int hour;
    int min;

    public Time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public static String Vivod(int hour, int min, String v) {
        if (hour < 10) {
            v = "0" + hour + "" + ":";
        } else v = hour + ":";
        if (min < 10) {
            v += "0" + min;
        } else v += min;
        return v;
    }

    public static int ProverkaMin(int m) {
        if (m >= 60) {
            m = m % 60;
        }
        return m;

    }

    public static int ProverkaHour(int m, int h) {
        if (m >= 60) {
            h += m / 60;
        }
        if (h >= 24) {
            h = h % 24;
        }
        return h;
    }

    public static int ProverkaDay(int h, int d, int m) {
        if (m >= 60) {
            h += m / 60;
        }
        if (h >= 24) {
            d += h / 24;
        }
        return d;
    }
}
