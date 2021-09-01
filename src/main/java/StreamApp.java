


import java.util.ArrayList;
import java.util.List;

public class StreamApp {
    private List<String> palabras;
    private List<String> numeros;

    public StreamApp(){
        palabras = new ArrayList<>();
        palabras.add("Deverio");
        palabras.add("Felipe");
        palabras.add("Miguel");
        palabras.add("Sofka");
        palabras.add("Hernan");
        palabras.add("David");

        numeros= new ArrayList<>();
        numeros.add("3");
        numeros.add("1");
        numeros.add("2");
        numeros.add("4");
        numeros.add("23");
    }
    public void filtrar(){
        palabras.stream().filter(x -> x.startsWith("D")).forEach(x-> System.out.println(x));
    }

    public void ordenar(){
        palabras.stream().sorted().forEach(x-> System.out.println(x));
    }


    public static void main(String[] args) {
        StreamApp app = new StreamApp();
        app.filtrar();
        app.ordenar();
    }


}
