[![CircleCI](https://circleci.com/gh/springframeworkguru/sfg-pet-clinic.svg?style=svg)](https://circleci.com/gh/springframeworkguru/sfg-pet-clinic)

# Spring Framework Guru Pet Clinic

This repo is for my online course called [Spring Framework 5: Beginner to Guru](https://www.udemy.com/spring-framework-5-beginner-to-guru/?couponCode=GITHUB_SFGPETCLINIC).

Contained in this repo is an opinionated version of the classic reference application - [Spring Pet Clinic](https://github.com/spring-projects/spring-petclinic)

# Package Structure

    services package
    |
    |_ CrudService              » A basic CRUD interface, the holy mother of them all.
    |
    |_ OwnerService            \
    |_ PetService               | » Basic service interfaces for each model of the application that extend CrudService     
    |_ VetService              /
    |
    |_ map package              » The services here will use an in-memory Map for the data.
    |  |
    |  |_ AbstractMapService    » This abstract class declares the Map<ID, T> using Java Generics and implements all the methods.
    |  |
    |  |_ OwnerServiceMap      \
    |  |_ PetServiceMap         | » Concrete classes that extend from the AbstractMapService and implement its own basic service interface from the directory above. 
    |  |_ VerServiceMap        /
    |
    |_ <other> package          » Probably some other implementation of CRUD services not based on in-memory Map.
     
    The `map` package is pretty neat in the sense that the Map<ID, T> is declared once and used by every ServiceMap. Understand why [Java Generics](https://docs.oracle.com/javase/tutorial/java/generics/why.html).

# License

The Spring PetClinic sample application is released under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).
