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
public enum ISSAliquot {
    
    MACHADO(0.05),
    ALFENAS(0.06);
    
    private final double aliquot;
    
    private ISSAliquot(double aliquot) {
        this.aliquot = aliquot;
    }
    
    public double getAliquot() {
        return aliquot;
    }
}
