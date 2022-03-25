fun main(args: Array<String>) {
    var listA = listOf("Red", "Green", "Blue", "Yellow", "White")
    println("List A : $listA")
    var listB = listOf("Red", "Green", "Black", "White", "Yellow")
    println("List B : $listB")
    var newList= mutableListOf<String>()
    for (name in listA) {
        if (name in listA == name in listB) {
            newList.add("Yes")
        } else {
            newList.add("No")
        }
    }
    print("$newList")
}