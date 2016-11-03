![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/thumbnail_8%20-%20TGAlogo%20(1).jpg "LSU Geaux App Logo")

# Software System Design Document

## for
# LSU Geaux Tour and Maps Application

### Version 1.1
### Prepared by 
### Tohyup Cho
### Joshua Koenig
### Javier Rodriguez
	         
##### CSC 4330 
##### Fall 2016 
##### November 2, 2016.

# Table of Contents
## Table of Contents......................................................................ii
## Revision History........................................................................ii
## 1. Introduction...........................................................................1
   1. Purpose
   2. Scope
   3. References
   4. Overview

## 2. Main System Architecture
   1. Complete System Architecture

## 3. Sub-Systems Architecture

   1. Data Storage Access Sub-System
   2. Google Maps Sub-System
   3. LSU Visitor Interface Sub-System

## 4. Sub-Systems Rational

   1. Data Storage Rational
   2. Google Maps Rational
   3. LSU Visitor Interface Rational

## 5. Physical View
   1. Description
   2. Physical Connection Diagram

## 6. Data View 
   1. Description
   2. Database Design Diagram

## 7. Work-Assignment View
   1. Team Management Structure
   2. Work Assignment

## 8. Development View 
   1. Project Organization Overview
   2. Source Code Organization Diagram

## 9. Element Catalog
   1. Physical View Catalog

## 10. User Interface
   1. Main Layout
   2. Core Feature Layout
   3. Create Button
   4. Choose Button
   5. Class/ Location Finder Button
   6. Save Button
   7. Landmarks
   8. Premade/ Saved Tours

## 11. Other

# Revision History
| Name | Date | Reason For Changes | Version |
|------|------|--------------------|---------|
|      |      |                    |         |
|      |      |                    |         |

## 1. Introduction

   1. #### Purpose

      The purpose of the System Software Design Document concerning the LSU Geaux Application is to enumerate the design, architectural, and organizational paradigms to be followed during the implementation phase of developement.

   2. #### Scope

      The LSU Geaux Application will service the LSU community by providing a dynamic and interactive thoroughfare through which users can create a tour of LSU's campus, select from a set of premade tours around LSU's campus, find a specific building on campus, and save a frequently used path. The mission of the application, molded by public necessity and client feedback, is to cater to incoming students by providing a means to traverse LSU's campus in an informed and timely manner. The LSU Geaux Application will fill a market gap left by its failed competitor-the LSU Mobile App.

  3. #### References
       LSU Geaux Application [Software Requirement Specification Document](https://github.com/jkoeni6/LSU-Geaux-App/blob/master/LSUGeauxApplication_SRS.md)

  4. #### Overview
       The LSU Geaux Application's System Software Design Document is partitioned into 11 major sections with multiple subsections. The major sections of the Software Design Document are placed into these categories:
     1. Introduction​: This section briefly discusses an overview of the purpose and scope of the application's System Software Design Document.
     2. Main System Architecture​: This section introduces the constituents of the logical view of the LSU Geaux Application.
     3. Sub­-systems Architecture​: This section describes the design of each individual sub-systems.
     4. Sub-system Rational​: This section discusses the logical continuity of each sub-system within the LSU Geaux Application.
     5. Physical View: This section outlines the physical components that compose the physical architecture of the application.
     6. Data View​: This section lists the data structures and databases used in the application.
     7. Work­ Assignment View​: This section presents project team management structure and division of tasks among developers.
     8. Development View​: This section provides a layout of software implementation packages.
     9. Element Catalog​: This section catalogs all symbols used in the Physical View section.
     10. User Interface​: This section displays and describes the design of the graphical user interface​.

## 2. Main System Architecture

   1. Complete System Architecture
      
      [Link to Complete System Architecture](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/20161102_224127.jpg)

   The LSU Geaux Application is implemented with a object-oriented style following the agile methodology called the *Unified Process*. All features will be implemented as objects with each object accepting LSU Visitor input. The Main Layout object will welcome the LSU Visitor to the application by connecting each Visitor to the Core Feature Layout object. The Core Feature Layout object will link to any combination of four possible linked objects:
    
   * Create object: which links the Visitor to any combination of Landmark objects.
   * Choose object: which links the Visitor to any combination of Landmark objects or Premade/ Saved Tour objects.
   * Class/ Location Finder object: which links the Visitor to one Landmark object,
   * Save object: links a Create object to a list of Choose objects.

## 3. Sub-systems Architecture

   1. Data Storage Access Sub-System

      This sub-system outlines the means by which the LSU Geaux Application manages Android device memory as well as internal application memory.  In this sub-system buttons receive LSU Visitor input to save or load tour objects. This sub-system utilizes internal storage in the case of saving a Tour objects and modifies external storage in the case of future application updates. Tour objects are loaded and stored in temporary storage while being built. This sub-system will then tear down any tour object not permanently stored in internal application memory.
   2. Google Maps Sub-System
     
      This sub-system assigns GPS coordinates to attributes of Landmark objects. Navigation to a Landmark object's detail page triggers the application of the Google Maps sub-system. This application sub-system communicates and coordinates with the Google Maps server to push and get GPS coordinates. The Google Maps sub-system updates GPS fragments found on Landmark object pages.
   3. LSU Visitor Interface Sub-System
      
      This sub-system passes each individual object's GUI based on the object the LSU Visitor accesses. The sub-system's buttons receive input from the LSU Visitor and utilize that input to traverse objects. When this sub-system is used to navigate to an object, it triggers the application to access object attributes for GUI display. The LSU Visitor Interface accesses a background image database for layout object referenced.  This sub-system accesses a Landmark database to display a Landmark object and its attributes.  It also connects the LSU Visitor to a database that contains a list of all premade and saved Tours. This sub-system facilitates the Google Maps sub-system in its communication with the Google Maps server.
## 4. Sub-Systems Rational

   1. Data Storage Access Rational

      The main purpose for this subsystem is to facilitate saving and load Tour objects. It serves as both a garbage collector for de-referenced Tour objects and modifies the about of physical storage needed for the application on the Android device's physical memory.

  2.  Google Maps Rational

      This sub-system provides the main functionality of the application.  This sub-system passes every object that contains a GPS attribute its value. 

  3. LSU Visitor Interface
    
      The rational for this sub-system implementation is that it provides Tour object creation functionality and links Landmark objects into a premade or saved Tour object. This sub-system is the main environment for every use case of the LSU Geaux Application.  It facilitates the logical continuity of the application.

## 5. Physical View
   1. Description
     
      The LSU Geaux Application runs on Android devices with Internet connection and Google Maps capabilities enabled.  The application communicates with the Google Maps server via the Internet to send and receive GPS information.
   2. Physical Connection Diagram

![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Physical_View.png "Physical View")

## 6. Data View
   
   1. Description
 
      Landmarks and Tour objects access attributes hidden in list_header objects and list_layout objects which are stored in a database. 
   
   2. Database Design Diagram

![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/4%20-%20Database%20Design%20View..JPG "Database Design Diagram")

## 7. Work Assignment View
   1. Team Management Structure

![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/4%20-%20Work%20Assignemnt%20View..JPG "Team Management Structure Diagram")

   2. Work Assignment
      
      Considering the development of this application and due to the minimal number of members, the development team decided to follow an egoless approach in which all the members contribute to its realization. However, based on the members’ background the aforementioned tasks were assigned as major responsibilities.

## 8. Development View 
     
   1. Project Organization Overview
    
      This project is being built in Android Studio with the SDK toolset and Java programming language. Android API 21 is the required API for the application to run. For the organization of the code, the main directory is named after the application's name. This directory includes different directories which constitue the software system. The code for each activity is in the LSUGeauxApp directory while the code for each layout can be found in the corresponding layout directory.

  2. Source Code Organization Diagram

     ![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/4%20-%20Development%20View..JPG "Source Code Organization Diagram")

## 9. Element Catalog

   1. Physical View Catalog

| Image | Description |
|------|------|
|  [Android Clipart](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/clipart_android.jpg)    |   Qualifies LSU Geaux Application as an Android supported application   |
|   [GPS Clipart](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/clipart_gps.png)   | Annotes LSU Geaux Application as a GPS enabled application     |
|      [Phone Clipart](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/clipart_phone.png)         | Shows that the LSU Geaux Application as a mobile application            |
|         [Server Clipart](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/clipart_server.png)      |    LSU Geaux Application communicates with the Google Maps server         |
|            [Wifi Clipart](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/clipart_wifi.png)                  |  Annotes LSU Geaux Application as an Internet enabled application    |

## 10. User Interface

   1. Main Layout 

      ![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture1.png "Main Layout")

      Description: The Main Layout displays a picture of Mike the Tiger as a Welcome screen and takes the user to the Core Feature Layout.

   2. Core Feature Layout

      ![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png "Core Feature Layout")

      Description: The Core Feature Layout displays a GPS fragment pointing at the heart of LSU's campus and prompts the LSU Visitor to choose from one of the system's main features.

  3. Create Button

     Description: The Create Button is found on the Core Feature Layout. The Create Button allows the LSU Visitor to choose from a list of Landmarks.

  4. Choose Button

     Description: The Choose Button is found on the Core Feature Layout. The Choose Button prompts the LSU Visitor to choose a premade Tour from a list of tours suggested by the system.

  5. Class/ Location Finder Button

     Description: The Class/ Location Finder Button will be found on the Core Feature Layout. The Class/ Location Finder Button allows the LSU Visitor to locate a specific location on campus from a list of Landmarks.

  6. Save Button

     Description: Save Button will be found on the Core Feature Layout. The Save Button allows the LSU Visitor to select a previous tour from the ones that the LSU Visitor has selected to store in memory for later use.

  7. Landmarks

     ![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture2.png "Landmark List")

     ![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Screenshot_20161102-201938%5B1%5D.png "Landmark Layout")

     Description: Landmarks can be found on the Landmark List and Landmark Layout. Landmarks display the GPS location, an image, and a description of a specific place on campus.

  8. Premade/ Saved Tours

     ![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture4.png "Premade/ Saved Tours")
  
      Description: Premade/ Saved Tours can be found on the Premade/ Saved Tours List. Premade/ Saved Tours display Tours and Landmarks that are suggested by the system as well as previously LSU Visitor saved Tours.

## 11. Other



         