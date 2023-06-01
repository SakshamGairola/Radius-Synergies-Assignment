# How to run the project
From the project root folder do a maven run to run the application
It will start on `localhost` port `8080`(default) with `localhost:8080/api` as context path
H2 web console is availabe form `localhost:8080/api/h2-consolse`
Tthere are 2 APIs in the project :
1. `getAll` GET API to fetch everything
2. `get/{id}` where `id` is to be provided, it fetches user with given id if exists

H2 databse is strored locally in `./h2`

For API testing a postman collection is provided in `./postmanCollection` directory

# Other solutions

Solution for other DSA/Logic based questions are in `./src/main/java/com/getUser/getUserAPI/OtherSolutions` directory with their respected `main()` methods