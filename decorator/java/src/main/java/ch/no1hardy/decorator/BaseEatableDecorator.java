package ch.no1hardy.decorator;

import ch.no1hardy.food.Eatable;

public abstract class BaseEatableDecorator implements Eatable {
    private final Eatable eatable;

    public BaseEatableDecorator(Eatable eatable) {
        this.eatable = eatable;
    }

    @Override
    public void eat() {
        eatable.eat();
    }
}
