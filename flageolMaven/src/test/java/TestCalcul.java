

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCalcul {
User us=new User();
Operations op=new Operations();
Calcul calculator=new Calcul();
double delta = 1e-15;
@Test
public void test$sum() {
    /**
     * This method should take two values (double)
     * and adds them together, returning the new value.
     */
    double expectedValue = 5;
    double actualValue = calculator.addition(2, 3);
    assertEquals("Le résultat doit être 5",expectedValue , actualValue, delta);
}

@Test
public void test$subract() {
    /**
     * This method should take two values (double)
     * and subtracts the first from the second.
     */
    double expectedValue = 10;
    double actualValue = calculator.soustraction(15, 5);
    assertEquals("Le résultat doit être 10", expectedValue, actualValue, delta);
}

@Test
public void test$divide() {
    /**
     * This method should take two values (double)
     * and divides the first from the second.
     */
    double expectedValue = 10;
    double actualValue = calculator.division(20, 2);
    assertEquals("Le résultat doit être 10", expectedValue, actualValue, delta);
}

@Test
public void test$multiply() {
    /**
     * This method should take two values (double)
     * and multiply the first with the second.
     */
    double expectedValue = 100;
    double actualValue = calculator.multiplication(50, 2);
    assertEquals("Le résultat doit être 100", expectedValue, actualValue, delta);
}

@Test
public void test$square() {
    /**
     * This method should square a value (double) provided by the user.
     */
    double expectedValue = 4;
    double actualValue = calculator.square(2);
    assertEquals("Le résultat doit être 4", expectedValue, actualValue, delta);
}

@Test
public void test$squareRoot() {
    /**
     * This method should provide the square root of a value (double).
     */
    double expectedValue = 2;
    double actualValue = calculator.squareRoot(4);
    assertEquals("Le résultat doit être 2", expectedValue, actualValue, delta);
}

@Test
public void test$variableExponentiation() {
    /**
     * This method should evaluate value1 (double) to the power of value2 (double).
     */
    double expectedValue = 1000000;
    double actualValue = calculator.variableExponentiation(100, 3);
    assertEquals("This should evaluate to 1000", expectedValue, actualValue, delta);
}

@Test
public void test$invertPositiveAndNegative() {
    /**
     * This method will invert the sign of the number
     */
    double expectedValue = 100;
    double actualValue = calculator.invertPositiveAndNegative(-100);
    assertEquals("Le résultat doit être", expectedValue, actualValue, delta);
}

@Test
public void test$sin() {
    /**
     * This method will evaluate to an answer that is equal to the ratio
     * of the side opposite a given angle (in a right triangle) to the hypotenuse.
     */
    double expectedValue = 0.8939966636005579;
    double actualVaue = calculator.sine(90);
    assertEquals("Le résultat doit être 0.8939966636005579", expectedValue, actualVaue, delta);
}

@Test
public void test$cosin() {
    /**
     * This method will evaluate to an answer that is equal to the ratio
     * of the side adjacent to an acute angle (in a right-angled triangle) to the hypotenuse.
     */
    double expectedValue = -0.4480736161291702;
    double actualValue = calculator.cosine(90);
    assertEquals("Le résultat doit être 0.4480736161291702", expectedValue, actualValue, delta);
}

@Test
public void test$tangent() {
    /**
     * This method will evaluate a tangent line
     */
    double expectedValue = -1.995200412208242;
    double actualValue = calculator.tangent(90);
    assertEquals("Le résultat doit être -1.995200412208242", expectedValue, actualValue, delta);
}

}
