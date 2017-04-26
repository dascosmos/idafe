package Presentation;
import Presentation.LeerArchivo;
import Data.*;
import com.sun.javafx.runtime.SystemProperties;
import org.apache.poi.util.SystemOutLogger;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Familia on 4/10/2017.
 */
public class Graficar {

        public static void main(String[] args) {
            LeerArchivo leer = new LeerArchivo();
            ArrayList<Empresa> empresas = new ArrayList<Empresa>();
            ArrayList<String> info = new ArrayList<String>();
            ArrayList<String> preguntas = new ArrayList<String>();
            StringTokenizer token;
            leer.LeerFromArchivo();
            String[] val = null;

            for(int i = 0; i < leer.getCelda().size(); ++i) {
                //System.out.println(i +"---->"+leer.getCelda().get(i));
                     val = leer.getCelda().get(i).split("VISTA HIGHER LEARNING");

                for (int j = 1; j<val.length;j++){
                    //System.out.println( j +"---->"+val[j]);
                    info.add("VISTA HIGHER LEARNING"+val[j]);
                }
               /* for(int k = 0; k<preguntas.size();k++){
                    empresas.add(new Empresa(val[0],new Trabajador(i,val[1],val[2],val[3],val[4],val[5],val[6],new Preguntas(k,preguntas.get(k)))));
                }*/

                    //System.out.println(val);

            }


            ArrayList<String> pro = new ArrayList<String>();
            String[] val2;
            String[] val3 = null;
            String pregunta ="";
            for (int j =0; j<info.size();j++) {
                //System.out.println(j+"--->"+info.get(j));
                val2 = info.get(j).split(",");

                for (int i =val2.length-1; i>0;i--){
                    //System.out.println(val2[i]);
                    if (!val2[i].equals("Profesional")&&!val2[i].equals("Técnico")&&!val2[i].equals("Tecnólogo")&&!val2[i].equals("Maestría")&&!val2[i].equals("Doctorado")&&!val2[i].equals("Bachiller")){
                        if (val2[i].indexOf("Profesional")>i||val2[i].indexOf("Técnico")>i||val2[i].indexOf("Tecnólogo")>i||val2[i].indexOf("Maestría")>i||val2[i].indexOf("Doctorado")>i||val2[i].indexOf("Bachiller")>i){
                            pro.add(val2[i]+",");
                        }


                    }else{

                        System.out.println("Nada");
                        break;
                    }

                }

            }


            int cont = 0;
            for (int i = cont; i<pro.size();i++){
                System.out.println(pro.get(i));
                if(i == cont+28){
                    preguntas.add(pro.get(i));
                }
                cont = i;
                System.out.println("----->"+cont);
            }

            for(int j = 0; j<preguntas.size();j++){
                System.out.println(preguntas.get(j));
            }



        }


}
