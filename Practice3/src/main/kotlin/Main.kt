fun main(args: Array<String>) {
   
//1.
    val myAge = 18
    val isTeenager = 13<myAge && myAge<19
    println(isTeenager)
    //
//2.
    val theirAge = 30
    val bothTeenagers = myAge<=19 && theirAge<=19
    println(bothTeenagers)
    //
//3.
    val reader = "Canya"
    val author = "Richard Lucas"
    val authorIsReader = reader== author
    println(authorIsReader)
    //
//4.
    val readerBeforeAuthor = reader<author
    println(readerBeforeAuthor)
    //
//5.
    val myAge2 =45
    val myAge3 = if (myAge2<19) {
        "Teenager"
    }else if (myAge2>13){
        "No teenager"
    }else if (myAge2>19){
    }else{
        "No teenager"
    }
    println(myAge3)
    //
//6.
    val answer= if(myAge2<19) myAge2 else 19
    println(answer)
    //

//7.
    var counter = 0
    while (counter < 10){
        counter = counter+1
        println(counter)
    }
    //



}