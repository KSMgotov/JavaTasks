package tasks.task1;

import java.util.Scanner;

public class Game {

    private final String targetWord;
    private final char[] currentWord;
    private int livesCount;
    private final int length;
    private int guessedLetters;

    public Game(String word, int lives){
        targetWord = word.toLowerCase();
        livesCount = lives;
        length = targetWord.length();
        currentWord = new char[length];
        for(int i = 0; i < length; i++){
            currentWord[i] = '_';
        }
    }

    public void play(){
        Scanner in = new Scanner(System.in);
        char curChar;
        while(livesCount > 0 && guessedLetters != length){
            System.out.println(currentWord);
            System.out.println("Количество жизней: " + livesCount);
            System.out.print("Введите букву: ");
            curChar = in.next().charAt(0);
            curChar = Character.toLowerCase(curChar);
            boolean found = false;
            for(int i = 0; i < targetWord.length(); i++){
                if(curChar == targetWord.charAt(i)) {
                    found = true;
                    guessedLetters++;
                    currentWord[i] = curChar;
                }
            }
            if(!found){
                livesCount--;
            }
        }
        System.out.println("Загаданное слово: " + targetWord);
        if(livesCount != 0){
            System.out.println("Победа! :)");
        }
        else{
            System.out.println("Поражение :(");
        }
    }

}
