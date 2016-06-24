package br.edu.hto.ifsp.Lol_Skins.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.R;
import br.edu.hto.ifsp.Lol_Skins.domain.Skin;
import br.edu.hto.ifsp.Lol_Skins.presenter.ListarSkinPresenter;

/**
 * Created by dioge on 31/05/2016.
 */
public class SkinsAdapter extends BaseAdapter {
    private final Context context;
    private final List<Skin> skins;

    public SkinsAdapter(Context context, List skins){
        this.context = context;
        this.skins = skins;
    }

    @Override
    public int getCount() {
        return skins != null ? skins.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return skins.get(position);
    }

    @Override
    public long getItemId(int position) {
        return skins.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_skins, parent, false);

        TextView txtNome_skin = (TextView) view.findViewById(R.id.txtNome_skin);
        ImageView imgSkin = (ImageView) view.findViewById(R.id.imgSkin);

        Skin skin = skins.get(position);
        txtNome_skin.setText(skin.getSkins_name());

        baixarImagem(skin, imgSkin);
        return view;
    }

    private void baixarImagem(final Skin skin, final ImageView imageView) {
        //Picasso.with(context).load(ListarProfessoresPresenter.baseURL + "images/" + professor.getId() + ".png").into(imageView);

        final Target target = new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                skin.setPreviewskin(bitmap);
                imageView.setImageBitmap(bitmap);
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        };

        imageView.setTag(target);

        Picasso.with(context)
                .load(ListarSkinPresenter.baseUrl + "img/" + skin.getSkins_id() + ".jpg")
                .into(target);
    }
}
