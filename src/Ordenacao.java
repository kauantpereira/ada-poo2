import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {

        List<String> listaStrings = new ArrayList<>(List.of( "Bernardo", "Elioenai", "Artur", "Daniel"));
        System.out.println("Lista desordenada: " + listaStrings);
        Collections.sort(listaStrings);
        System.out.println("Lista ordenada: " + listaStrings);

    }
}