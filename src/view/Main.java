/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.FinalPrice;
import model.tax.ICMS;
import model.tax.ICMSAliquot;
import model.tax.IPI;
import model.tax.ISS;
import model.tax.ISSAliquot;
import model.tax.Tax;

/**
 *
 * @author 12093156610
 */
public class Main {

    public static void main(String[] args) {
        // Estratégia inicial como IPI
        Tax strategy = new IPI();
        
        FinalPrice fp = new FinalPrice();
        fp.setStrategy(strategy);
        
        double finalPrice = fp.calculateFinalPrice(100000, 0.1);
        
        System.out.printf("Preço final com IPI: %.2f\n", finalPrice);
        
        // Estratégia alterada para ISS
        strategy = new ISS(ISSAliquot.MACHADO);
        
        fp.setStrategy(strategy);
        
        finalPrice = fp.calculateFinalPrice(1000, 0.3);
        
        System.out.printf("Preço final com ISS: %.2f\n", finalPrice);
        
        // Estratégia alterada para ICMS
        strategy = new ICMS(ICMSAliquot.SPRJ);
        
        fp.setStrategy(strategy);
        
        finalPrice = fp.calculateFinalPrice(1000, 0.3);
        
        System.out.printf("Preço final com ICMS: %.2f\n", finalPrice);
    }
}
