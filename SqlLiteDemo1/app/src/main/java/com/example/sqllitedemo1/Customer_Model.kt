package com.example.sqllitedemo1 // Package declaration: Organizes your code into a package

class CustomerModel(id: Int,name: String, age: Int, active: Boolean) {
    // Class definition: Defines a class named CustomerModel
    // Primary constructor: Takes id, name, age, and active as parameters

    var id: Int? = id
    // Property declaration: Defines a mutable property named'id' of type Int? (nullable Int)
    // Initialization: Assigns the value of the 'id' parameter to the property

    var name: String? = name
    // Property declaration: Defines a mutable property named 'name' of type String? (nullable String)
    // Initialization: Assigns the value of the 'name' parameter to the property

    var age: Int? = age
    // Property declaration: Defines a mutable property named 'age' of type Int? (nullable Int)
    // Initialization: Assigns the value of the 'age' parameter to theproperty

    var active: Boolean? = active
    // Property declaration: Defines a mutable property named 'active' of type Boolean? (nullable Boolean)
    // Initialization: Assigns the value of the 'active' parameter to the property
}