package SingletonPattern;

public  class Login {

	private static Login loginObj;
	
	private Login() {}
	
	
	public static Login getObj() {
	if(loginObj==null) {
		synchronized(Login.class) {
			if(loginObj==null) {
				loginObj=new Login();
			}	
		}
		
	}
	return loginObj;
	}

}
