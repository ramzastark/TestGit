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
        // 1er Commit Develop
        // 1er Commit dev_mer
        // 2do Commit dev_mer
        // 3er Commit dev_mer
    }
}
