package OOP.Interface.Practical1;

public class NiceCar {
    private Engine engine;
    private Media player=new CDPlayer();
    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upGradeEngine(){
        this.engine=new ElectricalEngine();
    }
}
