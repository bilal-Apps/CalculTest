import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Ignore;
import org.junit.Test;

public class CalserviceTest {
    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddition() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at Calservice.addition(Calservice.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Calservice()).addition(10.0d, 10.0d);
    }

    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    public void testAddition2() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.add(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.addition(10.0d, 10.0d), 0.0);
        verify(iResolution).add(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    public void testAddition3() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.add(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.addition(1.0d, 10.0d), 0.0);
        verify(iResolution).add(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    public void testAddition4() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.add(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.addition(0.5d, 10.0d), 0.0);
        verify(iResolution).add(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    public void testAddition5() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.add(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.addition(-0.5d, 10.0d), 0.0);
        verify(iResolution).add(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddition6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at Calservice.addition(Calservice.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Calservice()).addition(1.0d, 10.0d);
    }

    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddition7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at Calservice.addition(Calservice.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Calservice()).addition(0.5d, 10.0d);
    }

    /**
     * Method under test: {@link Calservice#addition(double, double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddition8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at Calservice.addition(Calservice.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Calservice()).addition(-0.5d, 10.0d);
    }

    /**
     * Method under test: {@link Calservice#soustraction(double, double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSoustraction() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at Calservice.soustraction(Calservice.java:24)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Calservice()).soustraction(10.0d, 10.0d);
    }

    /**
     * Method under test: {@link Calservice#soustraction(double, double)}
     */
    @Test
    public void testSoustraction2() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.sub(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.soustraction(10.0d, 10.0d), 0.0);
        verify(iResolution).sub(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#soustraction(double, double)}
     */
    @Test
    public void testSoustraction3() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.sub(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.soustraction(1.0d, 10.0d), 0.0);
        verify(iResolution).sub(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#soustraction(double, double)}
     */
    @Test
    public void testSoustraction4() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.sub(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.soustraction(0.5d, 10.0d), 0.0);
        verify(iResolution).sub(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#soustraction(double, double)}
     */
    @Test
    public void testSoustraction5() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.sub(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.soustraction(-0.5d, 10.0d), 0.0);
        verify(iResolution).sub(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#multiplication(double, double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMultiplication() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at Calservice.multiplication(Calservice.java:28)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Calservice()).multiplication(10.0d, 10.0d);
    }

    /**
     * Method under test: {@link Calservice#multiplication(double, double)}
     */
    @Test
    public void testMultiplication2() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.multy(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.multiplication(10.0d, 10.0d), 0.0);
        verify(iResolution).multy(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#multiplication(double, double)}
     */
    @Test
    public void testMultiplication3() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.multy(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.multiplication(1.0d, 10.0d), 0.0);
        verify(iResolution).multy(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#multiplication(double, double)}
     */
    @Test
    public void testMultiplication4() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.multy(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.multiplication(0.5d, 10.0d), 0.0);
        verify(iResolution).multy(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#multiplication(double, double)}
     */
    @Test
    public void testMultiplication5() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.multy(anyDouble(), anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.multiplication(-0.5d, 10.0d), 0.0);
        verify(iResolution).multy(anyDouble(), anyDouble());
    }

    /**
     * Method under test: {@link Calservice#division(double, double)}
     */
    @Test
    public void testDivision() {
        assertEquals(1.0d, (new Calservice()).division(10.0d, 10.0d), 0.0);
        assertEquals(0.0d, (new Calservice()).division(0.0d, 10.0d), 0.0);
        assertEquals(0.1d, (new Calservice()).division(1.0d, 10.0d), 0.0);
        assertEquals(0.05d, (new Calservice()).division(0.5d, 10.0d), 0.0);
        assertEquals(0.0d, (new Calservice()).division(10.0d, 0.0d), 0.0);
    }

    /**
     * Method under test: {@link Calservice#division(double, double)}
     */
    @Test
    public void testDivision2() {
        Calservice calservice = new Calservice();
        calservice.setIr(mock(IResolution.class));
        assertEquals(1.0d, calservice.division(10.0d, 10.0d), 0.0);
    }

    /**
     * Method under test: {@link Calservice#square(double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSquare() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at Calservice.square(Calservice.java:45)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Calservice()).square(10.0d);
    }

    /**
     * Method under test: {@link Calservice#square(double)}
     */
    @Test
    public void testSquare2() {
        IResolution iResolution = mock(IResolution.class);
        when(iResolution.square(anyDouble())).thenReturn(10.0d);

        Calservice calservice = new Calservice();
        calservice.setIr(iResolution);
        assertEquals(10.0d, calservice.square(10.0d), 0.0);
        verify(iResolution).square(anyDouble());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Calservice}
     *   <li>{@link Calservice#setIr(IResolution)}
     *   <li>{@link Calservice#setRes(IResolution)}
     *   <li>{@link Calservice#getIr()}
     *   <li>{@link Calservice#getRes()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Calservice actualCalservice = new Calservice();
        actualCalservice.setIr(null);
        actualCalservice.setRes(null);
        assertNull(actualCalservice.getIr());
        assertNull(actualCalservice.getRes());
    }
}

