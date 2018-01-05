package LeetCode;

/**
 * Created by sunginjung on 1/5/18.
 */
public class keyboardRow {

    public String[] findWords(String[] words) {

        String[] rows = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> answer = new ArrayList<>();

        for(String word: words){
            if(isPossible(word, rows)) {
                answer.add(word);
            }
        }

        String[] output = new String[answer.size()];
        output = answer.toArray(output);
        return output;

    }

    private static boolean isPossible(String string, String[] rows) {
        String input = string.toLowerCase();
        int len = input.length();
        for(int j = 0; j < rows.length; j++) {
            int count = 0;
            for(int i = 0; i < input.length(); i++) {
                if(rows[j].indexOf(input.charAt(i)) != -1) {
                    count++;
                }
                if (count == len) return true;
            }
        }
        return false;
    }
}
