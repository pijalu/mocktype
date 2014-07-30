package be.ordina.utdemo.mocktype;

public class App {

    private App() {
    }

    public static void main(final String[] args) {
        Car c = new Car(new DieselEngine());
        c.start();
        c.stop();
    }

}
