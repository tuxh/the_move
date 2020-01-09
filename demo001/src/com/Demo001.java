package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo001 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2019-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate);
        System.out.println("version_01");
        System.out.println("version_02");
        System.out.println("change");
    }

}
