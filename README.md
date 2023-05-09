# LSMSystem
This project is a system that allows its users to learn the Mexican Sign Language (Lengua de Señas Mexicana) through an Android App as well as monitor the learning process of it through a Web interface.

### Android App users
- Can navigate along a dictionary of words and expressions of the Mexican Sign Language and watch a video demostration of them.
- Can search a specific word or expression.
- Can take quizzes to test and keep track of their knowledge.
- Can register as employees of a specific company to allow it to track them as well as log in if already registered.

### Web interface users
- Can register a company to provide the means to link their employees as users of the Android App.
- Can register an administrator linked to a company.
- Can visualize the global progress of knowledge of the Mexican Sign Language of the company's employees.
- Can search the specific stats of every registered employee.
***
This project integrates different components as part of a REST architecture:

Web Interface: A web page developed in React JS.
Android App: An App developed in Kotlin with Retrofit.
API: An interface built in Node JS and Express.
Database: A MySQL database.
