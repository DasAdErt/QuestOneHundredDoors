package locations;

import characters.Personages;
import system.Random;

import java.util.Scanner;

public class School {

    //first floor
    public static void firstDoor(){
        // дальше проходит
        System.out.println("Я дёрнул пару раз двери и она всё-таки открылась.\n" +
                "А дальше вдалеке я увидел какую-то страшную и поцарапанную дверь, которая меня очень пугала.\n" +
                "Я решился открыть эту дверь. Потому что других выходов не было.\n" +
                "Я увидел там спуск вниз и там сильно похолодпло, будто она вела в подвал.\n" +
                "Я спустился по лестнице вниз и увидел ещё 3 двери.");
    }
    public static void secondDoor(){
        // закрыта
        System.out.println("Я дёрнул пару раз дверь и она не открылась. Я решил выбрать другую дверь.");
    }
    public static void threeDoor(){
        // дальше или закрыта ( рандом )

        Random random = new Random();

        int randomNumber = random.randomNumberClosedOrOpened;

        switch (randomNumber) {
            case 1:
                // дальше проходит
                System.out.println("Я дёрнул пару раз двери и она всё-таки открылась.\n" +
                        "А дальше вдалеке я увидел какую-то страшную и поцарапанную дверь, которая меня очень пугала.\n" +
                        "Я решился открыть эту дверь. Потому что других выходов не было.\n" +
                        "Я увидел там подъём наверх и там было очень темно," +
                        " но на самом верху я видел свет, который освещал очень хорошо 3 обычных двери.");
                break;
            default:// закрыта
                System.out.println("Я дёрнул пару раз дверь и она не открылась. Я решил выбрать другую дверь.");
                break;
        }
    }

    public static void firstFloor(){
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

                        switch (randomNumber){
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
                                        break;
                                }
                                break;
                        }
                        break;
                    default:
                        System.err.println("Такой двери не существует.");
                        break;
                }
                break;
            case 3:
                threeDoor();

                Random random = new Random();
                int randomNumber = random.randomNumberClosedOrOpened;

                switch (randomNumber){
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
                break;
        }
    }

    //second floor
    public static void fourDoor(){
        // дальше проходит
        System.out.println("Я начал открывать дверь и ей будто что-то мешало." +
                " Спустя несколько минут я всё-таки открыл эту дверь.\n" +
                "Я ходил по этому помещению минут 10 и ничего не мог найти," +
                " потом я услышал хлопок сзади, я резко обернулся.\n" +
                "Увидел 3 двери. Я сразу начал сомневаться, ведь их не было тут 5 минут назад.");
    }
    public static void fiveDoor(){
        // дальше проходит
        System.out.println("Я начал открывать дверь и ей будто что-то мешало." +
                " Спустя несколько минут я всё-таки открыл эту дверь.\n" +
                "Я ходил по этому помещению минут 10 и ничего не мог найти," +
                " потом я услышал хлопок сзади, я резко обернулся.\n" +
                "Увидел 3 двери. Я сразу начал сомневаться, ведь их не было тут 5 минут назад.");
    }
    public static void sixDoor(){
        // дальше проходит
        System.out.println("Я начал открывать дверь и ей будто что-то мешало." +
                " Спустя несколько минут я всё-таки открыл эту дверь.\n" +
                "Я ходил по этому помещению минут 10 и ничего не мог найти," +
                " потом я услышал хлопок сзади, я резко обернулся.\n" +
                "Увидел 3 двери. Я сразу начал сомневаться, ведь их не было тут 5 минут назад.");
    }

    //three floor
    public static void sevenDoor(){
        // смерть или закрыто ( рандом )

        Random random = new Random();

        int randomNumber = random.randomNumberClosedOrDeath;

        switch (randomNumber) {
            case 1:
                // смерть
                System.out.println("Я открыл дверь и зашёл во внутрь комнаты. После я услышал сзади хлопок, дверь закрылась.\n" +
                        "Я побежал к двери и она не открывалась. Я там просидел 2 недели и умер от голода и жажды.");
                break;
            default:// закрыта
                System.out.println("Я сильно дёрнул эту дверь, но она даже не сдвинулась. Надо выбрать другую дверь");
                break;
        }
    }
    public static void eightDoor(){
        // смерть
        System.out.println("Я открыл дверь и зашёл во внутрь комнаты. После я услышал сзади хлопок, дверь закрылась.\n" +
                "Я побежал к двери и она не открывалась. Я там просидел 2 недели и умер от голода и жажды.");
        System.out.println();
        System.err.println("Вы умерли!");
    }
    public static void nineDoor(){
        // дальше проходит
    }

    //four floor
    public static void tenDoor(){
        // дальше проходит
    }
    public static void elevenDoor(){
        // смерть
        System.out.println("Я зашёл в комнату и после на чём-то подскользнулся и ударился об порог.");
        System.out.println();
        System.err.println("Вы умерли!");
    }
    public static void twelveDoor(){
        // дальше проходит
    }

    //five floor
    public static void thirteenDoor(){
        // закрыто
        System.out.println("Я увидел повешенный замок на двери и не стал пытаться открыть. Надо выбрать другую дверь");
    }
    public static void fourteenDoor(){
        // дальше проходит
    }
    public static void fifteenDoor(){
        // закрыто
        System.out.println("Я увидел повешенный замок на двери и не стал пытаться открыть. Надо выбрать другую дверь");
    }
}
