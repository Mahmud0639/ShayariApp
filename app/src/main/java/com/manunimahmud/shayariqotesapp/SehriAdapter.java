package com.manunimahmud.shayariqotesapp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SehriAdapter extends RecyclerView.Adapter<SehriAdapter.SehriViewHolder> {
    private Context context;
    private List<SehriModel> list;

    public SehriAdapter(Context context, List<SehriModel> list){
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public SehriViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new SehriViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SehriViewHolder holder, int position) {
        SehriModel data = list.get(position);
        holder.text.setText(data.getText());
        setAnimation(holder.itemView);

        holder.whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent whatsappShare = new Intent(Intent.ACTION_SEND);
                    whatsappShare.setType("text/plain");
                    whatsappShare.setPackage("com.whatsapp");
                    whatsappShare.putExtra(Intent.EXTRA_TEXT,data.getText());
                    context.startActivity(whatsappShare);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        holder.share.setOnClickListener(v -> {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_SUBJECT,"Share");
            share.putExtra(Intent.EXTRA_TEXT,data.getText());
            context.startActivity(Intent.createChooser(share,"Share with"));
        });
        holder.copy.setOnClickListener(v -> {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData CopyData = (ClipData) ClipData.newPlainText("text",data.getText());
            clipboardManager.setPrimaryClip(CopyData);

            Toast.makeText(context, "Text copied!", Toast.LENGTH_SHORT).show();
        });
    }
    private void setAnimation(View view){
        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        view.setAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SehriViewHolder extends RecyclerView.ViewHolder {
        private ImageView whatsapp, share, copy;
        private TextView text;

        public SehriViewHolder(@NonNull View itemView) {
            super(itemView);

            whatsapp = itemView.findViewById(R.id.whatsapp);
            share = itemView.findViewById(R.id.share);
            copy = itemView.findViewById(R.id.copy);
            text = itemView.findViewById(R.id.text);
        }
    }
}
