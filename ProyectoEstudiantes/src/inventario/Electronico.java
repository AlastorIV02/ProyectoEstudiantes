class Electronico extends Producto {

    public Electronico(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 1.16;
    }
}