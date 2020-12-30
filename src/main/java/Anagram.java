import java.util.ArrayList;
import java.util.List;

public class Anagram {

    String firstString = "";

    public Anagram(String str) {
        this.firstString = str;
    }

    public ArrayList<String> match(List<String> stringList){
        ArrayList<String> matchList = new ArrayList<>();

        for (String checkString : stringList) {
            // put chars in pool, check if matching
            // if so, add to matchList

        }
        return matchList;
    }

}
