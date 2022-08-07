public class Mermelada extends Artesania{
    String sabor;

    public Mermelada(int cod, int precio, String Sabor) {
        super(cod, "Mermelada", precio, 2);
        this.sabor = Sabor;
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
