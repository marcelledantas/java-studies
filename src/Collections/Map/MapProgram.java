package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else{
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language");
        System.out.println(languages.put("Algol", "an algorithmic language"));
        System.out.println(languages.put("BASIC", "Beginners ALL Purposes Symbolic Instruction Code"));

//        if(languages.containsKey("Java")){
//            System.out.println("Java is already in the map");
//        } else{
//            languages.put("Java", "This course is about java");
//        }

        System.out.println(languages.put("Java", "this course is about Java"));
//        System.out.println(languages.get("Java")); //overriden

        System.out.println("=====================================================");

        for(String key: languages.keySet()){
            System.out.println( key + " : " + languages.get(key));
        }

    }
}

