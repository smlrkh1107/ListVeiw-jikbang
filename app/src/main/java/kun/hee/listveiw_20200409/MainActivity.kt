package kun.hee.listveiw_20200409

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kun.hee.listveiw_20200409.adapters.RoomAdaper
import kun.hee.listveiw_20200409.datas.Room

class MainActivity : AppCompatActivity() {

    var mRoomAdaper:RoomAdaper? = null
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

        mRoomAdaper = RoomAdaper(this, R.layout.room_list_item, roomList)
                                    // 어느화면, 어떤List(Int), 어떤목록뿌릴래 ?
        roomListView.adapter = mRoomAdaper

        roomListView.setOnItemClickListener { parent, view, position, id ->
//          몇번줄을 눌렀는지 Toast로 출력
            Toast.makeText(this, "${position+1}번 줄 클릭", Toast.LENGTH_SHORT).show() // 첫번째줄 0이니깐.
        }

        roomListView.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this, "${position+1}번 줄을 오래 클릭.",Toast.LENGTH_SHORT).show()
            return@setOnItemLongClickListener true
        }


    }
}
