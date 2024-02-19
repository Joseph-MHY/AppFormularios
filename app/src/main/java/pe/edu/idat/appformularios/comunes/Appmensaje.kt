package pe.edu.idat.appformularios.comunes

import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import pe.edu.idat.appformularios.R

object Appmensaje {
    fun enviarMensaje(vista: View, mensaje: String,tipoMensaje: TipoMensaje){
        val snackBar = Snackbar.make(vista,mensaje,Snackbar.LENGTH_LONG);
        val snackBarView: View = snackBar.view;
        if (tipoMensaje == TipoMensaje.ERROR){
            snackBar.setBackgroundTint(
                ContextCompat.getColor(MiApp.instace,
                R.color.errorColor)
            )
        } else {
            snackBar.setBackgroundTint(
                ContextCompat.getColor(MiApp.instace,
                    R.color.winColor)
            )
        }
        snackBar.show();
    }
}