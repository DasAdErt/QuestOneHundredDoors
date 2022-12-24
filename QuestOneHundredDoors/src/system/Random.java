package system;

public class Random {

    int fromTheNumberClosedOrOpened = 1;
    int upToTheNumberClosedOrOpened = 2;

    public int randomNumberClosedOrOpened = fromTheNumberClosedOrOpened + (int) (Math.random() * upToTheNumberClosedOrOpened);

    int fromTheNumberClosedOrDeath = 1;
    int upToTheNumberClosedOrDeath = 2;

    public int randomNumberClosedOrDeath = fromTheNumberClosedOrDeath + (int) (Math.random() * upToTheNumberClosedOrDeath);

    int fromTheNumberGame = 1;
    int upToTheNumberGame = 3;

    public int randomNumberGame = fromTheNumberGame + (int) (Math.random() * upToTheNumberGame);
}
