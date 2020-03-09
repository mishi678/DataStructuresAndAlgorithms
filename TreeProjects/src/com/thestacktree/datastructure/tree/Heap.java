package com.thestacktree.datastructure.tree;

public class Heap {
	Object heap[] = new Object[100];
	int heapIndex = 0;
	public void insert(Object item){
		int currentIndex = getInsertIndex();
		int parentIndex = getParentIndex(currentIndex);
		heap[currentIndex] = item;
		while(heap[currentIndex].hashCode() > heap[parentIndex].hashCode() ){
			swap(currentIndex,parentIndex);
			currentIndex = parentIndex ;
			parentIndex = getParentIndex(currentIndex);
		}
	}
	private int getInsertIndex() {
		
		while(heap[heapIndex] != null)
			heapIndex++;
		
		return heapIndex;
	}
	private void swap(int currentIndex, int parentIndex) {
		Object tmp = heap[parentIndex];
		heap[parentIndex] = heap[currentIndex];
		heap[currentIndex] = tmp;
	}
	private int getParentIndex(int currentIndex) {
		if(currentIndex<2) return 0;
		return (currentIndex -1 )/2;
	}
	
	public boolean isEmpty(){
		return heapIndex < 0;
	}
	
	public Object removeRoot(){
		Object rootItem = heap[0];
		int currentRootNodeIndex = 0;
		
		//loop until reach empty left and right
		while(currentRootNodeIndex != -1  ){
			int leftIndex = getLeftNodeIndex(currentRootNodeIndex);
			int rightIndex = getRightNodeIndex(currentRootNodeIndex);
			
			int indexOfHighValue =getHighestNodeIndex(leftIndex,rightIndex);
			
			//move the bigger node to root
			if(indexOfHighValue != -1){
				heap[currentRootNodeIndex] = heap[indexOfHighValue];
				heap[indexOfHighValue] = null;
				heapIndex = indexOfHighValue ;
			}
			currentRootNodeIndex = indexOfHighValue;
		}
		// end loop
		
		return rootItem;
	}
	private int getHighestNodeIndex(int leftIndex, int rightIndex) {
		if(heap[leftIndex] == null && heap[rightIndex]  ==null)
			return -1;
		if(heap[leftIndex] == null && heap[rightIndex]  !=null)
			return rightIndex;
		if(heap[leftIndex] != null && heap[rightIndex]  ==null)
			return leftIndex;
		
		return (heap[leftIndex].hashCode()>heap[rightIndex].hashCode())?leftIndex:rightIndex;
		
	}
	private int getRightNodeIndex(int currentRootNodeIndex) {
		return (currentRootNodeIndex * 2) + 2 ;
	}
	private int getLeftNodeIndex(int currentRootNodeIndex) {
		return (currentRootNodeIndex * 2) + 1 ;
	}
	
	

}
