# numberGenerator

## Installation instructions:
1. Install jdk. In windows, installation is simple and straight forward. Download the installer from oracle website and install java. 
    In `System properties` -> `Advanced System settings` -> `Environment variables`, click on `New` button under system variables, let the value be `JAVA_HOME`. In path, provide the path where java is installed. Click `Ok`. Now search for `path` variable, add %JAVA_HOME%/bin to that path. Click on `Ok`. In case of ubuntu, just execute this command: `sudo apt-add-repository ppa:webupd8team/java && sudo apt-get update && sudo apt-get install oracle-java8-installer`
2. Install maven by downloading from http://maven.apache.org/download.cgi. Extract it to `c:` in case of `windows`, in case of ubuntu, extract it to `/usr/local/apache-maven`. Then add that to environment variable in windows (It is similar to adding java to environment variable). In linux, use these commands to set variable: `export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.3 && export M2=$M2_HOME/bin && export MAVEN_OPTS=-Xms256m -Xmx512m` and `export PATH=$M2:$PATH`. 

## Starting Maven project
a. Create a directory, `cd` into that directory and execute this command to create maven project:  
`mvn archetype:generate -DgroupId={project-packaging} -DartifactId={project-name} -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
Here is an example:
`mvn archetype:generate -DgroupId=com.ajay -DartifactId=numberGenerator -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

b. After it is generated, use this command so that maven project can be imported into eclipse
`mvn eclipse:eclipse`

c. You can find rest of the details in my blog very soon.
