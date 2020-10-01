import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        List<String> listaTexto = new ArrayList<String>();
        listaTexto.add("Stream");
        listaTexto.add("yellow.");
        listaTexto.add("yesterday");
        listaTexto.add("ying y yang");

        Optional<String> miListaOrdenada = listaTexto.stream().max((str1,str2) -> {

                ArrayList<Character> str1Lista = new ArrayList<Character>();

                for (Character c : str1.toCharArray()) {
                    str1Lista.add(c);
                }

                long yStr1= str1Lista.stream().filter(character -> character.equals('y')).count();
                ArrayList<Character> str2Lista = new ArrayList<Character>();
                System.out.println( yStr1 + "Y: " + str1);

                for (Character c : str2.toCharArray()) {
                    str2Lista.add(c);
                }
                long yStr2= str2Lista.stream().filter(character -> character.equals('y')).count();
                System.out.println( yStr2 + "Y: " + str2);
                if(yStr1>yStr2){
                    return 1;
                }

                if(yStr1<yStr2){
                    return -1;
                }

                return 0;
            });


        if(miListaOrdenada.isPresent()){
            System.out.println(miListaOrdenada.get());
        }
    }
}
