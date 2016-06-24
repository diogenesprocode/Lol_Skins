package br.edu.hto.ifsp.Lol_Skins.presenter;

import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import br.edu.hto.ifsp.Lol_Skins.adapter.SkinsAdapter;
import br.edu.hto.ifsp.Lol_Skins.domain.Skin;
import br.edu.hto.ifsp.Lol_Skins.service.SkinService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListarSkinPresenter {
    public static String baseUrl = "http://192.168.49.124:8080/";

    public void listarSkins(final Context context, final ListView listView) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SkinService service = retrofit.create(SkinService.class);
        Call<List<Skin>> call = service.listarSkin();

        call.enqueue(new Callback<List<Skin>>() {
            @Override
            public void onResponse(Call<List<Skin>> call, Response<List<Skin>> response) {
                List<Skin> list = response.body();
                Log.d("teste", "teste");
                listView.setAdapter(new SkinsAdapter(context, list));
            }

            @Override
            public void onFailure(Call<List<Skin>> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }
}