package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class troca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troca);

        Button trocare = (Button) findViewById(R.id.trocar_livro);

        trocare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(troca.this,ListarLivros.class));
            }
        });
    }
}
