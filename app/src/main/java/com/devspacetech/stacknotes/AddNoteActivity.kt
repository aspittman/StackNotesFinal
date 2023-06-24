package com.devspacetech.stacknotes

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.devspacetech.stacknotes.databinding.ActivityAddNoteBinding


class AddNoteActivity: AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding
//    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //First toolbar
        val addNoteToolbar: Toolbar = binding.addNoteToolbar
        setSupportActionBar(addNoteToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Make a New Note :D"
        //Add color here
        //Second toolbar
        val typeSelectionToolbar: Toolbar = binding.typeSelectionToolbar
        typeSelectionToolbar.inflateMenu(R.menu.type_selections_menu)
        typeSelectionToolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.test_show ->  {
                    Toast.makeText(this, "This is a menu test", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    super.onOptionsItemSelected(menuItem)
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.add_menu_save -> {
            Toast.makeText(this, "Yay", Toast.LENGTH_SHORT).show()
//            try {
//                val file = File("test");
//                editText = binding.addNoteEdittext
//                val text = editText.text.toString()
//
//                FileOutputStream(file).use {
//                    fos -> OutputStreamWriter(fos, Charsets.UTF_8).use {
//                        osw -> BufferedWriter(osw).use {
//                        bf -> bf.write(text)
//                        bf.close() }
//                }
//                }
//                Toast.makeText(this, "Note Saved", Toast.LENGTH_LONG).show()
//            } catch (t: Throwable) {
//                Toast.makeText(this, "Exception: $t", Toast.LENGTH_LONG).show();
//            }
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.save_note_menu, menu)
        return true
    }
}