set projectLocation=C:\eclipse-committers-oxygen-1a-win32-x86_64\Selenium\Git hub\Testing
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
