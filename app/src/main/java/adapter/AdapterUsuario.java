package adapter;

import android.content.Context;
import android.etim.jade.whatsapplistjade.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Model.UsuarioModel;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder> {
    private Context context;

    public AdapterUsuario(Context context) {
        this.context = context;
    }

    @NonNull

    private ArrayList<UsuarioModel> usuarioList = new ArrayList<UsuarioModel>();
    public AdapterUsuario(Context context, @NonNull ArrayList<UsuarioModel> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public AdapterUsuario(List<UsuarioModel> usuarioList) {
    }

    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        itemLista = layoutInflater.inflate(R.layout.usuario_item,parent,false );

        return new UsuarioViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        holder.foto.setImageResource(usuarioList.get(position).getFoto());
        holder.nome.setText(usuarioList.get(position).getNome());
        holder.mensagem.setText(usuarioList.get(position).getMensagem());
    }

    @Override
    public int getItemCount() {
        return usuarioList.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder{
        ImageView foto;
        TextView nome;
        TextView mensagem;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.usuario_foto);
            nome = itemView.findViewById(R.id.nome_usuario);
            mensagem = itemView.findViewById(R.id.mensagem);
        }
    }
}
