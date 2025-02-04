package Assignment_6;
import java.util.*;
public class dictionaryOrder_small_gpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        List<String> permutations = new ArrayList<>();
        generatePermutations(input, "", permutations);

        Collections.sort(permutations);

        for (String perm : permutations) {
            if (perm.compareTo(input) < 0) {
                System.out.println(perm);
            }
        }
    }

    public static void generatePermutations(String str, String prefix, List<String> result) {
        if (str.isEmpty()) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(newStr, prefix + str.charAt(i), result);
        }
    }
}
