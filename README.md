# :house: MyHome

[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fz-100%2FMyHome&count_bg=%23B600B6&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=Total+Views&edge_flat=false)](https://hits.seeyoufarm.com)
![commit activity](https://img.shields.io/github/commit-activity/m/z-100/MyHome-android-app)
![commit activity](https://img.shields.io/github/commit-activity/m/z-100/MyHome-backend)

## ***For the developers***
- ![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white) [The Android "front-end" application](https://github.com/Z-100/MyHome-Android-App)
- ![Springboot](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white) [The Springboot-Java "back-end" application](https://github.com/Z-100/MyHome-Backend)

# The documentation
***This documentation was written by [Z-100](https://github.com/z-100)***. Words like "me" or "I", are referencing ***me***.

### The Concept
Long story short, the basic concept was to code two separate components, which then could be combined: A [REST-API](https://github.com/Z-100/MyHome-Backend) in the backend, working together with our database running in MariaDB and an [Android App](https://github.com/Z-100/MyHome-Android-App) in the frontend with a good, userfriendly and especially easy-to-understand UI, displaying the information gotten from the backend via an API call. <br />

Our actual concept started with the design of an ERM (more at "The Planning"), which was the base of the entire backend and later on also the front end (ResponseEntities). <br/>
During the course of this project, I heavily adjusted our, in the beginning created ERM: I decided to scrape one feature completely (Items in room, which was there to showcase, where which item was), but added a connection in between Item and house in order to keep the balance of Ying-Yang (Remove one feature, Add one feature).<br/>
Some tables also were edited completely, to fit more into the scheme of my backend, without bigger complications (def. big complication: Unsolvable StackOverFlow Error). <br/><br/>
The concept process wouldn't've been possible without the usage of certain diagrams like [this class diagram](https://github.com/Z-100/MyHome/blob/main/Diagrams/class/classdiagram-before-restapi.jpg) or the far more important [sketch](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/rough-sketch-restapi.png), which I used to find where to even start anything!
<br/> The [database's ERM](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/detailed-sketch-db.jpg), which also has a [pre-alpha version](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/rough-sketch-db.drawio), also was the blueprint to all the API-components.

### The design
The design of both the Front- and Backend were pretty simple. The RESTapi is designed, to be extended easily and was planned by creating a [Use-Case Diagram](https://github.com/Z-100/MyHome/tree/main/Diagrams/usecase/usecase-before-restapi.drawio). The best fitting description for the designing process would be the following: "Klein, aber fein"! <br/>
This Use-Case diagram would later on be [changed "a bit"](https://github.com/Z-100/MyHome/tree/main/Diagrams/usecase/usecase-after-update-member.drawio) (def. "a bit", Completely, as everything has gotten more difficult than anyone could ever imagine). <br/><br/>
The design of the front end app was done, by creating an [Activity Diagram](https://github.com/Z-100/MyHome/tree/main/Diagrams/usecase/activity-before-and-after-app.jpg), which continuously was being extended

### The planning 
Technically, the planning already has began, before M226b even started! The idea of a home management app also isn't anything new, so we had to have some really good ideas and create some really nice features if we wanted to even stand a chance to compete on the market. <br />
In other words: Code something good and functioning in the duration of this module, which can be easily extended. And so we did: <br />
We started by having a little backlog grooming in M153, before we started creating our [ERM](https://github.com/Z-100/MyHome/blob/main/Diagrams/sketch/detailed-sketch-db.jpg), which would then later be my blueprint to work on. 
We both had ideas, some of which were good, others just impossible to implement in that short amount of time or also just ***really*** idiodic.. <br />
<br>
The planing basically is a compilation of the concept and design:
We created lots of diagrams, had lots of ideas, started doing stuff, which mostly wasn't working, e.g...
<br>
For example: I started coding a response service with the springframework in the frontend, but this was changed to volley by andy.


### The test protocol
As already discussed in the project of [M226a](https://github.com/Z-100/M226a_miniproject), The whole testing process can, was and will (be) done again with the usage of JUnit, in combination of Mockito, to replace the requirement of "Use-Case-Testing".
<br /> <br />
If we are still required to deliver a such grotesque form of test cases, here's an example on how I tested everything belonging to the backend:

| To be tested | Expected | Result |
|:----------------:|:--------------:|:-------------:|
| The request of ".../member/get-members" | A json object containing all the members belonging to an account with all the information about a member (excluding foreign keys from other tables pointing on a particular member) | A json object containing all the members belonging to an account with all the information about a member (excluding foreign keys from other tables pointing on a particular member) |
| The password validation service | True up on entering the correct login information, false up on entering the incorrect login information | True up on entering the correct login information, false up on entering the incorrect login information |
| The token validation service | True up on entering the correct email and token, false up on entering the incorrect email and token | True up on entering the correct email and token, false up on entering the incorrect email and token |

<br/><br/>
# The database

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

