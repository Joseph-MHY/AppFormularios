package pe.edu.idat.appformularios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import pe.edu.idat.appformularios.databinding.ActivityListadoBinding
import android.R
import android.view.View

class ListadoActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityListadoBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListadoBinding.inflate(layoutInflater);
        setContentView(binding.root)
        var listaPersona = intent.getSerializableExtra("listaPersona")
                as ArrayList<String>;
        val adapter = ArrayAdapter(applicationContext,
            R.layout.simple_list_item_1,
            listaPersona)
        binding.lvPersonas.adapter = adapter
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}