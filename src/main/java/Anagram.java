import java.util.ArrayList;
import java.util.List;

public class Anagram {

    String firstString = "";

    public Anagram(String str) {
        this.firstString = str;
    }

    public List<String> match(List<String> stringList) {

        List<String> confirmedMatchList = new ArrayList<>();

        for (String eachStringItem : stringList) {
            List<Character> allChars = new ArrayList<>();
            putStringCharsIntoList(eachStringItem, allChars);

            if (firstString.length() == allChars.size()) {

                removeMatchingChars(allChars);
                if (allChars.isEmpty()) {
                    confirmedMatchList.add(eachStringItem);
                }
            }
        }

        return confirmedMatchList;
    }

    private void putStringCharsIntoList(String eachStringItem, List<Character> allChars) {
        if (!eachStringItem.toLowerCase().equals(firstString.toLowerCase())) {
            for (int i = 0; i < eachStringItem.length(); i++) {
                allChars.add(eachStringItem.toLowerCase().charAt(i));
            }
        }
    }

    private void removeMatchingChars(List<Character> allChars) {
        for (int i = 0; i < firstString.length(); i++) {

            if (allChars.contains(firstString.toLowerCase().charAt(i))) {
                allChars.remove(Character.valueOf(firstString.toLowerCase().charAt(i)));
            }

        }
    }

}
