package com.technoelevate.collection;

import java.util.Iterator;

public class ArrayListImplementation implements Iterable{
	private Object[] myArray;
	private int pos;
	public ArrayListImplementation(int size) {
		this.myArray=new Object[size];
	}
	public void addElements(Object obj) {
		if(this.pos>=this.size()) {
			grow();
		}
		
			this.myArray[pos]=obj;
			pos++;
		
	}
	public int size() {
		return this.myArray.length;
	}
	private Object[] grow() {
		Object[] temp=this.myArray;
		this.myArray=new Object[this.size()*2];
		for(int i=0;i<temp.length;i++) {
			this.myArray[i]=temp[i];
		}
		return this.myArray;
	}
	
	public void getAllElement() {
		for(Object ob:this.myArray) {
			System.out.print(ob+" ");
		}
	}
	
	public void getElements(int index) {
		System.out.println(this.myArray[index]);
	}
	
	@Override
	public Iterator iterator() {
			return new MyIteratorClass() ;
	}
	private class MyIteratorClass implements Iterator{
		int tempVar;
		  
		@Override
		public boolean hasNext() {
	
			return tempVar<pos?true:false;
		}

		@Override
		public Object next() {
	
			return myArray[tempVar++];
		}
		
	}
	
}
	
	
