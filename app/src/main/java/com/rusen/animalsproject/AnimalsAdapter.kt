package com.rusen.animalsproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.rusen.animalsproject.animals.Animals
import com.rusen.animalsproject.databinding.ItemAnimalBinding

class AnimalsAdapter :
    ListAdapter<Animals, AnimalsAdapter.AnimalsViewHolder>(AnimalsDiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val binding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) =
        holder.bind(animals = getItem(position))

    inner class AnimalsViewHolder(
        private val binding: ItemAnimalBinding,
    ) : RecyclerView.ViewHolder(binding.root) {


        fun bind(animals: Animals) {
            with(binding) {
                ivAnimalImage.setImageResource(animals.resmi)
                tvAnimalTitle.text = animals.adi
            }
        }
    }

    class AnimalsDiffUtilCallBack : DiffUtil.ItemCallback<Animals>() {
        override fun areItemsTheSame(oldItem: Animals, newItem: Animals): Boolean {
            return oldItem.adi == newItem.adi
        }

        override fun areContentsTheSame(oldItem: Animals, newItem: Animals): Boolean {
            return oldItem == newItem
        }
    }
}