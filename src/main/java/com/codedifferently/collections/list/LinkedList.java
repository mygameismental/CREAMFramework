package com.codedifferently.collections.list;

import com.codedifferently.collections.list.exception.EmptyLinkedListException;
import org.w3c.dom.Node;

import javax.lang.model.element.Element;

public class LinkedList<E>  { //singly linked list
    public Node head; //head node to hold the list

    public static class Node{
        public int data;
       public Node next = null;

        public Node(int value) {

       }

      //   public Node(int data){
        //   this.data = data;
          //  this.next = null;
        // }
    }

    public void addHead(int value){ //adds value to head node
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addTail(int value) throws EmptyLinkedListException { //adds value to tail node
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            throw new EmptyLinkedListException(); // throws an EmptyLinkedListException if fuction is called
            // can't add to the tail of an empty Linkedlist :-P!
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


    public boolean contains(){ //checking to see if node contains a value or not
        Node content = head;
        if(content == null){ //if head is null, then it means linked list is empty
            System.out.print("List is Empty");
            return false;
        }
        System.out.print("List is not Empty");
        return true;
    }

    public void printNodeContents(){ //prints node content
        Node print = head;
        while(print != null){
            System.out.println(print.data + " --> ");
            print = print.next;
        }
        System.out.println("null value");
    }


    public Node deleteHead()throws EmptyLinkedListException{
        if(head ==null){
            throw new EmptyLinkedListException(); //throws an EmptyLinkedListException if fuction is called
            // can't contents if there's nothing in there :-P!
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public Node deleteTail()throws EmptyLinkedListException {
        if(head == null || head.next == null){
            return head;
        }
        Node current = head;
        Node previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null; // replaces the last value with previous value
        return current;
    }

        // public static void main(String[] args) {
        //creating a linked list (Hard coding the linked list)



      //  third.next = fourth; // 18 --> 21 --> 24 --> 15
      //   fourth.next = fifth; // 18 --> 21 --> 24 --> 15 --> 12 --> null


    // }
}
