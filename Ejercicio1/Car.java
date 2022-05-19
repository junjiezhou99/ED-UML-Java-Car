package Ejercicio1;

public class Car{
    private String color;
    private int maxSpeed;

    public Car(String _color, int _maxSpeed){
        this.color = _color;
        this.maxSpeed = _maxSpeed;
    }

    public void CarInfo(){
        System.out.println("Car info: Car color= " + this.color + "Max speed =" + this.maxSpeed);
    }
}