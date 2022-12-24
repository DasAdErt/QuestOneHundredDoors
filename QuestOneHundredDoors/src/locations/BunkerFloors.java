package locations;

import characters.Personages;
import system.Random;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BunkerFloors extends Bunker{

    public static void firstFloor() throws IOException {
        FileWriter writer = new FileWriter("FirstFloorBunker.txt");

        writer.write("Первый выбор \"Бункер\".\n");

        Personages.bunkerDescription();

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                firstDoor();

                writer.write("Выбор: Первая дверь ( закрыта )\n");

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.Вторая дверь\n2.Третья дверь");
                System.out.print("Твой выбор (надо написать например 1): ");

                int secondChoice = scan.nextInt();

                switch (secondChoice) {
                    case 1:
                        secondDoor();

                        writer.write("Выбор: Вторая дверь ( открыта )\n");
                        writer.close();

                        break;
                    case 2:
                        threeDoor();

                        writer.write("Выбор: Третья дверь ( открыта )\n");
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
            case 2:
                secondDoor();

                writer.write("Выбор: Вторая дверь ( открыта )\n");
                writer.close();

                break;
            case 3:
                threeDoor();

                writer.write("Выбор: Третья дверь ( открыта )\n");
                writer.close();

                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                firstFloor();
                break;
        }
    }

    public static void secondFloor() throws IOException {
        FileWriter writer = new FileWriter("SecondFloorBunker.txt");

        writer.write("Второй выбор \"Бункер\".\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                fourDoor();

                writer.write("Выбор: Первая дверь ( закрыта )\n");

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.FiveDoor\n2.SixDoor.");
                System.out.print("Твой выбор (надо написать например 1): ");

                int secondChoice = scan.nextInt();

                System.out.println();

                switch (secondChoice) {
                    case 1:
                        fiveDoor();

                        writer.write("Выбор: Вторая дверь ( открыта )\n");
                        writer.close();

                        break;
                    case 2:
                        sixDoor();

                        writer.write("Выбор: Первая дверь ( Вы умерли! )\n");
                        writer.write("Вы умерли!\n");
                        writer.close();

                        System.exit(0);
                        break;
                    default:
                        System.err.println("Такой двери не существует.");

                        writer.write("Выбор: Такой двери не существует.\n");
                        writer.write("Повтор void.\n");

                        secondFloor();
                        break;
                }

                break;
            case 2:
                fiveDoor();

                writer.write("Выбор: Вторая дверь ( открыта )\n");
                writer.close();

                break;
            case 3:
                sixDoor();

                writer.write("Выбор: Первая дверь ( Вы умерли! )\n");
                writer.write("Вы умерли!\n");
                writer.close();

                System.exit(0);
                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                secondFloor();
                break;
        }
    }

    public static void threeFloor() throws IOException {

        FileWriter writer = new FileWriter("ThreeFloorBunker.txt");

        writer.write("Третий выбор \"Бункер\".\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                sevenDoor();

                writer.write("Выбор: Первая дверь ( закрыта )\n");

                System.out.println("Выберите одну из 2 дверей.\n" +
                        "1.Вторая дверь\n2.Третья дверь");
                System.out.print("Твой выбор (надо написать например 1): ");

                int secondChoice = scan.nextInt();

                System.out.println();

                switch (secondChoice) {
                    case 1:
                        eightDoor();

                        writer.write("Выбор: Вторая дверь ( открыта )\n");
                        writer.close();

                        break;
                    case 2:
                        nineDoor();

                        writer.write("Выбор: Вторая дверь ( закрыта, стоит кодовый замок )\n");
                        writer.close();

                        System.out.println("Введите код составленный из чисел 6,3 и 9.\n" +
                                "0. Для выхода из взлома замка и выбрать другую дверь.");

                        codeThreeFloor(); //code 936
                        break;
                    default:
                        System.err.println("Такой двери не существует.");

                        writer.write("Выбор: Такой двери не существует.\n");
                        writer.write("Повтор void.\n");

                        threeFloor();
                        break;
                }

                break;
            case 2:
                eightDoor();

                writer.write("Выбор: Вторая дверь ( открыта )\n");
                writer.close();

                break;
            case 3:
                nineDoor();

                writer.write("Выбор: Вторая дверь ( закрыта, стоит кодовый замок )\n");
                writer.close();

                System.out.println("Введите код составленный из чисел 6,3 и 9.\n" +
                        "0. Для выхода из взлома замка.");

                codeThreeFloor(); //code 936
                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                threeFloor();
                break;
        }
    }

    public static void fourFloor() throws IOException {

        FileWriter writer = new FileWriter("FourFloorBunker.txt");

        writer.write("Чётвёртый выбор \"Бункер\".\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите одну из 3 дверей.\n" +
                "1.Первая дверь\n2.Вторая дверь\n3.Третья дверь");
        System.out.print("Твой выбор (надо написать например 1): ");

        int firstChoice = scan.nextInt();

        System.out.println();

        switch (firstChoice) {
            case 1:
                tenDoor();

                Random random = new Random();
                int randomNumber = random.randomNumberClosedOrOpened;

                switch (randomNumber) {
                    case 1:

                        writer.write("Выбор: Первая дверь ( закрыта )\n");

                        System.out.println("Выберите одну из 2 дверей.\n" +
                                "1.Вторая дверь\n2.Третья.");
                        System.out.print("Твой выбор (надо написать например 1): ");

                        int secondChoice = scan.nextInt();

                        System.out.println();

                        switch (secondChoice) {
                            case 1:
                                elevenDoor();

                                writer.write("Выбор: Вторая дверь ( открыта )\n");
                                writer.close();

                                break;
                            case 2:
                                twelveDoor();

                                writer.write("Выбор: Третья дверь ( открыта )\n");
                                writer.close();

                                break;
                            default:
                                System.err.println("Такой двери не существует.");

                                writer.write("Выбор: Такой двери не существует.\n");
                                writer.write("Повтор void.\n");

                                fourFloor();
                                break;
                        }
                        break;
                    default:
                        writer.write("Выбор: Первая дверь ( открыта )\n");
                        writer.close();
                        break;
                }

                break;
            case 2:
                elevenDoor();

                writer.write("Выбор: Вторая дверь ( открыта )\n");
                writer.close();

                break;
            case 3:
                twelveDoor();

                writer.write("Выбор: Третья дверь ( открыта )\n");
                writer.close();

                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                fourFloor();
                break;
        }
    }

    public static void fiveFloor() throws IOException {

        FileWriter writer = new FileWriter("FiveFloorBunker.txt");

        writer.write("Пятый выбор \"Бункер\".\n");

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

                System.out.println("Выберите одну дверь.\n" +
                        "1.Вторая дверь");
                System.out.print("Твой выбор (надо написать например 1): ");

                int secondChoice = scan.nextInt();

                System.out.println();

                switch (secondChoice) {
                    case 1:
                        fourteenDoor();

                        writer.write("Выбор: Вторая дверь ( закрыта, стоит кодовый замок )\n");
                        writer.close();

                        codeFiveFloor(); //code 173
                        break;
                    default:
                        System.err.println("Такой двери не существует.");

                        writer.write("Выбор: Такой двери не существует.\n");
                        writer.write("Повтор void.\n");

                        fiveFloor();
                        break;
                }

                break;
            case 2:
                fourteenDoor();

                writer.write("Выбор: Вторая дверь ( закрыта, стоит кодовый замок )\n");
                writer.close();

                System.out.println("Введите код составленный из чисел 7,1 и 3.");

                codeFiveFloor(); //code 173
                break;
            case 3:
                fifteenDoor();

                writer.write("Выбор: Третья дверь ( закрыта )\n");

                System.out.println("Выберите одну дверь.\n" +
                        "1.Вторая дверь");
                System.out.print("Твой выбор (надо написать например 1): ");

                int threeChoice = scan.nextInt();

                System.out.println();

                switch (threeChoice) {
                    case 1:
                        fourteenDoor();

                        writer.write("Выбор: Вторая дверь ( закрыта, стоит кодовый замок )\n");
                        writer.close();

                        System.out.println("Введите код составленный из чисел 7,1 и 3.");

                        codeFiveFloor(); //code 173
                        break;
                    default:
                        System.err.println("Такой двери не существует.");

                        writer.write("Выбор: Такой двери не существует.\n");
                        writer.write("Повтор void.\n");

                        fiveFloor();
                        break;
                }
                break;
            default:
                System.err.println("Такой двери не существует.");

                writer.write("Выбор: Такой двери не существует.\n");
                writer.write("Повтор void.\n");

                fiveFloor();
                break;
        }
    }

    public static void callingVoidsBunker() throws IOException {
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
