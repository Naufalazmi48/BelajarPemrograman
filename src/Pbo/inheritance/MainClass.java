/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.inheritance;

/**
 *
 * @author MATRIX COMPUTER
 */
public class MainClass {
    public static void main(String[] args) {
        ChildCat childCat = new ChildCat("Garfield Junior", "Orange");
        childCat.setPower(20);
        childCat.paw();
    }
}
