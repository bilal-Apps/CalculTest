package math;


public class Main {

	public static void main(String[] args) {
		Operations op=new Operations();
		User u=new User();
		
		
		
		while(true)
		{
			System.out.println("Ma super calculatrice");
			System.out.println("----------");
			u.getID();
			System.out.println("----------");
			int rep=u.getCas();
			op.operation(rep);
			System.out.println("----------");
			
		}		
	}

}

