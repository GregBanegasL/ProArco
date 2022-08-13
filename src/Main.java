import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        Cliente cl1 = new Cliente("Fernanda", "030120002760","94735251",true);
        Cliente cl2 = new Cliente("Gregory", "030120002760","94735251",false);
        Cliente cl3 = new Cliente("Julio", "030120002760","94735251",false);
        Cliente cl4 = new Cliente("Rosa", "030120002760","94735251",true);
        Cliente cl5 = new Cliente("Edwin", "030120002760",false);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cl1);
        clientes.add(cl2);
        clientes.add(cl3);
        clientes.add(cl4);
        clientes.add(cl5);


        Empleado empleado1 = new Empleado(5652,"Julio","031488552222","88558855",false,
                "julio@julio.com","Vendedor",8000);
        Empleado empleado2 = new Empleado(5653,"Juan","031488552222","88558855",false,
                "juan@juan.com","Administrador",8000);
        Empleado empleado3 = new Empleado(5654,"Juana","031488552222","88558855",true,
                "juana@juana.com","Empaque",6000);
        Empleado empleado4 = new Empleado(5655,"Marcelo","031488552222","88558855",false,
                "Marcelo@marcelo.com","Vendedor",6000);
        Empleado empleado5 = new Empleado(5656,"sofia","031488552222","88558855",true,
                "sofia@sofia.com","Publicidad",6000);

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);


        Encurtido encurtido1 = new Encurtido(2022,150,"Cebolla, Chile, Zanahoria",1,true);
        Encurtido encurtido2 = new Encurtido(2023,120,"Repollo",1,false);
        Encurtido encurtido3 = new Encurtido(2024,140,"Cebolla",2,false);
        Encurtido encurtido4 = new Encurtido(2025,130,"Cebolla, Chile, Zanahoria",3,false);
        Encurtido encurtido5 = new Encurtido(2026,160,"Cebolla, Chile, Zanahoria, piña",3,true);

        List<Encurtido> encurtidos = new ArrayList<>();
        encurtidos.add(encurtido1);
        encurtidos.add(encurtido2);
        encurtidos.add(encurtido3);
        encurtidos.add(encurtido4);
        encurtidos.add(encurtido5);


        Mermelada memelada1 = new Mermelada(1000,150,"piña");
        Mermelada memelada2 = new Mermelada(1001,150,"Fresa");
        Mermelada memelada3 = new Mermelada(1002,150,"Durazno");
        Mermelada memelada4 = new Mermelada(1003,150,"Melocoton");
        Mermelada memelada5 = new Mermelada(1004,150,"Cereza");

        List<Mermelada> mermeladas = new ArrayList<>();
        mermeladas.add(memelada1);
        mermeladas.add(memelada2);
        mermeladas.add(memelada3);
        mermeladas.add(memelada4);
        mermeladas.add(memelada5);

        Artesania artesania1 = new Artesania(2000,"Lampara Rustica",300,1);
        Artesania artesania2 = new Artesania(2001,"Llavero Rustica",220,1);
        Artesania artesania3 = new Artesania(2002,"Porta Lapiz Rustica",150,1);
        Artesania artesania4 = new Artesania(2003,"Canasta Rustica",150,1);
        Artesania artesania5 = new Artesania(2004,"Guacal",120,1);

        List<Artesania> artesanias = new ArrayList<>();
        artesanias.add(artesania1);
        artesanias.add(artesania2);
        artesanias.add(artesania3);
        artesanias.add(artesania4);
        artesanias.add(artesania5);

        //artesanias.forEach(artesania -> System.out.println(artesania.getAtributos()));
        //clientes.forEach(cliente -> System.out.println(cliente.getAtributos()));
        //empleados.forEach(empleado-> System.out.println(empleado.getAtributos()));
        //encurtidos.forEach(encurtido -> System.out.println(encurtido.getAtributos()));
        //mermeladas.forEach(mermelada -> System.out.println(mermelada.getAtributos()));

    }

}