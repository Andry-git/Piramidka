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
public abstract class PiramidkaDecorator implements PiramidkaInterface {
    PiramidkaInterface piramid;
    PiramidkaDecorator(PiramidkaInterface piramid){this.piramid = piramid;}
    
    /**
     *
     * @return
     */
    @Override
    public abstract int cost();
    
    /**
     *
     * @return
     */
    @Override 
    public abstract String bild();
}
