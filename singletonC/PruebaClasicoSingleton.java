package singleton;




public class PruebaClasicoSingleton {
 public static void main(String par[])
 {        
  SingletonClasico instancia1 = SingletonClasico.getInstancia();
   System.out.println("Numero de instancias creadas despues de instancia1 "+ instancia1.numIns());   
  SingletonClasico instancia2= SingletonClasico.getInstancia();
   System.out.println("Numero de instancias creadas despues de instancia2 "+ instancia2.numIns());   
  SingletonClasico instancia3= SingletonClasico.getInstancia();
            
 
  System.out.println("Numero de instancias creadas despues de instancia3 "+ instancia3.numIns()); 
  // s7= new SingletonClasico();
  //System.out.println("Numero de instancias creadas despues de instancia3 "+ s7.numIns());
  //SingletonClasico s8= new SingletonClasico();
  //System.out.println("Numero de instancias creadas despues de instancia3 "+ s8.numIns()); 
  
  OtroCreador instancia = new OtroCreador();
  System.out.println("Numero de instancias creadas despues de instancia3 "+ instancia.numIns()); 
    
 } 
 
  
}
