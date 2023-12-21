package com.rusen.animalsproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.databinding.ItemAnimalBinding

class AnimalsAdapter(
    private val onAnimalsClick: (Animals) -> Unit
) : ListAdapter<Animals, AnimalsAdapter.AnimalsViewHolder>(AnimalsDiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val binding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalsViewHolder(binding, onAnimalsClick)

    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) =
        holder.bind(animals = getItem(position))

    inner class AnimalsViewHolder(
        private val binding: ItemAnimalBinding,
        private val onAnimalsClick: (Animals) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {


        fun bind(animals: Animals) {
            with(binding) {
                ivAnimalImage.setImageResource(animals.picture)
                tvAnimalTitle.text = animals.name
                root.setOnClickListener {
                    onAnimalsClick(animals)
                }
            }
        }
    }

    class AnimalsDiffUtilCallBack : DiffUtil.ItemCallback<Animals>() {
        override fun areItemsTheSame(oldItem: Animals, newItem: Animals): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Animals, newItem: Animals): Boolean {
            return oldItem == newItem
        }
    }
}