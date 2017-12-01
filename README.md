# SimpleProject

Config The Project
1. Edit pom.xml to change project name and groupId

  <groupId>com.semsun.redis (Edit GroupId Here)</groupId>
  <artifactId>%Enter Project Name Here%</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>%Enter Project Name Here%</name>
  <url>http://maven.apache.org</url>

2. Config log in src/main/resource/log4j.properties

 log4j.appender.logfile.File=<Log Path and Name>.log

3. Config package execute. 
 3.1. Default main class path is com.semsun.App. You can change the Main Class anywhere.
 3.2. Edit Execute Shell name 

 $ vi src/main/assemble/package/bin/application

 # Application
 APP_NAME="%You App Name%"
 APP_LONG_NAME="%You App Full Name%"


 $ mv application <You App Name>

 3.3. Config Execute
 $ vi src/main/assemble/package/conf/wrapper.conf

 # Application parameters.  Add parameters as needed starting from 1
 wrapper.app.parameter.1=com.semsun.App (Main Execute Class Path)

4. Clean Project
 $ mvn clean

5. Compile Project
 $ mvn compile

6. Build Execute Package
 $ mvn assembly:assembly

7. Package (When you builded Execute Package. You can just package jar for upgrade.)
 $ mvn package
