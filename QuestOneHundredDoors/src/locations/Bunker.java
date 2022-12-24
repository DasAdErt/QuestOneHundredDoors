package locations;

import characters.Personages;

import java.util.Scanner;

public class Bunker {
    //first floor
    public static void firstDoor() {
        // не хватает сил открыть
        System.out.println("Мне не хватает сил открыть данную дверь, надо выбрать другую.");
    }

    public static void secondDoor() {
        // дальше проходит
        System.out.println("Я начал открывать дверь, она очень скрипела.\n" +
                " Я всё-таки смог открыть эту дверь и увдиел тёмный коридор.\n" +
                "Решил пойти в темноту, через страх. Дошёл до места, где моргал свет и снова увидел 3 двери.");
    }

    public static void threeDoor() {
        // дальше проходит
        System.out.println("Я начал открывать дверь, она очень скрипела.\n" +
                " Я всё-таки смог открыть эту дверь и увдиел тёмный коридор.\n" +
                "Решил пойти в темноту, через страх. Дошёл до места, где моргал свет и снова увидел 3 двери.");
    }

    public static void firstFloor() {
        Personages.bunkerDescription();

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.FirstDoor\n2.SecondDoor\n3.ThreeDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        switch (firstChoise) {
            case 1:
                firstDoor();
                System.out.println("Выберите одну из 3 дверей.\n" +
                        "1.SecondDoor\n2.ThreeDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                switch (secondChoise) {
                    case 1:
                        secondDoor();
                        break;
                    case 2:
                        threeDoor();
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        break;
                }

                break;
            case 2:
                secondDoor();
                break;
            case 3:
                threeDoor();
                break;
            default:
                System.err.println("Такой двери не существует.");
                break;
        }
    }

    //second floor
    public static void fourDoor() {
        // открыто, но после двери обвал
        System.out.println("Я начал открывать дверь и услышал, как начали падать камни с потолка.\n" +
                "Я не решился продолжить дальше открывать эту дверь.");
    }

    public static void fiveDoor() {
        // дальше проходит
        System.out.println("Я открыл дверь и там оказался каридор который вёл куда то в неизвестность.\n" +
                "Я шёл где то мин 15-20 и вижу какой то свет и нашел дверь которая ведёт меня к другим дверям.");
    }

    public static void sixDoor() {
        // смерть
        System.out.println("Я открыл дверь и там ничего не видно.\n" +
                "Решил пройтись вперёд, но через 2 метра, я был уже в свободном падении.\n" +
                "Пролетел я так секунды 3 (3 секунд +- 7 этажей)");
    }

    public static void secondFloor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.FourDoor\n2.FiveDoor\n3.SixDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        switch (firstChoise) {
            case 1:
                fourDoor();
                System.out.println("Выберите одну из 3 дверей.\n" +
                        "1.FiveDoor\n2.SixDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                switch (secondChoise) {
                    case 1:
                        fiveDoor();
                        break;
                    case 2:
                        sixDoor();
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        break;
                }

                break;
            case 2:
                fiveDoor();
                break;
            case 3:
                sixDoor();
                break;
            default:
                System.err.println("Такой двери не существует.");
                break;
        }
    }

    //three floor
    public static void sevenDoor() {
        // закрыто
        System.out.println("Я открываю дверь, но она не как не хотелась открываться.");
    }

    public static void eightDoor() {
        // дальше проходит
        System.out.println("Я открываю дверь и вижу проход в другую дверь и там опять ждёт меня три  двери.");
    }

    public static void nineDoor() {
        // код 936
        System.out.println("Я просто дёрнул дверь и увидел кодовый замок, и можно его попытаться его взломать.\n" +
                "На обратной стороне замка я увидел что-то на царапано какие-то цифры их было три цифры 6,3 и 9.");
    }

    public static void threeFloor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.SevenDoor\n2.EightDoor\n3.NineDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        switch (firstChoise) {
            case 1:
                sevenDoor();
                System.out.println("Выберите одну из 3 дверей.\n" +
                        "1.EightDoor\n2.NineDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                switch (secondChoise) {
                    case 1:
                        eightDoor();
                        break;
                    case 2:
                        nineDoor();

                        System.out.println("Введите код составленный из чисел 6,3 и 9.\n" +
                                "0. Для выхода из взлома замка.");

                        codeSecondFloor(); //code 936
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        break;
                }

                break;
            case 2:
                eightDoor();
                break;
            case 3:
                nineDoor();

                System.out.println("Введите код составленный из чисел 6,3 и 9.\n" +
                        "0. Для выхода из взлома замка.");

                codeSecondFloor(); //code 936
                break;
            default:
                System.err.println("Такой двери не существует.");
                break;
        }
    }

    public static void codeSecondFloor(){
        Scanner scanner = new Scanner(System.in);

        int pass = scanner.nextInt();

        switch (pass) {
            case 936:
                System.out.println("Вы угадали пароль!");
                break;
            case 0:
                secondFloor();
                break;
            default:
                System.out.println("Пароль не верен!");
                codeSecondFloor();
        }
    }

    //four floor
    public static void tenDoor() {
        // дальше проходит или закрыто( рандом )  (пока что закрыто 100%)

        System.out.println("Я попытался открыть дверь, но она не открывалась.");

         //int fromTheNumber = 1;
         //int upToTheNumber = 2;

         //int randomNumber = fromTheNumber + (int) (Math.random() * upToTheNumber);

        //System.out.println("Проверка случайного числа" + randomNumber);

        //switch (randomNumber) {
           // case 1:
                // дальше проходит
                //System.out.println("Я начал открывать эту дверь, она открылась с трудом," +
                //        " ведь она не использовалсь много лет.\n" +
                 //       " За дверью находился затопленный коридор, но через весь коридор" +
                 //       " лежали доски по которым я и прошёл.\n" +
                 //       " В конце коридора наткнулся на 3 двери и 2 из них завалены.");
                //break;
           // case 2:
                // закрыто
           //     System.out.println("Я попытался открыть дверь, но она не открывалась.");
           //     break;
           // default:
            //    System.err.println("Не повезло, выпало не то число.");
            //    tenDoor();
        //}
    }

    public static void elevenDoor() {
        // дальше проходит
        System.out.println("Я начал открывать эту дверь, она открылась с трудом," +
                " ведь она не использовалсь много лет.\n" +
                " За дверью находился затопленный коридор, но через весь коридор" +
                " лежали доски по которым я и прошёл.\n" +
                " В конце коридора наткнулся на 3 двери и 2 из них завалены.");
    }

    public static void twelveDoor() {
        // дальше проходит
        System.out.println("Я начал открывать эту дверь, она открылась с трудом," +
                " ведь она не использовалсь много лет.\n" +
                " За дверью находился затопленный коридор, но через весь коридор" +
                " лежали доски по которым я и прошёл.\n" +
                " В конце коридора наткнулся на 3 двери и 2 из них завалены.");
    }

    public static void fourFloor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.TenDoor\n2.ElevenDoor\n3.TwelveDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        switch (firstChoise) {
            case 1:
                tenDoor();

                System.out.println("Выберите одну из 3 дверей.\n" +
                        "1.ElevenDoor\n2.TwelveDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                switch (secondChoise) {
                    case 1:
                        elevenDoor();
                        break;
                    case 2:
                        twelveDoor();
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        break;
                }

                break;
            case 2:
                elevenDoor();
                break;
            case 3:
                twelveDoor();
                break;
            default:
                System.err.println("Такой двери не существует.");
                break;
        }
    }

    //five floor
    public static void thirteenDoor() {
        // закрыто
        System.out.println("Эта дверь завалена камнями.");
    }

    public static void fourteenDoor() {
        // код 173
        System.out.println("Я подошёл в двери и снова увидел замок, " +
                "и выбора у меня нет, я вынужден взламывать замок.\n" +
                " Посмотрев внимательнее я увидел на двери выцарапанные 3 числа 7,1 и 3.");
    }

    public static void fifteenDoor() {
        // закрыто
        System.out.println("Эта дверь завалена камнями.");
    }

    public static void fiveFloor() {
        // closed
        //code 173
        //closed
    }
}