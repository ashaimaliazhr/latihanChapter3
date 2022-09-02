package asha.binar.latihanchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import asha.binar.latihanchapter3.databinding.ActivityParcelableBinding

class Parcelable : AppCompatActivity() {

    private lateinit var binding: ActivityParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.getParcelableExtra<DataDua>("DATA")?.let {
            val data = intent.getParcelableExtra<DataDua>("DATA")
            binding.tvNamaParcel.text =
                "Nama saya ${data!!.name}, Nama Panggilan saya ${data!!.nickname}, usia saya sekarang adalah ${data.age} tahun, saya bertempat tinggal di ${data.address}"
        }
    }
}