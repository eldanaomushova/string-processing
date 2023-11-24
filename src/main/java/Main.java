

public class Main {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        String password = "Eldana8.";

        String sentence = "Press Shift twice to open the Search Everywhere dialog and type show whitespaces";
        boolean isPasswordStrong = stringProcessor.isStrongPassword(password);
        System.out.println("Is password Strong? " + isPasswordStrong);
        int digitsCount = stringProcessor.calculateDigits(password);
        System.out.println("How many digits: " + digitsCount);
        int wordsCount = stringProcessor.calculateWords(sentence);
        System.out.println("How many words: " + wordsCount);
        String expression = "10 * 3 + 10";
        double expresssionCount = stringProcessor.calculateExpression((expression));
        System.out.println("Result: " + expresssionCount);
    }
}

