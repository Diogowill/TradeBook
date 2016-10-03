package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import pooa20161.iff.edu.br.trocalivros.Modelos.Usuario;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.login_login);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String l_email = ((EditText) findViewById(R.id.login_email)).getText().toString();
                String l_senha = ((EditText) findViewById(R.id.login_senha)).getText().toString();

                List<Usuario> usuarios = Usuario.find(Usuario.class, "email=? and senha=?", l_email, l_senha);

                if(usuarios.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Usuário não encontrado", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(Login.this,ListarLivros.class));
                }
            }
        });

    }


}
