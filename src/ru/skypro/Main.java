package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //№1
//    int clientOC = 0;
////        if (clientOC == 0){
////            System.out.println("Установите версию приложения для iOS по ссылке");
////        }
////        if (clientOC == 1){
////            System.out.println("Установите версию приложения для Android по ссылке");
////        }
//        №2
//        int clientDeviceYear = 2014;
//        int clientOC = 1;
//        if (clientOC == 0 && clientDeviceYear >= 2015) {
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        }
//        if (clientOC == 0 && clientDeviceYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//        }
//        if (clientOC == 1 && clientDeviceYear >= 2015) {
//            System.out.println("Установите версию приложения для Android по ссылке");
//        }
//        if (clientOC == 1 && clientDeviceYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для Android по ссылке");
//        }
//        №3
//        int year = 2021;
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            System.out.println(year+ " год является високосным");
//        }
//        else{
//            System.out.println(year+ " год не является високосным");
//        }
//        №4
//       int delivereyDistance = 10;
//       int уstimatedDeliveryTime = 0;
//       if(delivereyDistance <= 20){
//           уstimatedDeliveryTime += 1;
//           System.out.println("Потребуется дней: " +уstimatedDeliveryTime);
//          }
//        if(delivereyDistance > 20 && delivereyDistance <= 60){
//            уstimatedDeliveryTime += 2;
//            System.out.println("Потребуется дней: " +уstimatedDeliveryTime);
//        }
//        if(delivereyDistance > 60 && delivereyDistance <= 100){
//            уstimatedDeliveryTime += 3;
//            System.out.println("Потребуется дней: " +уstimatedDeliveryTime);
//        }
//        if(delivereyDistance > 100){
//            уstimatedDeliveryTime += 4;
//            System.out.println("Потребуется дней: " +уstimatedDeliveryTime);
//        }
//        №5

        int monthNumber = 7;
        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                break;

        }
    }
}
