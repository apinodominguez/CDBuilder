/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipizza;


public class PizzaBuilder {

    private int grHarina;
    private int mlAceite;
    private int grPinha;
    private int mlAgua;
    private int grTomate;
    private int grSal;
    private int grQueso;
    private String tipoAceite;
    private String tipoQueso;

    public PizzaBuilder(int grHarina, int mlAceite) { // constructor con los parametros "obligatorios"
        this.grHarina = grHarina;
        this.mlAceite = mlAceite;
    }
    public PizzaBuilder setGrHarina(int grHarina) { //Getters&Setters
        this.grHarina = grHarina;
        return this;
    }

    public PizzaBuilder setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setGrPinha(int grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public PizzaBuilder setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public PizzaBuilder setGrTomate(int grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrSal(int grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setGrQueso(int grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public Pizza createPizza() { // se le asignan los valores otorgados a los atributos de pizza
        return new Pizza(grHarina, mlAceite, grPinha, mlAgua, grTomate, grSal, grQueso, tipoAceite, tipoQueso);
    }
    
}
