import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();



    }


    public static void printYear(int year) {
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + " год является високосный");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задание 1");
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        printYear(year);
    }






    public static void printVersionOfApplication(int yearOfRealize, int clientOS) {
        int currentYear = 2023;
        if (yearOfRealize < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (yearOfRealize == currentYear && clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (yearOfRealize == currentYear && clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (yearOfRealize < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год выпуска вашего телефона:");
        int yearOfRealize = console.nextInt();
        System.out.println("Введите 0, если у Ваша операционная система - iOS; 1, если Android.");
        int clientOS = console.nextInt();
        printVersionOfApplication(yearOfRealize, clientOS);
    }







    public static void printDeliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance<=20){
            deliveryTime =deliveryTime +1;
            System.out.println("для доставки потребуется дней: "+ deliveryTime);
        } else if (deliveryDistance<=60) {
            deliveryTime =deliveryTime +2;
            System.out.println("для доставки потребуется дней: "+ deliveryTime);
        } else if (deliveryDistance<=100){
            deliveryTime =deliveryTime +3;
            System.out.println("для доставки потребуется дней: "+ deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дистанцию до клиента");
        int deliveryDistance = console.nextInt();
        printDeliveryTime(deliveryDistance);
    }
}