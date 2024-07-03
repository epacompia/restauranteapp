package com.arlandatec.restauranteapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val categories: List<Categoria>, private val products: List<Producto>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val categoryName: TextView = view.findViewById(R.id.categoryName)
        val productRecyclerView: RecyclerView = view.findViewById(R.id.productRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.categoryName.text = category.nombre

        val filteredProducts = products.filter { it.categoria.id == category.id }
        holder.productRecyclerView.adapter = ProductAdapter(filteredProducts)
        holder.productRecyclerView.layoutManager = LinearLayoutManager(holder.itemView.context)

        holder.categoryName.setOnClickListener {
            if (holder.productRecyclerView.visibility == View.GONE) {
                holder.productRecyclerView.visibility = View.VISIBLE
            } else {
                holder.productRecyclerView.visibility = View.GONE
            }
        }
    }

    override fun getItemCount() = categories.size
}
