package com.example.hackaton


import android.content.Context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_myifo.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MyifoActivity : AppCompatActivity() {

    val rank_url = Constants.BASE_URL + "/users/rank"
    val quiz_url = Constants.BASE_URL + "/quizzes"
    val rankList: ArrayList<Rank> = arrayListOf()

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myifo)

//        nickname_myifo.text="test9"
//        loadList()
    }
//   fun loadList(){
//       var id = "test9"
//       val recycler_view = recyclerView
//
//       (application as MasterApplication).service.load(
//           id
//       ).enqueue(object : Callback<RankList>{
//           override fun onFailure(call: Call<RankList>, t: Throwable) {
//               Log.d("aaa","onFail")
//               //Toast.makeText(this@MyifoActivity,"load_fail1",Toast.LENGTH_SHORT).show()
//           }
//
//           override fun onResponse(call: Call<RankList>, response: Response<RankList>) {
//               if(response.isSuccessful) {
//                   val list = response.body()
//                   Log.d("aaa","suc")
////                   Log.d("aaa",list?.rankList?.get(0).toString())
//               }else{
//                   Log.d("aaa","else")
//                   //Toast.makeText(this@MyifoActivity,"load_fail2",Toast.LENGTH_SHORT).show()
//               }
//
//           }
//       })
//   }
//        val nickname = id.text.toString()
//        val password = pw.text.toString()
//
//        if(nickname==""){
//            Toast.makeText(this@LoginActivity, "아이디를 입력해주세요", Toast.LENGTH_LONG).show()
//        }else if(password==""){
//            Toast.makeText(this@LoginActivity, "비밀번호를 입력해주세요", Toast.LENGTH_LONG).show()
//        }else{
//            val body = HashMap<String, String>()
//            body.put("nickname", nickname)
//            body.put("password", password)
//
//
//            (application as MasterApplication).service.login(
//                body
//            ).enqueue(object : Callback<Test> {
//                override fun onFailure(call: Call<Test>, t: Throwable) {
//                    Toast.makeText(this@LoginActivity, "로그인에 실패했습니다", Toast.LENGTH_LONG).show()
//                }
//
//                override fun onResponse(call: Call<Test>, response: Response<Test>) {
//                    if (response.isSuccessful) {
//                        val user = response.body()
//
//                        Log.d("test11",user?.nickname)
//                        val token = response.headers().get("X-AUTH-TOKEN").toString()
//
//                        Log.d("user", user.toString())
//
//                        if(token=="null"){
//                            Toast.makeText(this@LoginActivity, "아이디, 비밀번호가 틀립니다.", Toast.LENGTH_LONG).show()
//                        }
//                        else{
//                            saveUserToken(token, this@LoginActivity)
//                            (application as MasterApplication).createRetrofit()
//                            //username을 반환하는지 test
//                            Toast.makeText(this@LoginActivity, "환영합니다!" + "${user?.nickname}", Toast.LENGTH_LONG).show()
//                            startActivity (
//                                // Intent(this@SignInActivity, SearchActivity::class.java)
//                                Intent(this@LoginActivity, MyifoActivity::class.java)
//                            )
//                        }
//
//                    }
//                }
//            })
//        }
//
//
//    }





}





