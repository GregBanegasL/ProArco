public class Empleado {
    String Nombre;
    String Identidad;
    String NumeroCelular;
    Boolean Sexo;
    String Correo;
    String Cargo;

    public Empleado(String nombre, String identidad, String numeroCelular, Boolean sexo, String correo, String cargo) {
        Nombre = nombre;
        Identidad = identidad;
        NumeroCelular = numeroCelular;
        Sexo = sexo;
        Correo = correo;
        Cargo = cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getIdentidad() {
        return Identidad;
    }

    public String getSexo() {
        return Sexo?"Femenino":"Masculino";
        // si sexo es verdadero "Femenino" si es falso "Masculino"
        // if()

    }

    public String getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        NumeroCelular = numeroCelular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}
