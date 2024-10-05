package com.example.towerofgod.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.towerofgod.R
import com.example.towerofgod.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_FACTION = "extra_faction"
        const val EXTRA_POSITION = "extra_position"
        const val EXTRA_RANK = "extra_rank"
        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_ATTRIBUTE = "extra_attribute"
        const val EXTRA_SHINSU = "extra_shinsu"
        const val EXTRA_GENDER = "extra_gender"
        const val EXTRA_SPECIES = "extra_species"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_PHOTOCHAR = "extra_photochar"
        const val EXTRA_PHOTOFACTION = "extra_photofaction"
        const val EXTRA_BGCHAR = "extra_bgchar"
    }

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val charName = intent.getStringExtra(EXTRA_NAME)
        val charDesc = intent.getStringExtra(EXTRA_DESCRIPTION)
        val charFaction = intent.getStringExtra(EXTRA_FACTION)
        val charPosition = intent.getStringExtra(EXTRA_POSITION)
        val charRank = intent.getStringExtra(EXTRA_RANK)
        val charType = intent.getStringExtra(EXTRA_TYPE)
        val charAtt = intent.getStringExtra(EXTRA_ATTRIBUTE)
        val charShinsu = intent.getStringExtra(EXTRA_SHINSU)
        val charGender = intent.getStringExtra(EXTRA_GENDER)
        val charSpecies = intent.getStringExtra(EXTRA_SPECIES)
        val charAge = intent.getStringExtra(EXTRA_AGE)
        val charPhoto = intent.getIntExtra(EXTRA_PHOTOCHAR, 0)
        val charFactionPhoto = intent.getIntExtra(EXTRA_PHOTOFACTION, 0)
        val charBgphoto = intent.getIntExtra(EXTRA_BGCHAR, 0)

        binding.tvDetailNameChar.text = charName
        binding.tvDetailDescriptionChar.text = charDesc
        binding.tvDetailFactionChar.text = charFaction
        binding.tvDetailPositionChar.text = charPosition
        binding.tvDetailRankChar.text = charRank
        binding.tvDetailTypeChar.text = charType
        binding.tvDetailAttributeChar.text = charAtt
        binding.tvDetailShinsuChar.text = charShinsu
        binding.tvDetailGenderChar.text = charGender
        binding.tvDetailSpeciesChar.text = charSpecies
        binding.tvDetailAgeChar.text = charAge
        binding.civDetailPhotoChar.setImageResource(charPhoto)
        binding.ivDetailFactionPhoto.setImageResource(charFactionPhoto)
        binding.ivDetailPhoto.setImageResource(charBgphoto)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}