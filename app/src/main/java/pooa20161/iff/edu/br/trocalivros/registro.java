package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pooa20161.iff.edu.br.trocalivros.Modelos.Usuario;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button login = (Button) findViewById(R.id.registro_cadastrar);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final String r_nome = ((EditText) findViewById(R.id.registro_nome)).getText().toString();
                final String r_senha = ((EditText) findViewById(R.id.registro_senha)).getText().toString();
                final String r_idade = ((EditText) findViewById(R.id.registro_idade)).getText().toString();
                final String r_email = ((EditText) findViewById(R.id.registro_email)).getText().toString();
                final String r_telefone = ((EditText) findViewById(R.id.registro_telefone)).getText().toString();
                final String r_descricao = ((EditText) findViewById(R.id.registro_descricao)).getText().toString();

                Usuario usuario = new Usuario(r_nome, r_senha, Integer.parseInt(r_idade), r_email, r_telefone, r_descricao);
                usuario.save();

                Toast.makeText(getApplicationContext(), "Usuario salvo", Toast.LENGTH_LONG).show();

                startActivity(new Intent(registro.this,ListarLivros.class));
            }
        });
    }
}
