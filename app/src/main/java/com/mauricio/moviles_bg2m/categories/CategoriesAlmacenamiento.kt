package com.mauricio.moviles_bg2m.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.mauricio.moviles_bg2m.R
import com.mauricio.moviles_bg2m.databinding.FragmentCategoriesAlmacenamientoBinding

/**
 * A simple [Fragment] subclass.
 */
class CategoriesAlmacenamiento : Fragment() {
    lateinit var binding: FragmentCategoriesAlmacenamientoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_categories_almacenamiento,container,false)

        return binding.root
    }

}
