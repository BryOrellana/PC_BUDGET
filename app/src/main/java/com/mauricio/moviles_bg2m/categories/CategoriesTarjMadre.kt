package com.mauricio.moviles_bg2m.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.R
import com.mauricio.moviles_bg2m.databinding.FragmentCategoriesTarjMadreBinding

/**
 * A simple [Fragment] subclass.
 */
class CategoriesTarjMadre : Fragment() {
    private lateinit var binding: FragmentCategoriesTarjMadreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_categories__tarj__madre,
            container,
            false
        )

        //navToTarjMadreDesc()
        return binding.root
    }

    /*private fun navToTarjMadreDesc() {
        binding.apply {
            containerProduct1.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Tarj_Madre_to_descriptionTarjMadreFragment)
            }
            containerProduct2.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Tarj_Madre_to_descriptionTarjMadreFragment)
            }
            containerProduct3.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Tarj_Madre_to_descriptionTarjMadreFragment)
            }
            containerProduct4.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Tarj_Madre_to_descriptionTarjMadreFragment)
            }

        }
    }*/
}
