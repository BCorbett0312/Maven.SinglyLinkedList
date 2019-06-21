package com.zipcodewilmington.singlylinkedlist;




public class Node<E>{

    Node  next;
    E data;
    Node prev;



    //Constructor to add
    public Node(E value, Node nextValue, Node prevValue){
        next = nextValue;
        data = value;
        prev = prevValue;

    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public E getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }


    public void setData(E value){
        data = value;
    }

    public void setNext(Node nextValue){
        next = nextValue;
    }


}
