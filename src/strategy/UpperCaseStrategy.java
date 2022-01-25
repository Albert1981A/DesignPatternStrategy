package strategy;

public class UpperCaseStrategy implements PrintStrategy {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }

}
