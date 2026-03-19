class Alimento extends Producto implements Descontable {

    public Alimento(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 1.08;
    }

    @Override
    public double aplicarDescuento() {
        return precio * 0.9;
    }
}