package com.arlandatec.restauranteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arlandatec.restauranteapp.adapter.PlatoAdaptador
import com.arlandatec.restauranteapp.databinding.FragmentHomeBinding
import com.arlandatec.restauranteapp.model.Plato

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var binding: FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment




        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding = FragmentHomeBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.rvMenues.adapter = PlatoAdaptador(getMenues())

        val recyclerView: RecyclerView =view.findViewById(R.id.rvMenues)
        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = PlatoAdaptador(getMenues())

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun getMenues() : List<Plato>{
        return listOf(
            Plato(1,"Huancaina","papa + huancaida", 15.00, 1),
            Plato(2,"Huancaina","papa + huancaida", 15.00, 1),
            Plato(3,"Huancaina","papa + huancaida", 15.00, 1),
            Plato(4,"Huancaina","papa + huancaida", 15.00, 1),
        )
    }
}