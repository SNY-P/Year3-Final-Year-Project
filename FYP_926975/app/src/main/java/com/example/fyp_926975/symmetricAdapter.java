package com.example.fyp_926975;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class symmetricAdapter extends RecyclerView.Adapter<symmetricAdapter.MyViewHolder> {
    private Context context;
    private ArrayList questionNum, set, relation, userAnswer, ifCorrect;

    public symmetricAdapter(Context context, ArrayList questionNum, ArrayList set, ArrayList relation, ArrayList userAnswer, ArrayList ifCorrect) {
        this.context = context;
        this.questionNum = questionNum;
        this.set = set;
        this.relation = relation;
        this.userAnswer = userAnswer;
        this.ifCorrect = ifCorrect;
    }

    @NonNull
    @Override
    public symmetricAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.symmetric_result_list, parent,false);
        return new symmetricAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull symmetricAdapter.MyViewHolder holder, int position) {
        holder.questionNum.setText(String.valueOf(questionNum.get(position)));
        holder.set.setText(String.valueOf(set.get(position)));
        holder.relation.setText(String.valueOf(relation.get(position)));
        holder.userAnswer.setText(String.valueOf(userAnswer.get(position)));
        holder.ifCorrect.setText(String.valueOf(ifCorrect.get(position)));
    }

    @Override
    public int getItemCount() {
        return set.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView questionNum, set, relation, userAnswer, ifCorrect;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            questionNum = itemView.findViewById(R.id.qIDSym);
            set = itemView.findViewById(R.id.setSymmetric);
            relation = itemView.findViewById(R.id.relationSymmetric);
            userAnswer = itemView.findViewById(R.id.useranswerSymmetric);
            ifCorrect = itemView.findViewById(R.id.checkSymmetric);
        }
    }

}