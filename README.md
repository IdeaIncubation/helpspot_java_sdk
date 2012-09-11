helpspot_java_sdk
=================

Creator:
--------
Name: Bakul Brahmbhatt
Email: bakul21077@gmail.com


License:
--------
This software is licensed under "The Apache Software License, Version 2.0". 
Please read license terms at http://www.apache.org/licenses/LICENSE-2.0.txt


Requirements for using Jar created from this project:
----------------------------------------------------
* HelpSpot 3.1.6 is installed and you have admin account to query private/public apis. (We have not tested it against other HelpSpot Versions yet)
* Java 6 SDK is installed 


Requirement for participating in developing this SDK:
-----------------------------------------------------
* Above requirements (helpspot and java sdk version)
* Eclipse IDE for development (it would be nice if Eclipse IDE also has maven and git plugin installed)
* Git is installed (if eclipse doesn't contain git plugin. You will have to use command line for checkout/merge/check-in/etc. tasks. )
* Maven is installed (if eclipse doesn't contain maven plugin. You will have to use command line to manage your maven artifacts, run build, etc. )
* You have github account to fork this project (We do not give direct write/delete/edit access to stinkbird/helpspot_java_sdk repository but
  you can still work on our code by forking our repository and by sending pull request on github. Once you establish creditability, You will be
  granted full access to our repository so that you don't have to submit pull request.)


Dependency
----------
It is described in pom.xml ( there are two kind of dependencies (test and compile) ). Compile time dependency mandate that after you create Jar from this
project, you also have to copy compile time dependency jars with newly created jar into a project, which is using helpspot_java_sdk jar. 

If your project is using Maven you can use groupid/artifactid/version of this project to build your project and it will automatically download all 
required dependency. 


How to use this sdk?
--------------------
Basically, this sdk is broken down into two categories (private and public). 

Private API implementation is found under com.github.stinkbird.helpspot.private_api package. Use com.github.stinkbird.helpspot.private_api.PrivateApiUtil to retrieve response
from private api methods. 

Public API implementation is found under com.github.stinkbird.helpspot.public_api package. Use com.github.stinkbird.helpspot.public_api.PublicApiUtil to retrieve response
from public api methods.







