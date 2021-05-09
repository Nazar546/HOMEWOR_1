package space.example.homewor_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var Text1: TextView
    lateinit var Edit: EditText
    lateinit var Button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Text1 = findViewById(R.id.Text2) as TextView
        Edit = findViewById(R.id.EditText) as EditText
        Button1 = findViewById(R.id.button) as Button
     Button1.setOnClickListener({
         Text1.text = Edit.text
     })
    }
    fun onClickStart(image:View){
        image as ImageView
        image.setImageResource(R.drawable.smile)
    }
}