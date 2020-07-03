package com.mauricio.moviles_bg2m.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.R
import com.mauricio.moviles_bg2m.databinding.FragmentCategoriesProcesadoresBinding

/**
 * A simple [Fragment] subclass.
 */
class CategoriesProcesadores : Fragment() {
    private lateinit var binding: FragmentCategoriesProcesadoresBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_categories__procesadores,container,false)

        navToProductDesc()
        return binding.root
    }

    private fun navToProductDesc(){
        binding.apply {
            containerProduct1.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_categories_Procesadores_to_descriptionProductFragment)
            }
            containerProduct2.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_categories_Procesadores_to_descriptionProductFragment)
            }
            containerProduct3.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_categories_Procesadores_to_descriptionProductFragment)
            }
            containerProduct4.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_categories_Procesadores_to_descriptionProductFragment)
            }

        }
    }
}
