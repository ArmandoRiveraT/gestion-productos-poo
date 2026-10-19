/**
 * Clase Producto
 * Representa un artículo dentro del inventario de una tienda.
 * Aplica los conceptos de encapsulamiento, atributos, constructores y métodos.
 */
public class Producto {
    
    // 1. Declaración de atributos (encapsulados con modificador private)
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    /**
     * 2. Constructor de la clase Producto.
     * Inicializa un nuevo objeto Producto con sus valores base.
     * 
     * @param codigo Identificador único del producto
     * @param nombre Nombre comercial del producto
     * @param precio Precio unitario de venta
     * @param stock Cantidad inicial disponible en inventario
     */
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // 3. Implementación de Métodos de Negocio y Comportamiento

    /**
     * Muestra en consola toda la información detallada del producto.
     */
    public void mostrarInformacion() {
        System.out.println("========================================");
        System.out.println("Código: " + this.codigo);
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio Unitario: $" + String.format("%.2f", this.precio));
        System.out.println("Stock Disponible: " + this.stock + " unidades");
        System.out.println("Valor Total en Stock: $" + String.format("%.2f", calcularValorInventario()));
        System.out.println("========================================");
    }

    /**
     * Actualiza la cantidad de productos en el inventario (sumando o restando).
     * 
     * @param cantidad Cantidad a agregar (positiva) o retirar (negativa)
     */
    public void actualizarStock(int cantidad) {
        if (this.stock + cantidad >= 0) {
            this.stock += cantidad;
            System.out.println("[INFO] Stock actualizado para '" + this.nombre + "'. Nuevo stock: " + this.stock);
        } else {
            System.out.println("[ERROR] Stock insuficiente para retirar " + Math.abs(cantidad) + " unidades de '" + this.nombre + "'.");
        }
    }

    /**
     * Aplica un porcentaje de descuento sobre el precio actual del producto.
     * 
     * @param porcentaje Porcentaje de descuento (ejemplo: 15 para 15%)
     */
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = this.precio * (porcentaje / 100);
            this.precio -= descuento;
            System.out.println("[INFO] Descuento del " + porcentaje + "% aplicado a '" + this.nombre + "'. Nuevo precio: $" + String.format("%.2f", this.precio));
        } else {
            System.out.println("[ERROR] El porcentaje de descuento no es válido.");
        }
    }

    /**
     * Calcula el valor monetario total del inventario actual de este producto.
     * 
     * @return Valor total (precio multiplicado por stock)
     */
    public double calcularValorInventario() {
        return this.precio * this.stock;
    }

    // Métodos Getters y Setters básicos (para acceso controlado a los atributos)
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }
}