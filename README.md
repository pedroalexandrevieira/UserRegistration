# UserRegistration

UsersRegistration This is a back end application for registration of Users.

Tecnologies: Java, Gradle, SpringBoot, RestApi, and mysql.

The aplication allow Create, Get, Delete, and Update user informations.

General instrucions for running the application:

1º Please start mysql, create a database, then create a table with the follow parameters: id,lastName,firstName,lastName,streetName,streetNumber,poBox,city,state,zipCode,country,profile,email,password,confirmPassword.

2º Start the apllication in IDE

3º Inicialize PostMan program

4º Create a new user use the following link in postMan: http://localhost:2020/api/userProfile/createUserProfile . With the informations of the user(the only required field is email).

Exemple: 
<img width="1257" alt="Screenshot 2024-01-29 at 22 51 43" src="https://github.com/pedroalexandrevieira/UserRegistration/assets/88099104/a1279eb2-b0e9-40ff-8b4e-0270a23d9353">

4º Get all users use the following link: http://localhost:2020/api/userProfile/getAllUsersProfiles

For a single user use: http://localhost:2020/api/userProfile/getUserProfile/(userId)

5º Delete a specific user use the following link: http://localhost:2020/api/userProfile/deleteUserProfile/(userId)

5º Update a specific user use the following link: http://localhost:2020/api/userProfile/updateUserProfile/(userId)

6º At this point the application built its propose. Finish :) 
