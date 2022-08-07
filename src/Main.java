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

        Encurtido encurtido = new Encurtido(2022,"Cebolla, Chile, Zanahoria",1,false,120);
        Encurtido encurtido2 = new Encurtido(2023,"Cebolla, Chile, Zanahoria",2,true,125);
        Encurtido encurtido3 = new Encurtido(2024,"Cebolla, Chile, Zanahoria",1,true,120);
        Encurtido encurtido4 = new Encurtido(2025,"Cebolla, Chile, Zanahoria, Rabano",1,true,130);
        Encurtido encurtido5 = new Encurtido(2026,"repollo ",1,false,80);

        Encurtido [] listaEncurtido = new Encurtido[5];
        listaEncurtido[0] = encurtido;
        listaEncurtido[1] = encurtido2;
        listaEncurtido[2] = encurtido3;
        listaEncurtido[3] = encurtido4;
        listaEncurtido[4] = encurtido5;

        for(int i = 0;i<listaCliente.length;i++){
            System.out.println(listaEncurtido[i].getCod()+" "+listaEncurtido[i].getIngredientes());
        }

        Empleado empleado = new Empleado("Julio","5656669633221","99886655",false,
                "julio@julio.com","Vendedor");

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