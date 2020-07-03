package com.mauricio.moviles_bg2m.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.R
import com.mauricio.moviles_bg2m.databinding.FragmentCategoriesCompCompletaBinding

class CategoriesCompCompleta : Fragment() {
    private lateinit var binding: FragmentCategoriesCompCompletaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_categories__comp_completa, container, false)

       //navToPCDesc()
        return binding.root
    }

   /* private fun navToPCDesc() {
        binding.apply {
            containerProduct1.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Comp_completa_to_descriptionCompCompleta)
            }
            containerProduct2.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Comp_completa_to_descriptionCompCompleta)
            }
            containerProduct3.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Comp_completa_to_descriptionCompCompleta)
            }
            containerProduct4.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_categories_Comp_completa_to_descriptionCompCompleta)
            }
        }
    }*/
}
