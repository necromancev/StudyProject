package ru.romantsev.Assigment3;

public class Jellybean extends Sweet{
    private String taste;

    public Jellybean(String name, double weight, double price) {
        super(name, weight, price);
    }

    public Jellybean(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + "\nвкус " + taste + "\n";
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
