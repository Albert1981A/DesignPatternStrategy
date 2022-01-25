import main.Sentence;
import strategy.LowerCaseStrategy;
import strategy.UpperCaseStrategy;

public class Test {

    public static void main(String[] args) {

        Sentence sentence = new Sentence();

        sentence.add("Sara");
        sentence.add("Shara");
        sentence.add("Shir");
        sentence.add("Sameah");

        System.out.println("First print:");
        sentence.print();

        sentence.setPrintStrategy(new UpperCaseStrategy());
        System.out.println("Second print:");
        sentence.print();

        System.out.println("Third print:");
        sentence.setPrintStrategy(new LowerCaseStrategy());
        sentence.print();
    }

}
