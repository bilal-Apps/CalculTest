


public class Main {

	public static void main(String[] args) {
		Operations op=new Operations();
		User u=new User();
		
		
		
		while(true)
		{
			System.out.println("Ma super calculatrice");
			u.getID();
			System.out.println("----------");
			int rep=u.getCas();
			System.out.println("----------");
			op.operation(rep);
			System.out.println("----------");
		
			
		}		
	}

}

