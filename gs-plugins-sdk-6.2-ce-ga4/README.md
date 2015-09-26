# Getting Started Plugins/Apps for Liferay Portal 6.2

The [liferay-plugins-sdk-6.2-ce-ga4](http://sourceforge.net/projects/lportal/files/Liferay%20Portal/6.2.3%20GA4/liferay-plugins-sdk-6.2-ce-ga4-20150416163831865.zip/download), which contains sample Liferay plugins code for my learning and R&D purpose. These plugins are primarily compatible with [Liferay Portal CE 6.2 GA4](http://sourceforge.net/projects/lportal/files/Liferay%20Portal/6.2.3%20GA4/).

For more information about Liferay Plugins SDK, see its original [README file](https://github.com/tirthalpatel/Learning-Liferay/blob/master/gs-plugins-sdk-6.2-ce-ga4/README.markdown.original).

## Quick Setup Instructions

Import these plugin projects in Eclipse IDE: File -> Import -> Liferay.

Create "build.username.properties" file to build plugins using the ant tasks of Liferay Plugins SDK.

For detailed Liferay environment setup steps, see [Liferay Portal 6.2 - Getting Started Guide - Development Setup using Eclipse Kepler](http://tirthalpatel.blogspot.in/2014/02/liferay-portal-6.2-development-setup-guide.html) blog.

## Sample code as per Liferay Developer Documentation and Liferay in Action Book (for Liferay Portal 6.2.0 version)

Kudos to [Liferay Developer Documentation](https://dev.liferay.com/develop) and [Liferay in Action Book](https://www.manning.com/books/liferay-in-action), which offers excellent instructions to understand key Liferay fundamentals, frameworks and development strategies.

* [Source code of Liferay Developer Documentation Tutorials](https://github.com/liferay/liferay-docs/tree/6.2.x/develop).
* [Source code of Liferay In Action Book](https://manning-content.s3.amazonaws.com/download/4/19a995e-a6e5-4e76-b1cd-efa6545053a5/plugins-lia.zip) - This book is primarily designed for Liferay Portal 6.0.6 and provides guidance of Liferay 6.1. Obviously these plugins are not compatible with Liferay 6.2. So I had migrated "Liferay in Action" book's below plugins to Liferay 6.2.0 version by adding prefix "lia-*". I thought to make those also public for community reference, in case anyone wants to try those with Liferay 6.2.0 while reading "Liferay in Action" book.

I use below apps are for my own experimentation or R&D purpose, but one can get original source code of those from above references.

Once any portlet is deployed to Liferay Portal, it can be added to a site page from Add(+) -> Application -> "My Portlets" category.

### Hello World Portlet

[lia-hello-world-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/gs-plugins-sdk-6.2-ce-ga4/portlets/lia-hello-world-portlet) is as per Liferay in Action Book - Part 1: Working with Liferay and Portlets - Chap 2.

This portlet was built using mainly JSR Portlet standard (javax.portlet.*).

### First Liferay MVC Portlet

[first-liferay-mvc-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/gs-plugins-sdk-6.2-ce-ga4/portlets/first-liferay-mvc-portlet) is as per Liferay Documentation - [Writing your first liferay application](https://dev.liferay.com/develop/learning-paths/mvc/-/knowledge_base/6-2/writing-your-first-liferay-application).

The application was built using Liferay’s Model-View-Controller portlet framework.

### Complete Guestbook App

[guestbook-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/gs-plugins-sdk-6.2-ce-ga4/portlets/guestbook-portlet) provides a great introduction to developing on Liferay’s platform as per Liferay Documentation - [Learning Path](https://dev.liferay.com/develop/learning-paths/mvc).

The application was built using Liferay's Service Builder, a framework for generating the model, service, and persistence layers (to store data in a database) of an application. It offers demo for
* Service Builder to write data-driven application
* Liferay’s permissions system to implement security in application.
* Creating entity actions and adding custom portlet to the Liferay's Control Panel.
* Enabling Liferay's Search and Indexing framework for custom content type.
* Liferay's awesome Asset framework.
* Using Liferay's AlloyUI and making URLs friendly.

## Disclaimer

Again to repeat, all the apps/plugins in this project are for my own reference, experimentation and R&D purpose.