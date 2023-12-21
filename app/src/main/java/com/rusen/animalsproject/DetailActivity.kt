package com.rusen.animalsproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.birds.Birds
import com.rusen.animalsproject.animals.fish.Fish
import com.rusen.animalsproject.animals.mammals.Mammals
import com.rusen.animalsproject.animals.reptiles.Reptiles
import com.rusen.animalsproject.common.viewBinding
import com.rusen.animalsproject.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ANIMAL = "Animal"
    }

    private val binding by viewBinding(ActivityDetailBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataAnimal: Animals? = intent.getParcelableExtra(EXTRA_ANIMAL)
        showDetail(dataAnimal)
    }

    private fun showDetail(animals: Animals?) {
        with(binding) {
            animals?.picture?.let { ivImage.setImageResource(it) }
            tvTitle.text = animals?.name
            tvYedigiBesin.text = getString(R.string.food_label, animals?.food)
            tvYasadGHabitat.text = getString(R.string.naturel_environment, animals?.habitat)
            tvCKardSes.text = getString(R.string.animal_sound, animals?.makeVoice())
            tvSolunumTipi.text = getString(R.string.breathing_type, animals?.makeVoice())

            when (animals) {
                is Mammals -> tvRengi.text = getString(R.string.skin_color, animals.skinColor)
                is Birds -> tvRengi.text = getString(R.string.feather_color, animals.featherColor)
                is Fish -> tvRengi.text = getString(R.string.flake_color, animals.flakeColor)
                is Reptiles -> tvRengi.text =getString(R.string.flake_color,animals.flakeColor)
            }
        }
    }
}