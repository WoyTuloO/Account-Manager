# Account Manager
## Requirements
Java Runtime Environment Version 8
## Technologies
Project created using:
 - Java Swing

Tools used:
 - Apache NetBeans
 - Intelij IDEA
 - Maven

## Setup
To run the app you can just download the AccMgr.exe .
Alternatively download whole project, compile and run it yourself using JDK 21 and IDE of your choice.


## General info

### Main Frame
![image](https://github.com/WoyTuloO/Account-Manager/assets/145787367/15b9fbad-ea64-438d-b426-e017900ad543)

This is where user can add new entries to the memory of the app as well as create additional file, where one can store desired data as backup. User can easily load backup data into the app by clicking proper button. Both backup and latest state of the app is saved in user's documents folder.
### Add Account
![image](https://github.com/WoyTuloO/Account-Manager/assets/145787367/fa1fc1f1-0d28-48fc-a28c-3aad10d91623)

A new frame is created that gets the input of platform, login, and password textfields and passes them using shared memory to a dedicated thread running in main frame, so it is correctly read and displayed in the table.
### Edit Account
![image](https://github.com/WoyTuloO/Account-Manager/assets/145787367/bac2bf03-7e44-4030-9d75-22100ba69d7f)

A new frame where using similar mechanisms to ones used in creating new account, edited data is transferred using shared memory to an Edit Frame, where user can edit desired textfields and then pass the data back to Main Frame, to a thread waiting it. 

### Search For Account By Criteria
![image](https://github.com/WoyTuloO/Account-Manager/assets/145787367/0ea6b7cb-7a10-46f5-8288-b500ce12789d)

Utilizes a table row sorter to filter out entries that do not match the criteria. It looks for patterns in whole row, so there is no need to specify whether user is looking for a platform or login, it will display every entry with a cell that meets a given parameter.

## Features
#### Implemented:

 - Adding new entries
 - Removing existing entries
 - Editing existing entries
 - Filtering entries out with user given criteria
 - Creating and loading a latest save of data when closing/opening the app
 - Creating and loading a backup file on user's command
 
 #### To Implement:
 - Sorting existing entries

