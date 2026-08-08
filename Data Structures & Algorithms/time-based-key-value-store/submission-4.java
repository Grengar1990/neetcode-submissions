class TimeMap {

    private Map<String, TreeMap<Integer, String>> map; 

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        Map.Entry<Integer, String> pair = map.get(key).floorEntry(timestamp);
        if (pair == null) {
            return "";
        }

        return pair.getValue();
    }
}
