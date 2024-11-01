package tasks.task2;

public class Application {

    public static void main(String[] args) {
        ValuesReader val = new ValuesReader();
        val.inputValues();
        Converter converter = new Converter(val.getValues());
        converter.performConversion();
    }

}