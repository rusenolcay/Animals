package com.rusen.animalsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rusen.animalsproject.DetailActivity.Companion.EXTRA_ANIMAL
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.animals.birds.Eagle
import com.rusen.animalsproject.animals.birds.Parrot
import com.rusen.animalsproject.animals.birds.Penguin
import com.rusen.animalsproject.animals.birds.Bat
import com.rusen.animalsproject.common.viewBinding
import com.rusen.animalsproject.databinding.ActivityMainBinding
import com.rusen.animalsproject.animals.fish.MonkSeal
import com.rusen.animalsproject.animals.fish.Dolphin
import com.rusen.animalsproject.animals.mammals.Lion
import com.rusen.animalsproject.animals.mammals.Elephant
import com.rusen.animalsproject.animals.mammals.Cat
import com.rusen.animalsproject.animals.mammals.Giraffe
import com.rusen.animalsproject.animals.reptiles.Crocodile
import com.rusen.animalsproject.animals.reptiles.Snake

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val list = getAnimals()

        val adapter = AnimalsAdapter(onAnimalsClick = ::onAnimalClick)
        binding.rvAnimals.adapter = adapter
        adapter.submitList(list)
    }

    private fun onAnimalClick(animals: Animals) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(EXTRA_ANIMAL, animals)
        startActivity(intent)
    }

    private fun getAnimals() = listOf(
        Lion("Mike"),
        Bat("Corona"),
        Penguin("Joey"),
        Parrot("Racky"),
        Elephant("Chander"),
        Giraffe("Ross"),
        Crocodile("Dady"),
        Snake("Frood"),
        MonkSeal("Betty"),
        Dolphin("Jonues"),
        Cat("Mathilda"),
        Eagle("Kartal")
    )

}