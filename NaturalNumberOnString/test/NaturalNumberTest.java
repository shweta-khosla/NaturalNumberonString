import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;

/**
 * JUnit test fixture for {@code NaturalNumber}'s constructors and kernel
 * methods.
 *
 * @author Put your name here
 *
 */
public abstract class NaturalNumberTest {

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new number
     * @ensures constructorTest = 0
     */
    protected abstract NaturalNumber constructorTest();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorTest = i
     */
    protected abstract NaturalNumber constructorTest(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorTest)
     */
    protected abstract NaturalNumber constructorTest(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorTest = n
     */
    protected abstract NaturalNumber constructorTest(NaturalNumber n);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @return the new number
     * @ensures constructorRef = 0
     */
    protected abstract NaturalNumber constructorRef();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorRef = i
     */
    protected abstract NaturalNumber constructorRef(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorRef)
     */
    protected abstract NaturalNumber constructorRef(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorRef = n
     */
    protected abstract NaturalNumber constructorRef(NaturalNumber n);

    /**
     * Test default constructor.
     */
    @Test
    public void testConstructorNoArgs() {
        NaturalNumber n = this.constructorTest();
        assertTrue(n.isZero());
    }

    /**
     * Test constructor with int parameter.
     */
    @Test
    public void testConstructorInt() {
        NaturalNumber n = this.constructorTest(123);
        assertEquals("123", n.toString());
    }

    /**
     * Test constructor with string parameter.
     */
    @Test
    public void testConstructorString() {
        NaturalNumber n = this.constructorTest("456");
        assertEquals("456", n.toString());
    }

    /**
     * Test constructor with NaturalNumber parameter.
     */
    @Test
    public void testConstructorNaturalNumber() {
        NaturalNumber source = this.constructorTest(789);
        NaturalNumber n = this.constructorTest(source);
        assertEquals("789", n.toString());
    }

    /**
     * Test multiplyBy10 method.
     */
    @Test
    public void testMultiplyBy10() {
        NaturalNumber n = this.constructorTest(12);
        n.multiplyBy10(3);
        assertEquals("123", n.toString());
    }

    /**
     * Test multiplyBy10 with zero.
     */
    @Test
    public void testMultiplyBy10Zero() {
        NaturalNumber n = this.constructorTest();
        n.multiplyBy10(0);
        assertTrue(n.isZero());
    }

    /**
     * Test divideBy10 method.
     */
    @Test
    public void testDivideBy10() {
        NaturalNumber n = this.constructorTest(987);
        int lastDigit = n.divideBy10();
        assertEquals(7, lastDigit);
        assertEquals("98", n.toString());
    }

    /**
     * Test divideBy10 when number is zero.
     */
    @Test
    public void testDivideBy10Zero() {
        NaturalNumber n = this.constructorTest();
        int lastDigit = n.divideBy10();
        assertEquals(0, lastDigit);
        assertTrue(n.isZero());
    }

    /**
     * Test isZero method.
     */
    @Test
    public void testIsZero() {
        NaturalNumber n = this.constructorTest();
        assertTrue(n.isZero());
    }

    /**
     * Test isZero when number is non-zero.
     */
    @Test
    public void testIsZeroFalse() {
        NaturalNumber n = this.constructorTest(100);
        assertEquals("100", n.toString());
        assertEquals(false, n.isZero());
    }

}
