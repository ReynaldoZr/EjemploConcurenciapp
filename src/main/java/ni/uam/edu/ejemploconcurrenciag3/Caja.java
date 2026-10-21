package ni.uam.edu.ejemploconcurrenciag3;

public class Caja {

    private int cantidadVentas = 0;
    private int totalRecaudado = 0;

    /**
     * syncronized permite que solamente un Thread (hilo) ejecute el metodo a la vez
     * Con esto evitamos el problema de race condition
     * @param vendedor es el numero o nombre del vendedor (hilo)
     * @param monto
     */

    public synchronized void registrarVentas(String vendedor, int monto) {
        cantidadVentas++;
        totalRecaudado += monto;

        System.out.println(vendedor + "Registro una venta de C$ " + monto
                + "Ventas acumuladas:" + cantidadVentas + "total C$" + totalRecaudado);
    }

        public int getCantidadVentas() {
        return cantidadVentas;
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }




}
