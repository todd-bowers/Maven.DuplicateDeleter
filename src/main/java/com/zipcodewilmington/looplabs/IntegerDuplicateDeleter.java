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
        int newArraySize = 0;
        for (Integer integer : array) {
            if (counter(integer) < maxNumberOfDuplications) {
                newArraySize++;
            }
        }
        Integer[] removedArray = new Integer[newArraySize];
        int t = 0;
        for (Integer integer : array) {
            if (counter(integer) < maxNumberOfDuplications) {
                removedArray[t] = integer;
                t++;
            }
        }
        return removedArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int newArraySize = 0;
        for (Integer integer : array) {
            if (counter(integer) != exactNumberOfDuplications) {
                newArraySize++;
            }
        }
        Integer[] removedArray = new Integer[newArraySize];
        int t = 0;
        for (Integer integer : array) {
            if (counter(integer) != exactNumberOfDuplications) {
                removedArray[t] = integer;
                t++;
            }
        }
        return removedArray;
    }

    public int counter(int integer) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(integer)) count++;
        }
        return count;
    }
}
