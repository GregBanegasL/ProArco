public class Main {
    public static void main(String[] args) {
        Cliente cl = new Cliente("Eleana", "030120002760","94735251",true);
        System.out.println(cl.getNombre());
        System.out.println(cl.getIdentidad());
        System.out.println(cl.getNumeroCelular());
        System.out.println(cl.getSexo());

    }


}