/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.inheritance;
public class ChildCat extends ParentCat{

    public ChildCat(String name, String skin) {
        super(name, skin);
    }

    @Override
    public void setPower(int power) {
        super.setPower(power);
    }
    
    @Override
    public void paw() {
        super.paw();
    }
    
    
}
