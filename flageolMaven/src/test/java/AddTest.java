

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class AddTest {
	
	Calservice calservice;
	
	@Before
	public void setup() {
		IResolution res=mock(IResolution.class);
		when(res.add(3,3)).thenReturn(6.0);
		when(res.sub(3,3)).thenReturn(0.0);
		when(res.multy(3,3)).thenReturn(9.0);
		when(res.square(2)).thenReturn(4.0);
		
		
		calservice=new Calservice();
		calservice.setIr(res);
	}
	@Test
	public void test() {
		
		
		assertEquals(6, calservice.addition(3, 3), -1);
		assertEquals(2, calservice.soustraction(3, 3), 3);
		assertEquals(9, calservice.multiplication(3, 3), -1);
		assertEquals(4, calservice.square(2), -1);
		
	}

}
