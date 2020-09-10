package classes;

public class Furniture {
    protected String material;
    protected String color;
    protected int price;
    protected String madeInCountry;

    Furniture() {
        material = "undefined";
        madeInCountry = "undefined";
        color = "undefined";
        price = -1;
    }

    Furniture(String material, int price, String color, String madeInCountry) {
        this.madeInCountry = madeInCountry;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setMadeInCountry(String madeInCountry) {
        this.madeInCountry = madeInCountry;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public String getMadeInCountry() {
        return madeInCountry;
    }
}
