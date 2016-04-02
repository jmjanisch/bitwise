#Steps to Take in JSON and return JSON

##1. Consume JSON
###CoverageCalculator
	take the json from the URI

##2. Convert JSON to Java Object
###ProcessRequest class 
	takes in the JSON and parses
###Request class
	creates the request object uses the Employee class
	

##2. Validate
	validate class

##3. Holiday Logic
	go through holidays submitted and the holiday choices of the employees
	creates the ResponseEntity object that has the holidays and employees
	
##4. Convert Response Object to JSON
###CreateResponse
	parses through the java object ResponseEntity to create the response
###ResponseEntity class
	