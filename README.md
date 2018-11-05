# Dagger2 Android Sample App

<img src="https://user-images.githubusercontent.com/44644354/47969132-ed8ca800-e094-11e8-8bee-041de4146364.png" title="Dagger2" alt="Dagger2" width=100 height=100>

> An Android application with Dagger2 Android implementation using MVVM pattern along with AAC.


![Build Status](http://img.shields.io/travis/badges/badgerbadgerbadger.svg?style=flat-square)
 [![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org) 

## Info

- This project is built using `Android Studio 3.3 Beta 2`
- Minimum SDK version used in `21` target SDK version is `28`
- Project is based on Single Activity
- It is using Navigation Components, so no manual dealing with back stack.
- Each fragment have it's own view model injected by dagger from the view model factory

## Clone

- Clone this repo to your local machine using `https://github.com/SyedAsimAliSE/DaggerSampleApp.git`

## Usage

- Every thing related to <b>Dagger2</b> is in the <b>di</b> pacakge 
- Every thing related to <b>UI</b> is in <b>ui</b> pacakge
- Every screen have it's own pacakge and it contains the following:
  - Fragment Class
  - ViewModel Class  

> You want to add classes required within whole app level scope 

 Find `AppModule.kt` by pressing `shift` 2 times in the IDE

> Classes related to the Main Activity 

Find `MainModule.kt` it's in the ui > main pacakge


## Contributing

#### Step 1

- 🍴 Fork this repo!
- 👯 Clone this repo to your local machine using `https://github.com/SyedAsimAliSE/DaggerSampleApp.git`

#### Step 2

- **HACK AWAY!** 🔨🔨🔨

#### Step 3

- 🔃 Create a new pull request using <a href="https://github.com/SyedAsimAliSE/DaggerSampleApp/compare/" target="_blank">`https://github.com/SyedAsimAliSE/DaggerSampleApp/compare/`</a>.

---


## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
- Copyright 2018 © Syed Asim Ali.
