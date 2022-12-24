package game;

import locations.BunkerFloors;
import locations.SchoolFloors;
import system.Random;

import java.util.Scanner;

public class Game {
    public static void game(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы попали в игру Квест 100 дверей.\n\nВыберите одну из 3 локаций." +
                "\n1.Школа\n2.Бункер\n3.Рандом");
        System.out.print("Твой выбор: ");

        int choiseLocation = scanner.nextInt();

        Random random = new Random();

        int randomLocation = random.randomNumberGame;

        System.out.println();

        switch (choiseLocation){
            case 1://School
                System.out.println("Вы выбрали локацию - Школа.");
                System.out.println();
                SchoolFloors.callingVoidsSchool();
                break;
            case 2://Bunker
                System.out.println("Вы выбрали локацию - Бункер.");
                System.out.println();
                BunkerFloors.callingVoidsBunker();
                break;
            case 3://Random
                switch (randomLocation){
                    case 1://School
                        System.out.println("Вы рандомно выбрали локацию - Школа.");
                        System.out.println();
                        SchoolFloors.callingVoidsSchool();
                        break;
                    default://Bunker
                        System.out.println("Вы рандомно выбрали локацию - Бункер.");
                        System.out.println();
                        BunkerFloors.callingVoidsBunker();
                        break;
                }
                break;
            default:
                System.err.println("Такой локации нет!");
                game();
                break;
        }
    }
}
