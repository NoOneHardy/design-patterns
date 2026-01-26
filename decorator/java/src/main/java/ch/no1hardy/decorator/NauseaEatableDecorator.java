package ch.no1hardy.decorator;

import ch.no1hardy.food.Eatable;

public class NauseaEatableDecorator extends BaseEatableDecorator {
    public NauseaEatableDecorator(Eatable eatable) {
        super(eatable);
    }

    @Override
    public void eat() {
        System.out.println("You don't feel nauseous yet...");
        super.eat();
        System.out.println("You feel nauseous after eating this food.");
    }
}
