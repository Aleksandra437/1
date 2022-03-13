package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int day = 1;
        int month = 1;
        int year = 1;
        int hour = 0;
        int min = 0;
        int x = 1;
        String v = "";
        System.out.println("Дата: " + Date.Vivod(day, month, year, v));
        System.out.println("Время: " + Time.Vivod(hour, min, v));
        while (x!=0) {
            System.out.println("Что вы хотите изменить?");
            System.out.println("1 - дату, 2 - время, 3 - вывести дату и время, 0 - ничего");
            Scanner s = new Scanner(System.in);
            x = s.nextInt();
            if (x == 1) {
                System.out.println("Что вы хотите сделать?");
                System.out.println("1 - ввести дату, 2 - добавить дни, 3 - добавить месяцы, 4 - добавить годы");
                x = s.nextInt();
                if (x == 1){
                    System.out.print("Введите день = ");
                    day = s.nextInt();
                    System.out.print("Введите месяц = ");
                    month = s.nextInt();
                    System.out.print("Введите год = ");
                    year = s.nextInt();
                    year = Date.ProverkaYear(month, year, day);
                    month = Date.ProverkaMonth(day, month);
                    day = Date.ProverkaDay(day, month);
                    System.out.println("Дата: " + Date.Vivod(day, month, year, v));
                } else if (x == 2){
                    System.out.println("Сколько дней вы хотите добавить?");
                    x = s.nextInt();
                    day += x;
                    year = Date.ProverkaYear(month, year, day);
                    month = Date.ProverkaMonth(day, month);
                    day = Date.ProverkaDay(day, month);
                    System.out.println("Дата: " + Date.Vivod(day, month, year, v));
                } else if (x == 3){
                    System.out.println("Сколько месяцев вы хотите добавить?");
                    x = s.nextInt();
                    month += x;
                    year = Date.ProverkaYear(month, year, day);
                    month = Date.ProverkaMonth(day, month);
                    System.out.println("Дата: " + Date.Vivod(day, month, year, v));
                } else if (x == 4){
                    System.out.println("Сколько лет вы хотите добавить?");
                    x = s.nextInt();
                    year += x;
                    System.out.println("Дата: " + Date.Vivod(day, month, year, v));
                } else System.out.println("Неверная команда");
            } else if (x == 2) {
                System.out.println("Что вы хотите сделать?");
                System.out.println("1 - ввести время, 2 - добавить минуты, 3 - добавить часы");
                x = s.nextInt();
                if (x == 1){
                    System.out.print("Введите часы = ");
                    hour = s.nextInt();
                    System.out.print("Введите минуты = ");
                    min = s.nextInt();
                    day = Time.ProverkaDay(hour, day, min);
                    hour = Time.ProverkaHour(min, hour);
                    min = Time.ProverkaMin(min);
                    year = Date.ProverkaYear(month, year, day);
                    month = Date.ProverkaMonth(day, month);
                    day = Date.ProverkaDay(day, month);
                    System.out.println("Время: " + Time.Vivod(hour, min, v));
                } else if (x == 2){
                    System.out.println("Сколько минут вы хотите добавить?");
                    x = s.nextInt();
                    min += x;
                    day = Time.ProverkaDay(hour, day, min);
                    hour = Time.ProverkaHour(min, hour);
                    min = Time.ProverkaMin(min);
                    year = Date.ProverkaYear(month, year, day);
                    month = Date.ProverkaMonth(day, month);
                    day = Date.ProverkaDay(day, month);
                    System.out.println("Время: " + Time.Vivod(hour, min, v));
                } else if (x == 3){
                    System.out.println("Сколько часов вы хотите добавить?");
                    x = s.nextInt();
                    hour += x;
                    day = Time.ProverkaDay(hour, day, min);
                    hour = Time.ProverkaHour(min, hour);
                    year = Date.ProverkaYear(month, year, day);
                    month = Date.ProverkaMonth(day, month);
                    day = Date.ProverkaDay(day, month);
                    System.out.println("Время: " + Time.Vivod(hour, min, v));
                } else System.out.println("Неверная команда");
            } else if (x == 3) {
                System.out.println("Дата: " + Date.Vivod(day, month, year, v));
                System.out.println("Время: " + Time.Vivod(hour, min, v));
            } else if (x != 0) {
                System.out.println("Ошибка");
            }
        }
    }
}
