# About Me App
<a align="center" href="https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat">
    <img alt="Level" src="https://img.shields.io/badge/Level-Beginner-green"/>
</a>
<a align="center" href="https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat">
    <img alt="API" src="https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat"/>
</a>

Basic layout concepts demo app

Topics:
- strings.xml
    - Store all the strings across the app, good practice and the right way to internationalize an app.
- dimens.xml
    - Store dimensions, measures and spacings. 
- styles.xml
    - Store custom styles, create standards and easily reuse them.
- Reorder xml attributes
    - At the menu bar, Code -> Reformat Code. Order xml attributes, easier to read and organize xml layouts.
- Custom fonts
    - Added Roboto font.
- ScrollView
    - Handle big texts and make it scrollable.
- Data binding
    - Increase performance, reduce boilerplate code. Generates binding object at compile time for all views in the layout. FindViewById is slower because it traverses the view hierarchy at runtime to find a view at every call.
- Data class
    - Simple Kotlin class to store data.