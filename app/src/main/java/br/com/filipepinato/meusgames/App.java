package br.com.filipepinato.meusgames;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.facebook.stetho.Stetho;

import br.com.filipepinato.meusgames.dao.GeneroDAO;

public class App extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        ActiveAndroid.initialize(this);

        seedGenero();
    }

    private void seedGenero(){
        GeneroDAO generoDAO = new GeneroDAO();
        if(generoDAO.findAll().size() == 0){
            generoDAO.seed();
        }
    }

}
