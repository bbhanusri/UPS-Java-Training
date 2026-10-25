import java.util.HashMap;
class WordCount {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        HashMap<String, Integer> map = new HashMap<>();
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("Sentence is empty");
            return;
        }
        sentence = sentence.toLowerCase();
        String words[] = sentence.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        System.out.println("Word counts: " + map);
        String maxWord = "";
        int maxCount = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > maxCount) {
                maxCount = map.get(word);
                maxWord = word;
            }
        }
        System.out.println("Most frequent word: " + maxWord);
        System.out.println("Frequency: " + maxCount);
    }
}