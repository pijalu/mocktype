package be.ordina.utdemo.mocktype;

import org.junit.Assert;
import org.junit.Test;

/**
 * Use a stub object to trigger odd case: Engine does not start
 *
 * @author ppoissinger
 *
 */
public class TestMockStub {
    private final Engine stubEngine = new Engine() {
        @Override
        public void stop() {}
        @Override
        public void start() {}
        @Override
        public boolean isRunning() { return false; }
    };
    private final Car carWithUnstartableEngine = new Car(stubEngine);

    @Test
    public void testCarDoesNotStartWithoutEngine() {
        carWithUnstartableEngine.start();
        Assert.assertFalse(carWithUnstartableEngine.isStarted);
    }
}
