package Zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @org.junit.jupiter.api.Test
    void zooCreateTest() {
        Zoo zoo = Zoo.getInstance();
        Zoo zoo2 = Zoo.getInstance();
        assertEquals(zoo, zoo2);
    }

    @Test
    void nameZoo() {
         Zoo zoo = Zoo.getInstance();
         assertTrue(zoo.getName().equals("Name: "));
    }

    @Test
    void addressZoo() {
        Zoo zoo = Zoo.getInstance();
        assertTrue(zoo.getAddress().equals("addres: "));
    }
}