package locations;

import characters.Personages;
import system.Random;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SchoolFloors extends School {

    public static void firstFloor() throws IOException {

        FileWriter writer = new FileWriter("FirstFloorSchool.txt");

        writer.write("Первый выбор \"Школа\".\n");

        Personages.schoolDescription();

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                firstDoor();

                writer.write("Выбор: Первая дверь ( открыта )\n");
                writer.close();

                break;
            case 2:
                secondDoor();

                writer.write("Выбор: Вторая дверь ( закрыта )\n");

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.Первая дверь\n2.Третья дверь");
                System.out.print("Твой выбор (надо написать например 1): ");

                int secondChoice = scan.nextInt();

                switch (secondChoice) {
                    case 1:
                        firstDoor();

                        writer.write("Выбор: Первая дверь ( открыта )\n");
                        writer.close();

                        break;
                    case 2:
                        threeDoor();

                        Random random = new Random();
                        int randomNumber = random.randomNumberClosedOrOpened;

                        switch (randomNumber) {
                            case 1:
                                writer.write("Выбор: Вторая дверь ( открыта )\n");
                                writer.close();

                                break;
                            default:
                                writer.write("Выбор: Вторая дверь ( закрыта )\n");

                                System.out.println("Выберите одну дверь\n" +
                                        "1.Первая дверь\n");
                                System.out.print("Твой выбор (надо написать например 1): ");

                                int threeChoice = scan.nextInt();

                                System.out.println();

                                switch (threeChoice) {
                                    case 1:
                                        firstDoor();

                                        writer.write("Выбор: Первая дверь ( открыта )\n");
                                        writer.close();

                                        break;
                                    default:
                                        System.err.println("Такой двери не существует.");

                                        writer.write("Выбор: Такой двери не существует.\n");
                                        writer.write("Повтор void.\n");

                                        firstFloor();
                                        break;
                                }
                                break;
                        }
                        break;
                    default:
                        System.err.println("Такой двери не существует.");

                        writer.write("Выбор: Такой двери не существует.\n");
                        writer.write("Повтор void.\n");

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
                        writer.write("Выбор: Третья дверь ( открыта )\n");
                        writer.close();

                        break;
                    default:
                        writer.write("Выбор: Третья дверь ( закрыта )\n");

                        System.out.println("Выберите одну из 2 дверей.\n" +
                                "1.Первая дверь\n2.Вторая дверь");
                        System.out.print("Твой выбор (надо написать например 1): ");

                        int threeChoice = scan.nextInt();

                        System.out.println();

                        switch (threeChoice) {
                            case 1:
                                firstDoor();

                                writer.write("Выбор: Первая дверь ( открыта )\n");
                                writer.close();

                                break;
                            case 2:
                                secondDoor();

                                writer.write("Выбор: Вторая дверь ( закрыта )\n");

                                System.out.println("Выберите одну дверь\n" +
                                        "1.Первая дверь");
                                System.out.print("Твой выбор (надо написать например 1): ");

                                int fourChoice = scan.nextInt();

                                switch (fourChoice) {
                                    case 1:
                                        firstDoor();

                                        writer.write("Выбор: Первая дверь ( открыта )\n");
                                        writer.close();

                                        break;
                                    default:
                                        System.err.println("Такой двери не существует.");

                                        writer.write("Выбор: Такой двери не существует.\n");
                                        writer.write("Повтор void.\n");

                                        firstFloor();
                                        break;
                                }
                                break;
                            default:
                                System.err.println("Такой двери не существует.");

                                writer.write("Выбор: Такой двери не существует.\n");
                                writer.write("Повтор void.\n");

                                break;
                        }
                        break;
                }
                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                firstFloor();
                break;
        }
    }

    public static void secondFloor() throws IOException { //four five six

        FileWriter writer = new FileWriter("SecondFloorSchool.txt");

        writer.write("Второй выбор \"Школа\".\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                fourDoor();

                writer.write("Выбор: Первая дверь ( открыта )\n");
                writer.close();

                break;
            case 2:
                fiveDoor();

                writer.write("Выбор: Вторая дверь ( открыта )\n");
                writer.close();

                break;
            case 3:
                sixDoor();

                writer.write("Выбор: Третья дверь ( открыта )\n");
                writer.close();

                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                secondFloor();
                break;
        }
    }

    public static void threeFloor() throws IOException { //seven eight nine

        FileWriter writer = new FileWriter("ThreeFloorSchool.txt");

        writer.write("Третий выбор \"Школа\".\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                sevenDoor();

                Random random = new Random();
                int randomNumber = random.randomNumberClosedOrOpened;

                switch (randomNumber) {
                    case 1:
                        writer.write("Выбор: Первая дверь ( Вы умерли! )\n");
                        writer.write("Вы умерли!\n");
                        writer.close();

                    default:
                        writer.write("Выбор: Первая дверь ( закрыта )\n");

                        System.out.println("Выберите одну из 2 дверей.\n" +
                                "1.Вторая дверь\n2.Третья дверь");
                        System.out.print("Твой выбор (надо написать например 1): ");

                        int secondChoice = scan.nextInt();

                        System.out.println();

                        switch (secondChoice) {
                            case 1:
                                eightDoor();

                                writer.write("Выбор: Вторая дверь ( Вы умерли! )\n");
                                writer.close();

                                System.exit(0);

                                break;
                            case 2:
                                nineDoor();

                                writer.write("Выбор: Третья дверь ( открыта )\n");
                                writer.close();

                                break;
                            default:
                                System.err.println("Такой двери не существует.");

                                writer.write("Выбор: Такой двери не существует.\n");
                                writer.write("Повтор void.\n");

                                threeFloor();
                                break;
                        }
                        break;
                }

                break;
            case 2:
                eightDoor();

                writer.write("Выбор: Вторая дверь ( Вы умерли! )\n");
                writer.close();

                System.exit(0);
                break;
            case 3:
                nineDoor();

                writer.write("Выбор: Третья дверь ( открыта )\n");
                writer.close();

                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                threeFloor();
                break;
        }
    }

    public static void fourFloor() throws IOException { //ten eleven twelve
        FileWriter writer = new FileWriter("FourFloorSchool.txt");

        writer.write("Четвёртый выбор \"Школа\".\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первый дверь\n2.Второй дверь\n3.Третий дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                tenDoor();

                writer.write("Выбор: Первая дверь ( открыта )\n");
                writer.close();

                break;
            case 2:
                elevenDoor();

                writer.write("Выбор: Вторая дверь ( Вы умерли! )\n");
                writer.close();

                System.exit(0);
                break;
            case 3:
                twelveDoor();

                writer.write("Выбор: Третья дверь ( открыта )\n");
                writer.close();

                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                fourFloor();
                break;
        }
    }

    public static void fiveFloor() throws IOException { //thirteen fourteen fifteen

        FileWriter writer = new FileWriter("FourFloorSchool.txt");

        writer.write("Пятый выбор \"Школа\".\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                thirteenDoor();

                writer.write("Выбор: Первая дверь ( закрыта )\n");

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.Вторая дверь\n2.Третья дверь");
                System.out.print("Твой выбор (надо написать например 1): ");

                int secondChoice = scan.nextInt();

                switch (secondChoice){
                    case 1://opened
                        fourteenDoor();

                        writer.write("Выбор: Вторая дверь ( открыта )\n");
                        writer.close();

                        break;
                    case 2://closed
                        fifteenDoor();

                        writer.write("Выбор: Третья дверь ( закрыта )\n");

                        System.out.println("Выберите одну дверь\n" +
                                "1.Вторая дверь");
                        System.out.print("Твой выбор (надо написать например 1): ");

                        int fiveChoice = scan.nextInt();

                        switch (fiveChoice){
                            case 1:
                                fourteenDoor();

                                writer.write("Выбор: Вторая дверь ( открыта )\n");
                                writer.close();

                                break;
                            default:
                                System.err.println("Такой двери не существует.");

                                writer.write("Такой двери не существует.\n");
                                writer.write("Повтор void.\n");

                                fiveFloor();
                                break;
                        }
                        break;
                    default:
                        System.err.println("Такой двери не существует.");

                        writer.write("Такой двери не существует.\n");
                        writer.write("Повтор void.\n");

                        fiveFloor();
                        break;
                }

                break;
            case 2:
                fourteenDoor();

                writer.write("Выбор: Вторая дверь ( открыта )\n");
                writer.close();

                break;
            case 3:
                fifteenDoor();

                writer.write("Выбор: Третья дверь ( закрыта )\n");

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.Первая дверь\n2.Вторая дверь.");
                System.out.print("Твой выбор (надо написать например 1): ");

                int threeChoice = scan.nextInt();

                switch (threeChoice){
                    case 1://сlosed
                        thirteenDoor();

                        writer.write("Выбор: Первая дверь ( закрыта )\n");

                        System.out.println("Выберите одну дверь\n" +
                                "1.Вторая дверь");
                        System.out.print("Твой выбор (надо написать например 1): ");

                        int fourChoice = scan.nextInt();

                        switch (fourChoice){
                            case 1:
                                fourteenDoor();

                                writer.write("Выбор: Вторая дверь ( открыта )\n");
                                writer.close();

                                break;
                            default:
                                System.err.println("Такой двери не существует.");

                                writer.write("Такой двери не существует.\n");
                                writer.write("Повтор void.\n");

                                fiveFloor();
                                break;
                        }

                        break;
                    case 2://opened
                        fourteenDoor();

                        writer.write("Выбор: Вторая дверь ( открыта )\n");
                        writer.close();

                        break;
                    default:
                        System.err.println("Такой двери не существует.");

                        writer.write("Такой двери не существует.\n");
                        writer.write("Повтор void.\n");

                        fiveFloor();
                        break;
                }

                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                fiveFloor();
                break;
        }
    }

    public static void callingVoidsSchool() throws IOException {
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
