FROM tomcat:latest
ADD *.war /usr/local/tomcat/webapps/CMAD1-0.0.1-SNAPSHOT.war
ADD setenv.sh /usr/local/tomcat/bin/setenv.sh