public class Mermelada {
    int cod;
    String sabor;
    int precio;

    public Mermelada(int cod, String sabor, int precio) {
        this.cod = cod;
        this.sabor = sabor;
        this.precio = precio;
    }

    public Mermelada(int cod, int precio) {
        this.cod = cod;
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public String getSabor() {
        return sabor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
