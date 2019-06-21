package com.zipcodewilmington.singlylinkedlist;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void add() {
        SinglyLinkedList myTest = new SinglyLinkedList();

        String testString = "";

        Integer testInteger = 1;

        assertEquals(0, myTest.size());

        myTest.add(testString);

        assertEquals(1, myTest.size());

        myTest.add(testInteger);

        assertEquals(2, myTest.size());

    }

    @Test
    public void remove() {
        SinglyLinkedList myTest = new SinglyLinkedList();
        String testString = "";
        Integer testInteger = 1;

        myTest.add(testInteger);
        myTest.add(testString);

        assertEquals(2, myTest.size());

        assertTrue(myTest.remove(1));

        assertEquals(1, myTest.size());


    }


    @Test
    public void remove2() {
        SinglyLinkedList myTest = new SinglyLinkedList();
        String testString = "";
        Integer testInteger = 1;
        Double testDouble = 0.0;

        myTest.add(testInteger);
        myTest.add(testString);
        myTest.add(testDouble);

        assertEquals(3, myTest.size());

        assertTrue(myTest.remove(0));

        assertEquals(2, myTest.size());


    }

    @Test
    public void remove3(){
        SinglyLinkedList myTest = new SinglyLinkedList();
        String testString = "";
        Integer testInteger = 1;
        Double testDouble = 0.0;

        myTest.add(testInteger);
        myTest.add(testString);
        myTest.add(testDouble);
        myTest.add(testInteger);


        assertEquals(4, myTest.size());

        assertTrue(myTest.remove(1));

        assertEquals(testInteger, myTest.get(2));

        assertEquals(3, myTest.size());

    }

    @Test
    public void remove4(){
        SinglyLinkedList myTest = new SinglyLinkedList();
        String testString = "";
        Integer testInteger = 1;
        Double testDouble = 0.0;

        myTest.add(testInteger);
        myTest.add(testString);
        myTest.add(testDouble);
        myTest.add(testInteger);


        assertEquals(4, myTest.size());

        assertTrue(myTest.remove(3));

        assertEquals(testDouble, myTest.get(2));

        assertEquals(3, myTest.size());
    }





    @Test
    public void find() {
        SinglyLinkedList myTest = new SinglyLinkedList();
        Integer testInteger = 1;
        Integer testInt2 = 2;

        myTest.add(testInteger);
        myTest.add(testInt2);

        assertEquals(0, myTest.find(testInteger));

        assertEquals(1, myTest.find(testInt2));



    }

    @Test
    public void size() {
        SinglyLinkedList myTest = new SinglyLinkedList();
        String testString = "";
        Integer testInteger = 1;
        Double testDouble = 0.0;

        myTest.add(testInteger);
        myTest.add(testString);
        myTest.add(testDouble);

        assertEquals(3, myTest.size());




    }

    @Test
    public void get() {
        SinglyLinkedList myTest = new SinglyLinkedList();
        Integer testInteger = 1;
        Integer testInt2 = 2;

        myTest.add(testInteger);
        myTest.add(testInt2);


        assertEquals(testInteger, myTest.get(0));

        assertEquals(testInt2, myTest.get(1));


    }

    @Test
    public void copy() {
        SinglyLinkedList myTest = new SinglyLinkedList();
        Integer testInteger = 1;
        Integer testInt2 = 2;

        myTest.add(testInteger);
        myTest.add(testInt2);

        assertEquals(2, myTest.size());

        SinglyLinkedList myTest2 = myTest.copy();

        assertEquals(2, myTest2.size());


    }



}
