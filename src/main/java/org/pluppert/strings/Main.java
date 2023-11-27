package org.pluppert.strings;

public class Main {
    public static void main(String[] args) {
        // Exercise 3:
        /*
        String sentence = "Ok this is not as long!";
        String subString = sentence.substring(11, sentence.length() - 1);
        System.out.println("subString = " + subString);
        */

        // Exercise 5:
        String javaWorst = "Java is the worst programming language!";
        String javaBest = javaWorst.replace("worst", "best");
        System.out.println("javaBest = " + javaBest);
    }
}
