package pooa20161.iff.edu.br.trocalivros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pooa20161.iff.edu.br.trocalivros.Adapters.Listalivros;
import pooa20161.iff.edu.br.trocalivros.Modelos.Livro;

public class ListarLivros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_livros);

/*
        List<Livro> livros = Livro.listAll(Livro.class);
        String arrayLista[] = new String[livros.size()];
        Integer count = 0;
        for (Livro l : livros) {
            arrayLista[count] = l.getTitulo();
            count = count + 1;
        }

        final ListView lista_livros = (ListView) findViewById(R.id.lista_livros);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, arrayLista);
        lista_livros.setAdapter(adapter);
*/

        final List<Livro> livros = Livro.listAll(Livro.class);
        ListView list = (ListView) findViewById(R.id.lista_livros);
        final ArrayAdapter <Livro> adapter = new Listalivros(this, (ArrayList<Livro>) livros);
        try{
            list.setAdapter(adapter);
        }catch (Exception e){
            Toast.makeText(this, "Erro carregando livros"+e.getMessage(), Toast.LENGTH_LONG).show();
        }

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                //Causa yourData = causas.get(position);
                /*
                Intent intent = new Intent(getBaseContext(), Issue.class);
                intent.putExtra("CAUSA_ID", position);
                startActivity(intent);
                */
                //startActivity(new Intent(city2.this, Issue.class));

                String dataToPass= ""+(position+1);
                Intent intent = new Intent(ListarLivros.this, single_livro.class);
                intent.putExtra("LIVRO_ID", dataToPass);
                startActivity(intent);
            }
        });


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
