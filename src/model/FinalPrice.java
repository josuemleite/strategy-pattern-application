/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.tax.Tax;

/**
 *
 * @author 12093156610
 */
public class FinalPrice {
    
    // Estratégia de cálculo
    private Tax tax;

    // addTax
    public void setStrategy(Tax tax) {
        this.tax = tax;
    }
    
    public double calculateFinalPrice(double value, double profit) {
        double finalProfit = value * profit;
        return value + tax.calculateTax(value) + finalProfit;
    }
}
