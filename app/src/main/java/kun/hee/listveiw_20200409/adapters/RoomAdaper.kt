package kun.hee.listveiw_20200409.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kun.hee.listveiw_20200409.R
import kun.hee.listveiw_20200409.datas.Room

class RoomAdaper(context:Context, resId:Int, list:ArrayList<Room>) : ArrayAdapter<Room>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


                                        //converView 함수가 nill일수도 있지 > inf정의
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView  //바로 변수를 converView를 넣을 수 없음. 변수 새로 정의.
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!  // !! 는 tempRow가 절대 null이 아니야!
         // row 변수를 이용하여 각 줄에 맞는 Data 가공.

        return row
    }

}