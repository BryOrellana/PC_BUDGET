package com.mauricio.moviles_bg2m.main_views


import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mauricio.moviles_bg2m.R
import com.mauricio.moviles_bg2m.databinding.FragmentMoreBinding
import kotlinx.android.synthetic.main.fragment_more.*

class MoreFragment : Fragment() {
    lateinit var binding: FragmentMoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_more, container, false
        )

        btnListeners()
        return binding.root
    }

    private fun showWindow(tipo: Int = 0){
        var text="Facilitar la búsqueda de productos, generando presupuestos a través del mercado real, para satisfacer las necesidades del cliente, conectando con centros de compra externos."
        var titulo="Objetivo"
        if(tipo==1) {
            text = "La aplicación consiste en la búsqueda rápida y satisfactoria de productos tecnológicos, a modo de lograr tener un presupuesto del mercado real acerca de las necesidades de cada persona. Cada persona podrá crear un perfil propio y en este podrá ir almacenando sus presupuestos y a la vez tendrá acceso a tiendas externas a nuestra app en las que podrá encontrar los productos."
            titulo ="Acerca de"
        }
        if(tipo==2){
            text="Bryan Alexis Orellana Cabrera\n\nMauricio Enrique Palacios Palacios\n\nMiguel Ernesto Rivas Serrano\n\nGabriel Enrique Gonzalez Rodriguez   "
            titulo="¿Quiene Somos?"
        }
        val builder=AlertDialog.Builder(this.context)
        builder.setTitle(titulo)
        builder.setMessage(text)
        builder.setPositiveButton("Aceptar",null)
        val dialogue: AlertDialog=builder.create()
        dialogue.show()
    }

    private fun btnListeners() {
        binding.apply {
            btnSesion.setOnClickListener { view: View ->
                view.findNavController().navigate(R.id.action_moreFragment_to_loginFragment)
            }
            cambiarContra.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_moreFragment_to_changePasswordFragment2)
            }
            btnSubirProducto.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(R.id.action_moreFragment_to_fragment_subirproducto2)
            }
            objetivosTxt.setOnClickListener {
                showWindow()
            }
            acercaDeTxt.setOnClickListener {
                showWindow(1)
            }
            quienesSomosTxt.setOnClickListener {
                showWindow(2)
            }
        }
    }
}


