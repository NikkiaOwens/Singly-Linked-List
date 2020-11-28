package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public Node head = null;
        public Node tail = null;

        public void add(int data){

            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void remove(int index){
           //remove node from list at this index.
            if(head == null)
                return;

            //store head
            Node temp = head;

            // if need to remove head
            if( index == 0){
                head = temp.next; //change head
                return;
            }
            // find previous node of the node to be deleted.
            for( int i = 0; temp != null && i < index-1; i++)
                temp = temp.next;

            // if index greater than number of nodes
            if(temp == null || temp.next == null)
                return;

            //node temp - next is the node to be deleted store pointer to the next of the node to be edeleted
            Node next = temp.next.next;

            temp.next = next; //unlinks the deleted node?
        }

        public boolean contains(int element){
            // returns true if list contains element
//            if(head == null)
//                return false;

            //store head
            Node temp = head;


          while(temp != null){
              temp = temp.next;
          }
          if(temp.equals(element))
              return true;
          else
          return false;
        }

        public void display(){

            Node current =head;

            if(head == null){
                System.out.println("empty");
                return;
            }

            System.out.println("Nodes");
            while(current != null){
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

