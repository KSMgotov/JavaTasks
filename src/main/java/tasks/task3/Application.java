package tasks.task3;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину пароля: ");
        int len = in.nextInt();
        System.out.print("Введите количество генерируемых паролей: ");
        int count = in.nextInt();
        PasswordGenerator passGen = new PasswordGenerator(len);
        for(int i = 0; i < count; i ++) {
            System.out.println(passGen.generate());
        }
    }

}
