package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListarLivros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_livros);

        Button novo = (Button) findViewById(R.id.novo);

        novo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ListarLivros.this,Novo_livro.class));
            }
        });

        Button troca = (Button) findViewById(R.id.trocar);

        troca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ListarLivros.this,troca.class));
            }
        });
    }
}
