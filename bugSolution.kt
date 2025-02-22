```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    // removeIf removes elements that satisfy the predicate
    list.removeIf { it > 2 } 
    println("removeIf: " + list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    // removeAll removes elements that are present in the collection specified by the predicate
    list2.removeAll { it > 2 }
    println("removeAll: " + list2) // Output: [1, 2]

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    // retainAll retains only elements that satisfy the predicate
    list3.retainAll { it <= 2 }
    println("retainAll: " + list3) // Output: [1, 2]
    // Safer alternative: using filter and toMutableList
    val list4 = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list4.filter { it <=2 }.toMutableList()
    println("Safer alternative: " + filteredList) //Output: [1,2]
}
```