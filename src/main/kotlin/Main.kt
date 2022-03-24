fun main(args: Array<String>) {
    var listA = listOf("Red", "Green", "Blue", "Yellow", "White")
    print("List A : $listA")
    println()
    var listB = listOf("Red", "Green", "Black", "White", "Yellow")
    print("List B : $listB")
    for (name in listA) {
        for (name in listB){
            var c = mutableListOf<String>()
            if (name in listA == name in listB){
                c.add("Yes")
            }else{
                c.add("No")
            }
        }
    }
}
