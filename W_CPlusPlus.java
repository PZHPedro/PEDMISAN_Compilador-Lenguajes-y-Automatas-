public class W_CPlusPlus {
    private java.io.File f;
    
    public W_CPlusPlus(String ruta){
        f = new java.io.File(ruta);
        CleanCPP();
        Write_to_CPlus(
            "#include <iostream>\n"+
            "#include <string>\n"+
            "#include <cstring>\n"+
            "using namespace std;\n"+
            "int main(){\n"
        );

    }

    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                W_CPlusPlus pe = new W_CPlusPlus("C:/Pedmisan/Implementacion.cpp");
                pe.Write_to_CPlus("cout << \"prueba transcrita\";\n");
                pe.end_to_CPlus();
            }
        });        
    }
    
    public void Write_to_CPlus(String s){//Transcribe el codigo
//Escritura
        try {

            java.io.FileWriter w = new java.io.FileWriter(f , true);

            java.io.BufferedWriter bw = new java.io.BufferedWriter(w);

            java.io.PrintWriter wr = new java.io.PrintWriter(bw);
            wr.write(s);//escribimos en el archivo

            //wr.append("\n"); //concatenamos en el archivo sin borrar lo existente

            //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
            //de no hacerlo no se escribirá nada en el archivo
            wr.close();
            bw.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            System.out.println("no se pudo escribir");
        }
    }

    private void CleanCPP(){
        //Escritura
        try {

            java.io.FileWriter w = new java.io.FileWriter(f , false);

            java.io.BufferedWriter bw = new java.io.BufferedWriter(w);

            java.io.PrintWriter wr = new java.io.PrintWriter(bw);
            
            wr.write("");//Escribimos en el archivo.

            //wr.append("\n"); //Concatenamos en el archivo sin borrar lo existente.

            //Ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita.
            //de no hacerlo no se escribirá nada en el archivo.
            wr.close();
            bw.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            System.out.println("No se puedo limpiar");
        }
    }

    public void end_to_CPlus(){
        Write_to_CPlus("cout << endl << \"Ejecucion Finalizada\";\n");
        Write_to_CPlus("system(\"pause\");\nreturn 0;\n}");
    }
}


/*
/*
	Name: practica 15
	Copyright: tcnm
	Author: pedro jesus perez hernandez
	Date: 26/10/19 16:59
	Description: indeficador del mes a que pertenece segun un numero (0<n<13)
*/
//************************************			inicio de declarativas			************************************************************
/*#include <iostream>
#include <string>
#include <cstring>

using namespace std;
//************************************			inicio de main			************************************************************
/*int main()
{

   int n;
   string m ="Ingrese el numero de el mes";
   string vd;
   string sal ="El mes es ";
//************************************			fin de declarativas			************************************************************   
   cout<<m<<endl;*/
//************************************			inicio de while			************************************************************
   /*while (!(cin>>n && n>=1 && n<=12))
   {
     cin.clear();	fflush(stdin);
     cout<<m<<endl;
      
   }*/
//************************************			fin de while			************************************************************
//************************************			inicio de switch			************************************************************
   /*switch(n){
   	case 1:
   		vd="Enero";
   		break;
   	case 2:
   		vd="Febrero";
   		break;
   	case 3:
   		vd="Marzo";
   		break;
   	case 4:
   		vd="Abril";
   		break;
   	case 5:
   		vd="Mayo";
   		break;
   	case 6:
   		vd="Junio";
   		break;
   	case 7:
   		vd="Julio";
   	case 8:
   		vd="Agosto";
   	case 9:
   		vd="Septiembre";
   	case 10:
   		vd="Octubre";
   	case 11:
   		vd="Noviembre";
   	case 12:
   		vd="Diciembre";
   		break;
   	}*/
//************************************			fin de switch			************************************************************
   /*cout << sal+vd << endl;//resultado de el programa   
   system("PAUSE()");
   return 0;
}//************************************			fin de main			************************************************************
 */
