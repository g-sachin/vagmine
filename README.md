# Scala Functionalities


## Overview
* Scala is pure object-oriented
* Every function is an object
* is an immutable language by nature
* doesn't have any primitive types like int, long, etc
* doesn't have Static method/class/object
* Function is the first-class citizen

### Functions vs Method
* Functions - a group of statements that execute together to perform a specific task &
can be created as a complete object
* Method - is a function that defined as a member of a specific object

## Scala Data Types
*  Value Types:
    - Numeric types
      - Scala.Int
      - Scala.Float
      - Scala.Double
      - Scala.Byte
      - Scala.Char
      - Scala.Long
      - Scala.short
    - Non-Numeric Types
      - Scala.Boolean
      - Scala.Unit

## Scala Objects
* Scala.Any
     - Scala.AnyVal
       - Scala.Double
       - Scala.Float
       - Scala.Long
       - Scala.Int
       - Scala.Short
       - Scala.Byte
       - Scala.Char
       - Scala.Boolean
       - Scala.Unit
     - Scala.AnyRef
* Scala.Null
* Scala.Nothing

## Singletons
* allow the creation of singleton objects without the static keyword
* provides an `object` keyword to create a singleton. 

## Companion Object
* Scala has companion objects and class so that they can access each other private members
* both declared in the same file
* both names must be the same
* companion object provides multiple factory methods to work on classes like factory, clone, etc.

## Scala Traits
* 
## Functional Programming
[Functional Concept in Scala](src/main/scala/functional/programming/functional.md)

## Pattern Matching
pattern matching is done through case & it can compare any type.

### Case Classes
* objects are created without the `new` keyword.
* case classes are standard classes fit for a match expression
* generate getters, setters, toString, hashcode, equals automatically
* generate factory method `apply` & `unapply` used for match expression
* generate a `copy` method for cloning purposes
* 

## Failure
Scala.Try success/failure

## Parallel computation
[Parallel Programming in Scala](src/main/scala/parallel/computation/parallelprogramming.md)
## Collections
## Concurrency





