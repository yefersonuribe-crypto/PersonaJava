
class Usuario {
    String nombre;
    Usuario(String nombre) {this.nombre = nombre;};

}

class EmailService {
    void enviarBienvenida (String nombre){
        System.out.println("Email enviado a: " + nombre);
    }
}

class UserRepository{
    void guardar(String u){
        System.out.println("Usuario " + u + "guardado en DB");

    }
} 

public class SistemaUsuario {

    public static void main(String[] args) {
        Usuario nuevoU = new Usuario("Andres");
        EmailService emailer = new  EmailService();
        emailer.enviarBienvenida(nuevoU.nombre);

        System.out.println(" Speración de contextos ");
    }
}
