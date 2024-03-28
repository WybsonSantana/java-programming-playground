---
title: Car
---
```mermaid
classDiagram
    class Car {
        +String manufacturer
        +String model
        +String color
        +int manufactureYear
        +Person owner
    }
    Car *--> Person : has
```

---
title: Person
---
```mermaid
classDiagram
    class Person {
        +String name
        +String documentId
        +int birthYear
    }
```
