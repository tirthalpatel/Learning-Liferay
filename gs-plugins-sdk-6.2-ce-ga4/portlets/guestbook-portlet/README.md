# Complete Guestbook App

Provides a great introduction to developing on Liferay’s platform as per Liferay Documentation - [Learning Path](https://dev.liferay.com/develop/learning-paths/mvc).

## WRITING YOUR FIRST LIFERAY APPLICATION

* Select File -> New -> Liferay Plugin Project.
* Create the portlet using the New Portlet Wizard.

## Writing a Data-Driven Application

* Select project to create service.xml file using New -> Liferay Service Builder.
* Generates model, service and persistence layer code by running service.xml -> Build Services. Service Builder generates several stub classes for each entity configured in service.xml.
* To any customization in service layer code, consider to modify the -LocalServiceImpl.java class (implementation for local services) and the -ServiceImpl.java class (implementation for remote services). Ensure to re-run Build Services.
For example, see GuestbookLocalServiceImpl.java, GuestbookServiceImpl.java, EntryLocalServiceImpl.java and EntryServiceImpl.java classes in com.liferay.docs.guestbook.service.impl package.
* The methods from the persistence layer are exposed in the service layer (i.e., -LocalServiceImpl.java classes).
* UI jsp pages and Controller classes should access service layer code via -LocalServiceUtil.java classes instead of referring -LocalServiceImpl.java classes directly.
* Implementing UI components in "docroot/html" folder - init.jsp (repeatable elements of all JSP files) + *.jsp pages (as configured in portlet.xml file)
* Code flow:
	- Configuration files: docroot/WEB-INF/*.xml files
	- portlet.xml file: UI *.jsp to Controller classes mapping (i.e. /html/guestbook/view.jsp -> com.liferay.docs.guestbook.portlet.GuestbookPortlet)
	- JSP/Controllers  to access local service layer APIs code via -LocalServiceUtil classes (i.e. view.jsp / GuestbookPortlet.java -> GuestbookServiceUtil.*)
	-