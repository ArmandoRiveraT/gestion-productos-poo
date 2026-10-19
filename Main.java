/**
 * Clase Principal (Main)
 * Contiene el método main para ejecutar la aplicación, instanciar objetos
 * de la clase Producto y poner a prueba sus métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE GESTIÓN DE PRODUCTOS ---\n");

        // 1. Instanciación de objetos utilizando el constructor de la clase Producto
        Producto prod1 = new Producto("PROD-001", "Jabón Artesanal de Avena y Miel", 85.50, 40);
        Producto prod2 = new Producto("PROD-002", "Jabón Exfoliante de Café", 95.00, 25);
        Producto prod3 = new Producto("PROD-003", "Kit de Aceites Esenciales", 350.00, 10);

        // 2. Uso de métodos para mostrar el estado inicial de los objetos
        System.out.println(">>> ESTADO INICIAL DEL INVENTARIO:");
        prod1.mostrarInformacion();
        prod2.mostrarInformacion();
        prod3.mostrarInformacion();

        // 3. Prueba de métodos de modificación (stock y descuentos)
        System.out.println("\n>>> EJECUTANDO OPERACIONES DE INVENTARIO:");
        
        // Entrada de mercancía para el producto 1 (+15 unidades)
        prod1.actualizarStock(15);
        
        // Venta de mercancía del producto 2 (-5 unidades)
        prod2.actualizarStock(-5);
        
        // Intento de venta mayor al stock disponible en producto 3 (prueba de validación)
        prod3.actualizarStock(-15);
        
        // Aplicación de promoción del 10% al producto 3
        prod3.aplicarDescuento(10.0);

        // 4. Mostrar estado final tras las operaciones
        System.out.println("\n>>> ESTADO FINAL DEL INVENTARIO:");
        prod1.mostrarInformacion();
        prod2.mostrarInformacion();
        prod3.mostrarInformacion();
    }
}