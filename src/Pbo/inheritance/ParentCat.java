/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.inheritance;
public class ParentCat {
    protected String name;
    protected String skin;
    protected int power = 80;

    public void setPower(int power) {
        this.power = power;
    }
    
    public ParentCat(String name, String skin) {
        this.name = name;
        this.skin = skin;
    }
    
    public void paw() {
        System.out.printf("%s mencakar dengan power = %d", name, power);
        System.out.println("");
    }
}
