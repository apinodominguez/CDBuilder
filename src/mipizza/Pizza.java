package mipizza;

/**
 *
 * @author Angel
 */
public class Pizza {
    
    int grHarina;   int mlAceite;   int grPinha;
int mlAgua;     int grTomate;
int grSal;      int grQueso;
String tipoAceite;  String tipoQueso;

public Pizza() {
    }

    public Pizza(int grHarina, int mlAceite, int grPinha, int mlAgua, int grTomate, int grSal, int grQueso, String tipoAceite, String tipoQueso) { //constructor con todos los parametros
        this.grHarina = grHarina;
        this.mlAceite = mlAceite;
        this.grPinha = grPinha;
        this.mlAgua = mlAgua;
        this.grTomate = grTomate;
        this.grSal = grSal;
        this.grQueso = grQueso;
        this.tipoAceite = tipoAceite;
        this.tipoQueso = tipoQueso;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAceite=" + mlAceite + ", grPinha=" + grPinha + ", mlAgua=" + mlAgua + ", grTomate=" + grTomate + ", grSal=" + grSal + ", grQueso=" + grQueso + ", tipoAceite=" + tipoAceite + ", tipoQueso=" + tipoQueso + '}';
    }
    
    
}
