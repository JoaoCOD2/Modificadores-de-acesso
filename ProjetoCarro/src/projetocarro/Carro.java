
package projetocarro;


public class Carro {
    private String marca;
    private String modelo;
    public int ano;
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    
    public String getMarca (){
        return marca;
    }
    
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo (){
        return modelo;
    } 
    
    public void setAno (int ano){
        this.ano = ano;
    }
    
    public int getAno (){
        return ano;
    }
}
