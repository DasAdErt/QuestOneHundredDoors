package locations;

import system.Random;

import java.util.Scanner;

public class Bunker {
    //first floor
    public static void firstDoor() {
        // не хватает сил открыть
        System.out.println("Мне не хватает сил открыть данную дверь, надо выбрать другую.");
        System.out.println();
    }

    public static void secondDoor() {
        // дальше проходит
        System.out.println("Я начал открывать дверь, она очень скрипела.\n" +
                "Я всё-таки смог открыть эту дверь и увдиел тёмный коридор.\n" +
                "Решил пойти в темноту, через страх. Дошёл до места, где моргал свет и снова увидел 3 двери.");
    }

    public static void threeDoor() {
        // дальше проходит
        System.out.println("Я начал открывать дверь, она очень скрипела.\n" +
                "Я всё-таки смог открыть эту дверь и увдиел тёмный коридор.\n" +
                "Решил пойти в темноту, через страх. Дошёл до места, где моргал свет и снова увидел 3 двери.");
    }

    //second floor
    public static void fourDoor() {
        // открыто, но после двери обвал
        System.out.println("Я начал открывать дверь и услышал, как начали падать камни с потолка.\n" +
                "Я не решился продолжить дальше открывать эту дверь.");
        System.out.println();
    }

    public static void fiveDoor() {
        // дальше проходит
        System.out.println("Я открыл дверь и там оказался каридор который вёл куда то в неизвестность.\n" +
                "Я шёл где то мин 15-20 и вижу какой то свет и нашёл дверь которая ведёт меня к другим дверям.");
    }

    public static void sixDoor() {
        // смерть
        System.out.println("Я открыл дверь и там ничего не видно.\n" +
                "Решил пройтись вперёд, но через 2 метра, я был уже в свободном падении.\n" +
                "Пролетел я так секунды 3 (3 секунды +- 7 этажей)");
        System.out.println();
        System.err.println("Вы умерли!");
    }

    //three floor
    public static void sevenDoor() {
        // закрыто
        System.out.println("Я открываю дверь, но она не как не хотелась открываться.");
    }

    public static void eightDoor() {
        // дальше проходит
        System.out.println("Я открываю дверь и вижу проход в другую дверь и там опять ждёт меня три двери.");
    }

    public static void nineDoor() {
        // код 936
        System.out.println("Я просто дёрнул дверь и увидел кодовый замок, и можно его попытаться его взломать.\n" +
                "На обратной стороне замка я увидел что-то на царапано какие-то цифры их было три цифры 6,3 и 9.");
    }

    public static void codeThreeFloor() {
        Scanner scanner = new Scanner(System.in);

        int pass = scanner.nextInt();

        switch (pass) {
            case 936:
                System.out.println("Вы угадали пароль!");
                break;
            case 0:
                BunkerFloors.secondFloor();
                break;
            default:
                System.err.println("Пароль не верен!");
                codeThreeFloor();
        }
    }

    //four floor
    public static void tenDoor() {
        // дальше проходит или закрыто( рандом )

        Random random = new Random();

        int randomNumber = random.randomNumberClosedOrOpened;

        switch (randomNumber) {
            case 1:
                // дальше проходит
                System.out.println("Я начал открывать эту дверь, она открылась с трудом," +
                        " ведь она не использовалсь много лет.\n" +
                        "За дверью находился затопленный коридор, но через весь коридор" +
                        " лежали доски по которым я и прошёл.\n" +
                        "В конце коридора наткнулся на 3 двери и 2 из них завалены.");
                break;
            default:// закрыта
                System.out.println("Я попытался открыть дверь, но она не открывалась.");
                break;
        }
    }

    public static void elevenDoor() {
        // дальше проходит
        System.out.println("Я начал открывать эту дверь, она открылась с трудом," +
                " ведь она не использовалсь много лет.\n" +
                "За дверью находился затопленный коридор, но через весь коридор" +
                " лежали доски по которым я и прошёл.\n" +
                "В конце коридора наткнулся на 3 двери и 2 из них завалены.");
    }

    public static void twelveDoor() {
        // дальше проходит
        System.out.println("Я начал открывать эту дверь, она открылась с трудом," +
                " ведь она не использовалсь много лет.\n" +
                "За дверью находился затопленный коридор, но через весь коридор" +
                " лежали доски по которым я и прошёл.\n" +
                "В конце коридора наткнулся на 3 двери и 2 из них завалены.");
    }

    //five floor
    public static void thirteenDoor() {
        // закрыто
        System.out.println("Эта дверь завалена камнями.");
    }

    public static void fourteenDoor() {
        // код 173
        System.out.println("Я подошёл в двери и снова увидел замок," +
                " и выбора у меня нет, я вынужден взламывать замок.\n" +
                "Посмотрев внимательнее я увидел на двери выцарапанные 3 числа 7,1 и 3.");
    }

    public static void fifteenDoor() {
        // закрыто
        System.out.println("Эта дверь завалена камнями.");
    }

    public static void end(){
        System.out.println("Ура! Я смог взломать последнюю дверь и выйти на ружу, как же я давно не был тут!");
    }

    public static void codeFiveFloor() {
        Scanner scanner = new Scanner(System.in);

        int pass = scanner.nextInt();

        switch (pass) {
            case 173:
                System.out.println("Вы угадали пароль!");
                break;
            default:
                System.err.println("Пароль не верен!");
                codeFiveFloor();
        }
    }
}
