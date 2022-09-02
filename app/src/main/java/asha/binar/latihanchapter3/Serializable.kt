package asha.binar.latihanchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import asha.binar.latihanchapter3.databinding.ActivitySerializableBinding

class Serializable : AppCompatActivity() {

    private lateinit var binding: ActivitySerializableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Serializable
        intent.getSerializableExtra("PERSON")?.let {
            val person = intent.getSerializableExtra("PERSON") as MyData
            binding.tvNamaSerializable.text = "Nama saya ${person.name}, Nama Panggilan saya ${person.nickname}, usia saya sekarang adalah ${person.age} tahun, saya bertempat tinggal di ${person.address}"
        }
    }
}