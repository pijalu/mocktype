package be.ordina.utdemo.mocktype;

public class DummyEngine implements Engine {
    @Override
    public void start() {}

    @Override
    public void stop() {}

    @Override
    public boolean isRunning() { return true;  }
}
