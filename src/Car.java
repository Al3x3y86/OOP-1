public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public  String color;
    public int year;
    public String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.equals(" ")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals(" ")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.equals(" ")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.equals(" ")) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    void printCar() {
        System.out.println(brand+" "+model+ ", сборка " +country+
                ", цвет кузова — " +color+", объем двигателя — " +engineVolume+
                "л., год выпуска — "+year+ "год.");
    }
}
