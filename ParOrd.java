/*CLASE (OBJETO) PARA ALMACENAMIENTO DE PARES ORDENADOS
 * 
 */

public class ParOrd{ //int i

    String tipo, id;
    private int i = 0;

    public ParOrd(String tipo, String id){//
        this.tipo = tipo;
        this.id = id;
        ++i;
    }

    public void id_uso(){
        ++i;
    }

    public int cant_uso(){
        return i;
    }
}
