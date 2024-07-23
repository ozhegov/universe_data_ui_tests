# Проект по автоматизации тестирования сайта **[Юниверс Дата](https://universe-data.ru)**

## **Содержание:**

* <a href="#tools">Используемые инструменты</a>

* <a href="#cases">Примеры реализованных проверок</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Команды запуска</a>

* <a href="#allure">Интеграция с Allure Report</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомления в Telegram при помощи бота</a>

* <a href="#video">Пример выполнения теста</a>
---
<a id="tools"></a>
## <a name="Используемые инструменты">**Используемые инструменты:**</a>
<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="50" height="50" alt="IDEA"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="50" height="50" alt="Java"/>
  <img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="50" height="50" alt="JUnit5"/>
  <img src="https://aerokube.com/img/aerokube_logo.svg" width="50" height="50" alt="Selenoid"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="50" height="50" alt="Geadle"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="50" height="50" alt="GitHub"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" alt="Jenkins"/>
  <img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure Report"/>
  <img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jira/jira-original.svg" width="50" height="50" alt="JIRA"/>
  <img src="https://upload.wikimedia.org/wikipedia/commons/8/83/Telegram_2019_Logo.svg" width="50" height="50" alt="Telegram"/>
</p>

<a id="cases"></a>
## <a name="Примеры реализованных проверок">**Примеры реализованных проверок:**</a>
- *Проверка работы поиска при вводе названия продукта*
- *Проверка функционирования подписки на рассылку*
- *Отображение ответа при клике на вопрос в блоке F.A.Q.*

<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="25"/></a><a name="Сборка в Jenkins"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/C27-universe_data_ui_tests/)</a>

<p align="center">  
<img title="Jenkins" src="images/screenshots/jenkins_build.png" width="850">  
</p>

<a id="console"></a>
## Команды запуска

***Локальный запуск из терминала:***
```bash  
gradle clean ui_tests
```
***Удалённый запуск через Jenkins:***
```bash
clean ui_tests
  -DbaseUrl=${URL}
  -Dbrowser=${BROWSER}
  -DbrowserSize=${WINDOW_SIZE}
  -DwdHost={WDHOST}
```
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a><a name="Интеграция с Allure Report"></a>Интеграция с [Allure Report](https://jenkins.autotests.cloud/job/C27-universe_data_ui_tests/allure/)</a>

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Main" src="images/screenshots/allure_main.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Test Cases" src="images/screenshots/allure_test_cases.png" width="850">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/allure_graphs.png" width="850">
</p>

<a id="allure-testops"></a>
## <img alt="Allure TestOps" height="25" src="images/logo/Allure_TO.svg" width="25"/></a><a name="Интеграция с Allure TestOps"></a>Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/4337/)</a>

### *Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screenshots/allure_to_dashboard.png" width="850">  
</p>  

### *Автоматизированные тест-кейсы*

<p align="center">  
<img title="Allure TestOps Auto Test Cases" src="images/screenshots/allure_to_auto_test_cases.png" width="850">  
</p>

### *Ручные тест-кейсы*

<p align="center">  
<img title="Allure TestOps Manual Test Cases" src="images/screenshots/allure_to_manual_test_cases.png" width="850">
</p>

<a id="jira"></a>
## <img alt="Jira" height="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jira/jira-original.svg" width="25"/></a><a name="Интеграция с Jira"></a>Интеграция с [Jira]()</a>

<p align="center">  
<img title="Jira" src="images/screenshots/jira_integration.png" width="850">  
</p>

<a id="telegram"></a>
## <img alt="Telegram" height="25" src="https://upload.wikimedia.org/wikipedia/commons/8/83/Telegram_2019_Logo.svg" width="25"/></a><a name="Уведомления в Telegram при помощи бота"></a>Уведомления в Telegram при помощи бота</a>
<p align="center">  
<img title="Telegram Notifications" src="images/screenshots/telegram_notifications.png" width="450">  
</p>

<a id="video"></a>
## <img alt="Selenoid" height="25" src="https://aerokube.com/img/aerokube_logo.svg" width="25"/></a><a name="Пример выполнения теста"></a>Пример выполнения теста</a>
<p align="center">  
<img title="Selenoid Video" src="images/video/test_video_example.gif" width="550" height="350"  alt="video">  
</p>
