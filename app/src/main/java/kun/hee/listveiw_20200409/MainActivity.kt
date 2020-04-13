package kun.hee.listveiw_20200409

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kun.hee.listveiw_20200409.datas.Room

class MainActivity : AppCompatActivity() {

    val roomList = ArrayList<Room>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //ListView의 5번해당~
        roomList.add(Room(12000, "서울시 영등포구", 3, "오피스텔")) //Room뒤뒤  () =>생성자 호출
        roomList.add(Room(8000, "서울시 은평구", 4, "연립주택"))
        roomList.add(Room(22000, "경기도 수원시", 8, "다세대주택"))
        roomList.add(Room(17000, "서울시 성북구", 15, "아파트"))
        roomList.add(Room(10000, "경기도 남양주시", 0, "단독주택"))
        roomList.add(Room(5500, "서울시 광진구", -1, "오피스텔"))

    }
}
