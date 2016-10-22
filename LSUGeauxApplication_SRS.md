	
# Software Requirements Specification

## for
# LSU Geaux Tour and Maps Application

### Version 1.1
### Prepared by 
### Tohyup Cho
### Joshua Koenig
### Javier Rodriguez
	         
##### CSC 4330 
##### Fall 2016 
##### October 21st, 2016.

# Table of Contents
## Table of Contents......................................................................ii
## Revision History........................................................................ii
## 1. Introduction...........................................................................1
  1. Purpose
  2. Document Conventions
  3. Intended Audience and Reading Suggestions
  4. Product Scope
  5. References
  
## 2. Overall Description
  1. Product Perspective
  2. Product Functions
  3. User Classes and Characteristics
  4. Operating Environment
  5. Design and Implementation Constraints
  6. User Documentation
  7. Assumptions and Dependencies
  
## 3. External Interface Requirements
  1. User Interfaces
  2. Hardware Interfaces
  3. Software Interfaces
  4. Communication Interfaces
  
## 4. System Features
  1. Select a Tour Feature
  2. Create a Tour Feature
  3. Class/Location Finder
  4. Save a Tour Feature
  
## 5. Other Nonfunctional Requirements
  1. Performance Requirements
  2. Safety Requirements
  3. Security Requirements
  4. Software Quality Attributes
  5. Business Rules
## 6. Other Requirements
## Appendix A: Glossary
## Appendix B: Analysis Models
## Appendix C: To Be Determined List

# Revision History
| Name | Date | Reason For Changes | Version |
|------|------|--------------------|---------|
|      |      |                    |         |
|      |      |                    |         |

1. # Introduction
     1.	#### Purpose

        The purpose of this document is to provide insight into the software requirements, structure, and design for the 1.1 version of the LSU Geaux Application.  This SRS document will provide functional and nonfunctional requirement specifications in a system-wide description of the LSU Geaux Application.
     2. ####	Document Conventions
             
	 This document follows the IEEE std 830-1998 template.  Documentation follows Markdown syntax according to Markdown Version 1.0.1 specified by John Gruber. 
     3. ####	Intended Audience and Reading Suggestions

           This SRS document will list the product's functional and non-functional requirements in tabular format. Features in Section 4 are listed in priority order with the earliest implemented feature listed first. Features 5 and 6 constitute desirable features.   This document will enumerate required interfaces and hardware constraints. The writers of this document recommend that the reader read the document in sequential order such that Section 1 is read first and so on.  Developers ought to read Section 4 and 5 first. Project managers are asked to follow the sequential reading specification detailed above. Documentation writers ought to read Sections 2, 3, 4, and 5. Testers ought to read the Appendix B: Analysis Models Section.  Users should read Sections 1, 2, and 3.
     4. #### Product Scope
       The LSU Geaux Application will service the LSU community by providing a dynamic and interactive thoroughfare through which users can create a tour of LSU's campus, select from a set of premade tours around LSU's campus, find a specific building on campus, and save a frequently used path. The mission of the application, molded by public necessity and client feedback, is to cater to incoming students by providing a means to traverse LSU's campus in an informed and timely manner. The LSU Geaux Application will fill a market gap left by its failed competitor-the LSU Mobile App.  

     5. #### References
       1. Consult IEEE std 830-1998 for insights into this document's formatting.
       2. [Link to Markdown Syntax](http://daringfireball.net/projects/markdown/)
       
2. #	Overall Description
   1. #### Product Perspective
      Market analysis supported project feasibility.  Under further market analysis, the official LSU GPS-enabled application-LSU Mobile-failed to provide our pivotal feature-tour creation. In response to user feedback, the developers of the LSU Geaux Application determined that the software-user interactivity provided by the LSU Geaux Application ought to starkly contrast the purely navigation motivated LSU Mobile Application. The product initially began production in January of 2016 as mandated by LSU CSC 3380.  The development team decided to continue its production due to positive peer reviews and the prospect of continuing to serve the LSU community. 

   2. #### Product Functions
      The LSU Geaux Application will allow the user to participate in one from the following features:

        * Select a [suggested tour.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture4.png)
 
        * Create a [personalized tour.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)
 
        * Find a [specific location on LSU's campus.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture2.png)
 
      * Save a user-created tour path.

      These main features will allow the user to view the following:
           
      * Description text including quotes from famous alumni about the selected Landmark.
      * A picture of the selected Landmark.

      * GPS location of a Landmark with GPS-guided path from the user's current position to the landmark.
    
       For more information about product functionality [see the project state transition diagram.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/state_transition_diagram_srs_final.jpg)
       
   3. #### User Classes and Characteristics
      The LSU Geaux Application will aid anyone touring LSU's campus or finding the location of a class. However for the purpose of requirements and feature specification this document will list one generic user with cardinality of one to many.  The generic user will be classified as an LSU Visitor. The only characteristic required of the LSU Visitor is that they are in possession of Android phone and have the application installed. Thus the target audience includes non-students, students, and LSU staff. As a result the application does not specify priority users. All users possess the same privileges as it is the mission of the application to aid all users equally. 

    4. #### Operating Environment
         The application will operate on any Android device with Android OS 6.0.1 or higher. It was developed in the Android Studio IDE with API Version 21 and ought to run on any API greater than or equal to the 21st version. The LSU Visitor also must enable Google Maps services available on his or her Android device.  

    5. #### Design and Implementation Constraints
      The LSU Geaux Application is implemented with a object-oriented style following the agile methodology called the *Unified Process*. Time and storage handling constitute two  main high-risk constraints for the developers of this software. Also, the user is expected to have a device running in android with Google services available such as Google maps and connection to the internet is required for the app correct execution.
    6. #### User Documentation
      The product version 1.1 does not have any manual, online help, or tutorials implemented. However, if the project timeline allows, the development team holds a user manual, online help, and tutorials as a TBD item.
    7. #### Assumptions and Dependencies
      The LSU Visitor is expected to have a device running the Android OS 6.0.1 or higher with Google Maps Services enabled as long as the app is executed. The LSU Geaux application relies heavily on the capability of Google Maps Services and smartphone usage  with the ability to connect to the Internet.

3. # External Interface Requirements
   1. ####  User Interfaces
      The LSU Geaux Application implements a developer-made GUI using Java Studio API 21.  [The Core Feature Layout](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png) displays buttons which allow the LSU Visitor to select among several options initiating several use cases. The Create A Tour user interface displays a GPS location fragment, pictures, and Landmark text description. However, this application presents a design constraint in so much as it was designed to be implemented on a vertically oriented display. The software is constrained to only be displayed in a vertical position. 

   2. #### Hardware Interfaces
      The application is dependent on the hardware capabilities an Android device. Each LSU Visitor location request the software requires user to touch display interaction. Faulty hardware display screens that are either cracked or defaced may constitute problems with software to hardware communication protocol. Any Android device with these hardware features and Android Java API 21 compatibility is desirable as a target device. 

   3. #### Software Interfaces
      The LSU Geaux Application's GPS capability window implements a fragment which makes a remote call to the Google Maps API. Therefore, this software is dependent on the capability of Google Maps. The remainder of implemented functions are local which ensures that the program will run on an Android device with API 21 compatibility without being completely dependent on any other external software.
	4. #### Communications Interfaces

	   The LSU Geaux Application requests and acquires GPS location. Internet capability is necessary for proper execution of this application. The remainder of the application is executed without any other external function. 


4. # System Features
   1. ## Create A Tour Feature	
      1. The Create A Tour Feature is the pivotal feature of the software system. It constitutes a priority 1 feature. This is also the highest risk feature priority 1. If this feature would pass a failure message the core feature of the system would fail. Successful implementation of this feature secures benefit of priority 1. This feature is will be performed by the majority of LSU Visitors in a priority 1 frequency.
      2. | Item |             UC 1  Creates A Tour Feature                      |
         |------------|--------------------------------|
         |Summary |  LSU Visitor creates a personalized tour.                                 |
         |Rational|     LSU Visitor should be able to create a tour of 1 to 20 Landmarks and visit each Landmark in the order the Landmark was selected.                              |
         |Users |        LSU Visitor                             |
         |Preconditions| 1. The LSU Visitor must establish Internet Connection. |
         || 2. The LSU Visitor must enable GPS Service on their Android Device.                                                       |
         ||  3. LSU Visitor opened the LSU Geaux Application.
         |                   |4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)| 
         ||   5. LSU Visitor  defined number of Landmarks constituting the tour.                                                           |
         |Basic Course of Events| 1. LSU Visitor selects the Create button.|
         ||                       2. System prompts LSU Visitor to choose a Landmark from a displayed list of Landmarks.
         ||                       3. LSU Visitor selects a Landmark from the displayed list.
         ||    4. System displays the selected Landmark's GPS location, GPS guided path, and description text.
         ||    5. LSU Visitor taps the Android device's back button.|
         ||    6. System prompts the LSU Visitor to choose another Landmark.|
         || 7. System will display an error if the LSU Visitor chooses more than 20 Landmarks.
         || 8. System returns the LSU Visitor to the Core Feature Layout.   
            |References |   FReq 1, FReq 2, FReq 3                            |
         
      3. | Item |             Functional Requirement 1:  Internet Connection                     |
         |------------|--------------------------------|
         |Summary |  The System must connect to the Internet in order to send and receive data from Google Maps Services.                                 |
         |Rational| The System will manage GPS coordinates and data. An essential part of GPS coordinate management is the ability to send and receive data from Google Maps Services.                                   |
         |Requirements |    LSU Visitor must go to their Android device's Options menu.  LSU Visitor must then select Settings. LSU Visitor must then press the Enable Mobile Networks button.  If LSU Visitor does not enable Internet connectivity the System will display an error and will not execute the application's features.                                  |
         |References |    UC 1, UC 2, UC 3, UC 4                            |

         | Item |            Functional Requirement 2:     Google Maps GPS Services Enabled                 |
         |------------|--------------------------------|
         |Summary |    The System must be able to communicate with Google Maps GPS Services.                               |
         |Rational|  The System will be used to formulate GPS guided paths between specified Landmarks.  An essential part of tour creation is the ability to send and receive GPS coordinates from Google Maps Services.                                 |
         |Requirements |  LSU Visitor must go to their Android device's Options menu. LSU Visitor must then select Settings. LSU Visitor must then press the Enable Location Services button. If LSU Visitor does not enable location services the System will display an error and will not execute the application's features.                                    |
         |References |        UC 1, UC 2, UC 3, UC 4                        |

         | Item |             Functional Requirement 3:  Device Memory Access                   |
         |------------|--------------------------------|
         |Summary |       The System must be able to access and manipulate and Android device's memory.                            |
         |Rational|     The System will be used to save LSU Visitor made Tours after the LSU Visitor selects the Save option. Device memory manipulation is key to saving user created Tours.                             |
         |Requirements |        When LSU Visitor installs the application, the System will prompt LSU Visitor to share memory manipulation. LSU Visitor must go to their Android device's Options menu. LSU Visitor must then select Settings. LSU Visitor must find the location of the System and enable memory manipulation. If LSU Visitor does not enable memory manipulation the System will display an error and will not execute the application's features.                              |
         |References |         UC 1, UC 2, UC 4                       |

   2. ## Select A Tour Feature	
      1. The Select A Tour Feature is the second highest priority feature of the software system. It constitutes a priority 2 feature. This is also moderate risk feature of priority 4. If this feature would pass a failure message the core feature of the system would remain intact. Successful implementation of this feature secures benefit of priority 3. This feature is will be performed by LSU Visitors in priority 3 frequency.
      2. | Item |             UC 2  Select A Tour Feature                      |
         |------------|--------------------------------|
         |Summary | LSU Visitor chooses a suggested tour.                                  |
         |Rational|       LSU Visitor may need suggestions from the System as to what LSU campus Landmarks ought to be toured.                            |
         |Users | LSU Visitor                                    |
         |Preconditions|   1. The LSU Visitor must establish Internet Connection. |
         || 2. The LSU Visitor must enable GPS Service on their Android Device.                                                       |
         ||  3. LSU Visitor opened the LSU Geaux Application.
         || 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)|                                                                                      
         |Basic Course of Events|  1. LSU Visitor selects the Choose button.|
         ||                       2. System prompts LSU Visitor to choose a Tour from a displayed [list of Landmarks.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture4.png)
         ||                       3. LSU Visitor selects a Tour from the displayed list.
         ||    4. System displays the selected landmark's GPS location, GPS guided path, and description text.
         ||    5. LSU Visitor taps the Android device's back button.|
         ||    6. System displays the next Landmark's GPS location, GPS guided path, and description text.|                   
         |References |   FReq 1, FReq 2, FReq 3, NFReq 1                            |
	 
      3. Refer to UC 1.3 to scope the Functional Requirements for Section 4.2.
      
   3. ## Class/Location Finder
      1.  The Class/Location Finder is the third highest priority feature of the software system. It constitutes a priority 3 feature. This is also high risk feature of priority 2. If this feature would pass a failure message the core feature of the system would remain intact, however the application's find functionality will be interrupted. Successful implementation of this feature secures benefit of priority 2. This feature is will be performed by LSU Visitors in priority 2 frequency. 
      2. | Item |             UC 3  Class/Location Finder                      |
         |------------|--------------------------------|
         |Summary |    LSU Visitor finds a specific location on the LSU campus.                               |
         |Rational|    An LSU Visitor that has the characteristic of also being a student at LSU should be able to find their class locations.                               |
         |Users |     LSU Visitor                                |
         |Preconditions|    1. The LSU Visitor must establish Internet Connection. |
         || 2. The LSU Visitor must enable GPS Service on their Android Device.                                                       |
         ||  3. LSU Visitor opened the LSU Geaux Application.
         |                   |4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)|                             
         |Basic Course of Events| 1. LSU Visitor selects the Class/Location Finder button.|
         ||                       2. System prompts LSU Visitor to choose a Landmark from a displayed [list of Landmarks.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture2.png)
         ||                       3. LSU Visitor selects a Landmark from the displayed list.
         ||    4. System displays the selected landmark's GPS location, GPS guided path, and description text.
         ||    5. LSU Visitor taps the Android device's back button.|
         ||    6. System returns LSU Visitor to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)|                     
         |References |      FReq 1, FReq 2, FReq 3, NFReq 1                         |
	 
      3. Refer to UC 1.3 to scope the Functional Requirements for Section 4.3.
      
   4. ## Save A Tour Feature
      1. The Save A Tour Feature is the fourth highest priority feature of the software system. It constitutes a priority 4 feature. This is also high risk feature of priority 3. If this feature would pass a failure message the core feature of the system would remain intact, however the application's save functionality will be interrupted. Successful implementation of this feature secures benefit of priority 2. This feature is will be performed by LSU Visitors in priority 1 frequency. 
      2. | Item |             UC 4  Save A Tour Feature                      |
         |------------|--------------------------------|
         |Summary |        LSU Visitor stores a tour in device memory for later reuse.                           |
         |Rational|         LSU Visitor ought to be able to save frequently used Tour routes.                         |
         |Users |          LSU Visitor                           |
         |Preconditions|   1. The LSU Visitor must establish Internet Connection. |
         || 2. The LSU Visitor must enable GPS Service on their Android Device.                                                       |
         ||  3. LSU Visitor opened the LSU Geaux Application.
         |                   |4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)|
         ||5. LSU Visitor must have completed UC 1 or UC 3.                                    
         |Basic Course of Events| 1. LSU Visitor selects the Save button from the  [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)|
         || 2. System asks LSU Visitor if he or she is sure that he or she wants to Save the specified Tour or Landmark location.
         ||3. LSU Visitor selects Yes for the System to Save the specified Tour or Landmark Location. Otherwise the System returns the user to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)|
         || 4. System accesses the Android device's memory and Saves the Tour.
         || 5. LSU Visitor can view the Save Tour by accessing the Premade Tour list.               
         |References |              Extends UC 1 and UC 3, FReq 1, FReq 2, FReq 3, FReq 4                |
	 
      3. | Item |             Functional Requirement 4:  File Manipulation                   |
         |------------|--------------------------------|
         |Summary |       The System must be able to manipulate files in Android device's memory.                            |
         |Rational|     The System will be used to manipulate saved LSU Visitor made Tours after the LSU Visitor selects the Choose option. Device file manipulation is key to accessing saved user created Tours.                             |
         |Requirements |        When LSU Visitor installs the application, the System will prompt LSU Visitor to share file manipulation. LSU Visitor must go to their Android device's Options menu. LSU Visitor must then select Settings. LSU Visitor must find the location of the System and enable file manipulation. If LSU Visitor does not enable memory manipulation the System will display an error and will not execute the application's features.                              |
         |References |         UC 1, UC 2, UC 4                       |

5. # Other Nonfunctional Requirements
   1. #### Performance Requirements
   
         | Item |      NFReq 1     Scalability                     |
         |------------|--------------------------------|
         |Summary |        The Landmark list ought to be scalable in that it should be expanded by more than 10 Landmarks.                           |
         |Rational|          If the System is not scalable, LSU Visitors will not be able to find Landmarks that are required to complete their Tours.                         |                          
         |Requirements|   The developement team must be aware of any Landmarks on campus that can be mapped to by Google Maps. The developement team must then expand the Landmark list by at least 10 unlisted Google Maps mapped Landmarks.                  |
         |References |  UC 2, UC 3                              |
	 
   2. #### Safety Requirements

        When using this application in order to avoid personal injury, ought to take necessary precautions. An LSU Visitor following the software instructions may lose physical awareness and on his or her way may befall harm by being hit by other entities. 
At all times, the LSU Visitor is required to be aware of the status of the path that the application is asking the user to take.

   3. #### Security Requirements

	    This product does not require the user to create a profile in order to take a tour. This product is not intended to store or access any sensitive information from the user. The software possesses a low security requirements.
   4. #### Software Quality Attributes

        This product has the quality of adaptability, usability, flexibility, and maintainability. These ensure its ease of use and provide a user-friendly product which can be taken to other campus locations in order to serve other campuses.
   5. #### Business Rules
       The LSU Geaux App has to be easy to use since any person of any age may use the application. Any user is allowed to use any function presented by the software and the software is expected to run on any Android device. 


6. 	Other Requirements

Appendix A: Glossary

Appendix B: Analysis Models

[Link to the State Transition Diagram](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/state_transition_diagram_srs_final.jpg)

Appendix C: To Be Determined List

See Section 2.6 for User Documentation TBD
