
package getesetters;

public class mamifero {
    private String nome, genero, raca;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome; 
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
