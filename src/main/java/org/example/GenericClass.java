package org.example;

import java.util.Arrays;

public class GenericClass<T> {
    private int capacity;
    T[] arr;

    public GenericClass(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[this.capacity];
    }

    public GenericClass() {
        this(10);
    }

    public int size(){
        return (int) Arrays.stream(arr).filter(x->x!=null).count();

    }

    public int getCapacity(){
        return arr.length;
    }

    public void add(T data){
        int length = this.size();
        int capacity = this.getCapacity();
        if (length == capacity){
            T[] newArr = (T[]) new Object[capacity*2];
            for (int i = 0; i<capacity;i++){
                newArr[i]=arr[i];
            }
            arr = newArr;
        }
        arr[length]=data;
    }

    public T get(int index){
        return arr[index];
    }

    public void remove(int index){
        if (index<this.size()){
            for (int i=index; i<this.size()-1;i++){
                arr[i]=arr[i+1];
            }
            arr[this.size()-1]=null;
        }
    }

    public void set(int index, T data){
        if (index<this.size()){
            arr[index]=data;
        }
    }

    public String toString(){
        String convertString = "[";
        for(int i = 0; i<this.size();i++){
            convertString+=arr[i];
            if (i!=this.size()-1) convertString+=",";
        }
        return convertString+="]";
    }

    public int indexOf(T data){
        for (int i = 0; i<this.size();i++){
            if (arr[i].equals(data)) return i;
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i = this.size()-1; 0<=i;i--){
            if (arr[i].equals(data)) return i;
        }
        return -1;
    }

    public boolean isEmpty(){
        for (T obj : arr){
            if (obj!=null) return false;
        }
        return true;
    }

    public T[] toArray(){
        T[] newArr = (T[]) new Object[this.size()];
        for (int i = 0;i<this.size();i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public void clear() {
        Arrays.fill(arr,null);
    }

    public T[] sublist(int start,int finish){
        T[] subArr = (T[]) new Object[finish-start];
        int newIndex = 0;
        for (int i = start; i<finish;i++){
            subArr[newIndex]=arr[i];
            newIndex++;
        }
        return subArr;
    }

    public boolean contains(T data){
        for (int i = 0; i<this.size();i++){
            if (arr[i]==data) return true;
        }
        return false;
    }
}