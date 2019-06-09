package br.value.projeto.mae.maeapi.model;

import javax.persistence.*;

@Entity
@Table(name = "Mae")
public class Mae {

    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String sobrenome;

    @Column
    private int qtd_filho;

    @Column
    private boolean disponivel;

    public Mae(String nome, String sobrenome, int qtd_filho, boolean disponivel){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.qtd_filho = qtd_filho;
        this.disponivel = disponivel;

    }
    public Mae(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getQtdFilho() {
        return qtd_filho;
    }

    public void setQtdFilho(int qtdFilho) {
        this.qtd_filho = qtdFilho;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
