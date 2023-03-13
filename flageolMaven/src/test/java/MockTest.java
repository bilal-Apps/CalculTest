

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class MockTest {

	Operations op;
	@Mock 
	Calcul c=new Calcul();
	
	@Before
public void setup() {
		
		op=new Operations();
	}
	
	@Test
	public void test() {
		when(c.addition(1.0, 2.0)).thenReturn(3.0);
		//assertEquals(5, op.operation(1));

}}
