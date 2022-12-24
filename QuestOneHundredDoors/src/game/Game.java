package game;

import locations.BunkerFloors;
import locations.SchoolFloors;
import system.Random;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    public static void game() throws IOException {

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
