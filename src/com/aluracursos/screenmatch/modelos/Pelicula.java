package com.aluracursos.screenmatch.modelos;//referencia de paquete

public class Pelicula {//declara clase publuca llamada plicula
    private String nombre;//DECLARA DISTITNAS VARIABLES PRIVADAS DE DIFERENTE TIPO, SIN CONTENIDO INICIAL
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;//declara variable privada de tipo double, asi una clase externa no puede ver el valor ni modificar valor existente
    private int totalDeLasEvaluaciones;//declara variable privada de tipo int, asi una clase externa no puede ver el valor ni modificar valor existente

    public String getNombre() {//boton derecho getter. crea metodo public de tipo String llamado getNombre (que obtiene valor de variable nombre)
        return nombre;//retorna valor de variable nombre
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {//boton derecho setter. crea metodo public llamado setNombre que contiene atributo de tipo string llamado nombre
        this.nombre = nombre;//THIS accede a variable nombre de la clase pelicula (linea 4) al que se asigna el valor que el usuario registre
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getTotalDeLasEvaluaciones(){//crea METODO publico de tipo INT y usando GET obtiene el valor de totalDeLasEvaluaciones
        return totalDeLasEvaluaciones;//con return se "retorna" el valor obtenido con GET de variable int totalDeLasEvaluaciones
    }

    public void muestraFichaTecnica() {//declara metodo void que no devuelve nada, sino que es solo para ejecutar
        System.out.println("El nombre de la pelicula es " + nombre);//imprime contenido de atributo
        System.out.println("Su duración es de: " + fechaDeLanzamiento);
        System.out.println("Su duración es de: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){//declara metodo void llamado evaluaque no devuelve nada, sino que es solo para ejecutar el contenido de variable double llamado nota
        sumaDeLasEvaluaciones += nota;//variabla double sumaDeLasEvaluaciones sera igual a su contenido mas el contendio de variable double lllamdo nota (esto es lo mismo sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasEvaluaciones++;//incrementa valor de variables totalDeLasEvaluaciones

    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;//retorna valor de de sumaDeLasEvaluaciones dividido por valor de totalDeLasEvaluaciones
    }
}
