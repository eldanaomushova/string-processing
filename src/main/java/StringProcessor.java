
public class StringProcessor {
    public boolean isStrongPassword(String password) {
        String combinedPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).*$";
        //this pattern is used to check for strong password
        if(password.matches(combinedPattern)){
            return true;
        }
        return false;
    }
    public int calculateDigits(String sentence){
        int countDigits = 0;
        for(char i : sentence.toCharArray()){
            countDigits++;
        }
        return countDigits;
    }
    public int calculateWords(String sentence){
        String[] words = sentence.trim().split("\\s+"); //breaks down a sentence into an array of words
        return words.length;
    }
    public double calculateExpression(String expression){
        expression = expression.replaceAll("\\s", "");
        char[] arr = expression.toCharArray(); // make is aray
        int n = 0;
        char lastOperator = '+';
        int result = 0;
        for (char currentChar : arr) {
            if (Character.isDigit(currentChar)) {
                n = n * 10 + (currentChar - '0'); //if number is greater then zero
            } else {
                switch (lastOperator) {
                    case '*':
                        result *= n;
                        break;
                    case '/':
                        result /= n;
                        break;
                    case '+':
                        result += n;
                        break;
                    case '-':
                        result -= n;
                        break;
                    default:
                        break;
                }
                lastOperator = currentChar;
                n = 0;
            }
        }
        switch (lastOperator) {
            case '+':
                result += n;
                break;
            case '-':
                result -= n;
                break;
            case '*':
                result *= n;
                break;
            case '/':
                result /= n;
                break;
            default:
                break;
        }
        return result;
    }
}
