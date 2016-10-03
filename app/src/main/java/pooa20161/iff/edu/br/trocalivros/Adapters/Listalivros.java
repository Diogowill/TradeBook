package pooa20161.iff.edu.br.trocalivros.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pooa20161.iff.edu.br.trocalivros.Modelos.Livro;
import pooa20161.iff.edu.br.trocalivros.R;

/**
 * Created by leandropiresdesouza on 10/3/16.
 */
public class Listalivros extends ArrayAdapter<Livro> {

    private Context context = null;
    private ArrayList<Livro> livros = null;

    public Listalivros(Context context, ArrayList<Livro> livros){
        super(context, R.layout.livroslayout, livros);
        this.context = context;
        this.livros = livros;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.livroslayout, parent, false);

        TextView titulo = (TextView) rowView.findViewById(R.id.livro_titulo);
        TextView subtitulo = (TextView) rowView.findViewById(R.id.livro_subtitulo);

        titulo.setText(livros.get(position).getTitulo());
        subtitulo.setText(livros.get(position).getAutor());

        return rowView;
    }
}