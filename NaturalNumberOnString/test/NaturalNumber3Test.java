import components.naturalnumber.NaturalNumber;

/**
 * Customized JUnit test fixture for {@code NaturalNumber3}.
 */
public class NaturalNumber3Test extends NaturalNumberTest {

    @Override
    protected final NaturalNumber constructorTest() {
        return new NaturalNumber3();
    }

    @Override
    protected final NaturalNumber constructorTest(int i) {
        return new NaturalNumber3(i);
    }

    @Override
    protected final NaturalNumber constructorTest(String s) {
        return new NaturalNumber3(s);
    }

    @Override
    protected final NaturalNumber constructorTest(NaturalNumber n) {
        return new NaturalNumber3(n);
    }

    @Override
    protected final NaturalNumber constructorRef() {
        return new NaturalNumber3();
    }

    @Override
    protected final NaturalNumber constructorRef(int i) {
        return new NaturalNumber3(i);
    }

    @Override
    protected final NaturalNumber constructorRef(String s) {
        return new NaturalNumber3(s);
    }

    @Override
    protected final NaturalNumber constructorRef(NaturalNumber n) {
        return new NaturalNumber3(n);
    }
}
