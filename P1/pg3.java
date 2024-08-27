// crear dos metodos puros que permitan obtener area y perimetro del triangulo asumiendo que todos son triangulos rectangulos 
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
    public Triangulo (int lado){
        lado =0;
        int calcArea;
        calcArea= lado + lado + lado;
        
    } 
      public Triangulo (int perimetro){
          perimetro =0;
          int perimetro;
          perimetro = lado + lado 
          
      }
}
