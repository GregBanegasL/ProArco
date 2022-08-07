public class Encurtido extends Artesania{
    String ingredientes;
    int tipoVinagre;
    boolean picante;


    public Encurtido(int cod, int precio, String ingredientes, int tipoVinagre, boolean picante) {
        super(cod, "Encurtido", precio, 3);
        this.ingredientes = ingredientes;
        this.tipoVinagre = tipoVinagre;
        this.picante = picante;
    }

    public int getCod() {
        return cod;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getTipoVinagre() {
        //1 manzana, 2 blanco
        String aux="";
        if(tipoVinagre==1){
            aux = "Manzana";
        }
        else aux = "Blanco";
        return aux;
    }

    public String getPicante() {
        return picante?"Picante":"No picante";
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPicante(boolean picante) {
        this.picante = picante;
    }
}
