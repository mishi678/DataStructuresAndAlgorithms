import com.thestacktree.datastructure.tree.AVLTree;
import com.thestacktree.datastructure.tree.BinaryTree;
import com.thestacktree.datastructure.tree.Heap;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
////		BinaryTree tree = new BinaryTree();
//		AVLTree  tree = new AVLTree();
//		tree.insert("1");
//		tree.insert("3");
//		tree.insert("6");
//		tree.insert("8");
//		tree.insert("2");
		
		Heap heap = new Heap();
		heap.insert("5");
		heap.insert("4");
		heap.insert("3");
		heap.insert("6");
		
		System.out.println("Removed "+heap.removeRoot());
	}
}
