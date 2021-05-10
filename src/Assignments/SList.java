package Assignments;

import java.util.Iterator;


public class SList<E> {
	ListNode<E> head;
	int size;
	
	public SList() {
		head = new ListNode<E>(null);
		size = 0;
	}
	
	public Iterator<E> iterator(){
		return new Iterator<E>() {
          int myCount = 0;
          ListNode<E> node = head;

            @Override
            public boolean hasNext () {
                return myCount < size;
            }

            @Override
            public E next () {
                E s = node.data;
                myCount++;
                node=node.next;
                return s;
            }
        };
	}
	
	@Override
	public String toString() {
		return "SList [head=" + head + ", size=" + size + "]";
	}
	
	public void insert(int index,E element) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		if(element == null)
			throw new NullPointerException();
		ListNode<E> node = new ListNode(element);
		ListNode<E> headTemp = head;
		Iterator<E> itr = this.iterator();
		int count =0;
		while(itr.hasNext() && count<index)
			node=node.next;
		ListNode<E> nodenext = headTemp.next;
		headTemp.next = node;
		node.next = nodenext;
		size++;
	}
	
	public E remove(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		ListNode<E> headTemp = head;
		Iterator<E> itr = this.iterator();
		int count =0;
		while(itr.hasNext() && count<index)
			headTemp=headTemp.next;
		E oldData = headTemp.next.data;
		headTemp.next = headTemp.next.next;
		size--;
		return oldData;
	}
}
class ListNode<E>{
	E data;
	ListNode<E> next;
	
	public ListNode(E e) {
		this.data = e;
		this.next = null;
	}
}
