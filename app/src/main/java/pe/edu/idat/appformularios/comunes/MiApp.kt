package pe.edu.idat.appformularios.comunes

import android.app.Application

class MiApp : Application() {
    companion object{
        lateinit var instace: MiApp;
    }
    override fun onCreate() {
        super.onCreate()
        instace = this;
    }
}