package com.company;

public class Date {
    int day;
    int month;
    int year;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static String Vivod (int day, int month, int year, String v){
        if (day<10){
            v = "0" + day + ".";
        }else v = day + ".";
        if (month<10){
            v += "0" + month + ".";
        }else v += month + ".";
        if (year<10){
            v += "000" + year;
        }else if (year<100){
            v += "00" + year;
        }else if (year<1000){
            v += "0" + year;
        }else v += year;
        return v;
    }

    public static int ProverkaDay(int d, int m){
        while (d>28) {
            if (m == 2 && d > 28) {
                d = d - 28;
            } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
                d = d - 30;
            } else if (d > 31) {
                d = d - 31;
            } else break;
        }
        return d;
    }

    public static int ProverkaMonth(int d, int m){
        while (d>28) {
            if (m == 2 && d >= 28) {
                m++;
                d = d - 28;
            } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
                m++;
                d = d - 30;
            } else if (d > 31) {
                m++;
                d = d - 31;
            } else break;
        }
        if (m>12) {
            m = m%12;
        }
        return m;
    }

    public static int ProverkaYear(int m, int y, int d){
        while (d>28) {
            if (m == 2 && d >= 28) {
                m++;
                d = d - 28;
            } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
                m++;
                d = d - 30;
            } else if (d > 31) {
                m++;
                d = d - 31;
            } else break;
        }
        if (m>12) y += m/12;
        return y;
    }
}
