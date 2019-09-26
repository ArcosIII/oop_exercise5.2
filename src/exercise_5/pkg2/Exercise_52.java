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
public class Exercise_52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        abstractCircle C1 = new abstractCircle();
        abstractRectangle R1 = new abstractRectangle();
        abstractSquare S1 = new abstractSquare();
        System.out.println(C1.getArea() +" " +C1.getPerimeter()+ " "+C1.getRadius() +" "+ C1.toString());
        System.out.println(R1.getArea() +" " +R1.getPerimeter()+ " "+R1.getLength() +" "+R1.getWidth()+" "+ R1.toString());
        System.out.println(S1.getArea() +" " +S1.getPerimeter()+ " "+S1.getLength() +" "+S1.getWidth()+" "+ S1.toString());
    }
    
}
