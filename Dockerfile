FROM tomcat:9.0
COPY target/maven-war-plugin-example-1.0.0-SNAPSHOT.war  /usr/local/tomcat/webapps/
