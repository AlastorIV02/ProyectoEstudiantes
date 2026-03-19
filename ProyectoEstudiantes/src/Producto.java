abstract class Producto {
    protected int id;
    protected String nombre;
    protected double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularPrecioFinal();

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio base: " + precio);
    }
}