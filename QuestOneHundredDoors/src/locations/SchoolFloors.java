package locations;

import characters.Personages;
import system.Random;

import java.util.Scanner;

public class SchoolFloors extends School {

    public static void firstFloor() {
        Personages.schoolDescription();

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.FirstDoor\n2.SecondDoor\n3.ThreeDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                firstDoor();
                break;
            case 2:
                secondDoor();

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.FirstDoor\n2.ThreeDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                switch (secondChoise) {
                    case 1:
                        firstDoor();
                        break;
                    case 2:
                        threeDoor();

                        Random random = new Random();
                        int randomNumber = random.randomNumberClosedOrOpened;

                        switch (randomNumber) {
                            case 1:
                                break;
                            default:
                                System.out.println("Выберите одну дверь.\n" +
                                        "1.FirstDoor\n.");
                                System.out.print("Your choise: ");

                                int threeChoise = scan.nextInt();

                                System.out.println();

                                switch (threeChoise) {
                                    case 1:
                                        firstDoor();
                                        break;
                                    default:
                                        System.err.println("Такой двери не существует.");
                                        firstFloor();
                                        break;
                                }
                                break;
                        }
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        firstFloor();
                        break;
                }
                break;
            case 3:
                threeDoor();

                Random random = new Random();
                int randomNumber = random.randomNumberClosedOrOpened;

                switch (randomNumber) {
                    case 1:
                        break;
                    default:
                        System.out.println("Выберите одну из 2 дверей.\n" +
                                "1.FirstDoor\n2.SecondDoor.");
                        System.out.print("Your choise: ");

                        int threeChoise = scan.nextInt();

                        System.out.println();

                        switch (threeChoise) {
                            case 1:
                                firstDoor();
                                break;
                            case 2:
                                secondDoor();

                                System.out.println("Выберите одну дверь.\n" +
                                        "1.FirstDoor.");
                                System.out.print("Your choise: ");

                                int fourChoise = scan.nextInt();

                                switch (fourChoise) {
                                    case 1:
                                        firstDoor();
                                        break;
                                    default:
                                        System.err.println("Такой двери не существует.");
                                        firstFloor();
                                        break;
                                }
                                break;
                            default:
                                System.err.println("Такой двери не существует.");
                                break;
                        }
                        break;
                }
                break;
            default:
                System.err.println("Такой двери не существует.");
                firstFloor();
                break;
        }
    }

    public static void secondFloor() { //four five six
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.FourDoor\n2.FiveDoor\n3.SixDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                fourDoor();
                break;
            case 2:
                fiveDoor();
                break;
            case 3:
                sixDoor();
                break;
            default:
                System.err.println("Такой двери не существует.");
                secondFloor();
                break;
        }
    }

    public static void threeFloor() { //seven eight nine

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.SevenDoor\n2.EightDoor\n3.NineDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                sevenDoor();

                Random random = new Random();
                int randomNumber = random.randomNumberClosedOrOpened;

                switch (randomNumber) {
                    case 1:
                        System.out.println("Выберите одну из 2 дверей.\n" +
                                "1.EightDoor\n2.NineDoor.");
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
                                threeFloor();
                                break;
                        }
                        break;
                    default:
                        System.exit(0);
                        break;
                }

                break;
            case 2:
                eightDoor();
                System.exit(0);
                break;
            case 3:
                nineDoor();
                break;
            default:
                System.err.println("Такой двери не существует.");
                threeFloor();
                break;
        }
    }

    public static void fourFloor() { //ten eleven twelve

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.TenDoor\n2.ElevenDoor\n3.TwelveDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                tenDoor();
                break;
            case 2:
                elevenDoor();
                System.exit(0);
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

    public static void fiveFloor() { //thirteen fourteen fifteen
        // closed
        // дальше проходит
        // closed

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.ThirteenDoor\n2.FourteenDoor\n3.FifteenDoor.");
        System.out.print("Your choise: ");

        int firstChoise = scan.nextInt();

        System.out.println();

        switch (firstChoise) {
            case 1:
                tenDoor();

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.FourteenDoor\n2.FifteenDoor.");
                System.out.print("Your choise: ");

                int secondChoise = scan.nextInt();

                switch (secondChoise){
                    case 1://opened
                        break;
                    case 2://closed
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        fiveFloor();
                        break;
                }

                break;
            case 2:
                elevenDoor();
                break;
            case 3:
                twelveDoor();

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.ThirteenDoor\n2.FourteenDoor.");
                System.out.print("Your choise: ");

                int threeChoise = scan.nextInt();

                switch (threeChoise){
                    case 1://сlosed
                        System.out.println("Выберите одну из 3 дверей.\n" +
                                "1.ThirteenDoor\n2.FourteenDoor.");
                        System.out.print("Your choise: ");

                        int threeChoise = scan.nextInt();

                        break;
                    case 2://opened
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

    public static void callingVoidsSchool() {
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
