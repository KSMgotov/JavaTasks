package tasks.task2;

import java.util.Scanner;

public class Converter {

    private final float[][] courses;

    public Converter(float[][] coursesArray){
        courses = coursesArray;
    }

    public void performConversion(){
        System.out.println("Введите цифру, чтобы выбрать изначальную валюту:");
        System.out.println("1.Рубль");
        System.out.println("2.Доллар");
        System.out.println("3.Евро");
        System.out.println("4.Юань");
        System.out.println("5.Йена");
        System.out.print("Ваш выбор: ");
        Scanner in = new Scanner(System.in);
        int type = in.nextInt() - 1;
        System.out.print("Введите сумму: ");
        float sum = in.nextFloat();
        String[] names = {"рублях", "долларах", "евро", "юанях", "йенах"};
        for(int i = 0; i < 5; i++){
            if(i != type) {
                System.out.print(sum*courses[type][i]);
                System.out.println(" в " + names[i]);
            }
        }
    }

}
