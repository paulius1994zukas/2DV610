My web server

Test Document By. Software Development Company

Semester: HT2016 Course: Software Testing Code: 2DV610

Revision History Revision

Date

Author(s)

Description

1.0

22.12.2016

Test Manager

Created

i

Contents 1

OVERVIEW 1.1 Purpose . . . . . . . . . . . . . . . . . . . . . . . . . .
. . . . . . . . .

1 1

2

TEST STRATEGY 2.1 INTRODUCTION . . . . . . . . 2.1.1 Objective . . . . .
. . . . 2.2 ASSIGNMENT FORMULATION 2.2.1 Client . . . . . . . . . . .
2.2.2 Supplier . . . . . . . . . . 2.2.3 Assignment . . . . . . . . 2.3
SCOPE . . . . . . . . . . . . . . 2.3.1 Within scope . . . . . . . 2.3.2
Out of scope . . . . . . . 2.4 PRECONDITIONS . . . . . . . . 2.5 PRODUCT
RISK ANALYSES . .

. . . . . . . . . . .

2 2 2 2 2 2 2 2 2 2 2 2

. . . .

3 3 3 3 3

4

TESTING TYPES 4.1 Installation testing . . . . . . . . . . . . . . . . .
. . . . . . . . . . . . . 4.2 Compatibility testing . . . . . . . . . .
. . . . . . . . . . . . . . . . . . 4.3 Regression testing . . . . . . .
. . . . . . . . . . . . . . . . . . . . . . .

4 4 4 4

5

ORGANIZATION 5.1 Roles, tasks and responsibilities . . . . . . . . . . .
. . . . . . . . . . . 5.2 Structure of meetings . . . . . . . . . . . .
. . . . . . . . . . . . . . . . 5.3 Structure of reporting . . . . . . .
. . . . . . . . . . . . . . . . . . . . .

5 5 5 5

6

INFRASTRUCTURE 6.1 Test environments . . . . . . . . . . . . . . . . . .
. . . . . . . . . . . . 6.2 Test tools . . . . . . . . . . . . . . . . .
. . . . . . . . . . . . . . . . .

6 6 6

7

TEST CASE 7.1 TC1 Start Server 7.1.1 TC1.1 . . 7.1.2 TC1.2 . . 7.1.3
TC1.4 . . 7.1.4 TC1.4a . 7.1.5 TC1.4b . 7.1.6 TC1.4c . 7.2 TC2 Stop
Server 7.2.1 TC2.1 . . 7.2.2 TC2.2 . .

3

TEST LEVELS 3.1 Unit testing . . . . . . . . . . 3.2 Integration testing
. . . . . . . 3.3 System testing . . . . . . . . . 3.4 Operational
Acceptance testing

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . . . . . . . .

. . . .

. . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . . .

. . . .

. . . . . . . . . .

. . . . . . . . . .

7 7 7 7 8 8 9 9 10 10 10

8

REPORT 8.1 METRICS . . . . . . . . . . . . . . . 8.1.1 No. of test cases
passed/failed 8.2 BEST PRACTICES . . . . . . . . . . 8.2.1 Exit Criteria
. . . . . . . . . . 8.2.2 Conclusion . . . . . . . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

. . . . .

11 11 11 11 11 11

1 1.1

OVERVIEW Purpose

1

2

TEST STRATEGY

2.1 2.1.1 2.2

INTRODUCTION Objective ASSIGNMENT FORMULATION

2.2.1

Client

2.2.2

Supplier

2.2.3

Assignment

2.3

SCOPE

2.3.1

Within scope

2.3.2

Out of scope

2.4

PRECONDITIONS

2.5

PRODUCT RISK ANALYSES

2

3

TEST LEVELS

3.1

Unit testing

3.2

Integration testing

3.3

System testing

3.4

Operational Acceptance testing

3

4

TESTING TYPES

4.1

Installation testing

4.2

Compatibility testing

4.3

Regression testing

4

5

ORGANIZATION

5.1

Roles, tasks and responsibilities

5.2

Structure of meetings

5.3

Structure of reporting

5

6

INFRASTRUCTURE

6.1

Test environments

6.2

Test tools

6

7

TEST CASE

7.1

TC1 Start Server

7.1.1

TC1.1

Input: • Set program argument to “1091
\tests\se\lnu\http\resources\inner” for project main class
se.lnu.http.HTTPServerConsole. • Run MyWebServer.

Output: • First row as the text console print is: HTTP Server object
constructed • The second row as the text console print is: HTTP Server
started • The third row as the text console print is: Accept. Table 2:
TC1.1 Scenario Test Case Start web server TC.1.1

Test Data Port: 1091 Path: \tests\se\lnu
\http\resources
\inner

Expected Result Actual Result Web server has Started been started
successfully.

Table 2 The web server should been started successfully. 7.1.2

TC1.2

Input: • Set non program argument to project main class
se.lnu.http.HTTPServerConsole. • Run MyWebServer. Output: • Text console
print: Enter a valid port 1-65535 and a optional URL Table 3: TC1.2
Scenario Test Case Test Data Expected Result Enter socket port TC.1.2
none Web server ask and shared resource for the port, container and url.

Table 3 The web server should ask for socket port and path. 7

Actual Result throws WrongNumberOfArgumentsException.

7.1.3

TC1.4

Input: • TC1.2 • Write to the console: “1091
\tests\se\lnu\http\resources\inner”. • Press enter.

Output: • TC1.1 Table 4: TC1.4 Scenario Write to the access log.

Test Case Test Data TC.1.4 TC1.1

Expected Result TC1.1 Access log records request processed by the
server.

Actual Result Web server does not have an available access log

Table 4 The web server should start and write to the access log. 7.1.4

TC1.4a

Input: • TC1.2 • Write to the console: “80
\tests\se\lnu\http\resources\inner”. • Press enter.

Output: • Text console print: Socket 80 was taken • MyWebServer Stopped.
Table 5: TC1.4a Scenario Check the socket port

Test Case TC1.4a

Test Data Port: 80 Path: \tests\se\lnu
\http\resources
\inner

Expected Result Not available port and the Web server shuts down.

Actual Result Console: HTTP Server objectconstructed Port is taken

Table 5 The web server should print correct error message and then stop
running.

8

7.1.5

TC1.4b

Input: • TC1.2 • Write to the console: “1091 /some resource container
not exist”. • Press enter.

Output: • Text console print: No access to folder /some resource
container not exist • MyWebServer Stopped. Table 6: TC1.4b Scenario
Check the shared resource container

Test Case TC1.4b

Test Data Port: 1091 Path: /some resource container not exists

Expected Result Actual Result Not available throws path and the
NotADirectoryWeb server Exception. shuts down.

Table 6 The web server should print correct error message and then stop
running. 7.1.6

TC1.4c

Input: • Disable web server to being unable to write log.txt • TC1.4
Output: • Text console print: Cannot write to server log file log.txt
Table 7: TC1.4c Scenario Write to the access log fail.

Test Case Test Data TC.1.4c TC1.1

Expected Result Actual Result TC1.1 Web server does Access log records
not have an error occurred. available access log

Table 7 The web server should start but can’t write to the access log.

9

7.2

TC2 Stop Server

7.2.1

TC2.1

Input: • TC1.1 • Stop MyWebServer. Table 8: TC2.1 Scenario Stop web
server

Test Case Test Data TC.2.1 TC1.1

Expected Result Web server stops

Actual Result Web server is off

Table 8 The web server should been stopped successfully. 7.2.2

TC2.2

Input: • TC2.1 Output: • First row as the text console print is: HTTP
Server stopped • The second row as the text console print is: HTTP
Server Accept thread stopped Table 9: TC2.2 Scenario Test Case Test Data
Check if the TC.2.2 TC2.1 web server has stopped.

Expected Result Actual Result Notifies that the Web server stops server
has stopped. without notifying

Table 9 The web server should been stopped successfully and notify
correct message in the console.

10

8

REPORT

8.1 8.1.1 8.2

METRICS No. of test cases passed/failed BEST PRACTICES

8.2.1

Exit Criteria

8.2.2

Conclusion

11


