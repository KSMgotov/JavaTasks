package tasks.task2;

import java.util.Scanner;

public class ValuesReader {

    private final float[][] values;

    public ValuesReader(){
        values = new float[5][5];
    }

    public void inputValues() {
        Scanner in = new Scanner(System.in);
        values[0][0] = 1;
        System.out.print("Введите курс доллара к рублю: ");
        values[1][0] = in.nextFloat();
        System.out.print("Введите курс евро к рублю: ");
        values[2][0] = in.nextFloat();
        System.out.print("Введите курс юаня к рублю: ");
        values[3][0] = in.nextFloat();
        System.out.print("Введите курс йены к рублю: ");
        values[4][0] = in.nextFloat();
        for(int i = 0; i < 5; i++){
            for(int j = 1; j < 5; j++){
                if(i == j){
                    values[i][j] = 1;
                }
                else{
                    values[i][j] = values[i][0]/values[j][0];
                }
            }
        }
    }

    float[][] getValues(){
        return values;
    }

}
