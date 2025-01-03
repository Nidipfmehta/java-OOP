package CSPaperOnJava1.question4;

import java.util.*;

public class Main {
    public static Set<String> studentsTaught(Map<String, Map<Integer, String>> list, String instructor) {
        Set<String> studentNames = new HashSet<String>();
        for(String c : list.keySet()) {
            String student = c;
            Map<Integer, String> instructors = list.get(c);
            for(String i : instructors.values()) {
                if(Objects.equals(i, instructor)) {
                    studentNames.add(c);
                    System.out.println(c);
                }
            }
        }
        if(studentNames.isEmpty()) {
            return null;
        }
        return studentNames;
    }

    public static void main(String[] args) {
        Map<String, Map<Integer, String>> data = new HashMap<>();

        Map<Integer, String> coltonMap = new HashMap<>();
        coltonMap.put(163, "Kevin");
        data.put("Colton", coltonMap);

        Map<Integer, String> darelMap = new HashMap<>();
        darelMap.put(416, "Hunter");
        darelMap.put(373, "Kevin");
        darelMap.put(143, "Kevin");
        data.put("Darel", darelMap);

        Map<Integer, String> benMap = new HashMap<>();
        benMap.put(373, "Kevin");
        benMap.put(143, "Stuart");
        data.put("Ben", benMap);

        Map<Integer, String> atharvaMap = new HashMap<>();
        atharvaMap.put(121, "Miya");
        atharvaMap.put(122, "Hunter");
        atharvaMap.put(123, "Brett");
        data.put("Atharva", atharvaMap);

        System.out.println(studentsTaught(data, "Kevin"));
    }
}
