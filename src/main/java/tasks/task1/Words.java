package tasks.task1;

import java.util.Random;

public class Words {

    String[] wordList = {"Амальгамма", "Батут", "Колесо", "Продолжение", "Переводчик", "Коробка", "Подъезд", "Уравнение", "Смешение", "Лестница"};

    public String randomWord(){
        Random rand = new Random();
        return(wordList[rand.nextInt(wordList.length)]);
    }

}
