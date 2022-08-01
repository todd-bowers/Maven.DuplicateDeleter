package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        ArrayList<String> removed = new ArrayList<>();
        for (String string : array) {
            if (counter(string) < maxNumberOfDuplications) {
                removed.add(string);
            }
        }
        return removed.toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        ArrayList<String> removed = new ArrayList<>();
        for (String string : array) {
            if (counter(string) != exactNumberOfDuplications) {
                removed.add(string);
            }
        }
        return removed.toArray(new String[0]);
    }

    public int counter(String string) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(string)) count++;
        }
        return count;
    }
}
