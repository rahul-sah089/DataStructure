package strings;

import java.util.Stack;

/*
https://www.interviewcake.com/question/java/reverse-words?utm_source=weekly_email&utm_source=drip&utm_campaign=weekly_email&utm_campaign=Interview%20Cake%20Weekly%20Problem%20%23322:%20Reverse%20Words&utm_medium=email&utm_medium=email
*/
public class ReverseWordsProblems {
    public static char[] reverseCharacters(char[] message) {
        int leftIndex = 0;
        int rightIndex = message.length - 1;
        while (leftIndex < rightIndex) {
            char temp = message[leftIndex];
            message[leftIndex] = message[rightIndex];
            message[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return message;
    }

    public static String[] reverseWordsInString(String[] strArgs) {
        int leftIndex = 0;
        int rightIndex = strArgs.length - 1;
        while (leftIndex < rightIndex) {
            String temp = strArgs[leftIndex];
            strArgs[leftIndex] = strArgs[rightIndex];
            strArgs[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return strArgs;
    }

    public static void main(String[] args) {
        char[] message = {'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l'};
        System.out.println(message);
        message = ReverseWordsProblems.reverseCharacters(message);
        System.out.println(message);

    }
}
