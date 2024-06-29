package com.arlandatec.restauranteapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.arlandatec.restauranteapp.databinding.ItemMenuBinding
import com.arlandatec.restauranteapp.model.Plato

class PlatoAdaptador(val lista : List<Plato>): Adapter<PlatoVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlatoVH {
        val binding = ItemMenuBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PlatoVH(binding)
    }

    override fun getItemCount(): Int {
         return lista.size
    }

    override fun onBindViewHolder(holder: PlatoVH, position: Int) {
        val plato = lista[position]
        holder.completarInformacion(plato)
    }

}