"# QaTestVivify" 

I have used Maven for this project so all dependencies will be resolved by maven.
Tests can be executed using test suit - src/test/java/suites/TestSuites - run this class.
to be able to properly run entire test suite it is needed to access src/main/resources/configuration.properties.properties and increment values of email by one to avoid attempts to create already created account. With DB access i would handle this by deleting newly registered user in after class so tests would work with same configurations all the time.
