# Java_HospitalEmployeeDatabase

HospitalEmployeeDatabase

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

<img width="540" alt="Screen Shot 2022-10-12 at 5 21 08 PM" src="https://user-images.githubusercontent.com/107063397/195458838-0dac49fd-32a1-403d-8899-d9fe6d48ede1.png">
<img width="540" alt="Screen Shot 2022-10-12 at 5 21 21 PM" src="https://user-images.githubusercontent.com/107063397/195458846-2aaea6e8-034b-4cbb-a832-bd87ed34b3fe.png">


