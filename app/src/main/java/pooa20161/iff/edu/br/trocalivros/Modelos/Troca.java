package pooa20161.iff.edu.br.trocalivros.Modelos;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by leandropiresdesouza on 10/3/16.
 */
public class Troca extends SugarRecord {
    Integer codigo;
    String recomendacoes;
    Date data_troca;

    public Troca(){

    }

    public Troca(Integer codigo, String recomendacoes, Date data_troca){
        this.codigo = codigo;
        this.recomendacoes = recomendacoes;
        this.data_troca = data_troca;
    }
}
