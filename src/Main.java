
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

public class Main {
    public static void main(String[] args){

        Cliente cl1 = new Cliente("Fernanda", "030120002760","94735251",true);
        Cliente cl2 = new Cliente("Gregory", "030120002760","94735251",false);
        Cliente cl3 = new Cliente("Julio", "030120002760","94735251",false);
        Cliente cl4 = new Cliente("Rosa", "030120002760","94735251",true);
        Cliente cl5 = new Cliente("Edwin", "030120002760",false);

        Empleado empleado1 = new Empleado(5652,"Julio","031488552222","88558855",false,
                "julio@julio.com","Vendedor",8000);
        Empleado empleado2 = new Empleado(5653,"Juan","031488552222","88558855",false,
                "juan@juan.com","Administrador",8000);
        Empleado empleado33 = new Empleado(5654,"Juana","031488552222","88558855",true,
                "juana@juana.com","Empaque",6000);
        Empleado empleado4 = new Empleado(5655,"Marcelo","031488552222","88558855",false,
                "Marcelo@marcelo.com","Vendedor",6000);
        Empleado empleado5 = new Empleado(5656,"sofia","031488552222","88558855",true,
                "sofia@sofia.com","Publicidad",6000);

        Encurtido encurtido1 = new Encurtido(2022,150,"Cebolla, Chile, Zanahoria",1,true);
        Encurtido encurtido2 = new Encurtido(2023,120,"Repollo",1,false);
        Encurtido encurtido3 = new Encurtido(2024,140,"Cebolla",2,false);
        Encurtido encurtido4 = new Encurtido(2025,130,"Cebolla, Chile, Zanahoria",3,false);
        Encurtido encurtido5 = new Encurtido(2026,160,"Cebolla, Chile, Zanahoria, piña",3,true);

        Mermelada memelada1 = new Mermelada(1000,150,"piña");
        Mermelada memelada2 = new Mermelada(1001,150,"Fresa");
        Mermelada memelada3 = new Mermelada(1002,150,"Durazno");
        Mermelada memelada4 = new Mermelada(1003,150,"Melocoton");
        Mermelada memelada5 = new Mermelada(1004,150,"Cereza");

        Artesania artesania11 = new Artesania(2000,"Lampara Rustica",300,1);
        Artesania artesania2 = new Artesania(2001,"Llavero Rustica",220,1);
        Artesania artesania3 = new Artesania(2002,"Porta Lapiz Rustica",150,1);
        Artesania artesania4 = new Artesania(2003,"Canasta Rustica",150,1);
        Artesania artesania5 = new Artesania(2004,"Guacal",120,1);

        List<Object> Contenedora = new ArrayList<>();
        Contenedora.add(artesania11);
        Contenedora.add(artesania2);
        Contenedora.add(artesania3);
        Contenedora.add(artesania4);
        Contenedora.add(artesania5);
        Contenedora.add(cl1);
        Contenedora.add(cl2);
        Contenedora.add(cl3);
        Contenedora.add(cl4);
        Contenedora.add(cl5);
        Contenedora.add(empleado1);
        Contenedora.add(empleado2);
        Contenedora.add(empleado33);
        Contenedora.add(empleado4);
        Contenedora.add(empleado5);
        Contenedora.add(encurtido1);
        Contenedora.add(encurtido2);
        Contenedora.add(encurtido3);
        Contenedora.add(encurtido4);
        Contenedora.add(encurtido5);
        Contenedora.add(memelada1);
        Contenedora.add(memelada2);
        Contenedora.add(memelada3);
        Contenedora.add(memelada4);
        Contenedora.add(memelada5);

        listar(Contenedora);

    }
    public static void listar(List<Object> Contenedora){

        List<Artesania> ListaArtesania = new ArrayList<>();

        for(int i=0;i<Contenedora.size();i++){
            if(Contenedora.get(i).getClass().getSimpleName().equals("Artesania")){
                System.out.println(i);
                ListaArtesania.add(((Artesania)Contenedora.get(i)));
            }
        }
        List<Cliente> ListaCliente = new ArrayList<>();

        for(int i=0;i<Contenedora.size();i++){
            if(Contenedora.get(i).getClass().getSimpleName().equals("Cliente")){
                System.out.println(i);
                ListaCliente.add(((Cliente)Contenedora.get(i)));
            }
        }

        List<Empleado> ListaEmpleado = new ArrayList<>();

        for(int i=0;i<Contenedora.size();i++){
            if(Contenedora.get(i).getClass().getSimpleName().equals("Empleado")){
                System.out.println(i);
                ListaEmpleado.add(((Empleado)Contenedora.get(i)));
            }
        }

        List<Encurtido> ListaEncurtido = new ArrayList<>();

        for(int i=0;i<Contenedora.size();i++){
            if(Contenedora.get(i).getClass().getSimpleName().equals("Encurtido")){
                System.out.println(i);
                ListaEncurtido.add(((Encurtido)Contenedora.get(i)));
            }
        }

        List<Mermelada> ListaMermelada = new ArrayList<>();

        for(int i=0;i<Contenedora.size();i++){
            if(Contenedora.get(i).getClass().getSimpleName().equals("Mermelada")){
                System.out.println(i);
                ListaMermelada.add(((Mermelada)Contenedora.get(i)));
            }

        }

        ListaArtesania.forEach(artesania -> System.out.println(artesania.getAtributos()));
        ListaCliente.forEach(cliente -> System.out.println(cliente.getAtributos()));
        ListaEmpleado.forEach(empleado -> System.out.println(empleado.getAtributos()));
        ListaEncurtido.forEach(encurtido -> System.out.println(encurtido.getAtributos()));
        ListaMermelada.forEach(mermelada -> System.out.println(mermelada.getAtributos()));


    }

}

