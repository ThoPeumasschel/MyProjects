/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;



/**
 *
 * @author tpeuschel
 */
public class operationen {
    double addieren(double x, double y) {
        double res = x + y;
        return res;
    }
    double subtrahieren(double x, double y) {
        double res = x - y;
        return res;
    }
    double multiplizieren(double x, double y) {
        double res = x * y;
        return res;
    }
    double dividieren(double x, double y) {
        double res = x / y;
        return res;
    }
    double potenzieren(double x, double y) {
        double res;
        res = Math.pow(x, y);
        return res;
    }
    double radizieren(double x, double y) {
       // double res = Math.sqrt(x);
        double res = Math.pow(x, 1/y);
        return res;
    }
    
}
