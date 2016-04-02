#Steps to Take in JSON and return JSON

##1. Convert JSON to Java Object
	ObjectMapper mapper = new ObjectMapper
	String jsonInString = {}
	
	//JSON from String to Object
	RequestEntity request = mapper.readValue(jsonInString, RequestEntity.class)

##2. Validate

##3. Holiday Logic
	getFirstHoliday
	getSecondHoliday
	getLastHoliday
	
##4. Convert Response Object to JSON
	objectMaper mapper = new ObjectMapper
	ResponseEntity response = new ResponseEntity
	
	//Object to JSON in String
	String jsonInString = mapper.writeValueAsString(response)