package Presentation;

/**
 * Created by Familia on 3/27/2017.
 */
public class Graficar {

    public static void main(String[] args){
        LeerArchivo leer = new LeerArchivo();

        leer.LeerFromArchivo();

        for (int i = 0; i< leer.getCelda().size();i++) {
            System.out.println(leer.getCelda().get(i));
        }
    }
}
