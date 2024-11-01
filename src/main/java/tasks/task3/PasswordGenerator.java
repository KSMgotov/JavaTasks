package tasks.task3;

import java.util.Random;

public class PasswordGenerator {

    private int length;

    public PasswordGenerator(int len){
        length = len;
    }

    public char[] generate(){
        char[] password = new char[length];
        char[] specialSymbols = {'_', '!', '?', '-', '+', '%', '$'};
        Random rand = new Random();
        int division1 = rand.nextInt(2, length-1);
        int division2 = length - division1;
        int lowercaseLettersCount = rand.nextInt(1,division1);
        int uppercaseLettersCount = division1 - lowercaseLettersCount;
        int digitsCount = rand.nextInt(1,division2);
        int specialSymbolsCount = division2 - digitsCount;
        for(int i = 0; i < length; i++){
            if(lowercaseLettersCount > 0){
                password[i] = (char) ('a' + rand.nextInt(26));
                lowercaseLettersCount--;
            }
            else if(uppercaseLettersCount > 0){
                password[i] = (char) ('A' + rand.nextInt(26));
                uppercaseLettersCount--;
            }
            else if(digitsCount > 0){
                password[i] = (char) ('0' + rand.nextInt(10));
                digitsCount--;
            }
            else if(specialSymbolsCount > 0){
                password[i] = specialSymbols[rand.nextInt(specialSymbols.length)];
                specialSymbolsCount--;
            }
        }
        for(int i = password.length - 1; i > 0; i--){
            int j = rand.nextInt(i+1);
            char tmp = password[i];
            password[i] = password[j];
            password[j] = tmp;
        }
        return password;
    }

}
