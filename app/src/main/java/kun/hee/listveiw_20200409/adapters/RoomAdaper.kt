package kun.hee.listveiw_20200409.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextClock
import android.widget.TextView
import kun.hee.listveiw_20200409.R
import kun.hee.listveiw_20200409.datas.Room
import kotlin.math.floor

class RoomAdaper(context:Context, resId:Int, list:ArrayList<Room>) : ArrayAdapter<Room>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


     //converView 함수가 nill일수도 있지 > inf정의
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView //바로 변수를 converView를 넣을 수 없음. 변수 새로 정의.
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!  // !! 는 tempRow가 절대 null이 아니야!
         // row 변수를 이용하여 각 줄에 맞는 Data 가공.


         //XML에 있는 뷰들을 변수로 담기. findViewById
         val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
         val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
         val descTxt = row.findViewById<TextView>(R.id.descTxt)

         //근거 데이터 변수 추출. => 각 위치에 맞는 데이터를 mList에서 가져오기.
         val data = mList.get(position) //1번째는 0

//         가격이 1만 이상이면 ??억 ? 이렇게 나오기.
         if (data.price >= 10000) {
             if (data.price%10000 == 0){ priceTxt.text = "${data.price/10000}억"}
             else  priceTxt.text = "${data.price/10000}억 ${String.format("%,d", data.price%10000)}" }
         else priceTxt.text = String.format("%,d", data.price)

//        주소와 층수=> "주소, 층수(상황마다 다른값)"
        var floorStr = ""
             if(data.floor == 0) {floorStr = "반지하"}
             else if (data.floor > 0) {floorStr = "${data.floor}층"}
             else "지하 ${data.floor}층"
              addressAndFloorTxt.text = "${data.address}, ${floorStr}"

//         설명은 그냥 있는 그대로 대입.
         descTxt.text = data.desc





        return row
    }

}