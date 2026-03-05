
package projetousuario;


public class ProjetoUsuario {

    
    public static void main(String[] args) {
         Usuario u1 = new Usuario();
        
        u1.setLogin("joaoapalpa2@gmail.com");
        u1.setSenha("230229");
        
        if(u1.autenticar("joaoapalpa2@gmail.com", "230229")){
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos.");
        }
        
        
         Usuario u2 = new Usuario ();
         
         u2.setLogin("joaocardoso@gmail.com");
         u2.setSenha("Jp230999");
         
         if(u2.autenticar("joaocardoso@gmail.com", "Jp230990")){
             System.out.println("Login realizado com sucesso!");
         }else {
             System.out.println("Login ou senha incorretos.");
         }
        
    }
}
