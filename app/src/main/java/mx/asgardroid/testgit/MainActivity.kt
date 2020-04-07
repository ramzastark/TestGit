package mx.asgardroid.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Main", "Main")
        Log.d("Main", "siguiente Commit en Main")

        Log.d("Main", "Dante Dev")
        // 1er Commit Dante
        // 2do Commit Dante
        // 3ro Commit Dante
    }
}
