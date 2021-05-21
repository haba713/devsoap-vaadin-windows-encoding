# com.devsoap.plugin.vaadin - Windows encoding problem

## Prerequisites

OpenJDK 1.8

## Steps for reproducing the error

Check the Java version:
```
java -version # openjdk version "1.8.0_..."
```

Clone this project and start the application:
```
git clone git@github.com:haba713/devsoap-vaadin-windows-encoding.git
cd devsoap-vaadin-windows-encoding/
./gradlew vaadinRun
```

Wait for the message: `Application running on http://localhost:8080`

Open http://localhost:8080 in browser. You should see `A B C Å Ä Ö` which is
the case when running the app in Linux or Mac.

However, in you run the app in Windows you'll see `A B C Ã… Ã„ Ã–`. How can I
fix the problem?
