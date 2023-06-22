/*CLASE (OBJETO) OCUPADA COMO MEMORIA DE FLUCTUANTE
 * 
 */

public class Cache extends Object{

    private Object Valor = "";

    public void setValor(Object o){
        this.Valor = o;
    }

    public String getString (){
        return Valor.toString();
    }
}