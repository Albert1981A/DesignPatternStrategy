package strategy;

public class LowerCaseStrategy implements PrintStrategy {

    @Override
    public void print(String text) {
        System.out.println(text.toLowerCase());
    }

}
