package be.ordina.utdemo.mocktype;

public class DieselEngine implements Engine {
    protected boolean started;

    @Override
    public void start() {
        started = true;
        System.out.println("DieselEngine: Broum Broum");
    }

    @Override
    public void stop() {
        if (started) {
            started = false;
            System.out.println("DieselEngine: !(Broum Broum)");
        } else {
            System.out.println("DieselEngine: ?");
        }
    }

    @Override
    public boolean isRunning() {
        return started;
    }
}
