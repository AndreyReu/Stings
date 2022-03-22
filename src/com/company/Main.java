package com.company;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }


    //    Задание №1:
    public static void task1() {
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);


        //    Задание №2:
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
    }


    //        Задание №3:
    public static void task2() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }


    //    Видеоурок:
    public static void exampleHM() {
        String phone = "+960-415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный ");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий ");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас постороний ");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех ");
        } else {
            System.out.println("Неудача ");
        }
    }
}

