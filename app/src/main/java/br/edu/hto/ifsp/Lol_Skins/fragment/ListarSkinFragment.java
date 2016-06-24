package br.edu.hto.ifsp.Lol_Skins.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import br.edu.hto.ifsp.Aplicativo_SistemaEmpresas.R;
import br.edu.hto.ifsp.Lol_Skins.presenter.ListarSkinPresenter;

public class ListarSkinFragment extends Fragment {
    private ListView skinList;

    public ListarSkinFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("teste", "teste");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_listar_skins,container, false);

        skinList = (ListView) view.findViewById(R.id.listViewSkins);
        ListarSkinPresenter listarSkinPresenter = new ListarSkinPresenter();

        listarSkinPresenter.listarSkins(getContext(), skinList);
        Log.d("teste", "passou aq tbm");

        return view;
    }
}
