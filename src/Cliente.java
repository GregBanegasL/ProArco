public class Cliente {
    String Nombre;
    String Identidad;
    String NumeroCelular;
    Boolean Sexo;

    public Cliente(String nombre, String identidad, String numeroCelular, Boolean sexo) {
        Nombre = nombre;
        Identidad = identidad;
        NumeroCelular = numeroCelular;
        Sexo = sexo;
    }

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
    }

}
