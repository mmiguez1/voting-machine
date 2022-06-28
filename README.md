# Voting Machine Project
This project mimics a voting machine which allows the user to input a ballot file, vote on a ballot, and view outputted election results. 

## How To Launch the Program
1. Clone this repository
2. Open & Run the Executable JAR File

## How to Input a Ballot File
Once you run the voting_machine_project.jar file, it will prompt you to browse and select an input text file for program to retrieve ballot information from. 

* NOTE: File must be text (.txt) file with information formatted correctly. 
* The format should be as follows:
        
Matter being voted on
Number of Candidates
Candidate Name;Party Affiliation
        
*Example format of input file shown below.*

```
James Beard Award
3
Nina Compton;Compere Lapin
Alon Shaya;Saba
Emeril Lagasse;Emeril's
```
## How to Vote on Ballot
After selecting a ballot .txt file and clicking "OK", the ballot window will appear. To vote for desired candidate, click candidate’s name and then click ‘Cast Vote’ button.

## How to Output Election Results
After closing the ballot, a new window will appear asking you to provide an output file for the 
program to write the election results to. The browse window will appear allowing you to browse your computer folders. Name the file in the ‘File Name’ text entry box. Click the ‘Save’ to save the file name and location and then 'OK'. 
     
* NOTE: This file must be saved as a text (.txt) file

Open output file once saved to view results.

*Example format of output file shown below.*
```
RESULTS - James Beard Award
---------------------------
Nina Compton - Compere Lapin          3
Alon Shaya - Saba                     1
Emeril Lagasse - Emeril's             0
      
WINNER: Nina Compton - Compere Lapin
```
        
