/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author tpeuschel
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse(); // Animal ref, but a Horse object
        Animal c = new Horse();
       // c.buck();
        Horse d = new Horse();
        d.buck();
        a.eat(); //Runs the Animal version of eat()
        b.eat(); //Runs the Horse version of eat()
        d.eat();
    }

}
