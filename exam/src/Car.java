

public class Car {
    private String make = "Indonesia";
    private String model = "Sedan";
    private int year = 2024;

    public Car (String Make, String Model, int Year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetail() {
        System.out.println("Mobil ini dibuat di: " + make);
        System.out.println("Model mobil ini adalah: " + model);
        System.out.println("Mobil ini dibuat pada tahun: " + year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
