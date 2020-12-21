**Automation project for the Resultados application**

This project aims to automate the favorite flow for Resultados apk. This application can be found here: https://play.google.com/store/apps/details?id=br.jus.tse.resultados

### **Requirements**

- Java 1.8 <br>
- Appium <br>
- Android Emulator <br>

### **Project structure**

```
Resultados_TSE/
  src/
    test/
      java/
          pages/
              CandidatePage.java
              FavoritesPage.java
              HomePage.java
              SelectLocalPage.java
              SetupPage.java
          runner/
              CucumberTestRunner.java
          steps/
              CandidateSteps.java
              FavoritesSteps.java
              HomeSteps.java
              SelectLocalSteps.java
              SetupSteps.java
          util/
              AppiumDriverManager.java
      resources/
          apk/
              Resultados_TSE.apk
          features/
              Favorite.feature
          Cucumber.properties
```
**Brief explanation for each folder:** <br>
- pages >> PageObjects related, a .java file for each page and its functionalities as well. <br>
- runner >> The class to start the test that also contains Cumcumber properties. <br>
- steps >> Test implementation in gherkin for each page. <br>
- util >> Utility for the project. <br>
- apk >> Apk to be tested. <br>
- features >> .feature file written in gherkin. <br>

### **How to run the project**

- Launch the Android Emulator;
- Launch the Appium Server;
- Edit `AppiumDriverManager.java` with the correct path of the apk on your machine (`APK_PATH`) and also the information related to your Android Emulator (`PLATFORM_NAME`, `DEVICE_NAME`, and `VERSION`);
- Right click on `CucumberTestRunner.java` > select the option `Run 'CucumberTestRunner'`.

### **Execution record**

- You can check the tests running on the `Execution_Record.mp4` file.
