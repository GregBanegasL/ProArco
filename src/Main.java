public class Main {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Fernanda", "030120002760","94735251",true);
        Cliente cl2 = new Cliente("Gregory", "030120002760","94735251",false);
        Cliente cl3 = new Cliente("Julio", "030120002760","94735251",false);
        Cliente cl4 = new Cliente("Rosa", "030120002760","94735251",true);
        Cliente cl5 = new Cliente("Edwin", "030120002760",false);

        Cliente[] listaCliente= new Cliente[5];
        listaCliente[0] = cl1;
        listaCliente[1] = cl2;
        listaCliente[2] = cl3;
        listaCliente[3] = cl4;
        listaCliente[4] = cl5;

        for(int i=0;i<listaCliente.length;i++){
            System.out.println(listaCliente[i].getNombre());
        }

        Encurtido encurtido = new Encurtido(2022,150,"Cebolla, Chile, Zanahoria",1,true);
        Encurtido encurtido2 = new Encurtido(2023,120,"Repollo",1,false);
        Encurtido encurtido3 = new Encurtido(2024,140,"Cebolla",2,false);
        Encurtido encurtido4 = new Encurtido(2025,130,"Cebolla, Chile, Zanahoria",3,false);
        Encurtido encurtido5 = new Encurtido(2026,160,"Cebolla, Chile, Zanahoria, piña",3,true);

        Encurtido [] listaEncurtido = new Encurtido[5];
        listaEncurtido[0] = encurtido;
        listaEncurtido[1] = encurtido2;
        listaEncurtido[2] = encurtido3;
        listaEncurtido[3] = encurtido4;
        listaEncurtido[4] = encurtido5;

        for(int i = 0;i<listaCliente.length;i++){
            System.out.println(listaEncurtido[i].getCod()+" "+listaEncurtido[i].getIngredientes());
        }

        Empleado empleado = new Empleado("Julio","031488552222","88558855",false,
                "julio@julio.com","Vendedor",8000);

        System.out.printf("\n ----Empleado\n"+empleado.getNombre()+"\n"+
                empleado.getIdentidad()+"\n"+
                empleado.getSexo()+"\n"+
                empleado.getCargo()+"\n"+
                empleado.getCorreo());

        empleado.setCargo("Repartidor");
        empleado.setNumeroCelular("77885588");
        empleado.setCorreo("julio@gmail.com");

        System.out.printf("\n ----Empleado Seteado\n"+empleado.getNombre()+"\n"+
                empleado.getIdentidad()+"\n"+
                empleado.getSexo()+"\n"+
                empleado.getCargo()+"\n"+
                empleado.getCorreo());
    }
}