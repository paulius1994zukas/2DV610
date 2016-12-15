OVERVIEW
========

Purpose
-------

TEST STRATEGY
=============

INTRODUCTION
------------

### Objective

ASSIGNMENT FORMULATION
----------------------

### Client

### Supplier

### Assignment

SCOPE
-----

### Within scope

### Out of scope

PRECONDITIONS
-------------

PRODUCT RISK ANALYSES
---------------------

TEST LEVELS
===========

Unit testing
------------

Integration testing
-------------------

System testing
--------------

Operational Acceptance testing
------------------------------

TESTING TYPES
=============

Installation testing
--------------------

Compatibility testing
---------------------

Regression testing
------------------

ORGANIZATION
============

Roles, tasks and responsibilities
---------------------------------

Structure of meetings
---------------------

Structure of reporting
----------------------

INFRASTRUCTURE
==============

Test environments
-----------------

Test tools
----------

TEST CASE
=========

TC1 Start Server
----------------

### TC1.1

Input:

-   Set program argument to “” for project main class
    se.lnu.http.HTTPServerConsole.

-   Run MyWebServer.

Output:

-   First row as the text console print is: HTTP Server object
    constructed

-   The second row as the text console print is: HTTP Server started

-   The third row as the text console print is: Accept.

[h!tbp] [TC1.1]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Start web server & TC.1.1 & Port: & Web server has & Started\
& & Path: & been started &\
& & & successfully. &\
& & & &\

Table [TC1.1] The web server should been started successfully.

### TC1.2

Input:

-   Set non program argument to project main class
    se.lnu.http.HTTPServerConsole.

-   Run MyWebServer.

Output:

-   Text console print: Enter a valid port 1-65535 and a optional URL

[h!tbp] [TC1.2]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Enter socket port & TC.1.2 & none & Web server ask & throws &\
and shared resource & & & for the port, & WrongNumberOfArguments- &\
container & & & and url. & Exception. &\
& & & & &\

Table [TC1.2] The web server should ask for socket port and path.

### TC1.4

Input:

-   TC1.2

-   Write to the console: “”.

-   Press enter.

Output:

-   TC1.1

[h!tbp] [TC1.4]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Write to the & TC.1.4 & TC1.1 & TC1.1 & Web server does &\
access log. & & & Access log records & not have an &\
& & & request processed & available access &\
& & & by the server. & log &\

Table [TC1.4] The web server should start and write to the access log.

### TC1.4a

Input:

-   TC1.2

-   Write to the console: “”.

-   Press enter.

Output:

-   Text console print: Socket 80 was taken

-   MyWebServer Stopped.

[h!tbp] [TC1.4a]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Check the socket & TC1.4a & Port: & Not available & Console: &\

port & & Path: & port and the & HTTP Server object- &\

& & & Web server & constructed &\

& & & shuts down. & Port is taken &\

Table [TC1.4a] The web server should print correct error message and
then stop running.

### TC1.4b

Input:

-   TC1.2

-   Write to the console: “”.

-   Press enter.

Output:

-   Text console print: No access to folder /some resource container not
    exist

-   MyWebServer Stopped.

[h!tbp] [TC1.4b]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Check the shared & TC1.4b & Port: & Not available & throws &\

resource container & & Path: & path and the & NotADirectory- &\

& & & Web server & Exception. &\

& & & shuts down. & &\

Table [TC1.4b] The web server should print correct error message and
then stop running.

### TC1.4c

Input:

-   Disable web server to being unable to write log.txt

-   TC1.4

Output:

-   Text console print: Cannot write to server log file log.txt

[h!tbp] [TC1.4c]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Write to the & TC.1.4c & TC1.1 & TC1.1 & Web server does &\
access log & & & Access log records & not have an &\
fail. & & & error occurred. & available access &\
& & & & log &\

Table [TC1.4c] The web server should start but can’t write to the access
log.

TC2 Stop Server
---------------

### TC2.1

Input:

-   TC1.1

-   Stop MyWebServer.

[h!tbp] [TC2.1]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Stop web server & TC.2.1 & TC1.1 & Web server stops & Web server is off
&\

Table [TC2.1] The web server should been stopped successfully.

### TC2.2

Input:

-   TC2.1

Output:

-   First row as the text console print is: HTTP Server stopped

-   The second row as the text console print is: HTTP Server Accept
    thread stopped

[h!tbp] [TC2.2]

<span>llllll</span>\
 **Scenario** & **Test Case** & **Test Data** & **Expected Result** &\
 Check if the & TC.2.2 & TC2.1 & Notifies that the & Web server stops &\
web server has & & & server has stopped. & without notifying &\
stopped. & & & & &\

Table [TC2.2] The web server should been stopped successfully and notify
correct message in the console.

REPORT
======

METRICS
-------

### No. of test cases passed/failed

BEST PRACTICES
--------------

### Exit Criteria

### Conclusion
