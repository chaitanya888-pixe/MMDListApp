# MVVM Clean Architecture Project

This project demonstrates various Android development concepts using **Jetpack Compose**, **Retrofit**, and **Clean Architecture**. It displays a list of articles fetched from a public API along with detailed information about each article.

## Screenshots
<p>
  <img src="https://raw.githubusercontent.com/chaitanya888-pixe/MMDListApp/9bf41e6d1953cc46c669f227faf1a3e43c6a6722/ListScreen.jpeg" alt="List Screen" width="45%" />
  <img src="https://raw.githubusercontent.com/chaitanya888-pixe/MMDListApp/9bf41e6d1953cc46c669f227faf1a3e43c6a6722/DetailsScreen.jpeg" alt="Details Screen" width="45%" />
</p>



https://github.com/user-attachments/assets/87352eda-8d98-447a-87b1-86c772a0c6a6

## Project Structure

The app follows a **modular architecture pattern** with the following main modules:

- **core**:  
  Contains shared resources and configurations essential for the app.

- **data**:  
  Responsible for managing data sources, including local storage, remote APIs, and caching.

- **domain**:  
  Manages the app’s business logic, including use cases and entities.

- **presentation**:  
  Handles the UI using Jetpack Compose to render views and manage user interactions.

## Technologies Used

- **Android** – Core platform for building the app.
- **Jetpack Compose** – Modern UI toolkit for building declarative UIs.
- **Dagger Hilt** – Dependency injection framework for managing app-level dependencies.
- **JUnit** – Testing framework for writing and running unit tests.

---

## Features

- **Jetpack Compose**: Used for modern and declarative UI development.
- **Retrofit**: For seamless API integration.
- **Clean Architecture**: 
  - Separation of concerns across Presentation, Domain, and Data layers.
  - Enhanced reusability, testability, scalability, and maintainability.
- **Dependency Injection**: 
  - Efficient management of modules and initialization of dependencies.
- **Test Cases**:
  - Covers empty, data, and error scenarios for robust implementation.

---

## API Integration

This project uses the following public API for fetching articles:
- **API URL**: [https://newsapi.org/]

---


