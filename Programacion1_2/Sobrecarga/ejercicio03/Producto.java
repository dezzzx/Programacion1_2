package ejercicio03;

public class Producto {
	 private String nombre;
	    private double precio;
	    private int cantidadEnStock;

	    public Producto() {
	        this.nombre = "Sin nombre";
	        this.precio = 0.0;
	        this.cantidadEnStock = 0;
	    }

	    public Producto(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.cantidadEnStock = 0;
	    }

	    public Producto(String nombre, double precio, int cantidadEnStock) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.cantidadEnStock = cantidadEnStock;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public int getCantidadEnStock() {
	        return cantidadEnStock;
	    }

	    public void setCantidadEnStock(int cantidadEnStock) {
	        this.cantidadEnStock = cantidadEnStock;
	    }

	    public static void main(String[] args) {

	        
	        Producto producto2 = new Producto("Camiseta", 19.99);
	        Producto producto3 = new Producto("Libro", 15.50, 30);



	        System.out.println("Producto 1:");
	        System.out.println("Nombre: " + producto2.getNombre());
	        System.out.println("Precio: " + producto2.getPrecio());
	        System.out.println("Cantidad en stock: " + producto2.getCantidadEnStock());
	        System.out.println();

	        System.out.println("Producto 2:");
	        System.out.println("Nombre: " + producto3.getNombre());
	        System.out.println("Precio: " + producto3.getPrecio());
	        System.out.println("Cantidad en stock: " + producto3.getCantidadEnStock());
	    }
}
