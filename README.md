# hospital-employee-database

HospitalEmployeeDatabase

The purpose of this project is to implement a system to store data for employees at UAB Hospital. You have
to implement a for the user to interact with your system, via things like inputs that lead to different functions that
display other things for the user, like the employeeList() function. Another aspect of the project was to implement a
way to change the current stored data. I added ways to add and delete employees based on user input. Additionally, I
had to implement a function to update the actual uabEmployee.txt file that stores the original employee data with the
changes that were made by the user.

I created a ArrayList for every position. I created a class for every position as well, as well as a “SystemTester” class..
I implemented a toString overwrite in HospitalEmployee class, and then overwrote it in every every class, with a
“super” call to each parent class’s “toString”. This allows me to implement the toString() function for child classes
more easily, because it will automatically display the shared data that the parent class has for toString(). This will
make implementing child toString functions less effort and less writing.

I constantly ask for user input in the form of numbers, and this guides the user into which methods they need to be
directed towards. The data from uabEmployees.txt is automatically processed line by line, made into an Array split by
“ “, and then based on what letter is located at index 0 of each line, an object is created in the correct position.
Additionally, based on the letter located at index 0, it asks for different inputs to match the amount of parameters each
position object requires. Getters and setters are made for every variable for every position as well.

This comes up when you first run the code. SystemTester’s method Menu() is being displayed:

<img width="433" alt="Screen Shot 2022-10-12 at 5 24 08 PM" src="https://user-images.githubusercontent.com/107063397/195459172-a3758c14-8c44-4549-a04b-ef60544afbd4.png">

Here I enter “1” to see the employee list:

<img width="495" alt="Screen Shot 2022-10-12 at 5 24 58 PM" src="https://user-images.githubusercontent.com/107063397/195459244-5fc398ab-61d1-4a2f-8b4e-2a7edcafd5d1.png">

It automatically brought me back to the menu, so now I’m going to hit “2” to add an employee.

<img width="495" alt="Screen Shot 2022-10-12 at 5 25 35 PM" src="https://user-images.githubusercontent.com/107063397/195459320-f6e34088-3aea-43ca-98bd-f91eeade7ee2.png">

It will prompt to add all of the necessary information and then it will add the employee:

<img width="495" alt="Screen Shot 2022-10-12 at 5 27 29 PM" src="https://user-images.githubusercontent.com/107063397/195459544-91cf112a-fa83-44e8-885e-dd1ad3487e9f.png">

Lets see it in the list by hitting 1:

<img width="495" alt="Screen Shot 2022-10-12 at 5 28 03 PM" src="https://user-images.githubusercontent.com/107063397/195459637-895dfe37-2f83-479a-b628-7c46f227a51b.png">

Now lets update the txt file. It is not currently exactly like the original since i have been messing with it:

<img width="459" alt="Screen Shot 2022-10-12 at 5 28 41 PM" src="https://user-images.githubusercontent.com/107063397/195459711-32091621-ebb4-40cb-892d-2f07376d6a19.png">

 We don’t see the new person we added yet since we haven’t updated, but i’ll hit 3 (update database) now.:
 
<img width="459" alt="Screen Shot 2022-10-12 at 5 29 23 PM" src="https://user-images.githubusercontent.com/107063397/195459781-72c91b5b-86d5-488d-b33d-1abc7886c5c4.png">

As you can see, in line 7 the new doctor has been added to the txt file.
Now I am going to delete him, i’m going to hit 4:

<img width="459" alt="Screen Shot 2022-10-12 at 5 30 00 PM" src="https://user-images.githubusercontent.com/107063397/195459844-d6d278cd-d493-4831-a9cb-ed4e927e9bb7.png">

So because I typed Mitchell’s blazerID, it removed him from the system, now to save the changes we can hit update
database, 3:

<img width="459" alt="Screen Shot 2022-10-12 at 5 31 25 PM" src="https://user-images.githubusercontent.com/107063397/195460015-fb3cba6f-5c69-455e-86d9-6850684fb2b6.png">

As you can see, the database was updated and Mitchell was removed


