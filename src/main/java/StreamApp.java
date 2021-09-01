


import java.util.ArrayList;
import java.util.List;

public class StreamApp {
    private List<String> palabras;
    private List<String> numeros;

    public StreamApp(){
        palabras = new ArrayList<>();
        palabras.add("David");
        palabras.add("Felipe");
        palabras.add("Miguel");
        palabras.add("Sofka");
        palabras.add("Hernan");
        palabras.add("Dario");

        numeros= new ArrayList<>();
        numeros.add("3");
        numeros.add("1");
        numeros.add("2");
        numeros.add("4");
        numeros.add("23");
    }
    public void filtrar(){
        palabras.stream().filter(x -> x.startsWith("D")).forEach(System.out::println);
    }

    public static void main(String[] args) {
        StreamApp app = new StreamApp();
        app.filtrar();

    }


}
