class Ropa extends Producto implements Descontable {

    public Ropa(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 1.16;
    }

    @Override
    public double aplicarDescuento() {
        return precio * 0.8;
    }
}