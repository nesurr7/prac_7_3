package classes;

public class Chair extends Furniture {
    private int countOfLegs;
    private boolean Pillow;

    Chair() {
        countOfLegs = -1;
        Pillow = false;
    }

    Chair(String material, String color, int price, String madeInCountry, int countOfLegs, boolean Pillow) {
        this.Pillow = Pillow;
        this.countOfLegs = countOfLegs;
        this.madeInCountry = madeInCountry;
        this.color = color;
        this.price = price;
        this.madeInCountry = material;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public void setPillow(boolean pillow) {
        Pillow = pillow;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public boolean getPillow() {
        return Pillow;
    }

    @Override
    public String toString() {
        return "Параметры стула:" +
                "\nКол-во ножек:" + countOfLegs +
                "\nНаличие подушки:" + Pillow +
                "\nМатериал:" + material +
                "\nЦвет:" + color +
                "\nЦена:" + price +
                "\nСделано:" + madeInCountry +
                "\n_________________________";
    }
}
