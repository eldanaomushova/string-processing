# StringProcessor

A Java application containing a `StringProcessor` class to perform various string operations.


## Introduction

The `StringProcessor` class offers methods to validate strong passwords, count digits in a string, calculate words in a sentence, and evaluate mathematical expressions.

## Functionality
isStrongPassword(String password)

Checks whether the given password meets strong password criteria.
Parameters:
password: The password string to be checked.
Returns:
true if the password meets the strong password criteria; false otherwise.
Strong Password Criteria:
Must contain at least one uppercase letter (A-Z).
Must contain at least one lowercase letter (a-z).
Must contain at least one digit (0-9).
Must contain at least one special character (not alphanumeric).
calculateDigits(String sentence)

Counts the number of digits in the input string.
Parameters:
sentence: The string in which digits will be counted.
Returns:
The count of digits present in the input string.
calculateWords(String sentence)

Calculates the number of words in a sentence.
Parameters:
sentence: The string in which words will be counted.
Returns:
The count of words in the input sentence.
Word Count Criteria:
Words are counted based on spaces as separators.
calculateExpression(String expression)

Evaluates basic mathematical expressions consisting of +, -, *, and /.
Parameters:
expression: The mathematical expression to be evaluated.
Returns:
The result of the evaluated mathematical expression.
Expression Format:
Supports basic arithmetic operations (+, -, *, /).
Allows numbers and operators without spaces between them.
For example: "10 * 3 + 10", "21 + 10", "10 / 0".


## Test Cases
isStrongPassword()

Description: Tests the isStrongPassword(String password) method in the StringProcessor class to verify strong password criteria validation.
Test Scenarios:
Checks whether the method correctly identifies strong passwords based on criteria (uppercase, lowercase, digit, special character).
Verifies that the method correctly identifies passwords that do not meet the criteria.
Test Cases:
assertTrue(stringProcessor.isStrongPassword("Eldana.8")): Expects true for a strong password.
assertFalse(stringProcessor.isStrongPassword("Eldana")): Expects false for a password that does not meet the criteria.
calculateDigits()

Description: Tests the calculateDigits(String sentence) method in the StringProcessor class to count the number of digits in a string.
Test Scenarios:
Validates the accuracy of counting digits in different strings.
Test Cases:
assertEquals(8, stringProcessor.calculateDigits("Eldana8.")): Expects 8 digits in the given string.
assertEquals(9, stringProcessor.calculateDigits("WordExcel")): Expects 9 digits (none) in the given string.
calculateWords()

Description: Tests the calculateWords(String sentence) method in the StringProcessor class to count the number of words in a sentence.
Test Scenarios:
Validates the accuracy of counting words in sentences with varying lengths and structures.
Test Cases:
assertEquals(5, stringProcessor.calculateWords("Press Shift twice to open")): Expects 5 words in the sentence.
assertEquals(4, stringProcessor.calculateWords("Press Shift to open")): Expects 4 words in the sentence.
calculateExpression()

Description: Tests the calculateExpression(String expression) method in the StringProcessor class to evaluate basic mathematical expressions.
Test Scenarios:
Validates the correctness of evaluating expressions with arithmetic operations.
Checks handling of division by zero scenario.
Test Cases:
assertEquals(40, stringProcessor.calculateExpression("10 * 3 + 10")): Expects the correct result for a given expression.
assertEquals(31, stringProcessor.calculateExpression("21 + 10")): Expects the correct result for another expression.
Test for Division by Zero: Expects an ArithmeticException with a specific error message when dividing by zero.

