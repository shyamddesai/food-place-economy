# Food Place Economy
Food Place Economy is a model simulating the economy in the food service industry, specifically designed to practice concepts of inheritance and polymorphism. This model includes various food establishments, such as restaurants, food stands, and fast food outlets, along with mechanisms for processing bills, handling tips, and collecting taxes.

## Overview
This project simulates a food service environment where customers can:
- Purchase food from various types of establishments (restaurants, food stands, fast food).
- Receive and pay bills, with calculations for sales tax and tips.
- Interact with a tax collector responsible for collecting both sales tax and income tax.

The system models various entities and relationships in a food service economy, such as:
1. **FoodPlace**: Represents different types of food establishments.
2. **IncomeTaxPayer**: Models individuals or entities responsible for paying income tax.
3. **Customer and Check**: Handles customer interactions and bill processing, including tips and taxes.

## Key Features
1. **Inheritance and Polymorphism**: This project demonstrates inheritance by defining a hierarchy of `FoodPlace` and `IncomeTaxPayer` subclasses. Polymorphism allows various classes to implement tax and income methods in different ways.
2. **Tax Collection**: A `TaxCollector` class collects sales and income taxes from each `FoodPlace`, simulating real-world tax collection.
3. **Bill Calculation**: The `Check` class calculates total bills, including sales tax and tips, based on each customer’s order.
4. **Encapsulation of Business Logic**: Each class encapsulates specific business logic relevant to its role in the food service model, such as employee income, owner expenses, and customer payments.

---

## Project Structure
- **FoodPlace.java**: Abstract class for food establishments, extended by `Restaurant`, `FoodStand`, and `FastFood`.
- **IncomeTaxPayer.java**: Abstract class for entities paying income tax, extended by `Staff`, `Owner`, and `WorkingOwner`.
- **Customer.java**: Represents customers who interact with food establishments.
- **Check.java**: Manages and calculates bills, including tax and tip.
- **TaxCollector.java**: Responsible for collecting sales and income taxes from `FoodPlace` and `IncomeTaxPayer` entities.

## Class Structure
### FoodPlace Class
The `FoodPlace` class is an abstract class that represents a food establishment. Each subclass represents a specific type of food place with its unique attributes and methods:
- **Restaurant**: Contains staff like cooks and servers.
- **FoodStand**: Operated by a `WorkingOwner`.
- **FastFood**: Employs a list of `Staff` members.

Each subclass is responsible for managing its own income and tax contributions.

![image](https://user-images.githubusercontent.com/21160813/186042744-77b4d392-cdb1-44eb-bd36-8cf77beff9c1.png)  <br>
*(UML diagram of FoodPlace classes as provided)*

### IncomeTaxPayer Class
The `IncomeTaxPayer` class represents any individual or entity that pays income tax. It is extended by specific classes like `Staff`, `Owner`, and `WorkingOwner`, each with unique properties and tax-related attributes.
- **Staff**: Employees working in various establishments, with specific tax and salary details.
- **Owner**: Owns a `FoodPlace` and is responsible for overall financial obligations.
- **WorkingOwner**: Manages day-to-day operations and includes tips in income.

![image](https://user-images.githubusercontent.com/21160813/186043018-3f01af23-1c33-4b20-baba-ea7100876675.png)  <br>
*(UML diagram of IncomeTaxPayer classes as provided)*

### Additional Classes
- **Check**: Manages billing details, including menu price, sales tax, and tips.
- **TaxCollector**: Collects both sales tax and income tax from various food places and individuals.
- **Customer**: Represents customers who interact with the food establishments, make purchases, and pay bills.

![image](https://user-images.githubusercontent.com/21160813/186043053-5f065647-9d45-4ff9-98a9-46e0ce18ef32.png)  <br>
*(UML diagram of remaining classes as provided)*

---

## Setup and Execution
1. **Compile the Java Files**:
   ```bash
   javac *.java
   ```

2. **Run the Main Program**:
   ```bash
   java Main
   ```
