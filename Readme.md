# Team Project

###Problem Statement
Currently, Bao is working for UW-Health as an IS analyst. Each week, there is always one person on call in case there is an IS related emergency. The schedule rotates on a weekly basis between 7 people in the unit. Each week starts on Thursday at 7:00 a.m. The rotating schedule has already been filled out for this year except for holiday weeks. UW-Health recognizes 8 holidays every year, New Years, Martin Luther King Day, Memorial Day, July 4th, Labor Day, Thanksgiving, Chirtsmas Eve, and Christmas Day. The way that the holiday schedule is currently filled out is by having the whole unit email Bao an Excel spreadsheet with the holidays ranked from 1-8. 1 being the holiday the employee would prefer to work and 8 being the holiday the employee would prefer to have off. What we would like to create is a simple program that will populate the on-call holiday weeks with the employee's input of top 2 holidays to work and the 1 holiday they would like off. This will save Bao some time from having to go through all the spreadsheets and tallying up everyone's holiday choices. Not only that, but this will create a more neutral scheduling process. 

###Request to send to use HolidayCalculator Webservice
 To use the web service you will need to send a json request that has two objects.  The first object is holiday that is an array of holidays that you want to get staffed by employees.  The other object is an employees object that is an array of json employee objects.  The employee objects require an empid that is an int and a hoiday array that is three elements.  The first element in the array is he holiday they do not want to work.  The next element in the array is the first choice of holiday to work and the 3 element is the second choice of element to work.  The holiday choices are the index of the holiday in the holidays array.  It will look like the example below.
 
 {"holidays":["NewYears","MartinLutherKingDay","FourthOfJuly"],"employees":[{"empid":103,"holidayChoice":[1,2,3]},{"empid":106,"holidayChoice":[2,1,3]},{"empid":104,"holidayChoice":[2,1,3]}]}
 
 ###Response from Webservice
The response will match up an employee to the holiday to work.  It will look like below example.
 
 {response : [{"NewYears":105},{"MartinLutherKing Day":102},{"FourthOfJuly":101}]}
