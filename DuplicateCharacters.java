public class DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Print characters with frequency greater than 1 (i.e., duplicates)
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1 && Character.isLetter((char) i)) {
                System.out.println((char) i + " - " + charCount[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Jai Maharashtra";
        System.out.println("Input string: " + str);
        findDuplicateCharacters(str);
    }
}
