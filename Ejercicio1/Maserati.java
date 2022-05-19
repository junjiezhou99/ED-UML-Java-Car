package Ejercicio1;

public class Maserati extends Car {
    private String designer;
    private String productionYear;
    private Engine engine;

    public Maserati(String _color, int _maxSpeed, String _designer, String _productionYear){
        super(_color, _maxSpeed);
        this.designer = _designer;
        this.productionYear = _productionYear;
        this.engine = new Engine();
    }

    public void MaseratiStartDemo(){
        System.out.println("Overview: Designer= " + designer + " Production= " + productionYear);
        CarInfo();
        engine.Start();
    }

}
