/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdelw
 */
import java.util.ArrayList;
public class ExcerciseManagment {
    private ArrayList<String> excercises;
    public ExcerciseManagment(){
        this.excercises = new ArrayList<>();
    }
    public ArrayList<String> excerciseList(){
        return this.excercises;
    }
    public void add(String excercise){
        this.excercises.add("New");
    }
}
