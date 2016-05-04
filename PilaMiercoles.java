public class Ejercicios {
    
    private Stack pila;
    private Stack Notas;
    
    public void _1(){
        
        Stack pila=new Stack();
        
        pila.push("The Witcher 3: Wild Hunt");
        pila.push("Rocket league");
        pila.push("Move or die");
        pila.push("Heroes of the storm");
        pila.push("League of legends");
        pila.push("Saga Far cry");
        pila.push("World of warcraft");
        pila.push("Overwatch");
        pila.push("Diablo 3");
        
        System.out.println("Pilas: "+pila);
        System.out.println("Tamano pila: "+pila.size());
        System.out.println("Cima: "+pila.peek());
        
        System.out.println("Posición del elemento: " +pila.search("Heroes of the storm"));
        System.out.println("Posiciónd del elemento: " +pila.search("Hola")); // devuelve -1 si esta mal escrito el nombre de la pila
        
        System.out.println("Elemento des-apilado: " +pila.pop());
        System.out.println("¿Esta la pila vacia? " +pila.empty());
    }
    
    public void _2() {
        
        Stack Notas = new Stack();
        
        Notas.push(5);
        Notas.push(4);
        Notas.push(6);
        Notas.push(3);
        Notas.push(4);
        
        for(int a=0; a<Notas.size(); a++)
        {
            System.out.println(Notas.get(a));
        }
    }
    public void _3(){
        
        Stack elem = new Stack();
        
        elem.push("mesa");
        elem.push("Silla");
        elem.push("Vaso");
        elem.push("Zapatilla");
        
       for (Object i:elem)
        {
            System.out.println(i);
        }
        
    }
      public void _4(){
          Stack libros = new Stack();
          
          libros.push("El alquimista");
          libros.push("Camilo violenta lentes");
          libros.push("El hombre duplicado");
          
          System.out.println("La cantidad de pilas de la lista es: "+libros.size());
          
          while (!libros.empty()) {
            System.out.println(libros.pop());
          }
      }
}