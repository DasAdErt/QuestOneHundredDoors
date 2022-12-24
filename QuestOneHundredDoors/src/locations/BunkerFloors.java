package locations;

import characters.Personages;
import system.Random;

import java.util.Scanner;

public class BunkerFloors extends Bunker{

    public static void firstFloor() {
        Personages.bunkerDescription();

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.FirstDoor\n2.SecondDoor\n3.ThreeDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                firstDoor();
                System.out.println("Выберите одну из 2 дверей.\n" +
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
                        firstFloor();
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
                firstFloor();
                break;
        }
    }

    public static void secondFloor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.FourDoor\n2.FiveDoor\n3.SixDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                fourDoor();
                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.FiveDoor\n2.SixDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                System.out.println();

                switch (secondChoise) {
                    case 1:
                        fiveDoor();
                        break;
                    case 2:
                        sixDoor();
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        secondFloor();
                        break;
                }

                break;
            case 2:
                fiveDoor();
                break;
            case 3:
                sixDoor();
                System.exit(0);
                break;
            default:
                System.err.println("Такой двери не существует.");
                secondFloor();
                break;
        }
    }

    public static void threeFloor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.SevenDoor\n2.EightDoor\n3.NineDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                sevenDoor();
                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.EightDoor\n2.NineDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                System.out.println();

                switch (secondChoise) {
                    case 1:
                        eightDoor();
                        break;
                    case 2:
                        nineDoor();

                        System.out.println("Введите код составленный из чисел 6,3 и 9.\n" +
                                "0. Для выхода из взлома замка и выбрать другую дверь.");

                        codeThreeFloor(); //code 936
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        threeFloor();
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

                codeThreeFloor(); //code 936
                break;
            default:
                System.err.println("Такой двери не существует.");
                threeFloor();
                break;
        }
    }

    public static void fourFloor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.TenDoor\n2.ElevenDoor\n3.TwelveDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                tenDoor();

                Random random = new Random();
                int randomNumber = random.randomNumberClosedOrOpened;

                switch (randomNumber) {
                    case 1:
                        System.out.println("Выберите одну из 2 дверей.\n" +
                                "1.ElevenDoor\n2.TwelveDoor.");
                        System.out.print("Your choise: ");

                        int secondChoise = scan.nextInt();

                        System.out.println();

                        switch (secondChoise) {
                            case 1:
                                elevenDoor();
                                break;
                            case 2:
                                twelveDoor();
                                break;
                            default:
                                System.err.println("Такой двери не существует.");
                                fourFloor();
                                break;
                        }
                        break;
                    default:
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
                fourFloor();
                break;
        }
    }

    public static void fiveFloor() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.ThirteenDoor\n2.FourteenDoor\n3.FifteenDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                thirteenDoor();
                System.out.println("Выберите одну дверь.\n" +
                        "1.FourteenDoor");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                System.out.println();

                switch (secondChoise) {
                    case 1:
                        fourteenDoor();
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        fiveFloor();
                        break;
                }

                break;
            case 2:
                fourteenDoor();

                System.out.println("Введите код составленный из чисел 7,1 и 3.");

                codeFiveFloor(); //code 173
                break;
            case 3:
                fifteenDoor();

                System.out.println("Выберите одну дверь.\n" +
                        "1.FourteenDoor");
                System.out.print("Your choise: ");

                int threeChoise = scan.nextInt();

                System.out.println();

                switch (threeChoise) {
                    case 1:
                        fourteenDoor();
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        fiveFloor();
                        break;
                }
                break;
            default:
                System.err.println("Такой двери не существует.");
                fiveFloor();
                break;
        }
    }

    public static void callingVoidsBunker() {
        firstFloor();
        System.out.println();
        secondFloor();
        System.out.println();
        threeFloor();
        System.out.println();
        fourFloor();
        System.out.println();
        fiveFloor();
        System.out.println();
        end();
        System.out.println();
    }
}
