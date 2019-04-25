The following instructions will allow you to successfully run the following code

I have attached a jar inside of out\artifacts\hamInterview_jar\hamInterview.jar for the convienence of running locally
on the users machine.

Follow the following steps to run:

    - Open project in ide of choice
    - Copy path of the hamInterview.jar inside out\artifacts\hamInterview_jar\
    - Open terminal/cmd
    - Traverse to the location of the project
    - Run the following command java -jar [LOCATION OF JAR] [COMMAND]

    -[COMMAND]
        -allroutes
        -uniqueroutes
        -routesbyuser [USER ID]
        -routesbyservice [USER ID] [SERVICES]

    -[USER ID] : Any AlphaNumeric or Numeric containing no spaces or tabs.
    -[SERVICES] : Komoot, RWGP, Strava

    example
        java -jar C:\Users\Brett\IdeaProjects\hamInterview\out\artifacts\hamInterview_jar\hamInterview.jar
        routesbyservice 42 Komoot, STRAVA