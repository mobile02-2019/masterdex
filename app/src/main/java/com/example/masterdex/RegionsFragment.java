package com.example.masterdex;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.masterdex.adapter.RegioesAdapter;
import com.example.masterdex.models.Regiao;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegionsFragment extends Fragment {

    private RecyclerView recyclerView;


    public RegionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_regions, container, false);

        recyclerView = view.findViewById(R.id.regioes_recycler_view);

        RegioesAdapter regioesAdapter = new RegioesAdapter(getListaRegioes());

        RecyclerView.LayoutManager layoutManager =new GridLayoutManager(getContext(), 3);

        recyclerView.setAdapter(regioesAdapter);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

    private List<Regiao> getListaRegioes(){
        List<Regiao> listaRegioes = new ArrayList<>();

        Regiao kanto = new Regiao("Kanto");
        listaRegioes.add(kanto);

        return  listaRegioes;
    }
}
