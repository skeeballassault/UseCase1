# Alphacare
This program's login is a placeholder for the login list. The userlist is contained within USERS.csv, and the UserList class will interpret and store the list of users. At the moment, the standby login names and passwords are:

User: bromboni1997
Pass: Testing1

User: roberto5
Pass: Testing2

User: stickleg
Pass: Testing3

Account creation is not yet functional, but all of the fields work, including the password strength checker. Once the account creation is finished, the new users will be appended to the USERS.csv file.

UserFactory is a class that creates 3 different types of users: Patient, Pharmacist, & Doctor that are saved within an ArrayList. All three of these types are declared based off of what the user selects within the ComboBox. This ArrayList will then be written to the accompanying CSV containing user logins [WIP]

We have implemented the two use cases for patients allowing them to view their medical history and prescriptions. In order to allow doctors to write with the most amount of fidelity, we used a text box instead of prefilled menu items. If selected in the list, the labels with display the appropriate text since we used hashmaps to label the entries.

Refactored code was we fixed unnecessary 'code' which was code that was repeated and redundant for no apparent reason).  In the patientMedicalHistoryController.java class, there was an ObservableList added for data storage. We repeated a lot of data in order to stress test the listview element of the JavaFX. We also added unused classes. Before this sprint, the login UI was only used to transition to the next screen with no username or password used. Now it checks for the correct username and password combination. 