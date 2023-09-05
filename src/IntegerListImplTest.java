import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    private final IntegerListImpl integerList = new IntegerListImpl();



    @Test
    void add() {
        Integer actual = integerList.add(1);
        Integer expected = 1;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void testAdd() {
        Integer actual = integerList.add(0,2);
        Integer expected = 2;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void set() {
        Integer actual = integerList.set(0,3);
        Integer expected = 3;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void removeInteger() {
        integerList.add(4);
        Integer actual = integerList.removeInteger(4);
        Integer expected = 4;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void remove() {
        integerList.add(5);
        Integer actual = integerList.remove(0);
        Integer expected = 5;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void contains() {
        integerList.add(5);
        integerList.add(8);
        boolean actual = integerList.contains(5);
        boolean expected = true;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void indexOf() {
        integerList.add(5);
        integerList.add(8);
        int actual = integerList.indexOf(8);
        int expected = 1;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void lastIndexOf() {
        integerList.add(5);
        integerList.add(8);
        integerList.add(5);
        integerList.add(8);
        int expected = 2;
        int actual = integerList.lastIndexOf(5);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void get() {
        integerList.add(5);
        integerList.add(8);
        integerList.add(9);
        int expected = 9;
        int actual  = integerList.get(2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testEquals() {
        integerList.add(5);
        integerList.add(8);
        integerList.add(9);
        IntegerListImpl arr = new IntegerListImpl();
        arr.add(5);
        arr.add(8);
        arr.add(9);


        boolean expected = true;
        boolean actual = integerList.equals(arr);
        Assertions.assertEquals(expected,actual);
    }


}