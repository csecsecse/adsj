import java.util.*;

class Dictionary {
    private List<Map.Entry<String, Integer>> entries;

    public Dictionary() {
        this.entries = new ArrayList<>();
    }

    private void addEntry(String key, Integer value) {
        Map.Entry<String, Integer> newEntry = new AbstractMap.SimpleEntry<>(key, value);
        entries.add(newEntry);
        sortEntries();
    }
    public void add(String a, Integer b) {
        addEntry(a,b);
    }

    private void sortEntries() {
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey())==0?o1.getValue().compareTo(o2.getValue()):o1.getKey().compareTo(o2.getKey());
            }
        });
    }

    public List<Map.Entry<String, Integer>> getEntries() {
        return entries;
    }
}

public class Main {
    public static void main(String args[]) {
        Dictionary a = new Dictionary();
        a.add("Mango",23); a.add("Elephant",4); a.add("Mango",12); a.add("Silver",32); a.add("Banana",9); a.add("King",45); a.add("Apple",31); a.add("Andrea",2);
        for( Map.Entry< String , Integer > a : a.getEntries() ) System.out.println(a.getKey()+" - "+a.getValue());
    }
}
