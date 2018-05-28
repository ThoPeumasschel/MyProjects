/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialvererbung;

/**
 *
 * @author thomas
 */
public class TutorialVererbung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Audi A8 = new Audi();
        A8.anzahlTueren = 4;
        A8.farbe = "matt schwarz";
        A8.ps = 285;
                
        A8.autoFahrbereit();
        A8.autoNichtFahrbereit();
                
    }

}
