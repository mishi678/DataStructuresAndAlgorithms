package com.tst;

import java.util.ArrayList;

public class Arrays {
	
	private Object[] array;
		
	public void insert(Object obj) {
		if(array!=null) {
			Object[] tmpArray = new Object[array.length +1];
			for(int i=0 ;i<array.length;i++){
				tmpArray[i] = array[i];
			}
			tmpArray[tmpArray.length-1] = obj;
			array = tmpArray;
		}else {
			array = new Object[1];
			array[0] = obj;
			
		}
	}
	
	public int indexOf(Object serchObj) {
		int objIndex =-1;
		for(int i=0 ;i< array.length;i++) {
			if(array[i].equals(serchObj)) {
				objIndex = i;
				break;
			}
		}
		return objIndex;
	}
	
	@Override
	public String toString() {
		String arrayString = null;
		for(int i=0 ;i<array.length;i++){
			if(i == 0) {
				arrayString = array[i].toString();
			}else {
				arrayString = arrayString +","+ array[i].toString();
			}
		}
		return arrayString;
	}
}
