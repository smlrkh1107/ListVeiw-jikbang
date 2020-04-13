package kun.hee.listveiw_20200409.datas

class Room(price:Int, address:String, floor:Int, desc:String) {
    var price = price // 이름같아도 에러없지롱 ==> MainActivity 코드 아무것도 안넣으면 오류나
    var address = address
    var floor = floor //1~ 층수. 0층 : 반지하, -2.. 지하 2층
    var desc = desc

}