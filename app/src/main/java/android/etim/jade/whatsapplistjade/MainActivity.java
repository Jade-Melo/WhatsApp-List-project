package android.etim.jade.whatsapplistjade;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Model.UsuarioModel;
import adapter.AdapterUsuario;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    List<UsuarioModel> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_usuarios);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);

        AdapterUsuario adapterUsuario = new AdapterUsuario(usuarioList);

        recyclerView.setAdapter(adapterUsuario);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Usuarios(){
        UsuarioModel usuario = new UsuarioModel(R.drawable.usuario1, "Fabio Claret", "Olá como vai?");
        UsuarioModel usuario1 = new UsuarioModel(R.drawable.usuario2, "Mariana", "Oi tudo bem?");
        UsuarioModel usuario2 = new UsuarioModel(R.drawable.usuario1, "Carlos", "Bom dia");
        UsuarioModel usuario3 = new UsuarioModel(R.drawable.usuario1, "Sueli Muniz", "E aí?");
        UsuarioModel usuario4 = new UsuarioModel(R.drawable.usuario1, "Paulo Rogério", "Vamos para escola hoje?");
        UsuarioModel usuario5 = new UsuarioModel(R.drawable.usuario1, "Thiago", "Qual lab?");
        UsuarioModel usuario6 = new UsuarioModel(R.drawable.usuario1, "Barbara", "O professor faltou");
        UsuarioModel usuario7 = new UsuarioModel(R.drawable.usuario1, "Gisele", "Ebaaa");
        UsuarioModel usuario8 = new UsuarioModel(R.drawable.usuario1, "Mateus", "Vamos passear");
        UsuarioModel usuario9 = new UsuarioModel(R.drawable.usuario1, "Orion", "Já pode ir?");
        UsuarioModel usuario10 = new UsuarioModel(R.drawable.usuario1, "Djila", "Dicas de normas ABNT");
    }
}