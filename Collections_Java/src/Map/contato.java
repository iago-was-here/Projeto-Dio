package Map;

import java.util.Objects;

public class contato {
	 private String nome;
	    private Integer numero;

	    public contato(String nome, Integer numero) {
	        this.nome = nome;
	        this.numero = numero;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public Integer getNumero() {
	        return numero;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        contato contato = (contato) o;
	        return nome.equals(contato.nome) && numero.equals(contato.numero);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(nome, numero);
	    }

	    @Override
	    public String toString() {
	        return "Contato{" +
	                "nome='" + nome + '\'' +
	                ", numero='" + numero + '\'' +
	                '}';
	    }
}
