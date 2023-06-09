package com.example.lsm.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.lsm.Words
import com.example.lsm.databinding.FragmentVideoBinding

/*
Fragmento para la reproducción de videos.
 */

class Video : Fragment() {
    private var _binding: FragmentVideoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mediaController = MediaController(context)
        mediaController.setAnchorView(binding.videoView)

        binding.playButton.setOnClickListener {
            binding.videoView.start()
        }

        // Recepción de la palabra cuyo video se va a mostrar
        arguments?.let {
            val word = it.get("word") as Words
            val videoId = word.localVideoURL

            // El video se reproduce si este existe
            if(videoId != null) {
                val offlineUrl = Uri.parse("android.resource://${requireContext().packageName}/${videoId}")
                binding.wordTextView.text = word.name
                //binding.videoView.setMediaController(mediaController)
                binding.videoView.setVideoURI(offlineUrl)
                binding.videoView.requestFocus()
                //binding.videoView.start()
            }
            else {
                binding.videoView.isVisible = false
                binding.playButton.isVisible = false
                Toast.makeText(context, "Video no disponible", Toast.LENGTH_SHORT).show()
            }
        }
    }
}