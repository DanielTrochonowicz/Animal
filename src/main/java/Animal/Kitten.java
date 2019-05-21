package Animal;

public class Kitten extends Animals implements Cat {

    public Kitten() {
        this.setAge(0);
        this.setName("Kitten");
        this.setWeight(0.5);

    }
    public void makeSound() {
    }
    public boolean isHungry() {
        return false;
    }
    @Override
    public void feed() {
        System.out.println("I am full");
    }

    @Override
    protected double getRatio() {
        return 0;
    }
}
