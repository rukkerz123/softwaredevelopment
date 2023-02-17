package isuitelistener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class isuitelistener  implements ISuiteListener{

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub 
		System.out.println("test is now start");
	
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub 
		System.out.println("test is end");
		
	}  
	public void onend(Isuite suite) { 
		System.out.println("test will continue") ;
				   
	

}
