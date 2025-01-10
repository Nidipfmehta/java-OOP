package CSPaperOnJava2.question4;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
//4)
public class Main {
    public static void main(String[] args) {
        Map<String, Set<String>> taHobbies = new HashMap<>();
        taHobbies.put("Atharva", Set.of("board games", "comedy shows", "hiking", "video gaming"));
        taHobbies.put("Chaafen", Set.of("Formula 1", "reading", "traveling", "video gaming"));
        taHobbies.put("Jaylyn", Set.of("hiking", "traveling", "video gaming"));
        taHobbies.put("Shivani", Set.of("cafes", "music shows"));

        String result = mostPopularHobby(taHobbies);
        System.out.println(result);
    }

    public static String mostPopularHobby(Map<String, Set<String>> taHobbies) {
        Map<String, Integer> hobbyCount = new HashMap<>();
        for(String ta : taHobbies.keySet()) {
            Set<String> hobbies = taHobbies.get(ta);
            for(String hobby : hobbies) {
                hobbyCount.putIfAbsent(hobby, 0);
            }
        }
        for(String ta : taHobbies.keySet()) {
            Set<String> hobbies = taHobbies.get(ta);
            for(String hobby : hobbies) {
                hobbyCount.put(hobby, hobbyCount.get(hobby)+1);
            }
        }
        int max = 0;
        String popularHobby = "";
        for(String hobby : hobbyCount.keySet()) {
            if (hobbyCount.get(hobby) > max || (hobbyCount.get(hobby) == max && hobby.compareTo(popularHobby) < 0)) {
                popularHobby = hobby;
                max = hobbyCount.get(hobby);
            }
        }
        return popularHobby;
    }
}
