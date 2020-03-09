import com.tst.Arrays;

public class CustomArrayMain {
	
	public static void main(String[] args) {
		Arrays a = new Arrays();
		a.insert(1);
		a.insert("hi");
		a.insert(new Integer(1));
		
		System.out.println(a.toString());
		System.out.println(a.indexOf("his"));
	}

}
