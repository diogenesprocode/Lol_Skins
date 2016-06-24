package br.edu.hto.ifsp.Lol_Skins.service;



import java.util.List;

import br.edu.hto.ifsp.Lol_Skins.domain.Skin;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dioge on 31/05/2016.
 */
public interface SkinService {
    @GET("skins/list")
    Call<List<Skin>> listarSkin();

}
