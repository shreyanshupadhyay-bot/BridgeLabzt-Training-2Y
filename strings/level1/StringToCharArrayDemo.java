import java.util.Scanner;

public class StringToCharArrayDemo {
    public static char[] stringToCharArrayCustom(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] customArray = stringToCharArrayCustom(str);
        char[] builtInArray = str.toCharArray();

        boolean result = compareCharArrays(customArray, builtInArray);
        System.out.println("Custom char array: " + java.util.Arrays.toString(customArray));
        System.out.println("Built-in char array: " + java.util.Arrays.toString(builtInArray));
        System.out.println("Arrays are equal? " + result);
        sc.close();
    }
}
