package SingletonPattern;

public class MyMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login ob=Login.getObj();
		
		Login ob2=Login.getObj();
		
		
		/*although we creates two objects these objects points
		 * to the same object created using Login class in stack.
		 */
	}

}
