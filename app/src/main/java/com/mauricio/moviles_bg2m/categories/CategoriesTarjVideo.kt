package com.mauricio.moviles_bg2m.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.R
import com.mauricio.moviles_bg2m.databinding.FragmentCategoriesTarjVideoBinding

/**
 * A simple [Fragment] subclass.
 */
class CategoriesTarjVideo : Fragment() {
    lateinit var binding : FragmentCategoriesTarjVideoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_categories__tarj_video,container,false)

        //navToTarjVideoDesc()
        return binding.root
    }

   /* private fun navToTarjVideoDesc(){
        binding.apply {
            containerProduct1.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_categories_Tarj_video_to_descriptionTarjVideo)
            }
            containerProduct2.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_categories_Tarj_video_to_descriptionTarjVideo)
            }
            containerProduct3.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_categories_Tarj_video_to_descriptionTarjVideo)
            }
            containerProduct4.setOnClickListener { view : View ->
                view.findNavController().navigate(R.id.action_categories_Tarj_video_to_descriptionTarjVideo)
            }

        }
    }*/
}
