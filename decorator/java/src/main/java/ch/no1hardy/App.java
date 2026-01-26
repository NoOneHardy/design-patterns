package ch.no1hardy;

import ch.no1hardy.decorator.NauseaEatableDecorator;
import ch.no1hardy.decorator.PoisonEatableDecorator;
import ch.no1hardy.food.Carrot;
import ch.no1hardy.food.Eatable;
import ch.no1hardy.food.PufferFish;
import ch.no1hardy.food.SpiderEye;

public class App {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern Example");

        System.out.println("\nEating a simple carrot:");
        Eatable carrot = new Carrot();
        carrot.eat();

        System.out.println("\nEating a decorated spider eye:");
        Eatable spiderEye = new PoisonEatableDecorator(
                new SpiderEye()
        );
        spiderEye.eat();

        System.out.println("\nEating a puffer fish with multiple decorators:");
        Eatable pufferFish = new PoisonEatableDecorator(
                new NauseaEatableDecorator(
                        new PufferFish()
                ));
        pufferFish.eat();
    }
}
