package classes;

public class Sofa extends Furniture {
    int countOfPillows;
    String surfaceMaterial;
    int Length;
    int Width;
    int S;

    Sofa() {
        countOfPillows = -1;
        surfaceMaterial = "undefined";
        int Length = -1;
        int Width = 1;
    }

    Sofa(String material, String color, int price, String madeInCountry,
         int countOfLegs, String surfaceMaterial, int Length, int Width) {
        this.countOfPillows = countOfLegs;
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

    public void setCountOfPillows(int countOfLegs) {
        this.countOfPillows = countOfLegs;
    }

    public int getCountOfPillows() {
        return countOfPillows;
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
                "\nКол-во ножек:" + countOfPillows +
                "\nМатериал:" + material +
                "\nМатериал поверхности:" + surfaceMaterial +
                "\nПлощадь:" + S +
                "\nЦвет:" + color +
                "\nЦена:" + price +
                "\nСделано:" + madeInCountry +
                "\n_________________________";
    }
}