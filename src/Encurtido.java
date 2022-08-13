public class Encurtido extends Artesania{
    private String ingredientes;
    private int tipoVinagre;
    private boolean picante;


    public Encurtido(int cod, int precio, String ingredientes, int tipoVinagre, boolean picante) {
        super(cod, "Encurtido", precio, 2);
        this.ingredientes = ingredientes;
        this.tipoVinagre = tipoVinagre;
        this.picante = picante;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public String getTipoVinagre() {
        //1 manzana, 2 blanco
        if(this.tipoVinagre==1){
            return  "Manzana";
        } else if (this.tipoVinagre==2) {
            return "Blanco";
        } else if (this.tipoVinagre==3) {
            return "Piña";
        }else
            return "No definido";
    }

    public String getPicante() {
        return picante?"Si":"No";
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPicante(boolean picante) {
        this.picante = picante;
    }

    public String getAtributos(){
        return super.getAtributos2()+
                "\nIngredientes: "+getIngredientes()+
                "\nVinagre: "+getTipoVinagre()+
                "\nPicante: "+getPicante()+
                "\nPrecio: "+super.getPrecio()+"L";
    }
}
