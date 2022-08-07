public class Empleado extends Cliente{
    String Correo;
    String Cargo;
    int Sueldo;

    public Empleado(String nombre, String identidad, String numeroCelular, Boolean sexo, String correo, String cargo, int sueldo) {
        super(nombre, identidad, numeroCelular, sexo);
        Correo = correo;
        Cargo = cargo;
        Sueldo = sueldo;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCargo() {
        return Cargo;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }
}
