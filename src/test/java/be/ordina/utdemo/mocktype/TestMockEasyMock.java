package be.ordina.utdemo.mocktype;


import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.expectLastCall;

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


    @Test
    public void testCarWithAMockedEngineThatDoesNotStart() {
        expect(mockEngine.isRunning()).andStubReturn(false);
        mockEngine.start();
        expectLastCall().anyTimes();
        replayAll();

        Car testedCar = new Car(mockEngine);
        for (int i=0;i<100;++i) {
            testedCar.start();
        }
    }
}
