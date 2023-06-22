/*  NOTAS   
Nivel 1: Multiplicación, División, Módulo
Nivel 2: Suma, Resta;
*/
public class CTDOA {//CÓDIGO de TRES DIRECCIONES para OPERACIONES ARITMÉTICAS
    
    private java.util.ArrayList<String> list;
    private String codigo="",//codigo de 3 direcciones
            v1="", v2="", op="";
    private int no_var=0; String nombreVariable = "T"; //genera la variable temporal
    private int r1,r2,r3;//posiciones de la lista las cuales se modifican
    private int defecto = 1;//posicion de la lista donde se pone a evaluar
    private boolean prioridad = false; //true para prioridad aritmeta nivel 1, fakse para nivel 2
    private boolean listaRecorrida = false;
    
    public CTDOA(){
        list = new java.util.ArrayList<String>();
    }
    //version 1
    /*
    public void add(String s){
        this.list.add(s);
    }
    */
    //version 2
    public void add(String s) {
        String s0 = "";
        boolean in = true;
        int l = list.size();
        int i = (l > 0) ? (l - 1) : 0;
        l = 0;
        for (String e : list) {//se obtiene el ultimo dato
            if (l == i) s0 = e;            
            l++;
        }
        switch (s0) {
            case "1":
                if (s.equals("*")) {
                    //System.out.println("quitar");                    
                    in = false;
                }
                break;
            case "/":
            case "*":
                if (s.equals("1")) {
                    //System.out.println("quitar");                    
                in = false;
                }
                break;
        }

        if (in) {
            this.list.add(s);
        } else {
            list.set(i, "r0");
            list.remove("r0");
        }
    }
    
    public String generarCodigo(){

        while(!listaRecorrida){            
            nivel1(defecto);
            if(prioridad){
                generarVariable();
                codigo += op  + "   " + v1 + "    " + v2+ "    " + nombreVariable+"\n";
                list.set(r1, "r");
                list.set(r2, "r1");
                list.set(r3, nombreVariable);
                list.remove("r");
                list.remove("r1");
                
                prioridad=false;
            }
        }
        
        if(list.size() >= 3)listaRecorrida = false;
        else listaRecorrida = true;
        
        while(!listaRecorrida){
            nivel2();
            generarVariable();
            codigo += op  + "   " + v1 + "    " + v2+ "    " + nombreVariable+"\n";
            list.set(0, "r");
            list.set(1, "r1");
            list.set(2, nombreVariable);
            list.remove("r");
            list.remove("r1");
        }
        return this.codigo;
    }
    private void nivel1(int i){//para depurar de operaciones nivel 1(*,/,%)
        int j =1;
        int k =1;  
        boolean t = false;
        
        for(String e : list){
            if(j >= i){                
                if( k == 1) v1 = e;
                else if (k == 2){
                    if(!e.equals("+") && !e.equals("-")){
                         op = e;
                         r3=j;
                         r2=j-1;
                         r1 = r2-1;
                         prioridad = true;
                    }else defecto = j+1;
                }
                else if (k == 3) {
                    if (prioridad)v2 = e;                                           
                    t = true;                    
                }               
                k++;
            }
            if (t) break;
            j++;
        }
        if(j == list.size()) listaRecorrida = true;
    }
    private void nivel2(){
        int k = 1;
        for(String e : list){
            if(k == 1) v1 = e;
            if(k == 2) op = e;
            if(k == 3) {
                v2 = e;
                break;
            }
            k++;
        }
        if(k == list.size()) listaRecorrida = true;
    }   
    
    private String generarVariable(){
        nombreVariable="T"+(no_var++);
        return nombreVariable;
    }  
    public int longitud() {
        return list.size();
    } 
}