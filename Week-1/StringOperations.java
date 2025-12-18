import java.util.*;

public class StringOperations {

    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "Hello Ayush";

        // length()
        System.out.println("Length: " + str.length());

        // isEmpty()
        System.out.println("Is Empty: " + str.isEmpty());

        // charAt()
        System.out.println("Char at index 1: " + str.charAt(1));

        // toString()
        System.out.println("To String: " + str.toString());

        // equals()
        System.out.println("Equals: " + str.equals(str2));

        // compareTo()
        System.out.println("Compare To: " + str.compareTo(str2));

        // contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // startsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He"));

        // endsWith()
        System.out.println("Ends with 'ld  ': " + str.endsWith("ld  "));

        // matches()
        System.out.println("Matches regex: " + str.matches(".*Java.*"));

        // substring()
        System.out.println("Substring (2,7): " + str.substring(2, 7));

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // replace()
        System.out.println("Replace Java with Python: " +
                str.replace("Java", "Python"));

        // split()
        String[] words = str.trim().split(" ");
        System.out.print("Split: ");
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();

        // join()
        String joined = String.join("-", words);
        System.out.println("Joined: " + joined);

        // valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);
    }
}
