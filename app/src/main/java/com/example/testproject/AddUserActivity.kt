package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.network.NetworkConfig
import io.swagger.client.api.UsersApi
import io.swagger.client.model.User
import io.swagger.client.model.UserData
import io.swagger.client.model.UsersAnswer
import io.swagger.client.model.UsersAnswerMeta
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AddUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        val button_submit: Button = findViewById(R.id.button_submit)
        button_submit.setOnClickListener {
            var name = findViewById(R.id.userName) as EditText
            var email = findViewById(R.id.userEmail) as EditText
            var gender = findViewById(R.id.userGender) as EditText
            var status = findViewById(R.id.userStatus) as EditText
            createUser(name.text.toString(), email.text.toString(), gender.text.toString(), status.text.toString())
            finish()
            //val intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
        }
    }

    fun createUser(name: String, email:String, gender: String, status: String){
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(NetworkConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UsersApi::class.java)

        val newUser = UserData()
        newUser.name = name
        newUser.email = email
        newUser.gender = gender
        newUser.status = status
        val retrofitData = retrofitBuilder.createNewUser(newUser, "Bearer 09066c31e1c30471eaccd42b96df44e7fe7c7873573aa571f111c5dce56dc2cb")
        retrofitData.enqueue(object: Callback<User> {
            override fun onFailure(call: Call<User>, t: Throwable) {
                Toast.makeText(this@AddUserActivity, "Failed create", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<User>, response: Response<User>) {
                if(response.isSuccessful){
                    val responseBody = response.body()!!
                    Toast.makeText(this@AddUserActivity, "Successful create with id: " + responseBody.data?.id, Toast.LENGTH_SHORT).show()
                }
            }

        })
    }
}
