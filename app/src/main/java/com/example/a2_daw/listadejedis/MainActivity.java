package com.example.a2_daw.listadejedis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewJedis;
    ArrayList<String> mListajedis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewJedis = (ListView) findViewById(R.id.list_view_jedis);

        localJedis();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item_jedi,
                R.id.text_jedi,
                mListajedis
        );

        listViewJedis.setAdapter(adapter);

    }

    private void localJedis() {
        mListajedis.add("Luke");
        mListajedis.add("Rajivari†");
        mListajedis.add("Garon Jard");
        mListajedis.add("Cala Brin");
        mListajedis.add("Ters Sendon");
        mListajedis.add("Nomi Sunrider");
        mListajedis.add("Kavar†");
        mListajedis.add("Zez-Kai Ell†");
        mListajedis.add("Vrook Lamar†");
        mListajedis.add("Loona Vash†");
        mListajedis.add("Vandar Tokare†");
        mListajedis.add("Dorjander Kace");
        mListajedis.add("Lucien Draay");
        mListajedis.add("Mical");
        mListajedis.add("Belth Allusis†");
        mListajedis.add("Otegω");
        mListajedis.add("Nikil Nobil");
        mListajedis.add("Wens Aleusis");
        mListajedis.add("Oric Traless");
        mListajedis.add("Giffis Fane");
        mListajedis.add("Syo Bakarn");
        mListajedis.add("Jaric Kaedan†");
        mListajedis.add("Bela Kiwiiks");
        mListajedis.add("Orgus Din†");
        mListajedis.add("Tol Braga");
        mListajedis.add("Shol Bestros");
        mListajedis.add("Barsen'thor");
        mListajedis.add("Yaddle†");
        mListajedis.add("Oppo Rancisis†");
        mListajedis.add("Omo Bouri†");
        mListajedis.add("Tor Difusal");
        mListajedis.add("Thame Cerulian†");
        mListajedis.add("T'un");
        mListajedis.add("Tyvokka†");
        mListajedis.add("Mace Windu†");
        mListajedis.add("Yarael Poof†");
        mListajedis.add("Micah Giiett†");
        mListajedis.add("Saesee Tiin†");
        mListajedis.add("Even Piell†");
        mListajedis.add("Eeth Kothω");
        mListajedis.add("Adi Gallia†");
        mListajedis.add("Plo Koon†");
        mListajedis.add("Depa Billabaω");
        mListajedis.add("Ki-Adi-Mundi†");
        mListajedis.add("Coleman Trebor†");
        mListajedis.add("Shaak Ti†");
        mListajedis.add("Kit Fisto†");
        mListajedis.add("Obi-Wan Kenobi†");
        mListajedis.add("Agen Kolar†");
        mListajedis.add("Coleman Kcajω");
        mListajedis.add("Stass Allie†");
        mListajedis.add("Barratk'I");
        mListajedis.add("Cilghal");
        mListajedis.add("Kyp Durron");
        mListajedis.add("Corran Horn");
        mListajedis.add("Mara Jade Skywalker†");
        mListajedis.add("Kyle Katarn");
        mListajedis.add("Tresina Lobi†");
        mListajedis.add("Octa Ramis");
        mListajedis.add("Jaina Solo Fel");
        mListajedis.add("Kam Solusar");
        mListajedis.add("Kol Skywalker†");
        mListajedis.add("T'raa Saaω†");
        mListajedis.add("Tili Qua");
        mListajedis.add("K'Kruhkω");
    }

}
