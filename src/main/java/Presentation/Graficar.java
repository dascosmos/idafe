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
            StringTokenizer token2;
            leer.LeerFromArchivo();
            String[] val = null;

            for(int i = 0; i < leer.getCelda().size(); ++i) {
                //System.out.println(i +"---->"+leer.getCelda().get(i));
                     val = leer.getCelda().get(i).split("VISTA HIGHER LEARNING");

                for (int j = 1; j<val.length;j++){
                    //System.out.println( j +"---->"+val[j]);
                    info.add("VISTA HIGHER LEARNING"+val[j]);
                }
            }


            ArrayList<String> pro = new ArrayList<String>();
            String[] val2 = null;
            String[] val3 = null;
            for (int j =0; j<info.size();j++) {
                int tam = info.get(j).indexOf("Profesional");
                //System.out.println(j+"--->"+info.get(j));
                if(info.get(j).contains("Profesional")&&(info.get(j).lastIndexOf("Profesional")>tam||info.get(j).lastIndexOf("Técnico")>tam||info.get(j).lastIndexOf("Tecnólogo")>tam||info.get(j).lastIndexOf("Bachiller")>tam||info.get(j).lastIndexOf("Maestría")>tam||info.get(j).lastIndexOf("Doctorado")>tam||info.get(j).lastIndexOf("Especialización")>tam)) {
                    val2 = info.get(j).split("Profesional");
                }else if(info.get(j).contains("Técnico")&&(info.get(j).lastIndexOf("Profesional")>tam||info.get(j).lastIndexOf("Técnico")>tam||info.get(j).lastIndexOf("Tecnólogo")>tam||info.get(j).lastIndexOf("Bachiller")>tam||info.get(j).lastIndexOf("Maestría")>tam||info.get(j).lastIndexOf("Doctorado")>tam||info.get(j).lastIndexOf("Especialización")>tam)) {
                    val2 = info.get(j).split("Técnico");
                }else if(info.get(j).contains("Tecnólogo")&&(info.get(j).lastIndexOf("Profesional")>tam||info.get(j).lastIndexOf("Técnico")>tam||info.get(j).lastIndexOf("Tecnólogo")>tam||info.get(j).lastIndexOf("Bachiller")>tam||info.get(j).lastIndexOf("Maestría")>tam||info.get(j).lastIndexOf("Doctorado")>tam||info.get(j).lastIndexOf("Especialización")>tam)) {
                    val2 = info.get(j).split("Tecnólogo");
                }else if(info.get(j).contains("Maestría")&&(info.get(j).lastIndexOf("Profesional")>tam||info.get(j).lastIndexOf("Técnico")>tam||info.get(j).lastIndexOf("Tecnólogo")>tam||info.get(j).lastIndexOf("Bachiller")>tam||info.get(j).lastIndexOf("Maestría")>tam||info.get(j).lastIndexOf("Doctorado")>tam||info.get(j).lastIndexOf("Especialización")>tam)) {
                    val2 = info.get(j).split("Maestría");
                }else if(info.get(j).contains("Doctorado")&&(info.get(j).lastIndexOf("Profesional")>tam||info.get(j).lastIndexOf("Técnico")>tam||info.get(j).lastIndexOf("Tecnólogo")>tam||info.get(j).lastIndexOf("Bachiller")>tam||info.get(j).lastIndexOf("Maestría")>tam||info.get(j).lastIndexOf("Doctorado")>tam||info.get(j).lastIndexOf("Especialización")>tam)) {
                    val2 = info.get(j).split("Doctorado");
                }else if (info.get(j).contains("Bachiller")&&(info.get(j).lastIndexOf("Profesional")>tam||info.get(j).lastIndexOf("Técnico")>tam||info.get(j).lastIndexOf("Tecnólogo")>tam||info.get(j).lastIndexOf("Bachiller")>tam||info.get(j).lastIndexOf("Maestría")>tam||info.get(j).lastIndexOf("Doctorado")>tam||info.get(j).lastIndexOf("Especialización")>tam)) {
                    val2 = info.get(j).split("Bachiller");
                }else if(info.get(j).contains("Especialización")&&(info.get(j).lastIndexOf("Profesional")>tam||info.get(j).lastIndexOf("Técnico")>tam||info.get(j).lastIndexOf("Tecnólogo")>tam||info.get(j).lastIndexOf("Bachiller")>tam||info.get(j).lastIndexOf("Maestría")>tam||info.get(j).lastIndexOf("Doctorado")>tam||info.get(j).lastIndexOf("Especialización")>tam)){
                    val2 = info.get(j).split("Especialización");
                }else{
                    val2 = info.get(j).split("",1);
                }
                //System.out.println(j + "----->" + val2[val2.length-1]);
                pro.add(val2[val2.length-1]);
            }

            for (int i = 0; i<pro.size();i++){
                if(pro.get(i).contains("Profesional")) {
                   val3=pro.get(i).split("Profesional");
                }else if(pro.get(i).contains("Técnico")){
                    val3=pro.get(i).split("Técnico");
                }else if(pro.get(i).contains("Tecnólogo")){
                    val3=pro.get(i).split("Tecnólogo");
                }else if(pro.get(i).contains("Maestría")){
                    val3=pro.get(i).split("Maestría");
                }else if(pro.get(i).contains("Doctorado")){
                    val3=pro.get(i).split("Doctorado");
                }else if(pro.get(i).contains("Bachiller")){
                    val3=pro.get(i).split("Bachiller");
                }else if(pro.get(i).contains("Especialización")){
                    val3=pro.get(i).split("Especialización");
                }else{
                    val3=pro.get(i).split("",1);
                }
                preguntas.add(val3[val3.length-1]);
            }

            for(int j = 0; j<info.size();j++){
                int cant = info.get(j).lastIndexOf("Profesional");
                int cant2 = info.get(j).lastIndexOf("Tecnólogo");
                int cant3 = info.get(j).lastIndexOf("Técnico");
                int cant4 = info.get(j).lastIndexOf("Maestría");
                int cant5 = info.get(j).lastIndexOf("Doctorado");
                int cant6 = info.get(j).lastIndexOf("Bachiller");
                int cant7 = info.get(j).lastIndexOf("Especialización");



            }

            for (int i = 1;i<info.size();i++){
                token = new StringTokenizer(info.get(i), ",");
                while(token.hasMoreElements()) {

               //     empresas.add(new Empresa(token.nextToken(), new Trabajador(i, token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken())));
                }
                for (int j = 0;j<preguntas.size();j++){
                    token2 = new StringTokenizer(preguntas.get(j),",");
                }
            }

            for(int i = 0;i<empresas.size();i++){
                System.out.println(empresas.get(i));
            }

                 /* for(int k = 0; k<preguntas.size();k++){
                    empresas.add(new Empresa(val[0],new Trabajador(i,val[1],val[2],val[3],val[4],val[5],val[6],new Preguntas(k,preguntas.get(k)))));
                }*/



        }


}
