/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobject;

/**
 *
 * @author karan
 */
class Model
{
private String name;
private int id;
private double salry;
private double whour; 

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the salry
     */
    public double getSalry() {
        return salry;
    }

    /**
     * @param salry the salry to set
     */
    public void setSalry(double salry) {
        this.salry = salry;
    }

    /**
     * @return the whour
     */
    public double getWhour() {
        return whour;
    }

    /**
     * @param whour the whour to set
     */
    public void setWhour(double whour) {
        this.whour = whour;
    }
public String toString()
        {
            return "pay is " + salry*whour;
        }


}
public class modelclass2 {
    
}
