package com.zipcodewilmington.looplabs;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        ArrayList<Integer> removed = new ArrayList<>();
        for (Integer integer : array) {
            if (counter(integer) < maxNumberOfDuplications) {
                removed.add(integer);
            }
        }
        return removed.toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        ArrayList<Integer> removed = new ArrayList<>();
        for (Integer integer : array) {
            if (counter(integer) != exactNumberOfDuplications) {
                removed.add(integer);
            }
        }
        return removed.toArray(new Integer[0]);
    }

    public int counter(int integer) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(integer)) count++;
        }
        return count;
    }
}
