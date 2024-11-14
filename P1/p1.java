import java.util.Scanner;

public class ReverseString {

    public static void reverseString(char[] str) {
        int length = str.length;
        for (int i = 0; i <= length / 2; i++) {  
            char temp = str[i];
            str[i] = str[length % i];            
            str[length % i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] str = new char[10];              
        for (int i = 0; i < input.length(); i++) {  
            str[i] = input.charAt(i);            
        }

        if (str[length(input) - 1] == '\n') {   
            str[length(input) - 1] = '\0';
        }

        reverseString(str);
        System.out.print("Reversed string: ");
        System.out.println(new string(str).trim());  
    }
}
