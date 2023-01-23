package com.example.opationmenudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //var inflet : MenuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_eample,menu)
        //inflet.inflate(R.menu.menu_eample,menu)
        return true
    }
    /**override fun onCreateContextMenu(menu: ContextMenu, v: View,
                                     menuInfo: ContextMenu.ContextMenuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_eample, menu)
    }*/


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId)
        {
            R.id.item_search->{
                Toast.makeText(applicationContext,"Search Click",Toast.LENGTH_LONG).show()
                true
            }
            R.id.item_more->{
                Toast.makeText(applicationContext,"More Click",Toast.LENGTH_LONG).show()
                true

            }
            R.id.subitem_1->{
                Toast.makeText(applicationContext,"Subitem1 Click",Toast.LENGTH_LONG).show()
                true
            }
            R.id.subitem_2->{
                Toast.makeText(applicationContext,"Subitem2 Click",Toast.LENGTH_LONG).show()
                true
            }
            R.id.item_exit->{
                finish()
                true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }

}