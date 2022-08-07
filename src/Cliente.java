public class Cliente {
    String Nombre;
    String Identidad;
    String NumeroCelular;
    Boolean Sexo;

    //constructor

    public Cliente(String nombre, String identidad, String numeroCelular, Boolean sexo) {
        Nombre = nombre;
        Identidad = identidad;
        NumeroCelular = numeroCelular;
        Sexo = sexo;
    }

    //sobrecarga
    public Cliente(String nombre, String identidad, Boolean sexo) {
        Nombre = nombre;
        Identidad = identidad;
        //NumeroCelular = numeroCelular;
        Sexo = sexo;
    }

    //metodos

    public String getNombre() {
        return Nombre;
    }

    public String getIdentidad() {

        return Identidad;
    }

    public String getNumeroCelular() {

        return NumeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {

        NumeroCelular = numeroCelular;
    }

    public String getSexo() {
        return Sexo?"Femenino":"Masculino";
        // si sexo es verdadero "Femenino" si es falso "Masculino"
        // if()

    }

}
