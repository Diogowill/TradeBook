package pooa20161.iff.edu.br.trocalivros.Modelos;

import com.orm.SugarRecord;

/**
 * Created by leandropiresdesouza on 10/3/16.
 */
public class Livro extends SugarRecord {
    Integer codigolivro;
    String titulo;

    public Integer getCodigolivro() {
        return codigolivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEditora() {
        return editora;
    }

    public String getDescricao_livro() {
        return descricao_livro;
    }

    String autor;
    String ISBN;
    String editora;
    String descricao_livro;

    public Livro(){

    }

    public Livro(Integer codigolivro, String titulo, String autor, String ISBN, String editora, String descricao_livro){
        this.codigolivro = codigolivro;
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editora = editora;
        this.descricao_livro = descricao_livro;
    }

}
