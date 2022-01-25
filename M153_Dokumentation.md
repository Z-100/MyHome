# MyHome
### A project consisting of M153 & M226b

## Important documents and where to find them
| What document | Link to document|
|:----:|:-:|
| Entity Relationship Model (Made with MySQLWorkbench) | [In this repository](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/detailed-sketch-db.jpg) |
| Datamodel concept (Made with drawio) <br/> Download file -> [Open this link](https://www.draw.io) -> Open diagram <br/> -> Select file| [In this repository](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/rough-sketch-db.drawio) |
| Scheduling | [In this file](#Scheduling)|
| Requirement analysis | [In this file](#Requirement-analysis)|
| Working report | [In this file](#Working-reports) |
| Mock-data | [In this file](#Mock-data) |
| Testing | [In this file](#Testing) |

## Requirement-analysis
We wanted to create an Android App, simplifying the daily challanges of someones home.<br/> 
For this we needed a database to store all the required and useful data:
| Entity | Description |
|:--|:--|
| Account | So that the user can log into our app |
| House | A container used to not have every FK pointing towards Account |
| Member | An account has multiple (family-) members to choose from |
| Shoppinglist | Filled with items to shop for |
| Cleaning | To know when to clean which room |
| Item | Used in shopping list, recipe and items in room (basically a fridge) |
| Meal | Each member can list their very own meals |
| Recipe | Viewable by the whole household and "rateable" by each member |
| Rating | 0 - 5 stars, which can be applied to a recipe by each individual member |
| Room | Linked to "House", used by Cleaning and items in room |
| Rooms to be cleaned | MC:MC table in between cleaning and room |
| Shoppinglist has item | MC:MC table in between shoppinglist and item |
| Recipe has item | MC:MC table in between recipe and item |
| item is in room | MC:MC table in between item and room (basically the fridge) |


  

## Scheduling
| Date | Thing to do |
|:----------------:|:--------------:|
|    23.11.21 | Create this scheduling and start with the planning of the database |
|    30.11.21 | Start designing the actual ERM (Maybe finishing it) |
|    07.12.21 | (Finish the ERM) + Start dumping testdata into the database |
|    14.12.21 | Start with the RESTful API and connect it to the database (Create controllers and start with alphatesting) |
|    04.01.22 | Have the models finsihed in the API and Android App + start with services modifying/selecting data |
|    11.01.22 | Continue working on API and App |
|    18.01.22 | Start writing the documentation, finish up database (Remove irrelevant stuff, make it presentable to class) |
|    25.01.22 | (Finish documentation) Do the finishing touches and start with presentation |

## Mock-data
With the help of diverse websites, we generated code to insert data into our sql script. <br/>We then added this generated code to our database, which allowed us to start the testing process and 

## Testing
The testing mostly consisted of us spamming "ctrl + enter" in postman and praying nothing in the back-/frontend would break.
Other things we used for testing were "Repository-tests" realised with the usage of JUnit and Mockito.
## ERM  
Our ERM has two versions: One in the beginning and one [after completing the project](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/detailed-sketch-db.jpg)! <br/>
The differences are the following: There is no more "items_in_room" table, which results in the loss of our idea "fridge". As a counterpart of scraping a feature, we added a connection
in between "recipe" and "house"!<br/><br/>
An [alpha ERM](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/rough-sketch-db.drawio) can be found by clicking the link.

  

## Working-reports  
#### 23.11  
We started by doing a small backlog-grooming:
- What information we want to store
- How we store this information  
- A fight around what system to use (MariaDB won)
- What the relations regarding the tables should look like
Then we started designing the model, as a sketch and we pretty much finished that!

#### 30.11.21  
As the model already was finished, we went straight into starting the ERM! <br/>
By the end of the day, we finished this up and tried to import it into MariaDB... <br/>
This didn't work out and we went to G.G., who told us to use InnoDB as an export option. It then worked :)

#### 7.12  
I started searching for mass-mock data services and found one. I started inserting data into our database. Yes.

#### 14.12.21 
The first thing I did today, was learning how to even use SpringBoot and JPA with hibernate and MariaDB. This was very hard, as I did never use any of those libraries before. <br/> Andy was learning "How to use Android Studio - The IDE, which converts your PC into a oven".

#### 04.01.22
Spoiler: I did in fact not finish the models, as SpringBoot was not very helpful during that day. What I did do, was nearly jumping out of a window ;-) <br/>
One of the few positive things that happened today were, having everything, which works finished and ready to go (request services, which sent the data from the Database to the App)

#### 11.01.22
Today we didn't really do anything, but code; The entire morning and the entire afternoon just coding... <br />
I worked at the REST-API, especially the data manipulation services of the CRUD. Andrei worked at the App and had to fight Volley.

#### 18.01.22
Today we started the documentation, which we finished within that very same day, which means everything went as planned! After that we went back to coding our application (Android App and REST-API). <br/>
Whilst coding, we also started the finishing-up process, by removing irrelevant data and unlinking certain tables or adding connections in between them.

#### 25.01.22
As everything already was finished, we didn't really have anything to do... Yes

## Reflexion
Overall, this project was pretty fun to do for the two of us! We both learned a lot about using MariaDB and Workbench in a "professional" application.
