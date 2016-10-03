package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import pooa20161.iff.edu.br.trocalivros.Modelos.Livro;

public class single_livro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_livro);

        String livroid;
        Intent intent = getIntent();
        livroid = intent.getStringExtra("LIVRO_ID");

        final Livro livro = Livro.findById(Livro.class, Long.parseLong(livroid));

        ((TextView) findViewById(R.id.sl_titulo)).setText(livro.getTitulo());
        ((TextView) findViewById(R.id.sl_autor)).setText(livro.getAutor());
        ((TextView) findViewById(R.id.sl_editora)).setText(livro.getEditora());
        ((TextView) findViewById(R.id.sl_descricao)).setText(livro.getDescricao_livro());

    }
}
