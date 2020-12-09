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
public class Ring3 extends PiramidkaDecorator{

   Ring3(PiramidkaInterface ring){
        super(ring);
    }
    
    @Override
    public int cost() {if(piramid.cost()==3) return piramid.cost()-1; else return -1;}
    
    @Override 
    public String bild() {return piramid.bild()+"  000|000\n";}
}

