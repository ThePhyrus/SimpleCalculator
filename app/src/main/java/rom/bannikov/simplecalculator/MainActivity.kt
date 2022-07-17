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



        binding.btnNumber0.setOnClickListener { setTextFields(getString(R.string.number_0)) }
        binding.btnNumber1.setOnClickListener { setTextFields(getString(R.string.number_1)) }
        binding.btnNumber2.setOnClickListener { setTextFields(getString(R.string.number_2)) }
        binding.btnNumber3.setOnClickListener { setTextFields(getString(R.string.number_3)) }
        binding.btnNumber4.setOnClickListener { setTextFields(getString(R.string.number_4)) }
        binding.btnNumber5.setOnClickListener { setTextFields(getString(R.string.number_5)) }
        binding.btnNumber6.setOnClickListener { setTextFields(getString(R.string.number_6)) }
        binding.btnNumber7.setOnClickListener { setTextFields(getString(R.string.number_7)) }
        binding.btnNumber8.setOnClickListener { setTextFields(getString(R.string.number_8)) }
        binding.btnNumber9.setOnClickListener { setTextFields(getString(R.string.number_9)) }

        binding.btnOpenBracket.setOnClickListener { setTextFields(getString(R.string.open_bracket)) }
        binding.btnCloseBracket.setOnClickListener { setTextFields(getString(R.string.close_bracket)) }
        binding.btnDivision.setOnClickListener { setTextFields(getString(R.string.division)) }
        binding.btnMultiplication.setOnClickListener { setTextFields(getString(R.string.multiplication)) }
        binding.btnAddition.setOnClickListener { setTextFields(getString(R.string.addition)) }
        binding.btnSubtraction.setOnClickListener { setTextFields(getString(R.string.subtraction)) }
        binding.btnPoint.setOnClickListener { setTextFields(getString(R.string.point)) }

        binding.btnResult.setOnClickListener { setTextFields(getString(R.string.result)) }



        binding.btnBack.setOnClickListener {
            val string = binding.tvMathOperation.toString()
            if (string.isNotEmpty()) binding.tvMathOperation.text =
                string.substring(0, string.length - 1)
            binding.tvResult.text = "" //todo test!
        }

        binding.btnClear.setOnClickListener {
            binding.tvMathOperation.text = ""
            binding.tvResult.text = ""
        }

    }

    private fun setTextFields(string: String) = with(binding) {
        tvMathOperation.append(string)
    }
}