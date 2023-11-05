package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericClassTest {
    @Test
    void getCapacity_NoConstructor_10(){
        GenericClass genericClassNoConstructor = new GenericClass<>();
        int expected = 10;
        int actual = genericClassNoConstructor.getCapacity();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getCapacity_WithConstructor_ValueOfConstructor(){
        GenericClass genericClassWithConstructor = new GenericClass<>(15);
        int expected = 15;
        int actual = genericClassWithConstructor.getCapacity();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getCapacity_NoConstructorAndWithIncrease_20(){
        GenericClass genericClassWithConstructor = new GenericClass<>(20);
        for(int i = 1; i<=11;i++){
            genericClassWithConstructor.add(i);
        }
        int expected = 20;
        int actual = genericClassWithConstructor.getCapacity();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getCapacity_NoConstructorAndWith2Increase_40(){
        GenericClass genericClassWithConstructor = new GenericClass<>(20);
        for(int i = 1; i<=21;i++){
            genericClassWithConstructor.add(i);
        }
        int expected = 40;
        int actual = genericClassWithConstructor.getCapacity();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getCapacity_WithConstructorAndWithIncrease_30(){
        GenericClass genericClassWithConstructor = new GenericClass<>(15);
        for(int i = 1; i<=16;i++){
            genericClassWithConstructor.add(i);
        }
        int expected = 30;
        int actual = genericClassWithConstructor.getCapacity();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getSize_NoElement_0(){
        GenericClass genericClass = new GenericClass();
        int expected = 0;
        int actual = genericClass.size();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getSize_With4Element_4(){
        GenericClass genericClass = new GenericClass();
        int expected = 4;
        for(int i=1; i<=expected; i++){
            genericClass.add(i);
        }
        int actual = genericClass.size();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getSize_With21Element_21(){
        GenericClass genericClass = new GenericClass();
        int expected = 21;
        for(int i=1; i<=expected; i++){
            genericClass.add(i);
        }
        int actual = genericClass.size();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void get_Index5_5(){
        GenericClass genericClass = new GenericClass();
        for(int i=0; i<=10; i++){
            genericClass.add(i);
        }
        int expected = 5;
        Object actual = genericClass.get(5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void get_Index15_null(){
        GenericClass genericClass = new GenericClass();
        for(int i=0; i<=10; i++){
            genericClass.add(i);
        }
        Integer expected = null;
        Object actual = genericClass.get(15);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void remove_Index5_Size10(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<=11; i++){
            genericClass.add(i);
        }
        int expected = 10;
        genericClass.remove(5);
        int actual = genericClass.size();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void set_Index5Data20_20(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<=11; i++){
            genericClass.add(i);
        }
        int expected = 20;
        genericClass.set(5,20);
        Object actual = genericClass.get(5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void toString_5Element_5Element(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<=5; i++){
            genericClass.add(i);
        }
        String expected = "[1,2,3,4,5]";
        String actual = genericClass.toString();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void indexOf_5_4(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        int expected = 4;
        int actual = genericClass.indexOf(5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void indexOf_15_Minus1(){
        GenericClass genericClass = new GenericClass();
        for(int i=0; i<10; i++){
            genericClass.add(i);
        }
        int expected = -1;
        int actual = genericClass.indexOf(15);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void lastIndexOf_5_13(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        int expected = 13;
        int actual = genericClass.lastIndexOf(5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void lastIndexOf_15_Minus1(){
        GenericClass genericClass = new GenericClass();
        for(int i=0; i<10; i++){
            genericClass.add(i);
        }
        int expected = -1;
        int actual = genericClass.lastIndexOf(15);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void isEmpty_NotEmpty_False(){
        GenericClass genericClass = new GenericClass();
        for(int i=0; i<10; i++){
            genericClass.add(i);
        }
        boolean expected = false;
        boolean actual = genericClass.isEmpty();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void isEmpty_Empty_True(){
        GenericClass genericClass = new GenericClass();
        boolean expected = true;
        boolean actual = genericClass.isEmpty();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void toArray_Index0_1(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        int expected = 1;
        int actual = (int) genericClass.toArray()[0];
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void clear___null(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        genericClass.clear();
        String expected = "[]";
        String actual = genericClass.toString();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void sublist_1And4_2To4(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        Object[] expected = {3,4};
        Object[] actual = genericClass.sublist(2,4);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    void contains_3_True(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        boolean expected = true;
        boolean actual = genericClass.contains(3);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void contains_13_False(){
        GenericClass genericClass = new GenericClass();
        for(int i=1; i<10; i++){
            genericClass.add(i);
        }
        boolean expected = false;
        boolean actual = genericClass.contains(13);
        Assertions.assertEquals(expected,actual);
    }
}