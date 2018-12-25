  stpes :
    

commnd prompt: 

mvn archetype:generate -DgroupId=com.kg.webapp1 -DartifactId=webapp1 -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
  
   then 
   vs code tomat Server extension 
   
    restart ->  set  tomcat path in vs code .> then start server
	
	 then command prmpt 'mvn clean install'
	    target folder - > webapp1.war ->> run that(right click run  on tomcat server)

		
		 last  under  tomat services our app name came run that (using right click )

		 
		 
		 
		   problems : 
		     java \JRE  path not   set->.  prefernces ->settings-> java (search) change java configuration - set "java.home": "C:\\Program Files\\Java\\jdk1.8.0_131"''
		    

			
WAY 2:
  
  
  Add dependency:  
  
  
  <plugins>
      <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.2</version>
        <configuration>
          <port>9090</port>
          <path>/</path>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-shade-plugin</artifactId>
        <version>3.1.0</version>
        <configuration>
          <!-- put your configurations here -->
        </configuration>
        <executions>
          <execution>
            <hpase>package</phase>
            <goals>
              <goal>shade</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
	
	
	  mun clean install
	  
	  
	  >mvn tomcat7:run
	  
	   (take the port which given in  dependency ex: 9090 here)
	   
	   
	    hit localhost:9090------ hello world  Came
