# Software Testing Document

## for
# LSU Geaux Tour and Maps Application

### Version 1.1
### Prepared by 
### Tohyup Cho
### Joshua Koenig
### Javier Rodriguez
	         
##### CSC 4330 
##### Fall 2016 
##### November 20, 2016.

|Test Case: 1.1  |Test Case Name: Create 1 Landmark Tour |
|------------|----------------|
|System: LSU Geaux Application   |Subsystem: Create      |
|Designed by: Joshua Koenig          |Design Date: 17/11/ 2016               |
|Executed by: |Execution Date:    |
|Short Description: Test the lower bounds of the Create a Tour Feature |

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection. |
| 2. The LSU Visitor must enable GPS Service on their Android Device. |
| 3. LSU Visitor opened the LSU Geaux Application. |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)|  

|Step|Action|Expected System Response|Pass/Fail|Comment|
|----|------|------------------------|---------|-------|
| 1.   | Tap the 'Create' Button      | The system displays a message asking the LSU Visitor to enter the number of Landmarks in the new Tour |         |       |
| 2.   | Enter 1 as the number of Landmarks in the new Tour | The system displays the Landmark Layout| |    |
| 3.   | Tap the Alex Box Stadium Landmark Button | During the transition from the Landmark Layout, the system displays a toast saying 'You have 0 Landmarks left'. The system displays the text and GPS information associated with Alex Box Stadium |  |  | 
| 4.   | Enter 'Yes' or 'No" | The system will display a prompt to save the Tour | |      |
| 5.   | Check post-condition 1 | | | |

|Post-Conditions|
|---------------|
| 1. The system will display the 'Saved' message if 'Yes' was entered or return to the Core Feature Layout otherwise.               | 

|Test Case: 1.2 |Test Case Name: Create 20 Landmark Tour |
|------------|----------------|
|System: LSU Geaux Application      |Subsystem: Create    |
|Designed by: Joshua Koenig            |Design Date: 17/11/ 2016 |
|Executed by: |Execution Date:    |
|Short Description: Test the upper bounds of the Create a Tour Feature |

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)           |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.    | Tap the 'Create' Button      | The system displays a message asking the LSU Visitor to enter the number of Landmarks in the new Tour |         |      |
| 2.  | Enter 20 as the number of Landmarks in the new Tour | The system displays the Landmark Layout  |         |    |
| 3.  | Tap the Tiger Stadium Landmark Button | During the transition from Landmark Layout, the system displays a toast saying 'You have 19 Landmarks left'. The system displays the text and GPS information associated with Tiger Stadium | | |
| 4.  | Tap the Back Button when you are done viewing the Landmark screen| The system will display the Landmark Layout| | |
| 5.  | Continue to tap Landmarks from the Landmark Layout until 19 Landmarks have been tapped pressing the Back Button after each Landmark screen has been viewed| The system will display the Landmark counter toast after each Landmark is selected. After the Back Button has been tapped, the system will display the Landmark Layout| | |
| 6.  | Tap and view the 20th Landmark screen| During the transition from the Landmark Layout, the system displays a toast saying 'You have 0 Landmarks left'. The system displays the text and GPS information associated with the 20th Landmark  | | |
| 7.  | Enter 'Yes' or 'No"| The system will display a prompt to save the Tour| | |
| 8.  | Check post-condition 1| | | |

|Post-Conditions|
|---------------|
| 1. The system will display the 'Saved' message if 'Yes' was entered or return to the Core Feature Layout otherwise.             |

|Test Case: 1.3 |Test Case Name: Create 13 Landmark Tour|
|------------|----------------|
|System: LSU Geaux Application     |Subsystem: Create    |
|Designed by: Joshua Koenig            |Design Date:  17/ 11/ 2016             |
|Executed by: |Execution Date:    |
|Short Description: Test within bounds of the Create a Tour Feature|

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)           |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.   | Tap the 'Create' Button    | The system displays a message asking the LSU Visitor to enter the number of Landmarks in the new Tour  |         |       |
| 2.   | Enter 13 as the number of Landmarks in the new Tour| The system displays the Landmark Layout | | |
| 3.   | Tap the Middleton Library Landmark Button | During the transition from the Landmark Layout, the system displays a toast saying 'You have 12 Landmarks left'. The system displays the text and GPS information associated with Middleton Library | | |
| 4.  | Tap the Back Button when you are done viewing the Landmark screen| The system will display the Landmark Layout| | |
| 5.  | Continue to tap Landmarks from the Landmark Layout until 12 Landmarks have been tapped pressing the Back Button after each Landmark screen has been viewed| The system will display the Landmark counter toast after each Landmark is selected. After the Back Button has been tapped, the system will display the Landmark Layout| | |
| 6.  | Tap and view the 13th Landmark screen| During the transition from the Landmark Layout, the system displays a toast saying 'You have 0 Landmarks left'. The system displays the text and GPS information associated with the 13th Landmark  | | |
| 7.  | Enter 'Yes' or 'No"| The system will display a prompt to save the Tour| | |
| 8.  | Check post-condition 1| | | |


|Post-Conditions|
|---------------|
| 1. The system will display the 'Saved' message if 'Yes' was entered or return to the Core Feature Layout otherwise.              | 

|Test Case: 1.4 |Test Case Name: Create 21 Landmark Tour |
|------------|----------------|
|System: LSU Geaux Application      |Subsystem: Create    |
|Designed by: Joshua Koenig          |Design Date: 17/11/2016             |
|Executed by: |Execution Date:    |
|Short Description: Test outside the bounds of the Create a Tour Feature|

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)           |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.  | Tap the 'Create' Button | The system displays a message asking the LSU Visitor to enter the number of Landmarks in the new Tour |         |       |
| 2.  | Enter 21 as the number of Landmarks in the new Tour | The system will display a message of unsuccessful operation and displays the Core Feature Layout | | |
| 3.  | Check post-condition 1| | | |

|Post-Conditions|
|---------------|
| 1. The system will display the Core Feature Layout  | 

|Test Case: 2  |Test Case Name: Select a Tour |
|------------|----------------|
|System: LSU Geaux Application     |Subsystem: Select    |
|Designed by: Javier Rodriguez   |Design Date: 21/11/2016   |
|Executed by: |Execution Date:    |
|Short Description: Test the Select a Tour Feature |

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)  |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.   | Tap the 'Select' Button | The system displays the Select Feature Layout | | |
| 2.   | Tap the Tour titled 'Student Union, Memorial Tower, Middleton Library, Foster Hall' | The system will display the Student Union Landmark screen | | |
| 3.   | Tap the Back Button to view the next Landmark screen | The system will display the Memorial Tower Landmark Screen | | | 
| 4.   | Tap the Back Button to view the next Landmark screen | The system will display the Middleton Library Landmark Screen | | | 
| 5.   | Tap the Back Button to view the next Landmark screen | The system will display the Foster Hall Landmark Screen | | | 
| 6.   | Tap the Back Button twice | The system will display the Core Feature Layout | | |
| 7.  | Check post-condition 1| | | |

|Post-Conditions|
|---------------|
| 1. The system will display the Core Feature Layout | 

|Test Case: 3 |Test Case Name: Find Location|
|------------|----------------|
|System: LSU Geaux Application     |Subsystem: Class/Location Finder |
|Designed by: Tohyup Cho            |Design Date: 17/11/2016             |
|Executed by: |Execution Date:    |
|Short Description: Test the Class/Location Finder Feature |

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png)           |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.  | Tap the 'Find' Button      |  The system will display the Landmark Layout  |  | |
| 2.  | Tap any Landmark displayed | The system will display the appropriate Landmark screen | | |
| 3.  | Tap the Back Button | The system will display the Core Feature Layout | | |
| 4.  | Check post-condition 1| | | |

|Post-Conditions|
|---------------|
| 1. The system will display the Core Feature Layout  | 

|Test Case: 4.1 |Test Case Name: Save 1 Landmark Tour |
|------------|----------------|
|System: LSU Geaux Application     |Subsystem: Save    |
|Designed by: Joshua Koenig           |Design Date: 17/11/2016  |
|Executed by: |Execution Date:    |
|Short Description: Test the lower bounds of the Save a Tour Feature|

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png) |
| 5. LSU Visitor created a 1 Landmark Tour |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.  | Entered 'Yes' | The system will display a prompt to save the Tour | |       |
| 2.  | Tap the Back Button | The system will save the Tour and store it in the Select Feature Layout | | |
| 3.  | Check post-condition 1 | | | |
| 4.  | Check post-condition 2 | | | | 

|Post-Conditions|
|---------------|
| 1. The new saved Tour is saved in the Select Feature Layout   |
| 2. Tap the new saved Tour to test if the Tour returns the first Landmark screen | 

|Test Case: 4.2  |Test Case Name: Save 20 Landmark Tour |
|------------|----------------|
|System: LSU Geaux Application    |Subsystem: Save    |
|Designed by: Joshua Koenig          |Design Date: 17/11/2016              |
|Executed by: |Execution Date:    |
|Short Description: Test upper bounds of the Save a Tour Feature|

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png) |
| 5. LSU Visitor created a 20 Landmark Tour |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.  | Entered 'Yes' | The system will display a prompt to save the Tour | |       |
| 2.  | Tap the Back Button | The system will save the Tour and store it in the Select Feature Layout | | |
| 3.  | Check post-condition 1 | | | | 
| 4.  | Check post-condition 2 | | | | 

|Post-Conditions|
|---------------|
| 1. The new saved Tour is saved in the Select Feature Layout             |
| 2. Tap the new saved Tour to test if the Tour returns the first Landmark screen |  

|Test Case: 4.3 |Test Case Name: Save a 13 Landmark Tour |
|------------|----------------|
|System: LSU Geaux Application     |Subsystem: Save    |
|Designed by: Joshua Koenig           |Design Date: 17/11/2016              |
|Executed by: |Execution Date:    |
|Short Description: Test within the bounds of the Save a Tour Feature|

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png) |
| 5. LSU Visitor created a 13 Landmark Tour |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.  | Entered 'Yes' | The system will display a prompt to save the Tour | |       |
| 2.  | Tap the Back Button | The system will save the Tour and store it in the Select Feature Layout | | |
| 3.  | Check post-condition 1 | | | | 
| 4.  | Check post-condition 2 | | | | 

|Post-Conditions|
|---------------|
| 1. The new saved Tour is saved in the Select Feature Layout             |
| 2. Tap the new saved Tour to test if the Tour returns the first Landmark screen | 

|Test Case: 4.4 |Test Case Name: Do not Save a Tour |
|------------|----------------|
|System: LSU Geaux Application     |Subsystem: Save    |
|Designed by: Joshua Koenig           |Design Date: 17/11/2016              |
|Executed by: |Execution Date:    |
|Short Description: Test the rejection of the Save a Tour Feature|

|Pre-Conditions|
|-------------|
| 1. The LSU Visitor must establish Internet Connection.            |
| 2. The LSU Visitor must enable GPS Service on their Android Device.           |
| 3. LSU Visitor opened the LSU Geaux Application.            |
| 4. LSU Visitor  navigated to the [Core Feature Layout.](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/Picture3.png) |
| 5. LSU Visitor created a 13 Landmark Tour |
|Step|Action|Expected System Response|Pass/Fail|Comment|
| 1.  | Entered 'No' | The system will display a prompt to save the Tour | |       |
| 2.  | Tap the Back Button | The system will not save the Tour and store it in the Select Feature Layout | | |
| 3.  | Check post-condition 1 | | | | 

|Post-Conditions|
|---------------|
| 1. The new Tour is not saved in the Select Feature Layout             | 
