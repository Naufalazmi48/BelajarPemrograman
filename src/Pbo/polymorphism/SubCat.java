/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.polymorphism;

/**
 *
 * @author MATRIX COMPUTER
 */
public class SubCat extends ParentCat{

    @Override
    void claw() {
        System.out.println("Sub cat attack the enemy");
    }
    
    void claw(int power){
        System.out.println("Sub cat attack the enemy with "+ power + " power");
    }
    
}
