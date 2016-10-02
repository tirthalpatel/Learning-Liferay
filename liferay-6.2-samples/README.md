# Liferay Portal 6.2 Sample Code

This contains sample code for self learning and R&D purpose.

## Quick Setup Instructions

* Setup [Liferay Portal CE 6.2 GA4](http://sourceforge.net/projects/lportal/files/Liferay%20Portal/6.2.3%20GA4/)
* Download and unzip [liferay-plugins-sdk-6.2-ce-ga4](http://sourceforge.net/projects/lportal/files/Liferay%20Portal/6.2.3%20GA4/liferay-plugins-sdk-6.2-ce-ga4-20150416163831865.zip/download). Copy "build.<username>.properties" (e.g. build.tirthalp.properties) in liferay plugins sdk folder and configure it. Copy all sample portlets code into the portlets folder of the liferay plugins sdk.
* Import these plugin projects in Eclipse IDE: File -> Import -> Liferay.
* Deploy portlets to liferay portal. Once any portlet is deployed to Liferay Portal, it can be added to a site page from Add(+) -> Application -> "My Portlets" category. 
* For detailed Liferay environment setup steps, see [Liferay Portal 6.2 - Getting Started Guide - Development Setup using Eclipse Kepler](http://tirthalpatel.blogspot.in/2014/02/liferay-portal-6.2-development-setup-guide.html) blog.

## Sample code

### Hello World Portlet

[lia-hello-world-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/liferay-6.2-samples/portlets/lia-hello-world-portlet) is as per Liferay in Action Book - Part 1: Working with Liferay and Portlets - Chap 2.

This portlet was built using mainly JSR Portlet standard (javax.portlet.*).

### First Liferay MVC Portlet

[first-liferay-mvc-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/liferay-6.2-samples/portlets/first-liferay-mvc-portlet) is as per Liferay Documentation - [Writing your first liferay application](https://dev.liferay.com/develop/learning-paths/mvc/-/knowledge_base/6-2/writing-your-first-liferay-application).

The application was built using Liferay’s Model-View-Controller portlet framework.

### Complete Guestbook App

[guestbook-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/liferay-6.2-samples/portlets/guestbook-portlet) provides a great introduction to developing on Liferay’s platform as per Liferay Documentation - [Learning Path](https://dev.liferay.com/develop/learning-paths/mvc).

The application was built using Liferay's Service Builder, a framework for generating the model, service, and persistence layers (to store data in a database) of an application. It offers demo for
* Service Builder to write data-driven application
* Liferay’s permissions system to implement security in application.
* Creating entity actions and adding custom portlet to the Liferay's Control Panel.
* Enabling Liferay's Search and Indexing framework for custom content type.
* Liferay's awesome Asset framework.
* Using Liferay's AlloyUI and making URLs friendly.

## Other References

* [Source code of Liferay Developer Documentation Tutorials](https://github.com/liferay/liferay-docs/tree/6.2.x/develop)
* [Source code of Liferay In Action Book](https://manning-content.s3.amazonaws.com/download/4/19a995e-a6e5-4e76-b1cd-efa6545053a5/plugins-lia.zip)