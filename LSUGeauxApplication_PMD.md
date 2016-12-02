# Project Management Document

## for
# LSU Geaux Tour and Maps Application

### Version 1.1
### Prepared by 
### Tohyup Cho
### Joshua Koenig
### Javier Rodriguez
	         
##### CSC 4330 
##### Fall 2016 
##### December 2, 2016.

## 1. Vision

When new students and staff arrive at LSU, they might be overwhelmed size of our campus. Finding classes is frustrating as many maps provided by LSU do not list every potential building that could contain classes. Many more buildings are unlisted, but are still important to students for finding instructor offices or discovering a place to study or locating a place to eat. While GPS services display a building’s coordinates, they are inconsistent in finding individual halls. This project's goal was to create a dynamic, descriptive, interactive thoroughfare through which the user could navigate LSU’s vast campus. Displaying most of LSU’s Landmarks with a descriptive photo and GPS guidance, new visitors, students, and staff can stop worrying about finding their destination and focus on enjoying their time at the university.

## 2. The Unified Process and Agile Methodologies

The Unified Process is the agile methodology that was best suited for our project vision. With how the class was structured, we deemed that the Unified Process phases: inception, elaboration, construction, and transition most aligned with the predetermined deliverables of the class. Our work on the project over the semester was equivalent to an iteration of the Unified Process. Every phase was involved in our application’s development. Each phase developed its own iteration, terminating in the project deliverable. The SRS was a result of our Unified Process inception phase in which we identified all of our priorities and risks. The elaboration phase in the Unified Process model most closely aligned with the software design document deliverable. We used the construction phase to design an application that was easily testable. The transition phase is the period in which the application is presented to the class, and the instructor and teaching assistant provide critique on how to improve the application if it was further improved after the course. In other words, the project would be transitioning into another development iteration if desired.

## 3. Configuration Management

Javier Rodriguez handled the brunt of feature implementation and used Github to host code that needed the group's green light. Joshua Koenig and Tohyup Cho mainly used GitHub to cooperatively build documentation and to host the images and diagrams used in the documents. Due to initial inexperience with the internal mechanisms of GitHub, Joshua and Tohyup experienced an issue in which they attempted to update the main branch at once without using the pull request feature. This resulted in a failure to merge progress. Upon realizing the mistake and communicating with each other, Joshua and Tohyup quickly reverted the changes using the change history feature on GitHub and addressed the problem. As for the diagrams and images, GitHub provided a secure place to host them for use in the documents.

## 4. Deliverables

   1. Software Requirements Specification Document

      Outlined By Javier Rodriguez and extrapolated by Joshua Koenig, the project's Software Requirements Specification Document was the first major deliverable developed by the project team. The team began discussion about the Software Requirements Specification Document beginning in and around the first week of the 14 week development period. Inception and requirements specification took the project team 9 weeks to develop. Joshua transcribed and edited the final Markdown version of the Software Requirements Specification Document.

   2. Software System Design Document

      The project team divided the Software System Design Document into manageable sections according to each team developer. Joshua Koenig was responsible for the Markdown write up as well as the Introduction, Main and Subsystem Architecture, and received assistance from Javier while developing the User Interface section. Tohyup Cho developed the Physical View Section and the Element Catalog. Javier was responsible for the Data View, Work Assignment View, and the Development View sections. All documentation on this deliverable was conceived and implemented in a week.

   3. Final Executable Code

      Javier Rodriguez held a majority of the responsibility concerning code development. The executable code was not considered part of the critical path of the project timeline, thus it could be subject to slack. Javier implemented a majority of the mission critical code in a period of 5 weeks. The mission critical code included both the Find and Save feature code as well as any complexity reduction performed by Javier.

   4. Software Testing Document
      
      All project developers contributed to the formation of the Software Testing Document deliverable.  Test cases were compiled and confirmed at the group's consensus. Joshua handled the Markdown write up and contended for the proper arrangement of bounds testing.  For each of the 9 test cases listed in the Software Testing Document, each project member was responsible for 3--Joshua taking the first 3, Javier the second 3, and so on.

   5. Project Presentation

      Every project developer contributed at the project presentation itself. Joshua Koenig developed the presentation slides. Each member developed his script with aid from Joshua as needed.  

   6. Project Management Document
    
      Tohyup Cho created the original version of the Project Management Document as well as created any diagrams used in the document,  Joshua Koenig developed the Markdown write up and edit of the deliverable.

## 5. Potential Risks

As a small project team, we sought to create and foster project development that was productive and challenging yet not overly ambitious. However, there were still several risks involved. Javier, the team's main implementation engineer, provided  a source of human risk. If he ever became sick, the project development would suffer. The largest issue encountered was the time risk. With a small team and the duration of a semester, the team was not able to follow through with some potential improvements to its application. For example, a major quality of life improvement of the application included allowing the user to choose a specific number of Landmarks to use in a custom tour. Doing so would require an entire restructuring of the code, and the team was not confident that it could be completed in time. The project team deemed that four Landmarks for creating a custom tour would be sufficient because the number of classes that a new student would visit in a single day would rarely exceed four. Concerning liability issues, the user could get lost while using our application and blame the GPS system for leading him or her astray. Another liability issue is that the team would need to receive LSU’s permission for trademark usage in the application before it can be marketed.

## 6. Team Members

The team members of this project held to an egoless team management style. This style choice allowed for team members to divide project tasks into their own personal area of expertise without the possibility of managerial conflict. 

Tohyup Cho – handled documentation, in charge of Project Management Document and recording meetings

I mainly shared documentation with Joshua. I worked on every document when it came to creating most of the diagrams and helping draft the documents with Joshua before he converted it into Markdown. Because we were such a small group, we were easily able to schedule meetings that everyone could attend. Thanks to this, I did not miss any meetings. This was important because I oversaw recording what we did at each meeting in order to complete the meetings summaries section of the Project Management Document. I was also in charge of drafting most of the Project Management Document and creating the Gantt chart before sending it to Joshua for Markdown conversion.

Javier Rodriguez – handled coding, contributed to documentation

My major contribution for this project was to serve as the lead programmer. I implemented the new features for the system and tested them. I also supported my teammates by helping them with the documentation. I provided the Database design and the development view for the software design document. Also, I contributed in the creation of the software requirements document and I participated in all presentations and meetings.

Joshua Koenig - handled documentation and Markdown editing, served as pseudo-project manager organizing meetings and delegating responsibility

I assisted in the application's ideological conception. I managed project timeline and continuity. I served as the team's Markdown and documentation editor. I served as the project's Github gatekeeper. I facilitated succinct communication of ideas and information between group members. I developed the presentation of the project as well as provided any assistance to the other group members in their responsibilities. Although we used an egoless team management approach, the green light power resided with me.

## 7. Project Schedule

![alt text](https://raw.githubusercontent.com/jkoeni6/LSU-Geaux-App/master/thumbnail_gantt_chart.jpg "Gantt Chart")  

The project team used the critical path method to construct a Gantt Chart consisting of milestones.  Each milestone is defined by the corresponding deliverable. The critical path of our application development timeline is of the length 14 weeks.  Rough estimates of timeline place the development of the SRS document around 9 weeks. The structuring of the Software Software System Design document was placed around the duration of 1 week. The mission critical code fell of the critical path and could be collectively completed in the estimation of about 5 weeks.  The Software Testing document had a 3 week development phase which was quickly followed by the 1 week development phase of the Project Presentation and Project Management document. Due to our egoless team structure, any team member could call a meeting at any time for any reason. However team meetings usually corresponded to the completion of a project deliverable.

## 8. Meeting Summaries

October 21, 10:30 AM – 12:00 AM Members met to discuss SRS document content. Members discussed using GitHub for image hosting for documents and were assigned segments for SRS. Group also discussed plans for new features on application. Find, and Save/Saved Tour options were planned.

November 1, 6:00 – 7:00 PM Meeting to discuss how to complete SSD which required many more diagrams than SRS. A platform more efficient than image editing software was required. https://www.draw.io/ - browser based program designed for diagrams specifically - was suggested by Tohyup. Each member agreed to creating their segments of the document.

November 2, 6:00 – 6:45 PM After each member created his share of diagrams, group met to discuss finishing changes and how entire document would be organized.

November 17, 6:00 – 7:00 PM Group met to discuss what test cases were to be created for STD. Members cooperatively designed rough test cases by hand before adjourning to create them

individually. Group also discussed time constraints on Save/Saved feature and chose to restrict Landmark number for Saved Tours to four.

November 27, 9:30 – 10:15 PM Group had brief meeting to assign speaking parts and agree on speech for each slide in presentation.

November 30, 5:15 – 7:00 PM Group met with TA to review project. After the meeting with the TA, group met to discuss finishing touches on Project Management Document.  