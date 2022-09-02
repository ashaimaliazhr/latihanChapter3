package asha.binar.latihanchapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import asha.binar.latihanchapter3.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener{
            val intent = Intent(this, ManualData:: class.java)
            intent.putExtra("KEY_NAME", "Asha Imalia Zahra")
            intent.putExtra("KEY_NICKNAME", "Asha")
            intent.putExtra("KEY_AGE", 19)
            intent.putExtra("KEY_ADDRESS", "LAMPUNG")
            startActivity(intent)
        }

        binding.button3.setOnClickListener{
            val intent = Intent(this, asha.binar.latihanchapter3.Bundle::class.java)
            val bundle = Bundle()
            bundle.putString("KEY_NAMA", "Asha Imalia Zahra")
            bundle.putString("KEY_NAMAPANGGILAN", "Asha")
            bundle.putInt("KEY_USIA", 19)
            bundle.putString("KEY_ALAMAT", "LAMPUNG")
            intent.putExtras(bundle)
            startActivity(intent)
        }

        binding.button4.setOnClickListener {
            val intent = Intent(this, Serializable::class.java)
            val person = MyData("Asha Imalia Zahra", "Asha", 19, "Lampung")
            intent.putExtra("PERSON", person)
            startActivity(intent)

        }

        binding.button5.setOnClickListener{
            val intent = Intent(this, Parcelable::class.java)
            val data = DataDua("Asha Imalia Zahra", "Asha",19,"LAMPUNG")
            intent.putExtra("DATA", data)
            startActivity(intent)
        }
    }
}