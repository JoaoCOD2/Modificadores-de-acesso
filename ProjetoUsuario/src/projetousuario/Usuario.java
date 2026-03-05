
package projetousuario;


public class Usuario {
    private String login;
    private String senha;
    
    public void setLogin (String login){
        this.login = login;
    }
    
    public void setSenha (String senha){
        this.senha = senha;
    }
    
    public boolean autenticar (String login, String senha){
        
        if(this.login.equals(login) && this.senha.equals (senha)){
            return true;
        }else{
            return false;
        }
            
            
    }
}
