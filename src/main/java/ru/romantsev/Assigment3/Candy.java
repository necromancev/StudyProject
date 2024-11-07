package ru.romantsev.Assigment3;

public class Candy extends Sweet{
    private String color;

    public Candy(String name, double weight, double price) {
        super(name, weight, price);
    }

    public Candy(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nцвет " + color + "\n";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
