public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Door door1;
    private Door door2;
    private Door door3;
    private Door door4;
    private Brake brake;
    private Light light;

    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        door1 = new Door();
        door2 = new Door();
        door3 = new Door();
        door4 = new Door();
        brake = new Brake();
        light = new Light();
    }

    public void start() {
        engine.start();
        door1.open();
        door2.open();
        door3.open();
        door4.open();
        brake.start();

    }

    public void drive() {
        if (engine.getWork()) {
            transmission.switchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
            light.turnLight();

        }
    }

    public void stop() {
        engine.stop();
        door1.close();
        door2.close();
        door3.close();
        door4.close();
        brake.stop();
    }

    public static void main(String[] args) {
        Base base = new Base();
        base.start();
        base.drive();
        base.stop();
    }

}