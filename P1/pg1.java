/*Crear una clase llamada fracion con atributos correspondientes a numerador y denominador, aplicar encapsula, y los metodos set y get necesario*/
public class Triangulo {
    // Atributos privados
    private int base ;
    private int altura;

    
    public Triangulo(double base , double  altura ) {
        this.base = base ;
        this.altura = altura;
    }

    // Métodos get
    public int altura() {
        return altura;
    }
