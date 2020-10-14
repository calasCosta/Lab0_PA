package test;

import org.junit.Test;
import pa.Person;

import static org.junit.Assert.assertEquals;

public class TestPerson {
    Person p = new Person(1,"Costa");

    @Test
    public void nameTest(){
        assertEquals("Costa",p.getName());
    }

    @Test
    public void idTest(){
        assertEquals(1, p.getId());
    }
}
