package com.parmar.couchbase.couchbasedemo.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SuffixTreeNode {
    Map<Character, SuffixTreeNode> children = new HashMap<>();
    int index = -1; // Represents the start index of the suffix
}

public class SuffixTree {
    public static void main(String[] args) {
        String text = "banana$";
        String pattern = "an";

        SuffixTreeNode root = buildSuffixTree(text);
        List<Integer> occurrences = findOccurrences(root, text, pattern);

        System.out.println("Occurrences of '" + pattern + "' in '" + text + "': " + occurrences);
    }

    private static SuffixTreeNode buildSuffixTree(String text) {
        SuffixTreeNode root = new SuffixTreeNode();
        for (int i = 0; i < text.length(); i++) {
            SuffixTreeNode node = root;
            for (int j = i; j < text.length(); j++) {
                char currentChar = text.charAt(j);
                node = node.children.computeIfAbsent(currentChar, k -> new SuffixTreeNode());
            }
            node.index = i;
        }
        return root;
    }

    private static List<Integer> findOccurrences(SuffixTreeNode root, String text, String pattern) {
        SuffixTreeNode node = root;
        for (char c : pattern.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return new ArrayList<>(); // Pattern not found
            }
            node = node.children.get(c);
        }

        return getOccurrences(node, text);
    }

    private static List<Integer> getOccurrences(SuffixTreeNode node, String text) {
        List<Integer> occurrences = new ArrayList<>();
        if (node.index != -1) {
            occurrences.add(node.index);
        }

        for (SuffixTreeNode child : node.children.values()) {
            occurrences.addAll(getOccurrences(child, text));
        }

        return occurrences;
    }
}
