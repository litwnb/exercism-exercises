import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DialingCodes {

    private final HashMap<Integer, String> map = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return map;
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code, country);
    }

    public String getCountry(Integer code) {
       return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!map.containsValue(country))
            map.putIfAbsent(code, country);
    }

    public Integer findDialingCode(String country) {
        Integer code = null;
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), country)) {
                code = entry.getKey();
                break;
            }
        }
        return code;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (map.containsValue(country)) {
            map.remove(findDialingCode(country));
            map.put(code, country);
        }
    }
}
