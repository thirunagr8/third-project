package Week2;


public class Telecom extends Samsung implements MobileDesign {

	public static void main(String[] args) {
		//	public void  dialcaller(){
		//	System.out.println("I have option for calling")
		/*Samsung inh = new Samsung();
		MobilePhone inh1 = new MobilePhone();
		inh.camera();
		inh.dialcalling();
		inh1.Iphone();
		inh1.Nokia();

		 */		
		// camera();
		//dialcalling();
		//dialcalling("Ramesh" );
		// IphoneCamera();

		/*@Override
	public void support4G() {
		// TODO Auto-generated method stub
		System.out.println("I am learning interface");
	}
	}
		 */

		Telecom tn = new Telecom();
		tn.enablesim();
	}
	//@Override
	public  void enablesim() {
		// TODO Auto-generated method stub
		System.out.println("hi");	
	}
}


