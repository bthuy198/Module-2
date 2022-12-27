import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class countWordInString {
    public static void main(String[] args) {
        String str = "Mauris sagittis pulvinar ut augue ut interdum morbi lobortis lacinia lacus lacus augue ut quis euismod tortor elementum nec";
        show(countWordRepeateInString(str));
    }

    public static TreeMap countWordRepeateInString(String str) {
        str = str.trim();
        TreeMap<String, Integer> countWord = new TreeMap<>();
        String[] stringArr = str.split("\\s");
        for (int i = 0; i < stringArr.length; i++) {
            if (countWord.containsKey(stringArr[i]) == true) {
                int value = countWord.get(stringArr[i]);
                int newValue = value + 1;
                countWord.replace(stringArr[i], value, newValue);
            } else {
                countWord.put(stringArr[i], 1);
            }
        }
        return countWord;
    }
    public static void show(Map<String, Integer> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
