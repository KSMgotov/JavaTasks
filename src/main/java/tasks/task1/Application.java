package tasks.task1;

public class Application {

    public static void main(String[] args) {
        Words words = new Words();
        Game game = new Game(words.randomWord(), 5);
        game.play();
    }

}
