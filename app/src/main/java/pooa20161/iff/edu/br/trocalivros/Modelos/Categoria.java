package pooa20161.iff.edu.br.trocalivros.Modelos;

import com.orm.SugarRecord;

/**
 * Created by leandropiresdesouza on 10/3/16.
 */
public class Categoria extends SugarRecord {
    Integer codigo_livro;
    String categoria_livro;
    String descricao_categoria;

    public Categoria(){

    }

    public Categoria(Integer codigo_livro, String categoria_livro, String descricao_categoria){
        this.codigo_livro = codigo_livro;
        this.categoria_livro = categoria_livro;
        this.descricao_categoria = descricao_categoria;
    }

}
