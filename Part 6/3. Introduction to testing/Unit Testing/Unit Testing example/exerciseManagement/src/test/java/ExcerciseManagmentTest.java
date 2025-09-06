/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdelw
 */
public class ExcerciseManagmentTest {

    public ExcerciseManagmentTest() {
        ExcerciseManagment managment = new ExcerciseManagment();
        assertEquals(0, managment.excerciseList().size());
    }

    public void addingExcerciseGrowListByOne() {
        ExcerciseManagment managment = new ExcerciseManagment();
        managment.add("Writea test");
        assertEquals(1, managment.excerciseList().size());

    }

    public void addExcerciseIsInList() {
        ExcerciseManagment managment = new ExcerciseManagment();
        managment.add("Writea test");
        assertTrue(managment.excerciseList().contains("Write a test"));
    }

}
