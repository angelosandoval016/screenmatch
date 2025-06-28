import com.aluracursos.screenmatch.modelos.Pelicula;//nombre de paquete y clase

public class Principal {//declara clase publica llamada principal
    public static void main(String[] args){//declara clase publica estatica void que sera el menu
        Pelicula miPelicula = new Pelicula();//crea instancia. Crea espacio en memoria y convoca a clase pelicula nombrandola miPelicular, y le asinga la creacion de la instancia de clase com.aluracursos.screenmatch.modelos.Pelicula
        miPelicula.setNombre("La familia del futuro");//refiere objeto miPelicula (instancia de clase) y con metodo .setNombre se establece valor "Encanto" a variable nombre de clase pelicula
        miPelicula.setFechaDeLanzamiento(2007);
        miPelicula.setDuracionEnMinutos(95);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();//convoca a instancia de clase "com.aluracursos.screenmatch.modelos.Pelicula" desde instancia miPelicula ejecuta metodo void creado en clase plicula muestraFichaTecnica
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());









//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();//crea nuevo espacio en memoria llaada otraPelicula desde instancia de clase (llamando a objeto modelo)
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//
//        otraPelicula.muestraFichaTecnica();//convoca a instancia de clase "com.aluracursos.screenmatch.modelos.Pelicula" desde instanca otraPelicula y ejecuta metodo void creado en clase plicula muestraFichaTecnica

    }
}
