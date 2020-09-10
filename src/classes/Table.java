package classes;

public class Table extends Furniture {
    private int countOfLegs;
    private String surfaceMaterial;
    private int Length;
    private int Width;
    private int S;

    Table() {
        countOfLegs = -1;
        surfaceMaterial = "undefined";
        int Length = -1;
        int Width = 1;
    }

    Table(String material, String color, int price, String madeInCountry,
          int countOfLegs, String surfaceMaterial, int Length, int Width) {
        this.countOfLegs = countOfLegs;
        this.madeInCountry = madeInCountry;
        this.color = color;
        this.price = price;
        this.madeInCountry = material;
        this.surfaceMaterial = surfaceMaterial;
        this.Length = Length;
        this.Width = Width;
        this.S = Width * Length;
    }

    public void setSurfaceMaterial(String surfaceMaterial) {
        this.surfaceMaterial = surfaceMaterial;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public String getSurfaceMaterial() {
        return surfaceMaterial;
    }

    public int getS() {
        return S;
    }

    @Override
    public String toString() {
        return "Параметры стола" +
                "\nКол-во ножек:" + countOfLegs +
                "\nМатериал:" + material +
                "\nМатериал поверхности:" + surfaceMaterial +
                "\nПлощадь:" + S +
                "\nЦвет:" + color +
                "\nЦена:" + price +
                "\nСделано:" + madeInCountry +
                "\n_________________________";
    }
}
