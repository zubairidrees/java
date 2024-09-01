package com.zubair.jdk21;

import java.util.SequencedCollection;
import java.util.LinkedHashSet;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> sequenced = new LinkedHashSet<>();
        sequenced.add("first");
        sequenced.add("second");
        sequenced.add("third");

        // Access elements in encounter order
        sequenced.forEach(System.out::println);
    }
}

