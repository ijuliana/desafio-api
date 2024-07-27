Santander Dev Week 
Java RESTful API criada para Santander dev Week

## Diagrama de Classes 

``` mermaid


classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ news
    }
    
    class Account {
        +String Number
        +String Agency
        +Float Balance
        +Float Limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +Float limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *--> "1" Account : has
    User "1" *--> "N" Feature : has
    User "1" *--> "1" Card : has
    User "1" *--> "N" News : has
```
