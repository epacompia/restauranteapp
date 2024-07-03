package com.arlandatec.restauranteapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class CategoriaActivity : AppCompatActivity() {
    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria)

        categoryRecyclerView = findViewById(R.id.categoryRecyclerView)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this)

        // Crear datos en duro
        val categoriaMenu = Categoria(1, "menu", 1)
        val categoriaEjecutivo = Categoria(2, "ejecutivo", 1)
        val categoriaBebidas = Categoria(3, "bebidas", 1)
        val categoriaPostres = Categoria(4, "postres", 1)

        val productos = listOf(
            Producto(1, "Lomo Saltado", "Plato tipico peruano", 14.99, 1, categoriaMenu),
            Producto(2, "Frejoles con seco", "Plato tipico peruano", 14.99, 1, categoriaMenu),
            Producto(3, "Aji de gallina", "Plato tipico peruano", 14.99, 1, categoriaMenu),
            Producto(4, "Estofado de pollo", "Plato tipico peruano", 14.99, 1, categoriaMenu),
            Producto(5, "Pollo a la corden bleu", "Plato tipico peruano ejecutivo", 20.0, 1, categoriaEjecutivo),
            Producto(6, "Pollo a la brasa", "Plato tipico peruano ejecutivo", 20.0, 1, categoriaEjecutivo),
            Producto(7, "Pollo a lo pobre", "Plato tipico peruano ejecutivo", 20.0, 1, categoriaEjecutivo),
            Producto(8, "Gaseosa personal inka kola", "Gaseosa personal", 3.0, 1, categoriaBebidas),
            Producto(9, "Chicha morada 1 vaso", "Bebida peruana de sabor", 5.0, 1, categoriaBebidas),
            Producto(10, "Torta de chocolate", "Postre peruano", 4.0, 1, categoriaPostres)
        )

        val categorias = productos.map { it.categoria }.distinctBy { it.id }

        categoryAdapter = CategoryAdapter(categorias, productos)
        categoryRecyclerView.adapter = categoryAdapter
    }
}