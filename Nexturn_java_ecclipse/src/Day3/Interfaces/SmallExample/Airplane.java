package Day3.Interfaces.SmallExample;

public class Airplane implements Vehicle {

    @Override
    public void wheels() {
        System.out.println("These are the wheels of the airplane");
    }

    @Override
    public void Engine() {
        System.out.println("This is the engine of the airplane");
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.Engine();
        airplane.wheels();
    }
}
