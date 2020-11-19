/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campeonato;

/**
 *
 * @author Vitor
 */
public class Lutador {
   private String nome, categoria , nacionalidade;
   private boolean aposentado;
   private float peso;
   private int idade, vitorias, derrotas, empates;

 


 

 
    
    public Lutador(String nome, String nacionalidade, boolean aposentado, float peso, int idade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.aposentado = aposentado;
        //this.campeao = campeao;
        this.peso = peso;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //copia
    public Lutador(Lutador lt){
        this.nome = lt.nome;
        this.nacionalidade = lt.nacionalidade;
        this.aposentado = lt.aposentado;
        //this.campeao = campeao;
        this.peso = lt.peso;
        this.idade = lt.idade;
        this.vitorias = lt.vitorias;
        this.derrotas = lt.derrotas;
        this.empates = lt.empates;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean getAposentado() {
        return this.aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

 

    
    public void ganharluta(){
        
        this.vitorias = this.vitorias + 1;
    
    
    }
    public void perderluta(){
        
        this.derrotas = this.derrotas + 1;
    
    
    }
    public void empatarluta(){
        
        this.empates = this.empates + 1;
    
    
    }
     
    public String informarcategoria(){
     
        if(peso>=70 && peso<=85 )
        {
            this.categoria = "Peso leve";
             
        }else if(peso>85 && peso<100){
            
            this.categoria = "Peso médio";
            
        }else{
            
            this.categoria = "Peso pesado";
        }
        
        return this.categoria;
    }
    
    public void aposentar(){
        this.aposentado = true;
        //this.campeao = false;
    }
    
    

 

    
    public String apresentarLutador() {
        return "Lutador{" + "nome=" + nome + ", categoria=" + categoria + ", nacionalidade=" + nacionalidade + ", aposentado=" + aposentado + ", peso=" + peso + ", idade=" + idade + ", vitorias=" + vitorias + ", derrotas=" + derrotas + ", empates=" + empates + '}';
    }
    
}
    

