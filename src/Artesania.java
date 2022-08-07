public class Artesania {
    int cod;
    String Nombre;
    int precio;
    int Tipo;

    public Artesania(int cod, String nombre, int precio, int tipo) {
        this.cod = cod;
        Nombre = nombre;
        this.precio = precio;
        Tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getTipo() {
        return Tipo;
    }


}
