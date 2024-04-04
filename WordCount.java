import java.util.HashMap;

public class WordCount {

    public static HashMap<String, Integer> countWords(String str) {
      
        String[] words = str.split("\\s+"); 

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String str = "Myself Shraddha Gaikwad, and I'm very very very happy";

        HashMap<String, Integer> wordCountMap = countWords(str);

        System.out.println("Word Counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
