package singleton;


public class OtroCreador {
// se crean dos instancias de SingletonClasico    
private SingletonClasico instancia;
private SingletonClasico otrainstancia;
        
public OtroCreador() { 
 instancia = SingletonClasico.getInstancia();
 otrainstancia =
   new SingletonClasico();    
}
public int numIns()
{
   return otrainstancia.numIns();
   
}        
}