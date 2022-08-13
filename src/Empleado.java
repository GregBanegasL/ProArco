public class Empleado extends Cliente{

    private int CodigoEmpleado;
    private String Correo;
    private String Cargo;
    private int Sueldo;

    public Empleado(int Codigo,String nombre, String identidad, String numeroCelular, Boolean sexo, String correo, String cargo, int sueldo) {
        super(nombre, identidad, numeroCelular, sexo);
        this.CodigoEmpleado = Codigo;
        this.Correo = correo;
        this.Cargo = cargo;
        this.Sueldo = sueldo;
    }

    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public String getCorreo() {
        return this.Correo;
    }

    public String getCargo() {
        return this.Cargo;
    }

    public int getSueldo() {
        return this.Sueldo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public void setSueldo(int sueldo) {
        this.Sueldo = sueldo;
    }

    public String getAtributos(){
        return "\nEmpleado: "+getCodigoEmpleado()+
                "\nCargo: "+getCargo()+
                super.getAtributos2()+
                "\nCorreo: "+getCorreo();
    }
}
