Demo Spring App in docker image

How to run it:
1. Create image from Dockerfile <br>
   <code>docker build -t myimage:release .</code>
   
2. Create <b>config</b> dir and add application.properties to dir. <br>
Add to properties: name.from.file='your name'

3. Create docker container: <br>
<code>docker container run -p 8080:8080 -v "your path to config dir"/config/:/app/config myimage:release </code>
   
   

   