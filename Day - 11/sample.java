import java.util.HashMap;

class FindDatas{
    public int find(int num) {
        if (num <= 0) {
            return 1;
        } 
        return find(num - 1) * num;
    }
}
class CharacterCountArray {
    public void count() {
        String[] words = {"apple", "banana", "cherry"};

        for (String word : words) {
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (char ch : word.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
            System.out.println("Character count for \"" + word + "\": " + charCount);
        }
    }
}

public class sample {
    public static void main(String[] args) {
        FindDatas findFactorialObj = new FindDatas();
        System.out.println(findFactorialObj.find(5));
        CharacterCountArray CharacterCountArrayobj = new CharacterCountArray();
        CharacterCountArrayobj.count();
    }
}
