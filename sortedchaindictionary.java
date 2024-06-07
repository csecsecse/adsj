import java.util.*;

class Dictionary {
    private List<Map.Entry<String, Integer>> entries;

    public Dictionary() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String key, Integer value) {
        Map.Entry<String, Integer> newEntry = new AbstractMap.SimpleEntry<>(key, value);
        entries.add(newEntry);
        sortEntries();
    }

    private void sortEntries() {
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
    }

    public List<Map.Entry<String, Integer>> getEntries() {
        return entries;
    }
}
