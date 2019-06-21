package com.zipcodewilmington.singlylinkedlist;


import java.text.Collator;

/**
 * Created by leon on 1/10/18.
 */
class SinglyLinkedList<E> {
    private Node <E> begin;
    private Node <E> end;

    //Constructor
    public SinglyLinkedList(){
        begin = null;
        end = null;
    }

    public void add(E data) {

        if (begin == null) {
            begin = new Node(data, null, null);
            end = begin;
        }
        else {
            Node temp = new Node(data, null, end);
            end.setNext(temp);
            end = temp;

//            if (current != null) {
//                while (current.getNext() != null) {
//                    current = current.getNext();
//                }
//                current.setNext(temp);
//            }

        }
    }




    public Boolean remove(int index){
        if(index < 0 || index > this.size()){
            return false;
        }
        if(this.getNodeOfIndex(index) == begin){
            Node temp = begin.getNext();
            begin.setNext(null);
            begin = temp;
            return true;
        }
        Node current = begin;
        if(begin!=null){
            for (int i = 0; i < index-1; i++) {
                current = current.getNext();
            }
            if(current.getNext().getNext() != null);
                current.setNext(current.getNext().getNext());
                return true;
            }

        return false;
    }




    public int find(E data){
        int index = 0;
        if (data == null) {
            for(Node x = begin; x!= null; x = x.next){
                if(x.getData() == null){
                    return index;
                }
                index++;
            }
        }
        else{
            for(Node x = begin; x != null; x = x.next){
                if(data.equals(x.getData())){
                    return index;

                }
                index++;
            }
        }
        return -1;
    }




    public int size(){
        Node current = begin;
        int counter = 0;

        while(current != null){
            counter++;
            current = current.getNext();
        }

        return counter;
    }


    public E get(int index){

        return (E) getNodeOfIndex(index).getData();
    }


    private Node getNodeOfIndex(int index){
        try{
            Node current = begin;
            for(int i = 0; i< index; i++){
                current = current.getNext();
            }
            return current;
        }
        catch (NullPointerException E){
            return null;
        }
    }



    public SinglyLinkedList<E> copy(){
        SinglyLinkedList<E> result = new SinglyLinkedList<>();
        Node current = begin;
        while(current != null) {
            result.add((E) current.getData());
            current = current.getNext();

        }

        return result;
    }

    public void sort() {
    }






}
