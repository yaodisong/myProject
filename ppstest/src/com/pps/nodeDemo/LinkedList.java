package com.pps.nodeDemo;

public class LinkedList<T> {
    public Node head = new Node(null);
    public int size;
    public LinkedList(){

    }
    /*
    * 获取下标对应node
    * */
    public T get(int i){
        if(i<0||i>size-1){
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }else {
            //把第一个节点给临时节点遍历
            Node temp = head;
            //用counter来计数，找到在链表里的节点位置
            int counter = -1;
            while(temp!=null){
                if(counter == i){
                    return (T)temp.t;
                }
                temp = temp.next;
                counter++;
            }
        }

        return null;
    }
    /*
    * 在列表后面新增节点
    * */
    public void add(T t){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(t);
        size++;
    }
    /*
    * 删除下标对应节点
    * */
    public Boolean delete(int i){

        if(i<0||i>size-1){
            throw new IndexOutOfBoundsException("下标越界");
        }else {
            int counter = -1;
            Node temp = head;
            while (temp!=null){
                if(counter==i){
                    temp.next = temp.next.next;
                    size--;
                }
                temp = temp.next;
                counter++;
            }
        }
        return true;
    }
}

























