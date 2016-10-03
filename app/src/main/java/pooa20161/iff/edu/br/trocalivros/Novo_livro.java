package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import pooa20161.iff.edu.br.trocalivros.Modelos.Livro;

public class Novo_livro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_livro);

        Button cadastrar_livro = (Button) findViewById(R.id.nl_cadastrar);

        cadastrar_livro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String codigo = ((EditText) findViewById(R.id.nl_codigo)).getText().toString();
                String titulo = ((EditText) findViewById(R.id.nl_titulo)).getText().toString();
                String autor = ((EditText) findViewById(R.id.nl_autor)).getText().toString();
                String isbn = ((EditText) findViewById(R.id.nl_isbn)).getText().toString();
                String editora = ((EditText) findViewById(R.id.nl_editora)).getText().toString();
                String descricao = ((EditText) findViewById(R.id.nl_descricao)).getText().toString();

                Livro livro = new Livro(Integer.parseInt(codigo), titulo, autor, isbn, editora, descricao);
                livro.save();

                Toast.makeText(getApplicationContext(), "Livro cadastrado",  Toast.LENGTH_SHORT).show();

                startActivity(new Intent(Novo_livro.this,ListarLivros.class));
            }
        });
    }
}
