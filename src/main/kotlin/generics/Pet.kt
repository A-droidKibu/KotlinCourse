package generics

/**
 * created the abstract class Pet with a name property
 * created the concrete subtypes of class pet
 * namely Fish, Cat, Dog
 * the subtypes inherits the property from their Superclass
 */
abstract class Pet (var name: String)
class Fish(name: String) : Pet(name)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)