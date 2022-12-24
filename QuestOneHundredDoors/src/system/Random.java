package system;

public class Random {

    int fromTheNumberBunker = 1;
    int upToTheNumberBunker = 2;

    public int randomNumberBunkerTenDoor = fromTheNumberBunker + (int) (Math.random() * upToTheNumberBunker);

    int fromTheNumberGame = 1;
    int upToTheNumberGame = 3;

    public int randomNumberGame = fromTheNumberGame + (int) (Math.random() * upToTheNumberGame);
}
