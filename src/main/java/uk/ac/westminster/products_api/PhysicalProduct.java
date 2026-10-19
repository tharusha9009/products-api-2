package uk.ac.westminster.products_api;
// 1. A PhysicalProduct IS-A Product because…
// 2.  name one other class a shop system might have that would NOT pass this test, and say why.
public class PhysicalProduct extends product{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct (){};
    public PhysicalProduct (String name , Long id ,double price , double weightKg , String dimensions ){
        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;

    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }


}
