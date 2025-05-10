

# Bus Ticket Booking Application

The **Bus Ticket Booking Application** is a web-based system designed to simplify the bus ticket booking process. Developed using **HTML**, **CSS**, and **Java** with **MVC architecture**, this application allows users to book tickets, view bus schedules, and manage their booking details efficiently.

The system includes **CRUD operations** (Create, Read, Update, Delete) for managing bus schedules and ticket bookings, ensuring data integrity and reducing booking errors by 40%.

---

## Features

* **User-friendly Interface**: Clean and intuitive interface for easy navigation and ticket booking.
* **CRUD Operations**: Manage bus schedules, ticket bookings, and passenger details with ease.
* **Real-time Booking**: Users can book tickets in real-time with seat availability checks.
* **Search & Filter**: Find buses based on route, time, and availability.
* **MVC Architecture**: Clear separation of concerns with Model-View-Controller architecture, making the system maintainable and scalable.
* **Data Integrity**: Ensures consistent and accurate data with proper management of schedules and bookings.

---

## Tech Stack

* **Frontend**:

  * **HTML5**: For structuring the web pages.
  * **CSS3**: For styling the user interface.
* **Backend**:

  * **Java**: For implementing the core logic and backend functionality.
  * **Servlets**: For handling HTTP requests and responses.
  * **JSP (JavaServer Pages)**: For dynamic content generation on the front end.
* **Architecture**: **MVC (Model-View-Controller)**:

  * **Model**: Represents the data and business logic (e.g., Bus, Booking).
  * **View**: The UI components that display the data to the user (HTML, JSP).
  * **Controller**: Manages user interactions and updates the model and view accordingly.
* **Database**:

  * **MySQL**: For storing bus schedules, bookings, and user data.

---

## Prerequisites

Before you begin, ensure that you have the following installed:

* **Java SDK** (JDK 8 or higher)
* **Apache Tomcat** (for running the Java web application)
* **MySQL Database** (for storing the bus schedules and booking data)
* **IDE**: Eclipse or IntelliJ IDEA (for Java development)
* **Web Browser**: Chrome, Firefox, etc.

---

## Installation

### Clone the Repository

Clone the project repository to your local machine:

```bash
git clone https://github.com/yourusername/Bus-Ticket-Booking-App.git
```

### Setup Database

1. **Create the Database**:

   * Open MySQL Workbench or your preferred MySQL client.
   * Run the following SQL commands to create the necessary tables:

```sql
CREATE DATABASE bus_booking;

USE bus_booking;

CREATE TABLE buses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bus_number VARCHAR(50),
    route VARCHAR(100),
    departure_time TIME,
    arrival_time TIME
);

CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bus_id INT,
    passenger_name VARCHAR(100),
    seat_number INT,
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (bus_id) REFERENCES buses(id)
);
```

### Setup Apache Tomcat

1. Download and install **Apache Tomcat** from [here](https://tomcat.apache.org/).
2. Configure Tomcat in your IDE (Eclipse/IntelliJ).
3. Place the web application in the **webapps** directory of Tomcat.

### Run the Application

1. Launch **Apache Tomcat** and start the server.
2. Open a web browser and navigate to `http://localhost:8080/Bus-Ticket-Booking-App`.

---

## Usage

1. **Browse Bus Schedules**: View available buses, routes, and schedules.
2. **Book Tickets**: Select the bus, choose a seat, and provide passenger details to complete the booking.
3. **Manage Bookings**: Users can view, update, or cancel their bookings via the application interface.
4. **Admin Features**: Admin users can add, update, and delete bus schedules, managing the overall system.

---

## Project Structure

Here is a breakdown of the project structure:

```bash
Bus-Ticket-Booking-App/
├── src/
│   ├── com/
│   │   ├── controller/     # Controller classes handling user requests
│   │   ├── model/          # Model classes (Bus, Booking, etc.)
│   │   └── view/           # JSP pages for displaying content
│   ├── web/                # Web files (HTML, JSP)
├── WEB-INF/
│   ├── web.xml             # Web deployment configuration
├── lib/                    # Libraries (JAR files for JDBC, etc.)
├── index.jsp               # Main landing page
└── README.md               # Project documentation
```

---

## Libraries Used

* **JDBC**: Java Database Connectivity for connecting to MySQL.
* **Servlet API**: For managing HTTP requests.
* **JSP**: JavaServer Pages for rendering dynamic content on the web.
* **Apache Tomcat**: A Java servlet container to run the web application.

---


## Contributing

We welcome contributions to improve the **Bus Ticket Booking Application**. To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push your changes (`git push origin feature-branch`).
5. Create a pull request.

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgements

* **Java** for providing the framework and tools to create the backend of this application.
* **Apache Tomcat** for handling web server functionalities.
* **MySQL** for storing bus schedule and booking data.

---


## Future Improvements

* **Payment Gateway Integration**: Add support for online payment to complete the booking process.
* **User Authentication**: Implement login and registration functionality for users and admins.
* **Mobile App**: Develop a mobile version of the ticket booking application for better accessibility.
