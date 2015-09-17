# birdApi

Basic HTTP service with a JSON API. The service you will build is a bird registry and it will support the following requests:

    GET /birds - List all birds
    POST /birds - Add a new bird
    GET /birds/{id} - Get details on a specific bird
    DELETE /birds/{id} - Delete a bird by id
    
Installation & Build Steps
-----------------------------
Its basicaly a maven project so you need to build it using maven commands
mvn clean install

Running App.
-----------
You need to run the AppConfig.java which has spring Boot Application runner.

Application runs at http://localhost:8080/birds

Some of the sample post request jsons are 
{"name":"Tweety44","family":"f223","continents":["North America","Latin","Asia"],"added":"Tue Sep 15 02:30:08 IST 2015","visible":true}

