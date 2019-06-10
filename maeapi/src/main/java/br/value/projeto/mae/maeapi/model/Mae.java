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
    private int qtdfilho;

    @Column
    private boolean disponivel;

    public Mae(String nome, String sobrenome, int qtdfilho, boolean disponivel){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.qtdfilho = qtdfilho;
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
        return qtdfilho;
    }

    public void setQtdFilho(int qtdFilho) {
        this.qtdfilho = qtdFilho;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Mae{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", qtdfilho=" + qtdfilho +
                ", disponivel=" + disponivel +
                '}';
    }
}
