package be.ordina.utdemo.mocktype;

import org.junit.Assert;
import org.junit.Test;

/**
 * Use a fake object to isolate car
 *
 * @author ppoissinger
 *
 */
public class TestMockFake {
    private final Engine fakeEngine = new Engine() {
        boolean started=false;
        @Override
        public void stop() { started=false; }
        @Override
        public void start() { started=true; }
        @Override
        public boolean isRunning() { return started; }
    };

    private final Car carWithStartableEngine = new Car(fakeEngine);

    @Test
    public void testCarCanStart() {
        carWithStartableEngine.start();
        Assert.assertTrue(carWithStartableEngine.isStarted);
    }
}
