package new1;
import java.util.Arrays;

public class program1 {
	public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(checkAnagrams(str1, str2));
    }
	public static boolean checkAnagrams(String str1, String str2) {
        // remove spaces and punctuation and convert to lowercase
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // check if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
	
	
	
}
