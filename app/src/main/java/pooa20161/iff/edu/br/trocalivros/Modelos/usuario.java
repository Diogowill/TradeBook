package pooa20161.iff.edu.br.trocalivros.Modelos;

import com.orm.SugarRecord;

/**
 * Created by leandropiresdesouza on 10/3/16.
 */
public class Usuario extends SugarRecord {
    String nome;
    String senha;
    Integer idade;
    String email;
    String telefone;
    String descricao_usuario;


    public Usuario(){

    }

    public Usuario(String nome, String senha, Integer idade, String email, String telefone, String descricao_usuario) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.descricao_usuario = descricao_usuario;
    }

}
