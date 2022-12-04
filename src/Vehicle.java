public class Vehicle {

    String type;
    String model;
    String color;
    double price;
    String[] seats;

    Vehicle(){
        this("sedan", "lada", "white", 10);
    }

    Vehicle(String type, String model, String color, double price, String... seats){
        this.type = type;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();

        System.out.println(car);

        Vehicle sportCar = new Vehicle("sportcar", "audi", "black", 100.0, "sportSeat", "standardSeat");
        System.out.println(sportCar);
    }
}
