//a Partir de la misma clase crear sobrecarga al contructor y crear dos objetos para cada una de las formas de constructor 
public class Triangulo {
    // Atributos privados
    private int base ;
    private int altura;

    
    public Triangulo(int base , int  altura ) {
        this.base = base ;
        this.altura = altura;
    
    }

    // Métodos get
    public int getaltura() {
        return altura;
    }

    public int getbase() {
        return base;
    }

    // Métodos set
    public void setbase(int base) {
        this.base = base;
    }

    public void setaltura(int altura) {
        this.altura = altura;
    }
}
