package asha.binar.latihanchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import asha.binar.latihanchapter3.databinding.ActivityManualDataBinding

class ManualData : AppCompatActivity() {

    private lateinit var binding: ActivityManualDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManualDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Get Data
        intent.getStringExtra("KEY_NAME")?.let {
            val name = intent.getStringExtra("KEY_NAME")
            binding.tvNamaManualData.text = "Nama Saya $name"
        }
        intent.getStringExtra("KEY_NICKNAME")?.let {
            val nickname = intent.getStringExtra("KEY_NICKNAME")
            binding.tvNicknameManualData.text = "Nama Panggilan $nickname"
        }
        intent.getIntExtra("KEY_AGE",19)?.let {
            val age = intent.getIntExtra("KEY_AGE", 19)
            binding.tvAgeManualData.text = "Umur Saya $age"
        }
        intent.getStringExtra("KEY_ADDRESS")?.let {
            val address = intent.getStringExtra("KEY_ADDRESS")
            binding.tvAddressManualData.text = "Alamat Saya $address"
        }
    }
}