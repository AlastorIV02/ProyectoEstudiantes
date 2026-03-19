package inventario;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Electronico(1, "Laptop", 10000);
        Producto p2 = new Alimento(2, "Manzana", 50);
        Producto p3 = new Ropa(3, "Camisa", 300);

        Producto[] inventario = {p1, p2, p3};

        for (Producto p : inventario) {
            p.mostrarInfo();
            System.out.println("Precio final: " + p.calcularPrecioFinal());

            if (p instanceof Descontable) {
                Descontable d = (Descontable) p;
                System.out.println("Precio con descuento: " + d.aplicarDescuento());
            }

            System.out.println("----------------------");
        }
    }
}
