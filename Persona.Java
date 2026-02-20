public class Persona { 

    //Public es un modificador de acceso puede ser accesible desde cualquier parte de la aplicacion
    //class es una plantilla para crear objetos que tendrán atributos (datos) y métodos (acciones).
    //Persona es el nombre de la clase

    //Atributos significa que estás declarando atributos (variables de instancia) dentro de la clase
    //Private Es un modificador de acceso que indica que solo se puede acceder a esa variable desde dentro de la misma clase 
    //Evita que otras clases modifiquen o lean el valor directamente, protegiendo la integridad de los datos (encapsulamiento en POO).
    // 
    private String nombre; //Declara una variable llamada nombre que puede almacenar texto.
    private int edad; //Declara una variable llamada edad que almacena números enteros.

    //contructor es el que va a inicializar los atributos

    public Persona (String nombre, int edad){ //Es la firma del constructor, que recibe dos parámetros (nombre y edad) para inicializar el objeto.
        this.nombre = nombre; //El this se refiere al atributo de la instancia. Así se evita confusión cuando
        this.edad = edad; //lo mismo que el anterior
    }

    //Metodo publico 'saludar' que imprime un saludo incluyendo el nombre y la edad de la persona
    public void saludar (){
        System.out.println("Hola, mi nombre es :" + nombre +  " y tengo " + edad + " años ");
        //System.out.println para mostrar un mensaje en consola, combinando texto con los valores de nombre y edad.
    }

    public void caminar(){
        System.out.println(nombre + " esta caminando");
        //System.out.println para mostrar un mensaje en consola, combinando texto con los valores de nombre y edad.
    }


    // Metodo publico de caminar y saludar se ejecutan en el "MAIN"
    public static void main (String[] args){ //ignifica que el método pertenece a la clase y no a un objeto en particular.
        //Main Es el nombre estándar que Java busca al iniciar un programa.
        //Crear un objeto llamado persona1 de la clase persona para que tenga nombre y edad 
        //String[] args Sirve para pasar argumentos al programa al momento de ejecutarlo.

        Persona persona1 = new Persona ("Juan", 25); //Crea un objeto de tipo Persona usando el constructor que recibe nombre y edad.

        persona1.saludar(); //Llama a los métodos definidos en la clase Persona.
        persona1.caminar(); //lo mismo que el anterior pero para caminar
    }


}