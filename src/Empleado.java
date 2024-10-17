import java.util.Scanner;
//Richard Padilla
public class Empleado {

    String nombre, cargo;
    double salario;
    String fechaIngreso;

    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Primer empleado
        System.out.println("Ingrese los detalles del primer empleado:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo1 = scanner.nextLine();
        System.out.print("Salario: ");
        double salario1 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Fecha de Ingreso (ej. 2022-01-15): ");
        String fechaIngreso1 = scanner.nextLine();
        Empleado empleado1 = new Empleado(nombre1, cargo1, salario1, fechaIngreso1);

        //Segundo empleado
        System.out.println("Ingrese los detalles del segundo empleado:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo2 = scanner.nextLine();
        System.out.print("Salario: ");
        double salario2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Fecha de Ingreso (ej. 2022-01-15): ");
        String fechaIngreso2 = scanner.nextLine();
        Empleado empleado2 = new Empleado(nombre2, cargo2, salario2, fechaIngreso2);

        //Tercer empleado
        System.out.println("Ingrese los detalles del tercer empleado:");
        System.out.print("Nombre: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo3 = scanner.nextLine();
        System.out.print("Salario: ");
        double salario3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Fecha de Ingreso (ej. 2022-01-15): ");
        String fechaIngreso3 = scanner.nextLine();
        Empleado empleado3 = new Empleado(nombre3, cargo3, salario3, fechaIngreso3);

        System.out.println("Información de los empleados:");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }
}
