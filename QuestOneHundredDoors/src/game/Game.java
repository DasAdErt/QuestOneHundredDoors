package game;

import locations.BunkerFloors;
import locations.SchoolFloors;
import system.Random;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    public static void game() throws IOException {
        //delete file choice game
        File fileChoiceGame = new File("ChoiceGame.txt");
        fileChoiceGame.delete();

        //delete all files school floors
        File fileFirstFloorSchool = new File("FirstFloorSchool.txt");
        fileFirstFloorSchool.delete();
        File fileSecondFloorSchool = new File("SecondFloorSchool.txt");
        fileSecondFloorSchool.delete();
        File fileThreeFloorSchool = new File("ThreeFloorSchool.txt");
        fileThreeFloorSchool.delete();
        File fileFourFloorSchool = new File("FourFloorSchool.txt");
        fileFourFloorSchool.delete();
        File fileFiveFloorSchool = new File("FiveFloorSchool.txt");
        fileFiveFloorSchool.delete();

        //delete all files school floors
        File fileFirstFloorBunker = new File("FirstFloorBunker.txt");
        fileFirstFloorBunker.delete();
        File fileSecondFloorBunker = new File("SecondFloorBunker.txt");
        fileSecondFloorBunker.delete();
        File fileThreeFloorBunker = new File("ThreeFloorBunker.txt");
        fileThreeFloorBunker.delete();
        File fileFourFloorBunker = new File("FourFloorBunker.txt");
        fileFourFloorBunker.delete();
        File fileFiveFloorBunker = new File("FiveFloorBunker.txt");
        fileFiveFloorBunker.delete();

        FileWriter writer = new FileWriter("ChoiceGame.txt");

        writer.write("Выбор игры.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы попали в игру Квест 100 дверей.\n\nВыберите одну из 3 локаций." +
                "\n1.Школа\n2.Бункер\n3.Рандом");
        System.out.print("Твой выбор (надо написать например 1): ");

        int choiseLocation = scanner.nextInt();

        Random random = new Random();

        int randomLocation = random.randomNumberGame;

        System.out.println();

        switch (choiseLocation){
            case 1://School
                System.out.println("Вы выбрали локацию - Школа.");

                writer.write("Вы выбрали локацию - Школа.\n");
                writer.close();

                System.out.println();
                SchoolFloors.callingVoidsSchool();

                break;
            case 2://Bunker
                System.out.println("Вы выбрали локацию - Бункер.");

                writer.write("Вы выбрали локацию - Бункер.\n");
                writer.close();

                System.out.println();
                BunkerFloors.callingVoidsBunker();
                break;
            case 3://Random
                switch (randomLocation){
                    case 1://School
                        System.out.println("Вы рандомно выбрали локацию - Школа.");

                        writer.write("Вы рандомно выбрали локацию - Школа.\n");
                        writer.close();

                        System.out.println();
                        SchoolFloors.callingVoidsSchool();
                        break;
                    default://Bunker
                        System.out.println("Вы рандомно выбрали локацию - Бункер.");

                        writer.write("Вы рандомно выбрали локацию - Бункер.\n");
                        writer.close();

                        System.out.println();
                        BunkerFloors.callingVoidsBunker();
                        break;
                }
                break;
            default:
                System.err.println("Такой локации нет!");

                writer.write("Такой локации нет!\n");
                writer.write("Повтор void.\n");

                game();
                break;
        }
    }
}
