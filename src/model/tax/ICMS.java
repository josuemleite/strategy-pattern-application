/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tax;

/**
 *
 * @author 12093156610
 */
public class ICMS implements Tax {
    
    private ICMSAliquot aliquot;
    
    public ICMS(ICMSAliquot aliquot) {
        this.aliquot = aliquot;
    }
    
    @Override
    public double calculateTax(double value) {
        return value * aliquot.getAliquot();
    }
}