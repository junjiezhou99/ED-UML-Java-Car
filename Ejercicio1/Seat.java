package Ejercicio1;

public class Seat extends Car {
    private String distributor;
    private Engine engine;

    public Seat(String _color, int _maxSpeed, String _distributor){
        super(_color, _maxSpeed);
        this.distributor = _distributor;
        this.engine = new Engine();
    }

    public void SeatStopDemo(){
        System.out.println("Overview: Distributor= " + distributor);
        CarInfo();
        engine.Stop();
    }
}
