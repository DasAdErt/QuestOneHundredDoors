package game;

import locations.Bunker;
import system.Random;

import java.util.Scanner;

public class Game {
    public static void game(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы попали в игру Квест 100 дверей.\n\nВыберите одну из 3 локаций." +
                "\n1.Школа\n2.Психиатрическая больница\n3.Бункер\n4.Рандом");
        System.out.print("Твой выбор: ");

        int choiseLocation = scanner.nextInt();

        Random random = new Random();

        int randomLocation = random.randomNumberGame;

        System.out.println();

        switch (choiseLocation){
            case 1://School
                break;
            case 2://PsychiatricHospital
                break;
            case 3://Bunker
                System.out.println("Вы выбрали локацию - Бункер.");
                System.out.println();
                Bunker.callingVoidsBunker();
                break;
            case 4://Random
                switch (randomLocation){
                    case 1://School
                        break;
                    case 2://PsychiatricHospital
                        break;
                    default://Bunker
                        System.out.println("Вы рандомно выбрали локацию - Бункер.");
                        System.out.println();
                        Bunker.callingVoidsBunker();
                        break;
                }
                break;
            default:
                System.err.println("Такой локации нет!");
                break;
        }
    }
}
