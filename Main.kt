fun main(args: Array<String>) {
    var listA = listOf("Red", "Green", "Blue", "Yellow", "White")
    println("List A : $listA")
    var listB = listOf("Red", "Green", "Black", "White", "Yellow")
    println("List B : $listB")
    for (name in listA) {
        if (name in listA == name in listB) {
            var c = listOf<String>("Yes")
            print("$c")
        } else {
            var c = listOf<String>("No")
            print("$c")
        }
    }
}