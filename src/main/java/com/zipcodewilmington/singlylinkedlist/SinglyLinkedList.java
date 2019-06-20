package com.zipcodewilmington.singlylinkedlist;


import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
class SinglyLinkedList {
    private Node begin;


    //Constructor
    public SinglyLinkedList(){

    }


    public void add(Object data) {

        if (begin == null) {
            begin = new Node(data);

        }

        else {
            Node temp = new Node(data);
            Node current = begin;

            if (current != null) {
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(temp);
            }

        }
    }




    public Boolean remove(int index){
        if(index <0 || index>size()){
            return false;
        }

        Node current = begin;
        if(begin!=null){
            for (int i = 0; i < index; i++) {
                if(current.getNext() == null){
                    return false;
                }
                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());

            return true;
        }

        return false;
    }




    public int find(Object data){
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




    public Object get(int index){

        return getNodeOfIndex(index).getData();
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



    public SinglyLinkedList copy(){
        SinglyLinkedList result = new SinglyLinkedList();
        Node current = begin;
        while(current != null) {
            result.add(current);
            current = current.getNext();

        }

        return result;
    }

    public void sort(){

    }


}
