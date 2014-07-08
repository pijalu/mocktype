package be.ordina.utdemo.mocktype;

import org.junit.Assert;
import org.junit.Test;

/**
 * Use a stub object to trigger odd case: Engine does not start
 *
 * @author ppoissinger
 *
 */
public class TestMockSpy {
    private class SpyEngine extends DieselEngine {
        int startedCalledCount=0;
        @Override
        public void start() {
            startedCalledCount++;
            super.start();
        }
    };
    private final SpyEngine spyEngine = new SpyEngine();
    private final Car spiedTestCar = new Car(spyEngine);

    @Test
    public void testCarStartStartsTheEngine() {
        spiedTestCar.start();
        Assert.assertEquals("Engine start is called once", 1, spyEngine.startedCalledCount);
    }
}
