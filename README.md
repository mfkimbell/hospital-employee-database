# Java_HospitalEmployeeDatabase

Introduction
Explain the purpose of the project (1 Paragraph)
The purpose of this project is to implement a system to store data for employees at UAB Hospital. You have
to implement a for the user to interact with your system, via things like inputs that lead to different functions that
display other things for the user, like the employeeList() function. Another aspect of the project was to implement a
way to change the current stored data. I added ways to add and delete employees based on user input. Additionally, I
had to implement a function to update the actual uabEmployee.txt file that stores the original employee data with the
changes that were made by the user.
Code Explanation
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

<img width="542" alt="Screen Shot 2022-10-11 at 8 17 25 PM" src="https://user-images.githubusercontent.com/107063397/195226929-678f57ac-5571-458b-ac31-8f73a95a5a80.png">
<img width="342" alt="Screen Shot 2022-10-11 at 8 17 39 PM" src="https://user-images.githubusercontent.com/107063397/195226935-c39153b7-4c1d-4fdd-b7d6-bfe7c873a813.png">
<img width="343" alt="Screen Shot 2022-10-11 at 8 17 48 PM" src="https://user-images.githubusercontent.com/107063397/195226939-526c2781-7b3b-41a4-beac-5b9fc03e63a8.png">
<img width="340" alt="Screen Shot 2022-10-11 at 8 17 57 PM" src="https://user-images.githubusercontent.com/107063397/195226943-5ca2a364-905a-4bd9-8882-06a0916db888.png">
<img width="350" alt="Screen Shot 2022-10-11 at 8 18 06 PM" src="https://user-images.githubusercontent.com/107063397/195226951-d9b52783-86f1-4e9f-a7e5-45cfb2e7ed7a.png">
<img width="255" alt="Screen Shot 2022-10-11 at 8 18 23 PM" src="https://user-images.githubusercontent.com/107063397/195226971-e92b3d56-68fb-443a-a71e-3c644c86974b.png">

