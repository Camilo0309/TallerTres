package com.i001114.tallertres.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.i001114.tallertres.Models.Photos;
import com.i001114.tallertres.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAMILO on 4/10/2017.
 */

public class AdapterPhotos extends RecyclerView.Adapter<AdapterPhotos.ViewHolder>{
    List<Photos> photosList = new ArrayList<>();
    Context context;

    public AdapterPhotos(List<Photos> photosList, Context context) {
        this.photosList = photosList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
// Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes
        holder.textViewtitle.setText(photosList.get(position).getTitle());

        String[] lista1;

        lista1 = new String[10];
        lista1[0]= "https://i.pinimg.com/originals/bc/3c/7b/bc3c7b772bd446870a34c8ef17bc4a6a.jpg";
        lista1[1] = "https://i1.wp.com/img02.deviantart.net/5964/i/2012/177/7/f/f_c_barcelona_wallpaper_mes_que_un_club_by_great_design-d54xfum.png";
        lista1[2] = "https://i.blogs.es/5881f1/fifa-18-cabecera/original.jpg";
        lista1[3] = "http://www.dlcompare.com/upload/gameimage/file/35720.jpeg";
        lista1[4] = "http://cdn.gamers.vg/wp-content/uploads/2016/07/FIFA-17-portada-Marco-Reus.jpg";
        lista1[5] = "https://clashroyale.com/uploaded-images/CR_facebook_share_02.jpg?mtime=20160104014218";
        lista1[6] ="http://nintenworld.com/wp-content/uploads/2017/07/3184635-resident-evil-7-review-thumb.jpg";
        lista1[7] = "https://redbarrelsgames.com/wp-content/uploads/2016/04/ScreenShotOutlastII-01.jpg";
        lista1[8] = "https://zenbyte.net/~blog2017/wp-content/uploads/2016/06/uncharted4.jpg";
        lista1[9] = "https://xbhalo.blob.core.windows.net/wallpapers/halo-1980x1080.jpg";

        int random = (int) (Math.random()*9);


        Picasso.with(context).load(lista1[random]).into(holder.imageView);


    }


    @Override
    public int getItemCount() {
        return photosList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewtitle;
        ImageView imageView;

        public ViewHolder(View item) {
            super(item);
            textViewtitle = (TextView) item.findViewById(R.id.id_tv_item_title);
            imageView = (ImageView) item.findViewById(R.id.id_img_item_cardview);


        }
    }
}
