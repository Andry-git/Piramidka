/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidka;

/**
 *
 * @author q
 */
public class Piramidka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PiramidkaInterface piramid;
        piramid = new Ring4(new Ring3(new Ring2(new Ring())));
        System.out.println(piramid.bild());
        if (piramid.cost() == 1){System.out.println("+");}
        else {System.out.println("-");}
        PiramidkaInterface piramid1;
        piramid1 = new Ring4(new Ring2(new Ring3(new Ring())));
        System.out.println(piramid1.bild());
        if (piramid1.cost() == 1){System.out.println("+");}
        else {System.out.println("-");}
    }
}
