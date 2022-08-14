public class Mermelada extends Artesania{
    private String sabor;

    public Mermelada(int cod, int precio, String Sabor) {
        super(cod, "Mermelada", precio, 3);
        this.sabor = Sabor;
    }

    public String getSabor() {
        return this.sabor;
    }

    public String getAtributos(){
        return super.getAtributos2()+
                "\nSabor: "+getSabor()+
                "\nPrecio: "+super.getPrecio()+"L";
    }

}
