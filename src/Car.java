public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String origin;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String origin) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (origin == null) {
            this.origin = "default";
        } else {
            this.origin = origin;
        }

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }
}
