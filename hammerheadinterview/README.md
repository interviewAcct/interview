The following instructions will allow you to successfully run the following code

Follow the following steps to run:

    - Open project in ide of choice
    - Create jar
    - Open terminal/cmd
    - Traverse to the location of the project
    - Run the following command java -jar [LOCATION OF JAR] [COMMAND]

    -[COMMAND]
        -allroutes
        -uniqueroutes
        -routesbyuser [USER ID]
        -routesbyservice [USER ID] [SERVICES]

    -[USER ID] : Any of at least 1 character in length
    -[SERVICES] : Komoot, RWGP, Strava, (If valid repeated services with the same name are used it will only process
      that service once and any invalid services will be ignored but will continue to process valid services that are
      a part of the given list).

    example
        java -jar C:\Users\Brett\IdeaProjects\hamInterview\out\artifacts\hamInterview_jar\hamInterview.jar
        routesbyservice 42 Komoot STRAVA