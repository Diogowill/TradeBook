package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class Novo_livro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_livro);

        Button cadastrar_livro = (Button) findViewById(R.id.cadastrar_livro);

        cadastrar_livro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Novo_livro.this,ListarLivros.class));
            }
        });
    }
}
