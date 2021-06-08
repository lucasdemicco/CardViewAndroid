package Controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lucas.cardview.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import Model.Postagem;


public class AdapterCard extends RecyclerView.Adapter<AdapterCard.myViewHolder> {

    private List<Postagem> postagens;

    public AdapterCard(List<Postagem> listaPostagens) {
        this.postagens = listaPostagens;
    }

    @NonNull
    @NotNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagemdetalhes, parent, false);
        return new myViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterCard.myViewHolder holder, int position) {
        Postagem postagem = postagens.get(position);
        holder.txtNome.setText(postagem.getNome());
        holder.txtPostagem.setText(postagem.getPostagem());
        holder.imagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView txtNome;
        TextView txtPostagem;
        ImageView imagem;

        public myViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.txtNome);
            txtPostagem = itemView.findViewById(R.id.txtPostagem);
            imagem = itemView.findViewById(R.id.imagem);
        }
    }
}
