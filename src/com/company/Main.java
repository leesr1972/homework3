package com.company;

public class Main {

    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("У Вас неверно введен номер операционной системы.");
        }

        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }

        int year = 2021;
        var remainderof4 = year % 4;
        var remainderof100 = year % 100;
        var remainderof400 = year % 400;
        if (remainderof4 == 0 || remainderof400 == 0) {
            if (remainderof100 != 0) {
                System.out.println(year + " год является високосным.");
            }
            else System.out.println(year + " год не является високосным.");
        }
        else System.out.println(year + " год не является високосным.");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Мы доставим Вашу карту завтра!");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Мы доставим Вашу карту послезавтра!");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Мы доставим Вашу карту в течение 3-х дней!");
        }
        if (deliveryDistance > 100) {
            System.out.println("К сожалению мы не сможем доставить Вам карту, так как Вы слишком далеко живете.");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(monthNumber + "-й месяц относится к зиме.");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + "-й месяц относится к весне.");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + "-й месяц относится к лету.");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + "-й месяц относится к осени.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}
