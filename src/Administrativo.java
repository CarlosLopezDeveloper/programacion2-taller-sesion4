public class Administrativo extends Empleado {
    private double salarioBasico;
    private int diasVacaciones;

    public Administrativo(String cedula, String nombre, String dependencia, double salarioBasico) {
        super(cedula, nombre, dependencia);
        this.salarioBasico = salarioBasico;
        this.diasVacaciones = 15;
    }

    public boolean tomarVacaciones(int dias) {
        if (dias <= 0) {
            System.out.println("RECHAZADO: La cantidad de días solicitados debe ser mayor a cero.");
            return false;
        }
        if (dias > diasVacaciones) {
            System.out.println("RECHAZADO: No tiene suficientes días disponibles. Solicita: "
                    + dias + " días | Disponibles: " + diasVacaciones + " días.");
            return false;
        }
        diasVacaciones -= dias;
        System.out.println("APROBADO: Se han otorgado " + dias + " días de vacaciones.");
        return true;
    }

    @Override
    public double calcularPagoMensual() {
        return salarioBasico;
    }

    @Override
    public String resumen() {
        return super.resumen() + " | Salario Básico: $" + salarioBasico + " | Días Vacaciones Restantes: " + diasVacaciones;
    }
}
