# Liferay Portal 7 Sample Code

This contains sample code for self learning and R&D purpose.

## Setup Guide

For detailed Liferay environment setup instructions, see my [blog](http://tirthalpatel.blogspot.com/2016/09/liferay-portal-7-getting-started-guide-series.html)

How to import sample projects in Liferay IDE? `Import -> Gradle -> Gradle project -> Select "gs-dxp-workspace" folder -> ... -> Finish`

## Sample code

### Plain-vanilla portlets

* [hello-world-mvc-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/liferay-7-samples/gs-dxp-workspace/modules/hello-world-mvc-portlet) - A hello world mvc portlet as a reference of my [blog](http://tirthalpatel.blogspot.com/2016/09/liferay-portal-7-ggs-hello-world-portlet-module.html).

* [simple-liferay-mvc-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/liferay-7-samples/gs-dxp-workspace/modules/simple-liferay-mvc-portlet) - To try render, action and resource phases of portlet using traditional approach which could be used to develop simple requirements.

* [complex-liferay-mvc-portlet](https://github.com/tirthalpatel/Learning-Liferay/tree/master/liferay-7-samples/gs-dxp-workspace/modules/complex-liferay-mvc-portlet) - To try render, action and resource commands approach in Liferay 7 to develop complex use cases. 

### News App 

* [Portlet + Service builder](https://github.com/tirthalpatel/Learning-Liferay/tree/master/liferay-7-samples/gs-dxp-workspace/modules/news) module projects
	- Go to "module" directory and run command to create "news-api" and "news-service" modules: `blade create -t servicebuilder -p com.tirthal.learning news`
	- Go to "news" directory and run command to create "news-web" portlet module: `blade create -t mvcportlet news-web`
	- TODO: Service builder customization: service.xml, *LocalServiceImpl, *ServiceImpl, and *ModelImpl
	
## Other References

* [Liferay Documentation](https://dev.liferay.com/)
* [Liferay's Blade samples](https://github.com/liferay/liferay-blade-samples)