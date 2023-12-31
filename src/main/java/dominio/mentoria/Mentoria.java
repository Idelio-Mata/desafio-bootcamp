package dominio.mentoria;

import dominio.conteudo.Conteudo;

import java.time.LocalDate;

// A classe Mentoria é filha de Conteúdo. Ela herda os atributos e metodos de Conteudo.
public class Mentoria extends Conteudo {


    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
