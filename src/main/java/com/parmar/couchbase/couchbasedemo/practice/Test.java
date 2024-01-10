package com.parmar.couchbase.couchbasedemo.practice;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String n = "dharmendraparmar";
        Map<Character, Long> collect = n.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, String> MY_MAP = new HashMap<>();
        MY_MAP.put("Key A", "value A");
        MY_MAP.put("Key B", "value B");
        MY_MAP.put("Key C", "value C");
        MY_MAP.put("Key Null", null);
        Magic magic = new Magic();

        // absent: putting new key -> null
        String putResult = MY_MAP.putIfAbsent("new key1", magic.nullFunc());
        System.out.println("first value :"+putResult);
        if(MY_MAP.containsKey("new key1")) {
            System.out.println("it contains key and value as null");
        }
        // absent: putting new key -> not-null
        putResult = MY_MAP.putIfAbsent("new key2", magic.strFunc("new key2"));
        System.out.println("second value :"+putResult);

        // absent: existing key -> null (original)
        putResult = MY_MAP.putIfAbsent("Key Null", magic.strFunc("Key Null"));
        System.out.println("third value: "+putResult);
    }

    static class Magic {
        public String nullFunc() {
            return null;
        }

        public String strFunc(String input) {
            return input + ": A nice string";
        }
    }
}
