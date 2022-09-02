package asha.binar.latihanchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import asha.binar.latihanchapter3.databinding.ActivityBundleBinding

class Bundle : AppCompatActivity() {

    private lateinit var binding: ActivityBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get Data From Bundle
        intent.extras?.getString("KEY_NAMA")?.let {
            val bundle = intent.extras
            val nama = bundle?.getString("KEY_NAMA")
            val nama_panggilan = bundle?.getString("KEY_NAMAPANGGILAN")
            val usia = bundle?.getInt("KEY_USIA")
            val alamat = bundle?.getString("KEY_ALAMAT")
            binding.tvNamaBundle.text = "Nama saya $nama, Nama Panggilan saya $nama_panggilan, usia saya sekarang adalah $usia tahun, saya bertempat tinggal di $alamat"
        }

    }
}