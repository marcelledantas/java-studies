package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        languages.put("Python", "an interpreted, object-oriented, high-level programming language");

        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else{
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        System.out.println(languages.put("Algol", "an algorithmic language"));
        System.out.println(languages.put("BASIC", "Beginners ALL Purposes Symbolic Instruction Code"));
        languages.put("Lisp", "Therein lies madness");
//        if(languages.containsKey("Java")){
//            System.out.println("Java is already in the map");
//        } else{
//            languages.put("Java", "This course is about java");
//        }

        System.out.println(languages.put("Java", "this course is about Java"));
//        System.out.println(languages.get("Java")); //overriden

        System.out.println("=====================================================");

//        languages.remove("Lisp");
        if(languages.remove("BASIC", "Beginners ALL Purposes Symbolic Instruction Code")){
            System.out.println("BASIC removed");
        } else{
            System.out.println("BASIC not removed, key/value pair not found");
        }

        if((languages.replace("Lisp", "Therein lies madness" ,"a functional programming language with imperative features"))){
            System.out.println("Lisp replaced");
        } else{
            System.out.println("List was not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));

        for(String key: languages.keySet()){
            System.out.println( key + " : " + languages.get(key));
        }

    }
}

