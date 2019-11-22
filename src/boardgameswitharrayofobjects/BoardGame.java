/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgameswitharrayofobjects;

/**
 *
 * @author room3.01
 */
public class BoardGame {
    String name;
    double cost;

    public BoardGame(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public BoardGame() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public String details(){
        return "Game: " +name+ " cost: " +cost;
    }

    @Override
    public String toString() {
        return "BoardGame{" + "name=" + name + ", cost=" + cost + '}';
    }
    
}
