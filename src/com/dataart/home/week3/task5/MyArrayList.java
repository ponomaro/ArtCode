package com.dataart.home.week3.task5;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Home on 28.01.2016.
 */

public class MyArrayList<T> implements Iterable<T> {
    private final int ININTIAL_SIZE=2;
    private Object[] myArrayList = new Object[ININTIAL_SIZE];
    private int actSize=0;

    public void add(T data){
        if (actSize==myArrayList.length){
            increaseSize();
        }
        myArrayList[actSize++] = data;
    }

    private void increaseSize()throws RuntimeException{
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length*2+1);
    }

    public T get(int index) throws RuntimeException{
        if (index >= actSize){
            throw new IndexOutOfBoundsException();
        }
        return (T) myArrayList[index];

    }

    public int size() {
        return actSize;
    }

    public boolean contains(T type){
        boolean result=false;
        for (int i = 0; i <actSize ; i++) {
            if((myArrayList[i]).equals(type)) result=true;
        }
        return result;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < actSize && myArrayList[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T) myArrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

}