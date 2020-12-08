package com.pliniodev.listadetarefassimples.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pliniodev.listadetarefassimples.Model.Tarefa;
import com.pliniodev.listadetarefassimples.R;

import java.util.List;

public class TarefaAdapter extends RecyclerView.Adapter<TarefaAdapter.MyViewHolder> {

    private List<Tarefa> listaTarefas;

    //Construtor do adapter que recebe o atributo lista de tarefas
    public TarefaAdapter(List<Tarefa> lista) {
        this.listaTarefas = lista;
    }

    //Classes para o RecyclerView
    //onCreateViewHolder
    //é chamado quando é necessário criar um novo item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //instanciando o arquivo Resource xml
        View itemLista = LayoutInflater.from(parent.getContext())
                                        .inflate(R.layout.lista_tarefa_adapter, parent, false);

        return new MyViewHolder(itemLista);//envia o item criado para o MyViewHolder
    }

    //OnBindViewHolder preenche ou infla o que foi criado
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Tarefa tarefa = listaTarefas.get(position);
        holder.tarefa.setText(tarefa.getNomeTarefa());

    }

    //Conta os items enviado através do construtor do adapter
    @Override
    public int getItemCount() {
        return this.listaTarefas.size();
    }
    //fim Classes para o RecyclerView


    //Criação da classe MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tarefa;

        public MyViewHolder(@NonNull View itemView) {//recebe o parametro criado no oncreate
            super(itemView);

            //atribui o textView que está dentro do item View criado no onCreateViewHolder
            tarefa = itemView.findViewById(R.id.textTarefa);
        }
    }

}
