package com.arlandatec.restauranteapp.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.arlandatec.restauranteapp.databinding.ItemMenuBinding
import com.arlandatec.restauranteapp.model.Plato

class PlatoVH (private val binding : ItemMenuBinding) : ViewHolder(binding.root) {
    fun completarInformacion(plato : Plato){
        binding.tvMenu.text = plato.nombre
        binding.tvDetalle.text = plato.descripcion
        binding.tvPrecio.text = plato.precio.toString()
    }
}