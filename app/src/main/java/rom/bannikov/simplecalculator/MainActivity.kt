package rom.bannikov.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import rom.bannikov.simplecalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun setTextFields(string: String) = with(binding){
        tvMathOperation.append(string)
    }
}