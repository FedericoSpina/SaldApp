package app.mobile.saldapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.LoginButton)

        loginButton.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "12345") {
                Toast.makeText(this@MainActivity, "Login Successful!", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this@MainActivity, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
