class TimeMap {

    private Map<String, TreeMap<Integer, String>> timeMap; 

    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!timeMap.containsKey(key)) {
            timeMap.put(key, new TreeMap<>());
        }
        timeMap.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (!timeMap.containsKey(key) || timestamp < timeMap.get(key).firstKey()) {
            return "";
        }
        return timeMap.get(key).floorEntry(timestamp).getValue();
    }
}
