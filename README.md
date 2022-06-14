# Scala Functionalities
https://ciena.percipio.com/search?categories=Course&q=scala

## Overview
* Scala is pure object-oriented
* Every function is object
* is immutable language by nature
* doesn't have any primitive types like int, long etc
* doesn't have Static method/class/object
* Function is the first class citizen

### Functions vs Method
* Functions - is a group of statements that execute together to perform a specific task &
can be created as a complete object
* Method - is a function that defined as member of specific object

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
* allow creation of singleton object without static keyword
* provides `object` keyword to create singleton. 

## Companion Object
* Scala has companion object and class, so that they can access each other private members
* both declared in same file
* both name must be same
* companion object provides multiple factory methods to work on class like factory, clone etc.

## Scala Traits
* 
## Functional Programming
[Functional Concept in Scala](src/main/scala/functional/programming/functional.md)

## Pattern Matching
pattern matching is done through case & it can compare any type.

### Case Classes
* object are created without `new` keyword.
* case classes are standard class fit for match expression
* generate getters, setter, toString, hashcode, equals automatically
* generate factory method `apply` & `unapply` used for match expression
* generate `copy` method for cloning purpose
* 

## Failure
Scala.Try success/failure

## Parallel computation
## Collections
## Concurrency





