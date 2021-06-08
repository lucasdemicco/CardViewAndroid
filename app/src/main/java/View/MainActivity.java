package View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.lucas.cardview.R;

import java.util.ArrayList;
import java.util.List;

import Controller.AdapterCard;
import Model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerPostagem.setLayoutManager(layoutManager);


        //Grid Layout
        /*RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);*/


        //Adapter
        declararPostagens();
        AdapterCard adapter = new AdapterCard(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void declararPostagens(){
        Postagem p = new Postagem("Lucas De Micco", "Viagem Legal!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Camila França", "Que vista!", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Kaique Tiers", "Sensacional!", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Flávia França", "Amei!", R.drawable.imagem4);
        this.postagens.add(p);

    }
}