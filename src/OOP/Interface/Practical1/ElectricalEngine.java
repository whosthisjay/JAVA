
package OOP.Interface.Practical1;

public class ElectricalEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electrical Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Electrical Engine Accelerate");
    }
}
