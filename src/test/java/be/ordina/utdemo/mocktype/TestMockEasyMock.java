package be.ordina.utdemo.mocktype;


import static org.easymock.EasyMock.expect;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class TestMockEasyMock extends EasyMockSupport{
    @Mock
    Engine mockEngine;

    @Test
    public void testCarWithAMockedEngine() {
        //Engine mockEngine=createMock(Engine.class);
        expect(mockEngine.isRunning()).andReturn(false);
        mockEngine.start();
        expect(mockEngine.isRunning()).andReturn(true);
        mockEngine.stop();
        replayAll();

        Car testedCar = new Car(mockEngine);

        testedCar.start();
        testedCar.stop();

        verifyAll();
    }

}
