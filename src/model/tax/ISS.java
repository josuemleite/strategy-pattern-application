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
public class ISS implements Tax {
    
    private ISSAliquot aliquot;
    
    public ISS(ISSAliquot aliquot) {
        this.aliquot = aliquot;
    }

    public ISS(ICMSAliquot icmsAliquot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double calculateTax(double value) {
        return aliquot.getAliquot() * value;
    }
}
