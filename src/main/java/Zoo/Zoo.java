package Zoo;

import Animal.*;

import java.util.*;

public class Zoo {

    private String name;
    private String address;
    private Zoo(){}
    Set<Animals> animals;

//    public Zoo(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }

    private static class SingletonZoo {
        private static final Zoo INSTANCE = new Zoo();
    }

    public static Zoo getInstance() {
        return SingletonZoo.INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void createZoo(){
        animals = new HashSet<Animals>();
        animals.addAll(createTiger());
        animals.addAll(createOtherCats());
        animals.add(new Kitten());

        System.out.println("Before sorting");
        for (Animals before: animals) {
            System.out.println(before.toString());
        }
        System.out.println("After sorting");
        List<Animals> sort = new ArrayList<Animals>(animals);
        Collections.sort(sort);
        for (Animals after : sort){
            System.out.println(after.toString());
        }
        for (Animals sound : sort) {
            ((Cat) sound).makeSound();
        }
    }
    private Set<Tiger> createTiger() {
        Set<Tiger> tigers = new HashSet<Tiger>();
        Tiger tiger1 = new Tiger.TigerBuilder("Siberian Tiger: ", 5).build();
        Tiger tiger2 = new Tiger.TigerBuilder("Asian Tiger: ", 10).build();
        Tiger tiger3 = new Tiger.TigerBuilder("Malayan Tiger: ", 7).build();
        tigers.add(tiger1);
        tigers.add(tiger2);
        tigers.add(tiger3);
        return tigers;
    }
    private Set<Animals>createOtherCats(){
        Set<Animals> otherCats = new HashSet<Animals>();
        Lion lion = new Lion();
        Cheetah cheetah = new Cheetah();
        otherCats.add(lion);
        otherCats.add(cheetah);
        return otherCats;
    }
}