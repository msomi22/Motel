
-- Schema Name: hoteldb
-- Username: hotel
-- Password: hotel12345

-- These tables describe the database for a point of sale system

-- Make sure you have created a Postgres user with the above username, password
-- and appropriate permissions. For development environments, you can make the 
-- database user to be a superuser to allow for copying of external files. 

-- Then run the "dbSetup.sh" script in the bin folder of this project.

\c postgres

-- Then execute the following:
DROP DATABASE IF EXISTS hoteldb; -- To drop a database you can't be logged into it. Drops if it exists.
CREATE DATABASE hoteldb;

-- Connect with the database on the username
\c hoteldb hotel



-- =========================
-- 1.  Clients/Customers Management
-- =========================


-- -------------------
-- client
----------------------
CREATE TABLE  client (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    name text,
    idnumber text,
    county text,
    phonenumber text,
    email text
);

\COPY client(uuid,name,idnumber,county,phonenumber,email) FROM '/tmp/client.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE client OWNER TO hotel;


----------------------
--clientorder
----------------------
CREATE TABLE  clientorder(
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    clientid text REFERENCES client(uuid),
    ordernumber text,
    deliveryplace text,
    deliverytime text,
    deliverydate text, 
    orderstatus text
);

\COPY clientorder(uuid,clientid,ordernumber,deliveryplace,deliverytime,deliverydate,orderstatus) FROM '/tmp/clientorder.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE clientorder OWNER TO hotel;

---------------
--    orders
-------------
   CREATE TABLE  orders(
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    clientorderId text REFERENCES clientorder(uuid),
    item text,
    quantity integer,
    price integer
);

\COPY orders(uuid,clientorderId,item,quantity,price) FROM '/tmp/order.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE orders OWNER TO hotel; 

-------------
 --   room
-----------
 CREATE TABLE  room (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    roomid text,
    roomclass text,
    status text,
    rentalfee integer
);

\COPY room(uuid,roomid,roomclass,status,rentalfee) FROM '/tmp/room.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE room OWNER TO hotel; 

------------------
--    clientroom
-------------------
CREATE TABLE  clientroom(
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    clientid text REFERENCES client(uuid),
    roomid text REFERENCES room(uuid),
    duration text,
    status text,
    description text
);

\COPY clientroom(uuid,clientid,roomid,duration,status,description) FROM '/tmp/clientroom.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE clientroom OWNER TO hotel;    

--+++++++++++++++++++++
--Employees Management
--++++++++++++++++++++++

--------
--  salary
----------   
CREATE TABLE     salary(
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    category text,
    amount integer
);

\COPY salary(uuid,category,amount) FROM '/tmp/salary.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE    salary OWNER TO hotel; 


--------------------
--    employee
--------------------
CREATE TABLE  employee (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    status text,
    employeeNumber text,
    idnumber text,
    phonenumber text,
    email text,
    salaryid text REFERENCES salary(uuid),
    registrationDate timestamp with time zone DEFAULT now()
);

\COPY employee(uuid,status,employeeNumber,idnumber,phonenumber,email,salaryid,registrationDate) FROM '/tmp/employee.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE employee OWNER TO hotel; 



--------------------
--  employeesalary
--------------------

CREATE TABLE  employeesalary (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    employeeId text REFERENCES employee(uuid),
    day text,
    week text,
    month text,
    year text,
    datepaid timestamp with time zone DEFAULT now()
);

\COPY employeesalary(uuid,employeeId,day,week,month,year,datepaid) FROM '/tmp/employeesalary.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE employeesalary OWNER TO hotel; 

------------
--   position
-------------   
CREATE TABLE  position (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    position text
   
);

\COPY position(uuid,position) FROM '/tmp/position.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE position OWNER TO hotel; 
 
 ------------------
 --  employeeposition
 ------------------
 CREATE TABLE  employeeposition (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    possitionId text REFERENCES position(uuid),
    employeeId text REFERENCES employee(uuid)
);

\COPY employeeposition(uuid,possitionId,employeeId) FROM '/tmp/employeeposition.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE employeeposition OWNER TO hotel; 

------------------
--   users
------------------
 CREATE TABLE  users (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    employeeId text REFERENCES employee(uuid),
    username text,
    password text

   
);

\COPY users(uuid,employeeId,username,password) FROM '/tmp/users.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE users OWNER TO hotel; 

--++++++++++++++++++++++++++
--Meals, beverages Management
--++++++++++++++++++++++++++++

----------------
--category
----------------
CREATE TABLE  category (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    category text,
    description text

  );

\COPY category(uuid,category,description) FROM '/tmp/category.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE category OWNER TO hotel; 

-------------------------
--     Meal
--------------------
CREATE TABLE  meal (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    categoryId text REFERENCES category(uuid),
    description text,
    unitprice integer
  );

\COPY meal(uuid,categoryId,description,unitprice) FROM '/tmp/meal.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE meal OWNER TO hotel; 

--+++++++++++++++++=
--   moneymanagement
--++++++++++++++++++=

--------------------
--sales
----------------
   CREATE TABLE  sales (
	    id SERIAL PRIMARY KEY,
	    uuid text UNIQUE NOT NULL,
	    transactionid text,
	    mealsid text REFERENCES meal(uuid),
	    quantity integer,
	    day text,
	    week text,
	    month text,
	    year text,
	    date timestamp with time zone DEFAULT now()
  );

\COPY sales(uuid,transactionid,mealsid,quantity,day,week,month,year,date) FROM '/tmp/sales.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE sales OWNER TO hotel; 

---------------------
--expenses
-----------------
 CREATE TABLE  expenses (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    day text,
    week text,
    month text,
    year text,
    date timestamp with time zone DEFAULT now(),
    amount integer,
    description text
  );

\COPY expenses(uuid,day,week,month,year,date,amount,description) FROM '/tmp/expenses.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE expenses OWNER TO hotel; 

--+++++++++++++++++
--Account Management
--+++++++++++++++++++

------------------
--account
----------------------
CREATE TABLE  account (
    id SERIAL PRIMARY KEY,
    uuid text UNIQUE NOT NULL,
    motelname text,
    mobile text,
    email text,
    address text,
    town text

  );
  

\COPY account(uuid,motelname,mobile,email,address,town) FROM '/tmp/account.csv' WITH DELIMITER AS '|' CSV HEADER
ALTER TABLE account OWNER TO hotel; 

