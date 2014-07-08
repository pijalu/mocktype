package be.ordina.utdemo.mocktype;

public class Car {
    protected Engine engine;
    protected boolean isStarted = false;

    public Car(final Engine engine) {
        setEngine(engine);
    }

    public void setEngine(final Engine engine) {
        if (isStarted || engine.isRunning()) {
            throw new IllegalStateException(
                    "You don't change the engine in a started car!");
        }
        this.engine = engine;
    }

    public void start() {
        engine.start();
        isStarted = engine.isRunning();
        if (isStarted) {
            System.out.println("Car: started");
        } else {
            System.out.println("Car: Criuk blup blup...(silence)");
        }
    }

    public void stop() {
        engine.stop();
        System.out.println("Car: I am stoped");
        isStarted = false;
    }
}
