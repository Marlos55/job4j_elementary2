package ru.job4j;

public class SwitchWeek {
    public static void nameOfDay(int day){
        String name;
        switch (day) {
            case 7:
                name = "пон";
                break;
            case 6:
                name = "вт";
                break;
            case 5:
                name = "ср";
                break;
            case 4:
                name = "чт";
                break;
            case 3:
                name = "пт";
                break;
            case 2:
                name = "сб";
                break;
            case 1:
                name = "вс";
                break;
        }
        return name;

    }
}
