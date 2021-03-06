# Documentation M120
This document concludes the entire documentation for the M120. <br /><br />
# Ergo & Std

## Style guide

### Our application's Style Guide

![StyleGuide](https://user-images.githubusercontent.com/68548148/162922338-a4c0fd0a-338d-4673-91c1-136bb2815b0d.PNG)

## 10 rules of good design

| The rule | What it means | Our remarks |
|:--|:--|:--|
| Make Everything the used needs readily accessible | An organized structure of e.g. menu items. The user has to be able to find everything in a max. of three clicks. | Not to find something in a few clicks/seconds can be frustrating and motivates the user to leave the application quicker. |
| Be Consistent | E.g. Menu items should be placed at the same place on every page: Don't change the location of the searchbar from top to bottom when changing pages. | The user has to learn how the application works. This is really hard to do if every page has a different layout. |
| Be Clear | No user should be confused whilst using an application. | Not too many but also not too few features should be available for the user at any time. |
| Give Feedback | Buttons should change their shape/colour when pressed. On-success: Show popup; This cheers up the user. Loading pages are incredibly less boring when showing some kind of moving gears. | The user should be given indications on what's going on, whilst they are using an application. |
| Use Recognition, Not Recall | Use recognizable icons, as images are being remembered more, than an overly complicated slogan. | The application should be recognized, by just looking at a logo |
| Choose How People Will interact First | Humans are based on patterns. If something works against those patterns, most people will recognize that feeling as "annoying"  | If a building requires the customers to open two doors to enter, both doors should open in the same direction. |
| Follow design standards | This basically is the same as the fact above: If a user expects a certain part to look the same on every website / in every application. This part should look the same on every website / in every application. | A button should look and act like a button. Most doors look and work the same way everywhere. You don't see cars with  |
| Elemental Hierarchy matters | It's important, that the user can start their navigation on the most important feature. E.g. don't show the ingredients before the user can even see the title of what they are cooking | A top-down hierarchy is very important, as most things in the real world work like that and most people can and will understand this kind of logic. |
| Keep Your Users Free & in Control | At least let the user _feel_, that they're in charge of what is happening with their product. Let the user have an undo-, resp. a redo-button. | Being restricted limits the workflow.|

## HIG-comparison

#### HIG - Human Interface Guidelines

HIG are recommendations and advice aim for the improvement of usability, learnability and consistency of all software across a certain platform. <br />
Mostly HIG are being distributed by operating system (OS) manufacturers, to ensure consistency across their platform. <br />
Advantages of HIG are as already said; consistency. This ensures, that...
* ...the user can adapt better to the operating system, as all applications "look" & feel the same way
* ...the user can learn how most applications work more quickly
* ...the user instantly recognizes, which OS they are currently using
* ...the developers have less work to do, as someone already thought about the UX
* 
Developers however often times tend to break those HIG, as they think the HIG are not working well with their application. <br />
This ignorance of the HIG can lead to a war between the developers and the OS-manufacturers:
- Apple for example just does not approve any apps into their App Store, which go against their HIG.
- The GNOME-distribution does not include Firefox in their OS by default, as Firefox' layout does not match the GNOME-HIG
- Windows...? That's just a whole mess by itself.
- And other countless wars...


| Linux (GNU) | Windows (Win32) | macOS (Catalina) |
|:--|:--|:--|
| App naming: 2 simple nouns | / | / |
| In hierarchical navigation, a parent view provides links to multiple sub-views. The parent view can be a grid of images or a list, and each sub-view can be either a secondary window or a different view which is shown in the same window as the parent. Moving between parent and sub-view is accomplished with browsing. | A top-level window has no owner window and is displayed on the taskbar. Examples: application windows. In Windows Vista and later, dialog boxes without owner windows and property sheets are also considered top-level. | Presents content and functions that aren???t document-related. The primary window in an app is considered the main app window. |
| /, as the user can do whatever they want to anyway | Min Screen resolution: 800px x 600ox | Min Screen resolution: 800px x 600ox |
| /, as the user can do whatever they want to anyway | Close. All primary and secondary windows with a standard window frame should have a Close button on the title bar. Clicking Close has the effect of canceling or closing the window. | The title bar resides at the top of a window and includes options for closing, minimizing, and zooming (or expanding to full-screen mode) the window.  |
| As every app with sudo rights can edit anything anytime it wants to: The best security is to be a good Linuxian | Security is associated with communication channels. | Avoid relying solely on passwords for authentication. Take advantage of other technologies like Touch ID, which lets users authenticate with a fingerprint. For developer guidance, see LocalAuthentication. |

## Corporate design

Corporate Design of Generali:
https://www.generali.ch/en/allgemein/ueber-uns/marke

The whole of Corporate Design is based around the identity of the firm, and what it strives to achieve.  
As the first example we're going to take a look at Andrei's firm Generali. Find the link to their corporate design above.


You can see that the whole of the Corporate Design starts with the Logo. That is mainly with what you're usually going to start. The whole Logo has a meaning. In the case of Generali, the reasons are as following (described on their website):

Mark stands for strong values. It embodies strength and protection.
The Lion of St. Mark stands as a statue on Piazza San Marco in Venice ??? the birthplace of ???Assicurazioni Generali???.

For a Corporate Design, one of the most important things is to describe what you want to achieve, to show people your values. Genearli has a text explaining that on the page above. The text is aimed to get everyone on board with your vision of where the company should go. It is important to describe everything very humbly and influence people to get on board with what your company stands for. As a big Firm, Generali have a lot of ressources and experiences. Thus, they could show some videos too, to get everyone to empathize with them. Showing their nice side and the success of Generali will further make people want to support the cause. You can see they have grown to the point where they not only provide insurance to make money, but they also support sportsmen and women, and invest in charities that help situations in poorer country. Even though it might seem like they're only doing it out of the kindness of their heart. Part of the reason they're doing it is to make the brand look better, and attract more customers by setting some good values and making people emphatize.

It is important to also have a good, eye pleasing design. If you start off with your corporate design, that will have an influence on the looks of your whole company. For example the Generali logo. It shows up everywhere, on their buildings, on their websites, on their customers letters and so on. So it is important to chose something taht actually matters. Even the color is important, as you can see on the Generali main website. The whole site is the same color as the logo, keeping up the theme that was set in the corporate design.

## Accessibility

Accessibility is the practice of making your websites usable by as many people as possible. We traditionally think of this as being about people with disabilities, but the practice of making sites accessible also benefits other groups such as those using mobile devices, or those with slow network connections.

You might also think of accessibility as treating everyone the same, and giving them equal opportunities, no matter what their ability or circumstances. Just as it is wrong to exclude someone from a physical building because they are in a wheelchair (modern public buildings generally have wheelchair ramps or elevators), it is also not right to exclude someone from a website because they have a visual impairment. We are all different, but we are all human, and therefore have the same human rights.

Accessibility is the right thing to do. Providing accessible sites is part of the law in some countries, which can open up some significant markets that otherwise would not be able to use your services or buy your products.

**Building accessible sites benefit everyone:**
  - Semantic HTML, which improves accessibility, also improves SEO, making your site more findable.
  - Caring about accessibility demonstrates good ethics and morals, which improves your public image.
  - Other good practices that improve accessibility also make your site more usable by other groups, such as mobile phone users or those on low network speed. In fact,     everyone can benefit from many such improvements.
  - In some places this is actually mandated by law.

**What kinds of disability are we looking at?:**
  - People with visual impairments
  - People with hearing impairments
  - People with mobility impairments
  - People with cognitive impairments
  - Slow Internet
  - Slow Device
  - Reduced Device Screen Size
  - ...
 <br />
These are just some of the groups, there are others, and depending to whomst your app is aimed at, you might want to take different approaches and different accessibility standards into consideration<br />


**Some examples for addaptment to Accessibility in Programming might be:**
  - Colorblind mode. In which visual impairment is addressed by working with different colors.
  - Speak Text Aloud. The device reads the text on the screen aloud so that people with visual impairment can know what is on their screen.
  - For people with hearing impairments, most websites offer subtitles to what is being read aloud. For most cases they are turned on automatically, like in games         where a task is described, or if an app takes you on a tour of itsself. For some apps, you might have to turn them on, for example Youtube.
  - For people with mobility impairments, it is important to make buttons an appropriate size. For devices like phones, some apps might want to offer voice to text         features, in which the person can talk what they want to write instead of writing it on the tiny mobile phone keyboard. Voice assistants usually offer this             kind of feature to reply to messages received.
  - Persons with cognitive impairments cover a wide variaty of people with different sicknesses. The implementation of Accessibility for this group might not be           obvious at first sight, here are some guidelines to hold on to to help this group of people gain accessibility to your app: <br />
        - Delivering content in more than one way, such as by text-to-speech or by video. <br />
        - Easily understood content, such as text written using plain-language standards. <br />
        - Focusing attention on important content. <br />
        - Minimizing distractions, such as unnecessary content or advertisements. <br />
        - Consistent webpage layout and navigation. <br />
        - Familiar elements, such as underlined links blue when not visited and purple when visited. <br />
        - Dividing processes into logical, essential steps with progress indicators. <br />
        - Website authentication as easy as possible without compromising security. <br />
        - Making forms easy to complete, such as with clear error messages and simple error recovery. <br />
       
  - For persons with slow internet, you can offer something like Youtube does, lowering the quality of the video to reduce bandwith, thus being able to consume your       application at lesser quality, but not having to leave it.
  - In general you want to have clean code that makes things happen as fast as they can, doing this is important for exactly the category that is slow devices.
  - For people with reduced screen size, for example a phone, you will want to design your website or app so that it is responsive. Maybe you will want to offer a         mobile only application.


# DP & IF

## (Dis)advantages layering

Layering is the splitting of certain parts of an application / software, to ensure better maintainability... <br />
This "splitting" is achieved by parting the application into an "n-tier"-app. Mostly, there's a _backend-_, _frontend-_ and a _database-layer_. <br />
This specific distribution of layers in an application is called a Three-Tier-Architecture, as there are three layers... <br />
This ensures, in theorie, that the client _(frontend)_ can **not** access any information it shouldn't be able to.

### Comp

| Advantages | Disadvantage |
|:--|:--|
| More scalability | Increased effort |
| Data integrety | Increased complexity |
| Redused distribution (Increased Maintainability) | More things can (and will) break |

### Advantages

#### More scalability & Data integrity

Over all the scalability of the entire is massively being increased. <br />
You can not only have the database being connected once to the backend services, which also greatly increases security, but you also can e.g. add more pages to a website without having to implement everything twice in the backend. <br />
This also means there is less duplicated code, which also means the application consists of [higher quality code](#increased-maintainability)!

#### Increased Maintainability

As an application is getting bigger and more complex over time, the code's quality is getting more important each commit. <br />
Therefore a split-up application is very important, as the distribution of everything (code, data, ...) is lessened: <br />
The database layer should not be integrated into the frontend, as the user does not need to have access to the other users' data. That's only one, but very important reason, to keep everything separated.

### Disadvantages

#### Increased effort & Complexity

On the turn side, the effort required to even have the base of a small application working, is tremendously being risen. <br />
Everything needs to be separated. Everything needs more logic. [More parts can break](#more-breaking-parts). More parts means more maintenance... <br />

#### More breaking parts

This disadvantage goes hand-in-hand with the increased maintainability: <br />
Because of a higher complexity, the application has more connections in between the parts, which means that more connections can break. <br />
But because of this, the breaking parts are more isolated and the issue can be addressed more quickly.

## Mockups and sketches
Insert mockups and sketches

## Functional programming
Implemented [here](https://github.com/z-100/myhome-mobile)


# Testing

### Recommended test cases
Insert GUI / API Testcases

### Test protocol
## Login page
| Tested component | Expected result | Actual result | Passed |
|:--|:--|:--|:--|
| Login: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Login: Correct info entered | Logged into account<br/>Token & E-Mail saved to device, which can be retrieved again | Logged into account<br/>Token & E-Mail saved to device, which can be retrieved again | :heavy_check_mark: |
| Login: Incorrect info entered | Error displaying with reasoning | Error displaying with reasoning | :heavy_check_mark: |

## Register page
| Tested component | Expected result | Actual result | Passed |
|:--|:--|:--|:--|
| Register: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Register: Correct info entered | Logged into account<br/>Token & E-Mail saved to device, which can be retrieved again<br/>New account in backend | Logged into account<br/>Token & E-Mail saved to device, which can be retrieved again<br/>New account in backend | :heavy_check_mark: |
| Register: Incorrect info entered | Error displaying with reasoning | Error displaying with reasoning | :heavy_check_mark: |

## Members page
| Tested component | Expected result | Actual result | Passed |
|:--|:--|:--|:--|
| Members: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Members: Click on member | User logged into correct member<br/>Redirected to dashboard | User logged into correct member<br/>Redirected to dashboard | :heavy_check_mark: |

## Static pages
| Tested component | Expected result | Actual result | Passed |
|:--|:--|:--|:--|
| Dashboard: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Kitchen: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Rooms: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Settings: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Delete account: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Change password: Viewing page | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |

## Navbar
| Tested component | Expected result | Actual result | Passed |
|:--|:--|:--|:--|
| Navbar top: Viewing navbar | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Navbar top: Pressing buttons | Redirected correctly | Redirected correctly | :heavy_check_mark: |
| Navbar bottom: Viewing navbar | Information displayed correctly | Information displayed correctly | :heavy_check_mark: |
| Navbar bottom: Pressing buttons | Redirected correctly | Redirected correctly | :heavy_check_mark: |


### GUI testing tool
For the sake of this project, we used espresso. <br/>
Espresso is a free library, which can be used to test any frontend component to their limit:
* It's possible to simulate...
  * ...clicks, which can simulate button presses
    * ...even doubleClicks and long clicks (press and hold)
  * ...text operations, which can simulate text entered by the user
  * ...text validations, which can, as you might be expecting, validate text
  * ...open links
  * ...close the keyboard
  * ...scroll to certain areas
  * ...all kinds of swipe directions:
    * ...up, down, left, right
* Other things it can do, are...
  * ...validate the existance of components by their id
  * ...check the satus of a component
    * ...It's displayed status
    * ...It's enabled status
    * ...It's focuesd status
    * ...It's checked status
    * ...It's selected status
  * ...check hints of certain components
  * ...
As you can see, it's pretty much. All these functionalities would've been impossible to implement in this timeframe. <br/>
That's why we've only implemented a bunch of those features.

# Our goals
| Criteria | Points | Status |
|:----|:-:|:-:|
| Ergo & Std |
| [Sie haben einen Style Guide f??r Ihre Applikation(en) erstellt](#style-guide) | 1 | ???? |
| ["Sie haben eine Zusammenfassung der Punkte und Erkl??rungen zum Video ""10 Rules of Good UI Design to follow"" erstellt und kommentiert. https://www.youtube.com/watch?v=RFv53AxxQAo"](#10-rules-of-good-design) | 1 | ???? |
| [Sie haben die Human Interface Guidelines (HIG) f??r Windows/Linux/Apple miteinander verglichen](#hig-comparison) | 1 | ???? |
| [Sie erl??utern anhand von Beispielen, wie das Corporate Design Ihrer/einer Firma aussieht und umgesetzt wird](#corporate-design) | 1 | ???? |
| [Sie erl??utern, was unter Barrierefreiheit zu verstehen ist und geben Beispiele f??r die Umsetzung](#accessibility) | 1 | ???? |
| DP & IF |||
| [Vor- und Nachteile einer Trennung von Pr??sentations- und Anwendungslogik wurden erl??utert](#(dis)advantages-layering) | 1 | ???? |
| [F??r eine selbstgew??hlte Applikation wurden Skizzen/Mockups erstellt und erl??utert](#mockups-and-sketches) | 1 | ???? |
| [Eine ereignisbasierte Anwendung wurde entwickelt](#functional-programming) | 4 | ???? |
| Testing |||
| [Sie haben ein Protokoll ??ber den Test Ihrer Applikation erstellt](#test-protocol) | 1 | ???? |
| [Sie haben die Verwendung eines GUI Testing-Tools dokumentiert](#gui-testing-tool) | 1 | ???? |
