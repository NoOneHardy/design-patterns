package ch.no1hardy.decorator;

import ch.no1hardy.food.Eatable;

public class PoisonEatableDecorator extends BaseEatableDecorator {
    public PoisonEatableDecorator(Eatable eatable) {
        super(eatable);
    }

    @Override
    public void eat() {
        System.out.println("You don't feel any pain yet...");
        super.eat();
        System.out.println("You feel a sharp pain after eating this food.");
        System.out.println("You have been poisoned!!!!!");
    }
}
