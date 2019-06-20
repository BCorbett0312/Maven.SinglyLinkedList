package com.zipcodewilmington.singlylinkedlist;

public class Node{

    Node next;
    Object data;


    //Constructor to add next
    public Node(Object value){
        next = null;
        data = value;

    }

    //Constructor to add to specific point
    public Node(Object value, Node nextValue){
        next = nextValue;
        data = value;

    }



    public Object getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }


    public void setData(Object value){
        data = value;
    }

    public void setNext(Node nextValue){
        next = nextValue;
    }


}
