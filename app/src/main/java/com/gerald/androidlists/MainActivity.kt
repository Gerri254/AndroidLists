package com.gerald.androidlists

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListView : ListView = findViewById(R.id.ListPlayers)
        //data

        val players = arrayOf("Ronaldo","Messi","Neymar","Salah","De Bruyne","Kimmich","Writz","Trent","Allison","Robertson","Cruyff",
        "Son","Kane","Virgil","Pogba","De Jong","Benardo","Halland","Nunez","Recce")
        Log.d("_PLAYERS","We have ${players.size} players")//d-debugging
        Log.d("XYZ",players[0])

        //adapter
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,players)

        //tell list which adapter to use
        myListView.adapter = adapter
        myListView.onItemClickListener = AdapterView.OnItemClickListener{_, _, position, _->
            val games = players[position]//cities(position)
            Toast.makeText(this,games,Toast.LENGTH_SHORT).show()
            Log.d( "_PLAYERS","Player that was clicked is $games")
            Log.i("_PLAYERS", "Position is  i$position")
            Log.e("_PLAYERS", "Position is e $position")
            Log.v("_PLAYERS", "Position is v $position")
            Log.wtf("_PLAYERS", "Position is wtf $position")
            Log.w("_PLAYERS", "Position is w $position")
        //v-verbose i-information d-debugging e-error message
            val intent = Intent(this,SecondActivity::class.java)

            // pass data between activities
            intent.putExtra("name",games)
            intent.putExtra("position",position)

            //open activity
            startActivity(intent)
        }
            //

    }
}