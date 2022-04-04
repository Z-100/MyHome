# App specific documentation M120

## Ergonomic developement

## Style guide

## Our own UX

## Mockups and sketches

## MVC-based developement

## Functional programming

## Synched views

## Test protocol

## GUI-testing tools


# General documentation M120

## Menu structure

## Design standards

## 10 rules of good design

| The rule | What it means | Our remarks |
|:--|:--|:--|
| Make Everything the used needs readily accesible | An organized structure of e.g. menu items. The user has to be able to find everything in a max. of three clicks. | Not to find something in a few clicks/seconds can be frustrating and motivates the user to leave the application quicker. |
| Be Consistent | E.g. Menu items should be placed at the same place on every page: Don't change the location of the searchbar from top to bottom when changing pages. | The user has to learn how the application works. This is really hard to do if every page has a different layout. |
| Be Clear | No user should be confused whilst using an application. | Not too many but also not too less features should be available for the user at any time. |
| Give Feedback | Buttons should change their shape/colour when pressed. On-success: Show popup; This cheers up the user. Loading pages are incredibly less boring when showing some kind of moving gears. | The user should be given indications on what's going on, whilst they are using an application. |
| Use Recognition, Not Recall | Use recognizable icons, as images are being remembered more, than an overly complicated slogan. | The application should be recognized, by just looking at a logo |
| Choose How People Will interact First | Humans are based on patterns. If something works against those patterns, most poeple will recognize that feeling as "annoying"  | If a building requires the customers to open two doors to enter, both doors should open in the same direction. |
| Follow design standards | This basically is the same as the fact above: If a user excpects a certain part to look the same on every website / in every application. This part should look the same on every website / in every application. | A button should look and act like a button. Most doors look and work the same way everywhere. You don't see cars with  |
| Elemental Hierarchy matters |  |  |
| Keep Your Users Free & in Control |  |  |

## HIG-comparison

## Corporate design

## Accesibility

## (Dis)advnatages layering

Layering is the splitting of certain parts of an application / software, to ensure better maintainability... <br />
This "splitting" is achieved by parting the application into an "n-tier"-app. Mostly, there's a _backend-_, _frontend-_ and a _databaselayer_. <br />
This specific distribution of layers in an application is called a Three-Tier-Architecture, as there are three layers.. <br />
This ensures, in theorie, that the client _(frontend)_ can **not** access any information it shouldn't be able to.

### Comp

| Advantages | Disadvantage |
|:--|:--|
| More scalability | Increased effort |
| Data integrety | Increased complexity |
| Redused distribution (Increased Maintainability) | More things can (and will) break |

### Advantages

#### More scalability & Data integrity

Over all the scalability of the entire is massivley being increased. <br />
You can not only have the database being connected once to the backend services, which also greatly increases security, but you also can e.g. add more pages to a website without having to implement everything twice in the backend. <br />
This also means there is less duplicated code, which also means the application consists of [higher quality code](#increased-maintainability)!

#### Increased Maintainability

As an application is getting bigger and more complex over time, the code's quality is getting more important each commit. <br />
Therefore a split-up application is very important, as the distribution of everything (code, data, ...) is lessend: <br />
The database layer should not be integrated into the frontend, as the user does not need to have access to the other users' data. That's only one, but very imporant reason, to keep everything separated.

### Disadvantages

#### Increased effort & Complexity

On the turn side, the effort required to even have the base of a small application working, is tremendously being risen. <br />
Everything needs to be separated. Everything needs more logic. [More parts can break](#more-breaking-parts). More parts means more maintenance... <br />

#### More breaking parts

This disadvantage could goes hand-in-hand with the increased maintainability: <br />
Because of a higher comlexity, the application has more connections in between the parts, which means that more connections can break. <br />
But because of this, the breaking parts are more isolated and the issue can be addressed more quickly.


## MVC documented

## Recommended test-cases


# What we want to achive in the project of M120
| Criteria | Points | Status |
|:----|:-:|:-:|
| [Programme wurden hinsichtlich der Erfüllung der Ergonomie-Standards beurteilt. Die Beurteilungen werden begründet](#Ergonomic-developement) | 1 | 🔴 |
| [Die Menüstruktur oder Benutzerführung von verschiedenen Programmen/Websites wurde aufgezeigt und kommentiert](#Menu-structure) | 1 | 🔴 |
| [Verschiedene Standards für die Gestaltung von Benutzeroberflächen wurden beschrieben und ihre Bedeutung kommentiert](#Design-standards) | 1 | 🔴 |
| [Sie haben einen Style Guide für Ihre Applikation(en) erstellt](#Style-guide) | 1 | 🔴 |
| ["Sie haben auf Basis der nachfolgend definierten WebSite das Vorgehen beim UX Design mit eigenen Worten beschrieben. https://bit.ly/2LhxRm4"](#Our-own-UX) | 1 | 🔴 |
| ["Sie haben eine Zusammenfassung der Punkte und Erklärungen zum Video ""10 Rules of Good UI Design to follow"" erstellt und kommentiert. https://www.youtube.com/watch?v=RFv53AxxQAo"](#10-rules-of-good-design) | 1 | 🔴 |
| [Sie haben die Human Interface Guidelines (HIG) für Windows/Linux/Apple miteinander verglichen](#HIG-comparison) | 1 | 🔴 |
| [Sie erläutern anhand von Beispielen, wie das Corporate Design Ihrer/einer Firma aussieht und umgesetzt wird](#Corporate-design) | 1 | 🔴 |
| [Sie erläutern, was unter Barrierefreiheit zu verstehen ist und geben Beispiele für die Umsetzung](#Accesibility) | 1 | 🔴 |
| [Spezielles] | 1 | 🔴 |
| [Vor- und Nachteile einer Trennung von Präsentations- und Anwendungslogik wurden erläutert](#(Dis)advantages-layering) | 1 | 🟢 |
| [Für eine selbstgewählte Applikation wurden Skizzen/Mockups erstellt und erläutert](#Mockups-and-sketches) | 1 | 🔴 |
| [Die Anwendung des MVC-Patterns (oder MVVM, MVP) bei einer bestehenden (eigenen oder fremden) Anwendung wurde aufgezeigt und kommentiert](#MVC-documented) | 2 | 🔴 |
| [Eine Anwendung wurde auf Basis des MVC-/MVVM-Patterns entwickelt](#MVC-based-developement) | 4 | 🔴 |
| [Der Ablauf bei der Ereignisverarbeitung wurde aufgezeigt und anhand eines Beispielprogramms umgesetzt](#Functional-programming) | 2 | 🔴 |
| [Eine ereignisbasierte Anwendung wurde entwickelt](#Functional-programming) | 4 | 🔴 |
| [Synchronisation zwischen unterschiedlichen Views wurde umgesetzt](#Synched-views) | 1 | 🔴 |
| [Sie haben eine Empfehlung für den Test einer Anwendung mit Benutzeroberfläche erstellt (mit Berücksichtigung der Standards)](#Recommended-test-cases) | 1 | 🔴 |
| [Sie haben ein Protokoll über den Test Ihrer Applikation erstellt](#Test-protocol) | 1 | 🔴 |
| [Sie haben die Verwendung eines GUI Testing-Tools dokumentiert](#GUI-testing) | 1 | 🔴 |
