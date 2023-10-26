package generics

/**
 * main function allow
 * creation of the instances of the concrete classes
 * 
 */
fun main() {
    // create the objects of the class
    val objCat: Cat = Cat("Yellow Local Cat")
    val obj2Cat = Cat("White Colored Cat")
    // the fish object
    val obj1Fish = Fish("Tilapia")
    val objFish = Fish("Shark")

    // the dog objects
    val objDog = Dog("German-Shepherd")
    val obj1Dog = Dog("Lion-Dogs")
    // the contest class
    val catContest = Contest<Cat>()
    val dogContest = Contest<Dog>()
    val fishContest = Contest<Fish>()
    catContest.addScore(objCat, 34)
    fishContest.addScore(objFish, 345)
    dogContest.addScore(objDog, 32)
    val topAnimal = catContest.getWinners().first()
    val top1Animal = fishContest.getWinners().first()
    val topAnima = dogContest.getWinners().first()
    println("The top animal is ${topAnimal.name}")
    println("The Animal is ${top1Animal.name}")
    println("The best animal is ${topAnima.name}")

    // the petContest that will hold all the animals
    val petContest = Contest<Pet>()
    petContest.addScore(objCat, 45)
    petContest.addScore(obj1Fish, 50)
    petContest.addScore(obj1Dog, 67)
    val topWinner = petContest.getWinners().first()
    println("The top pet is ${topWinner.name}")

}