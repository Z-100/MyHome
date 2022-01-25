# :house: MyHome

[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fz-100%2FMyHome&count_bg=%23B600B6&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=Total+Views&edge_flat=false)](https://hits.seeyoufarm.com)
![commit activity](https://img.shields.io/github/commit-activity/m/z-100/MyHome-android-app)
![commit activity](https://img.shields.io/github/commit-activity/m/z-100/MyHome-backend)

## ***For the developers***
- ![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white) [The Android "front-end" application](https://github.com/Z-100/MyHome-Android-App)
- ![Springboot](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white) [The Springboot-Java "back-end" application](https://github.com/Z-100/MyHome-Backend)

## The documentation
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
