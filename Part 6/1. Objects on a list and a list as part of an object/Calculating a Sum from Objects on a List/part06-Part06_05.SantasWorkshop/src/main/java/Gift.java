/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdelwahab Ayman
 */
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String GiftName,int GiftWeight){
        this.name = GiftName;
        this.weight=GiftWeight;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return getName() +"("+getWeight()+" kg)";
    }
}
