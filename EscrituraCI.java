import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author pedmisan
 */
public class EscrituraCI {
    
    private File f;

    public EscrituraCI(String ruta) {
        f = new File(ruta);
        limpiarTxt();
    }
    private void limpiarTxt(){
        //Escritura
        try {

            FileWriter w = new FileWriter(f , false);

            BufferedWriter bw = new BufferedWriter(w);

            PrintWriter wr = new PrintWriter(bw);
            
            wr.write("");//Escribimos en el archivo.

            //wr.append("\n"); //Concatenamos en el archivo sin borrar lo existente.

            //Ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita.
            //de no hacerlo no se escribirá nada en el archivo.
            wr.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo escribir");
        }
    }
    public void EscribirOA(String s){//Escribe Operaciones Aritméticas
        //Escritura
        try {

            FileWriter w = new FileWriter(f , true);

            BufferedWriter bw = new BufferedWriter(w);

            PrintWriter wr = new PrintWriter(bw);
            wr.write("OP  " + "v1  " + "V2  " + "R   \n");
            wr.write(s);//Escribimos en el archivo.

            //wr.append("\n"); //Concatenamos en el archivo sin borrar lo existente.

            //Ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita.
            //de no hacerlo no se escribirá nada en el archivo.
            wr.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo escribir");
        }
    }

    public void EscribirD(String s){//Escribe Declaraciones
        try {

            FileWriter w = new FileWriter(f , true);

            BufferedWriter bw = new BufferedWriter(w);

            PrintWriter wr = new PrintWriter(bw);
            wr.write("Type  " + "Values" + "\n");
            wr.write(s);//Escribimos en el archivo.

            //wr.append("\n"); //Concatenamos en el archivo sin borrar lo existente.

            //Ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita.
            //de no hacerlo no se escribirá nada en el archivo.
            wr.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo escribir");
        }
    }
    
    public void EscribirB(String s){
        
        try {

            FileWriter w = new FileWriter(f , true);

            BufferedWriter bw = new BufferedWriter(w);

            PrintWriter wr = new PrintWriter(bw);
            wr.write(s);//Escribimos en el archivo.
            //wr.append("\n"); //Concatenamos en el archivo sin borrar lo existente.

            //Ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita.
            //de no hacerlo no se escribirá nada en el archivo.
            wr.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo escribir");
        }
    }

}
