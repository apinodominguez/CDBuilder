/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipizza;

/**
 *
 * @author Angel
 */
public class Main {

     public static void main(String[] args) {
       Pizza miPizzaHawaina;
     miPizzaHawaina = new PizzaBuilder(500, 350) // se inicializa el builder
                                .setGrPinha(100) // damos los parametros que lo distinguen
                                .createPizza(); // se los otorgamos a pizza
         System.out.println(miPizzaHawaina.toString()); 
        
        Pizza miPizzaMargarita;
        miPizzaMargarita = new PizzaBuilder(500,300)
                                .setGrQueso(100)
                                .createPizza();
         System.out.println(miPizzaMargarita.toString());
         
     }
}
