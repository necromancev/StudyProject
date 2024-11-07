package ru.romantsev.Assigment3;

public class SweetBasket {

    public static void main(String[] args) {
        Sweet[] sweetBasket = new Sweet[4];
        Candy candy = new Candy("Конфета", 220F,100,"Красный");
        IceCream iceCream = new IceCream("Мороженое", 150F, 150, "Ванильный");
        IceCream iceCream2 = new IceCream("Мороженое", 150F, 160, "Шоколадный");
        Jellybean jellybean = new Jellybean("Мармеладка", 20F, 10,"Киви");
        sweetBasket[0] = candy;
        sweetBasket[1] = iceCream;
        sweetBasket[2] = iceCream2;
        sweetBasket[3] = jellybean;
        double unWeight = 0;
        int unPrice = 0;

        System.out.println("В корзине лежит: ");
        for(int i = 0; i < sweetBasket.length; i++){
            System.out.printf("%s\n", sweetBasket[i].toString());
            unWeight += sweetBasket[i].getWeight();
            unPrice += sweetBasket[i].getPrice();
        }
        System.out.printf("Общий вес подарка %.2f грамм\n", unWeight);
        System.out.printf("Общая цена подарка %d рублей", unPrice);

        //assemble
        //all price, weight and price
        //print
    }

}
