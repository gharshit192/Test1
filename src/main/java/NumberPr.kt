import org.json.JSONArray

fun main() {
    println("${calculatePairOfSum(sum =5,list = mutableListOf(1,2,5),out = mutableSetOf(JSONArray()))}")
    test()
}

fun calculatePairOfSum(sum : Int, num: Int =0, list: MutableList<Int>, out: MutableSet<JSONArray>, count: Int=0)  : MutableSet<JSONArray> {
    var found = 0
    var variSum = if (num == 0) {
        sum
    } else {
        num
    }
    var xx = 0
    for (i in 1..variSum) {
        found = i
        for (j in 1..variSum) {
            if (found + j == variSum) {
                if (list.contains(found) && list.contains(j)) {
                    if ((found + j) == variSum) {
                        if ((count + variSum) == sum){
                            if (count != 0){
                                if(!out.contains(JSONArray().put(count).put(found).put(j))){
                                    out.add(JSONArray().put(count).put(found).put(j))
                                }
                            }  else{
                                if (!out.contains(JSONArray().put(found).put(j))){
                                    out.add(JSONArray().put(found).put(j))
                                }
                            }
                        }
                        xx = j
                    }
                }
                if (xx == 0) xx= j
                calculatePairOfSum(sum, xx, list, out,found)
//                midArr.forEach { out.add(it) }
//                println("$midArr")
            }
        }
    }
//    println("$out")
    return out
}

fun test(){
    val list = mutableListOf<JSONArray>()
    list.add(JSONArray())
    list.add(JSONArray().put(1).put(2).put(2))
    list.add(JSONArray().put(3).put(1).put(1))
    list.add(JSONArray().put(1).put(1).put(3))
    list.add(JSONArray().put(3).put(1).put(1))
    println(list)
val newList = mutableListOf<JSONArray>()

    list.forEach {
        if(it.contains(3) && it.contains(1) &&it.contains(1)){
            newList.add(it)
        }
    }
    println(newList)
}