/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise_5.pkg2;

/**
 *
 * @author cabarronos_cis21035
 */
abstract class Shape {
   protected String color;
    protected boolean filled;
    
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public String toString(){
        if(this.filled == true){
            return ("A shape with color of "+this.color+" and is filled");
        }else{
            return ("A shape with color of "+this.color+" and is not filled");
        }
    }
}
