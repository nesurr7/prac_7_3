package classes;

import java.util.ArrayList;

public class FurnitureShop {

    private ArrayList<Sofa> sofas = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();
    private ArrayList<Chair> chairs = new ArrayList<>();

    FurnitureShop() {
        Chair chair1 = new Chair("Дерево", "Белый", 2500,
                "Россия", 4, true);
        Chair chair2 = new Chair("Дерево", "Зеленый", 4500,
                "Германия", 8, true);
        chairs.add(chair1);
        chairs.add(chair2);
        Table table1 = new Table("Дерево", "Алый", 4500,
                "Россия", 4, "Стекло", 50, 100);
        Table table2 = new Table("Дерево", "Черный", 7500,
                "Норвегия", 4, "Металл", 100, 100);
        tables.add(table1);
        tables.add(table2);
        Sofa sofa1 = new Sofa("Кожа", "Бежевый", 11500,
                "Россия", 4, "Шерсть", 250, 120);
        Sofa sofa2 = new Sofa("Ткань", "Белый", 6500,
                "Россия", 24, "Ткань", 150, 220);
        sofas.add(sofa1);
        sofas.add(sofa2);
    }

    public void addChair(Chair obj) {
        chairs.add(obj);
    }

    public void addTable(Table obj) {
        tables.add(obj);
    }

    public void addSofa(Sofa obj) {
        sofas.add(obj);
    }

    //Удаление по индексу

    public void delChair(int del) {
        chairs.remove(del);
    }

    public void delTable(int del) {
        tables.remove(del);
    }

    public void delSofa(int del) {
        tables.remove(del);
    }

    public void printShop() {

        for (Chair chair : chairs) {
            System.out.println(chair.toString());
        }
        for (Table table : tables) {
            System.out.println(table.toString());
        }
        for (Sofa sofa : sofas) {
            System.out.println(sofa.toString());
        }

    }

}