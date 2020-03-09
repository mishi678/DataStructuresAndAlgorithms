import com.tst.LinkedList;
import com.tst.Node;

public class Main {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.addFirst("5");
	list.addFirst("4");
	list.addFirst("3");
	list.addFirst(2);
	list.addFirst(1);
//	list.addAt("Second Ele", 1);
	System.out.println(" Before Reverse :"+list);
	list.reverse();
	System.out.println("After Reverse: "+list);
	System.out.println("Node from last: "+list.findNodeFromEnf(4));
	list.deleteFirst();
	System.out.println("List after deletion :"+list);
}
}
