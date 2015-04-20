package mx.leonet.materialdesignv4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class movies extends ActionBarActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Mis peliculas");
        setSupportActionBar(toolbar);

        List<peliculas> items = new ArrayList<>();

        items.add(new peliculas(R.mipmap.ape, "El amanecer del planeta de los simios", 4.5,2013,"Accion"));
        items.add(new peliculas(R.mipmap.sector7, "Sector 7", 4.5,2014,"Ciencia Ficcion"));
        items.add(new peliculas(R.mipmap.bichos, "Bichos", 4.2,1998,"Animacion"));
        items.add(new peliculas(R.mipmap.entrenardragon, "Como entrenar a tu dragon", 4.8,2010,"Animacion"));
        items.add(new peliculas(R.mipmap.killbill, "Kill Bill: Vol. 1", 4.1,2003,"Accion"));
        items.add(new peliculas(R.mipmap.villanofavorito, "Mi villano favorito 2", 4.6,2013,"Animacion"));
        items.add(new peliculas(R.mipmap.rush, "Rush", 4.1,2013,"Familiar"));
        items.add(new peliculas(R.mipmap.enredados, "Enredados", 4.0,2010,"Animacion"));
        items.add(new peliculas(R.mipmap.spiderman, "Spiderman 2", 4.0,2014,"Accion"));
        items.add(new peliculas(R.mipmap.samurai, "El ultimo samurai", 3.3,2003,"Accion"));



        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.movies);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new peliculaAdapter(items);
        recycler.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movies, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
