package com.example.lsm.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.lsm.R
import com.example.lsm.databinding.FragmentQuizzesBinding

/*
Fragmento para la selección de dificultad de los quizzes a realizar.
 */

class Quizzes : Fragment() {
    private var _binding: FragmentQuizzesBinding ? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentQuizzesBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val basic = view.findViewById<Button>(R.id.basic_button)
        val intermediate = view.findViewById<Button>(R.id.intermediate_button)
        val advanced = view.findViewById<Button>(R.id.advanced_button)

        // Seleccion de la dificultad basica y asignacion en un bundle para generar la configuracion
        basic.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("difficulty", "Dificultad básica")
            view.findNavController().navigate(R.id.action_quizzes_frag_to_quizRoad_frag, bundle)
        }
        // Seleccion de la dificultad intermedia y asignacion en un bundle para generar la configuracion
        intermediate.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("difficulty", "Dificultad intermedia")
            view.findNavController().navigate(R.id.action_quizzes_frag_to_quizRoad_frag, bundle)
        }
        // Seleccion de la dificultad avanzada y asignacion en un bundle para generar la configuracion
        advanced.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("difficulty", "Dificultad avanzada")
            view.findNavController().navigate(R.id.action_quizzes_frag_to_quizRoad_frag, bundle)
        }
    }
}