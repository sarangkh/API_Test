This test has been developed using java, testing, Rest-assured and dependant libraries.
Acceptance Criteria:
•	Name = "Carbon credits"
•	CanRelist = true
•	The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"

For meeting above acceptance criteria created 3 tests:
1)	First test validates the Name.
2)	Second test validates that CanRelist has value true
3)	And third test validate that element with Name = "Gallery" has a Description that contains the text "2x larger image"

To execute these test prerequisite:
1) Download Rest-Assured Jars/Library:- First download all the required Rest-Assured jar files. Here is the link to download the Jars: 
   https://github.com/rest-assured/rest-assured/wiki/Downloads
   On this page you will find a section to download “Current direct downloads” . Move to that section and click on the link to dist 
   package.
2) Once click on the link, browser will download the rest-assured-3.0.3-dist.zip file on the system. For me the file gets downloaded to the 
   “downloads” folder. In your case, it might be a different location based on your browser’s default setting. Now, go to that folder where 
   the zip file was downloaded and simply unzip the files.Go to the unzipped folder and open it. There should be following folders and 
   files inside the unzipped folder.
     i) docs: A folder containing javadocs
     ii) rest-assured-3.0.3.jar: jar file containing Rest-Assured classes
     iii) rest-assured-3.0.3-deps.zip : Another zip file containing all the dependency jars.
   make sure to unzip the rest-assured-3.0.3-deps.zip dependency jars as well. At the end your folder would like this.
3)	In eclipse add all the jar files attached in project’s build path
4)	Eclipse/InteliJ should have TestNG configured

In order to run the test – run it as testing test and for results check console, emailable-report.html in test-output folder or junitreports in test-output/junitreports folder. 
