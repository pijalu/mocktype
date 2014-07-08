package be.ordina.utdemo.mocktype;

import org.junit.Test;

/**
 * Test engine change using mock
 *
 * @author ppoissinger
 *
 */
public class TestMockDummy {
    final Engine dummyEngine = new DieselEngine();
    Car testedCar = new Car(new DieselEngine());
    @Test(expected = IllegalStateException.class)
    public void testExceptionIfCarStarted() {
        testedCar.start();
        testedCar.setEngine(dummyEngine);
    }
}
