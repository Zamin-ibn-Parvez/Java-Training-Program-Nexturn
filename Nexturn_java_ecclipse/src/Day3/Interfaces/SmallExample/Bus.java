package Day3.Interfaces.SmallExample;

public class Bus implements Vehicle{

    public void wheels(){
        System.out.println("These are the wheels of the bus");
    }

    public void Engine(){
        System.out.println("This is the engine of the bus");
    }


    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.Engine();
        bus.wheels();
    }
}
