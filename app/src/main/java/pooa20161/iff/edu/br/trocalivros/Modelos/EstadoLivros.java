package pooa20161.iff.edu.br.trocalivros.Modelos;

import com.orm.SugarRecord;

/**
 * Created by leandropiresdesouza on 10/3/16.
 */
public class EstadoLivros extends SugarRecord {
    String descricao_estado;
    String nota_para_livro_trocado;

    public EstadoLivros(){

    }

    public EstadoLivros(String descricao_estado, String nota_para_livro_trocado){
        this.descricao_estado = descricao_estado;
        this.nota_para_livro_trocado = nota_para_livro_trocado;
    }
}
