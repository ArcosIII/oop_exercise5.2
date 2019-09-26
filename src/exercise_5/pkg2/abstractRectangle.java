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
public class abstractRectangle extends Shape {
    protected double width;
    protected double length;
    
     public abstractRectangle(){
         this.length = 1.0;
         this.width = 1.0;
     }
     public abstractRectangle(double length,double width){
         this.length = length;
         this.width = width;
     }
     public abstractRectangle(double length,double width,String color,boolean filled){
         this.length = length;
         this.width = width;
         this.setColor(color);
         this.setFilled(filled);
     }
     public double getLength(){
         return length;
     }
     public void setlength(double length){
         this.length = length;
     }
     public double getWidth(){
         return width;
     }
     public void setWidth(double width){
         this.width = width;
     }
     public double getArea(){
         double area = this.length * this.width;
         return area;
     }
     public double getPerimeter(){
         double peri = (this.length *2) + (this.width*2);
         return peri;
     }
     public String toString(){
         return "A Rectangle with width " + this.width + " and length " + this.length + " which is a subclass of "+super.toString();
     }
}
