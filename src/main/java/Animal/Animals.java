package Animal;

import Animal.Utils.FeedingDate;
import Animal.Utils.Marching;
import Animal.Utils.MovingStrategy;


public abstract class Animals implements Comparable<Animals>{

    protected String name;
    protected int age;
    protected double weight;
    protected FeedingDate date;
    protected MovingStrategy strategy;


    public void feed(){
        this.date = new FeedingDate();
        this.strategy = new Marching();
    }
    public String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    protected void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    protected void setWeight(double weight) {
        this.weight = weight;
    }
    public int compareTo(Animals animalsToCompare){
        double ratio = getRatio();
        double ratioToCompare = animalsToCompare.getRatio();
        if (ratio == ratioToCompare)
            return 0;
        else if (ratio < ratioToCompare)
            return 1;
        else
            return -1;
    }

    protected double getRatio(){
        return this.weight/this.age;
    }
    public void  move(){
        strategy.move();
    }

    public void setStrategy(MovingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "Animal Name: " + name + "\n" +
                " Age: " + age + "\n" +
                " Weight: " + weight + "\n" +
                " LastFeed: " + date + "\n" +
                " Ratio: " + getRatio() + "\n";
    }
}
