package ejercicio02;

public class Rectangulo {
	private double ancho;
    private double altura;

    
    public Rectangulo() {
        this.ancho = 0.0;
        this.altura = 0.0;
    }

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }


    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double calcularArea() {
        return ancho * altura;
    }

    public static void main(String[] args) {
      
       
        Rectangulo rectangulo2 = new Rectangulo(5.0, 3.0);
        Rectangulo rectangulo3 = new Rectangulo(7.5, 2.5);
        
        System.out.println("Rectángulo 1:");
        System.out.println("Ancho: " + rectangulo2.getAncho());
        System.out.println("Altura: " + rectangulo2.getAltura());
        System.out.println("Área: " + rectangulo2.calcularArea());
        System.out.println();

        System.out.println("Rectángulo 2:");
        System.out.println("Ancho: " + rectangulo3.getAncho());
        System.out.println("Altura: " + rectangulo3.getAltura());
        System.out.println("Área: " + rectangulo3.calcularArea());
    }
}
