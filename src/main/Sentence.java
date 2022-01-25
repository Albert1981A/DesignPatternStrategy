package main;

import strategy.PrintStrategy;

public class Sentence {

    private StringBuilder stringBuilder = new StringBuilder();
    private PrintStrategy printStrategy = null;

    public void setPrintStrategy(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void add(String word) {
        stringBuilder.append(" " + word);
    }

    public void print() {
        if (printStrategy == null) {
            System.out.println(stringBuilder);
        } else {
            printStrategy.print(stringBuilder.toString());
        }

    }

}
