# Travel Agency Database and GUI

## Overview

This project was developed as part of my academic coursework during my 5th semester at the Computer Engineering and Informatics Department at the University of Patras. It allowed me to gain a deeper understanding of the applications of Databases and GUIs.

## Travel Agency Database README

This repository contains the database schema and description for a fictional travel agency's relational database.

### Tables

1. **Branch**: Represents the agency's branches, with each record linking to a specific phone number stored in the "phones" table.

2. **Worker**: Contains information about all agency employees across branches, categorized into administrators (admin), drivers (driver), guides (guide), and IT personnel (it). Each record also includes a reference to the branch where the worker is employed.

3. **Guide**: Stores data about tour guides and their language proficiency. It relates to the "languages" table, which lists the languages each guide can speak.

4. **Manages**: Links administrative workers to the branches they oversee.

5. **Trip**: Records information about organized trips, including the branch responsible for the trip, the driver, and the guide leading the tour. Trips are also associated with events through the "events" table.

6. **Events**: Describes significant events or activities that take place during trips.

7. **Destination**: Lists all possible travel destinations. Destinations are associated with trips through the "travel_to" table.

8. **Travel_to**: Connects trips with their destinations.

9. **Reservation**: Stores reservations made for trips.

10. **Offers**: Contains information about upcoming trips.

11. **Reservation_offers**: Manages reservations for future trips.

12. **Log**: A log table for recording database actions such as inserts, updates, and deletes. It is updated by triggers and does not relate to other tables in the database.

### Database Structure

The database is designed to manage various aspects of a travel agency, including its branches, employees, tours, and reservations. Here's how some of the key tables are related:

- Workers are associated with branches where they work.
- Guides are linked to the languages they can speak.
- Administrative staff oversee branches.
- Trips are organized by branches and include drivers and guides.
- Events are part of trips and are recorded in the "events" table.
- Destinations are associated with trips through the "travel_to" table.
- Reservations are made for trips.
- Upcoming trips and their reservations are managed through the "offers" and "reservation_offers" tables.
- The "log" table keeps a record of database actions.

## Graphical User Interface (GUI)

This repository contains not only the database schema but also a graphical user interface (GUI) for interacting with the database.

![image](https://github.com/christinasamara/travel-agency-database-gui/assets/85516294/ec886dea-56d0-449e-a51e-e92dadbe79f8)

