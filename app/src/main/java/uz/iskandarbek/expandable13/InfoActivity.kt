package uz.iskandarbek.expandable13

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {

    private lateinit var detailTextView: TextView
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val name: TextView = findViewById(R.id.item_name)
        detailTextView = findViewById(R.id.item_detail_text)

        val itemName = intent.getStringExtra("item_name")
        val itemDetail = intent.getStringExtra("item_detail")

        if (itemName != null) {
            name.text = itemName
        }

        if (itemDetail != null) {
            // Start the typing animation
            typeText(itemDetail, 10L)
        }
    }

    private fun typeText(text: String, delay: Long) {
        detailTextView.text = ""
        val textArray = text.toCharArray()
        var index = 0

        val runnable = object : Runnable {
            override fun run() {
                if (index < textArray.size) {
                    detailTextView.append(textArray[index].toString())
                    index++
                    handler.postDelayed(this, delay)
                }
            }
        }
        handler.post(runnable)
    }
}
