package br.com.dio;

import br.com.dio.model.Gato;

public class primeiro_programa {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("O senhor dos anéis", 300);
        System.out.println(livro);


        System.out.println(gato);
      /* int a = 3;
       int b = 7;
        System.out.println("Hello World e sua resposta é: " + (a+b));*/
    }
}
class Livro{
    private String nome;
    private Integer numpag;

    public Livro(String nome, Integer numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag=" + numpag +
                '}';
    }
}
