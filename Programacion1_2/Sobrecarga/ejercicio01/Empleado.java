package ejercicio01;

public class Empleado {
	private String nombre;
    private double salario;
    private String departamento;

    public Empleado() {
        this.nombre = "Sin nombre";
        this.salario = 0.0;
        this.departamento = "Sin departamento";
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = "Sin departamento";
    }

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    public static void main(String[] args) {
       
        
        Empleado empleado2 = new Empleado("Popeye", 2500.0);
        Empleado empleado3 = new Empleado("Chanquete", 3000.0, "Ventas");


        

        System.out.println("Empleado 1:");
        empleado2.imprimirDetalles();
        System.out.println();

        System.out.println("Empleado 2:");
        empleado3.imprimirDetalles();
    }
}
