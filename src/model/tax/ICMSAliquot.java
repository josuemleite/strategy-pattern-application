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
public enum ICMSAliquot {

    SPRJ(0.12),
    SPDF(0.07);

    private final double aliquot;
    
    private ICMSAliquot(double aliquot) {
        this.aliquot = aliquot;
    }
    
    public double getAliquot() {
        return aliquot;
    }
}
