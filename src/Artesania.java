public class Artesania {
    private int Cod;
    private String Nombre;
    private int Precio;
    private int Tipo;

    public Artesania(int cod, String nombre, int precio, int tipo) {
        this.Cod = cod;
        this.Nombre = nombre;
        this.Precio = precio;
        this.Tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.Precio = precio;
    }

    public int getCod() {
        return this.Cod;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public int getPrecio() {
        return this.Precio;
    }

    public String getTipo() {
        if(this.Tipo==1){
            return "Artesania";
        } else if (this.Tipo==2) {
            return "Encurtido";
        } else if (this.Tipo==3) {
            return "Mermelada";
        } else if (this.Tipo==4) {
            return "Chocolate";
        }else
            return  "No definido";
    }

    public String getAtributos(){
        return "\nTipo: "+getTipo()+
                "\nCodigo: "+getCod()+
                "\nNombre: "+getNombre()+
                "\nPrecio: "+getPrecio()+"L";
    }
    public String getAtributos2(){
        return "\nTipo: "+getTipo()+
                "\nCodigo: "+getCod();
                //"\nNombre: "+getNombre();
                //"\nPrecio: "+getPrecio()+"L";
    }
}
