public class Nomina {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE NÓMINA DEL INTEP ===");
        System.out.println();

        // 1. Creación de empleados
        Docente docente1 = new Docente("111222333", "Carlos Andrés Pérez", "Sistemas", 60, 35000.0);
        Administrativo admin1 = new Administrativo("999888777", "María Fernanda Gómez", "Talento Humano", 1800000.0);

        // 2. Resumen inicial mostrando atributos heredados
        System.out.println("--- 2. Resumenes Iniciales ---");
        System.out.println("Docente: " + docente1.resumen());
        System.out.println("Administrativo: " + admin1.resumen());
        System.out.println();

        // 3. Pago mensual
        System.out.println("--- 3. Cálculos de Pago Mensual ---");
        System.out.println("Pago Mensual Docente: $" + docente1.calcularPagoMensual());
        System.out.println("Pago Mensual Administrativo: $" + admin1.calcularPagoMensual());
        System.out.println();

        // 4. Toma de vacaciones válida
        System.out.println("--- 4. Solicitud de Vacaciones Válida (5 días) ---");
        admin1.tomarVacaciones(5);
        System.out.println();

        // 5. Intento de tomar más días de los disponibles (ej. 12 días teniendo 10 restantes)
        System.out.println("--- 5. Solicitud de Vacaciones Inválida (12 días) ---");
        admin1.tomarVacaciones(12);
        System.out.println();

        // 6. Resumen final del administrativo
        System.out.println("--- 6. Resumen Final de Administrativo ---");
        System.out.println(admin1.resumen());
    }
}
