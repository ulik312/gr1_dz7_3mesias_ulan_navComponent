package com.example.gr1_dz7_3mesias_ulan_navcomponent

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.gr1_dz7_3mesias_ulan_navcomponent.databinding.ItemCharacterBinding
import com.example.gr1_dz7_3mesias_ulan_navcomponent.CharacterModel

class CharactersAdapter(
    private val list: List<CharacterModel>,
    private val onClick: (character: CharacterModel) -> Unit
) : Adapter<CharactersAdapter.CharactersViewHolder>() {

    private val id = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        return CharactersViewHolder(
            ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class CharactersViewHolder(private val binding: ItemCharacterBinding) :
        ViewHolder(binding.root) {
        fun onBind(characterModel: CharacterModel) {
            // Связываем item'ку с данными
            binding.imCharacter.setImageResource(characterModel.image)
            binding.tvCharacterStatus.text = characterModel.status
            binding.tvCharacterName.text = characterModel.name


            // При нажатии на айтемку в RecyclerView, передаем модельку
            binding.root.setOnClickListener {
                onClick(list[adapterPosition])
            }
        }
    }
}