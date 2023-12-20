package com.rusen.animalsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rusen.animalsproject.animals.birds.Kartal
import com.rusen.animalsproject.animals.birds.Papagan
import com.rusen.animalsproject.animals.birds.Penguen
import com.rusen.animalsproject.animals.birds.Yarasa
import com.rusen.animalsproject.common.viewBinding
import com.rusen.animalsproject.databinding.ActivityMainBinding
import com.rusen.animalsproject.animals.fish.Fok
import com.rusen.animalsproject.animals.fish.Yunus
import com.rusen.animalsproject.animals.mammals.Aslan
import com.rusen.animalsproject.animals.mammals.Fil
import com.rusen.animalsproject.animals.mammals.Kedi
import com.rusen.animalsproject.animals.mammals.Zurafa
import com.rusen.animalsproject.animals.reptiles.Timsah
import com.rusen.animalsproject.animals.reptiles.Yilan

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val list = hayvanListesiGetir()

        val adapter= AnimalsAdapter()
        binding.rvAnimals.adapter = adapter
        adapter.submitList(list)
    }

    fun hayvanListesiGetir() = listOf(
        Aslan("Mike"),
        Yarasa("Corona"),
        Penguen("Joey"),
        Papagan("Racky"),
        Fil("Chander"),
        Zurafa("Ross"),
        Timsah("Dady"),
        Yilan("Frood"),
        Fok("Betty"),
        Yunus("Jonues"),
        Kedi("Mathilda"),
        Kartal("Beşiktaş")
    )
}