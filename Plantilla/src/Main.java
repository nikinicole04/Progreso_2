//Clases Independientes
//Define las clases necesarias según el modelo, con atributos y métodos propios.
public class ClaseA {
    // Atributos privados
    private String atributo1;
    private int atributo2;

    // Constructor
    public ClaseA(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    // Métodos getter y setter
    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    // Métod para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Atributo1: " + atributo1 + ", Atributo2: " + atributo2);
    }
}

// Relaciones Entre Clases
//Si hay herencia:

public class ClaseB extends ClaseA {
    private String atributoExtra;

    public ClaseB(String atributo1, int atributo2, String atributoExtra) {
        super(atributo1, atributo2); // Llamada al constructor de ClaseA
        this.atributoExtra = atributoExtra;
    }

    public String getAtributoExtra() {
        return atributoExtra;
    }

    public void setAtributoExtra(String atributoExtra) {
        this.atributoExtra = atributoExtra;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al métod de la clase base
        System.out.println("AtributoExtra: " + atributoExtra);

    }

   // Si hay composición (una clase contiene instancias de otra clase):
   public class ClaseC {
       private ClaseA objetoClaseA;
       private List<String> listaElementos;

       public ClaseC(ClaseA objetoClaseA) {
           this.objetoClaseA = objetoClaseA;
           this.listaElementos = new ArrayList<>();
       }

       public void agregarElemento(String elemento) {
           listaElementos.add(elemento);
       }

       public void mostrarDetalles() {
           System.out.println("Detalles de ClaseC:");
           objetoClaseA.mostrarDetalles();
           System.out.println("Elementos: " + listaElementos);
       }
       //Crear Objetos
     //  Métodos para crear objetos a partir de entrada del usuario

       public static ClaseA crearClaseA() {
           Scanner scanner = new Scanner(System.in);

           System.out.print("Introduce atributo1: ");
           String atributo1 = scanner.nextLine();

           System.out.print("Introduce atributo2: ");
           int atributo2 = scanner.nextInt();

           return new ClaseA(atributo1, atributo2);
       }
//gestion de listas
private static List<ClaseA> listaClaseA = new ArrayList<>();

       public static void agregarClaseA(ClaseA objeto) {
           listaClaseA.add(objeto);
       }

       public static void mostrarLista() {
           for (ClaseA obj : listaClaseA) {
               obj.mostrarDetalles();
           }
       }


   }


}


