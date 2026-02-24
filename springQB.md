1. ###### **What is Container ?**

**=>** A container is a special software/program/application that manages the whole lifecycle of given resources/component from creation to destruction.

For ex. Container is like aquarium managing lifecycle of fishes called as component , once we drop fish into aquarium , the aquarium takes care of fish and  provide necessary survival facilities like water, food, air, environment

###### 

###### **2. What is spring bean ?**

**=>** The spring bean is a java class whose object is created and managed by IOC container/spring container is called as spring bean.

We can take predefined / user-defined / third-party java classes as spring bean.

We cannot take interface and abstract class as spring bean because they can not in instantiated.

###### 

###### **3. Why the spring containers are called as IOC container ?**

**=>** In core java application class loading, object creation, object management , calling methods on objects, keeping object t ready for destruction will be done by programmer manually directly or indirectly. i.e. everything is under the control of programmer.

But in Spring/Spring boot application the operation like class loading, object creation , object management , calling lifecycle methods will be taken care by spring container / IOC container . i.e. It's reverse or we can say inverse of regular control that is there with programmer. So the spring container are called as IOC container.

###### 

###### **4. What are the ways through which we can give inputs and instructions to IOC container ?**

**=>** So there are three ways to give input and instructions to IOC container :

a. Using XML driven configuration (inputs and instruction to IOC container will be given using spring bean configuration file (xml file).


 	b. Using XML + annotation driven configuration.

 	c. Using 100% code driven configuration / java config approach .

###### 

###### **5. Why we can not use @Component annotation to configure predefined classes as spring beans in annotation driven or 100% code driven configuration ?**

**=>** @Component is class level annotation , since we cannot edit the source code of predefined classes we cannot use @Component , as alternate use @Bean method of @Configuration class.

###### 

###### **6. Can we configure user-defined class as spring bean using @Bean method ? If yes then it is not being used ?**

**=>** Yes , we can configure user-defined class as spring bean using @Bean method, but it's not recommended, programmer needs to create object for spring bean class  then taking @Bean method definition in the configuration class with proper method signature, and its very complex.



###### 

###### **7. What is DEPENDENCY MANAGMENT ?**

**=>** Dependency management is core feature that simplifies the process of managing libraries (dependencies) used in a project. It ensures all Spring-related libraries and their version are compatible and automatically synchronized.

This system ensures that your application remains stable, consistence and easy to maintain across different environments.

###### 

###### **8. What is SETTER INJECTION ?**

**=>** If IOC container uses setter injection method of target spring bean class to assign / inject dependent spring bean class object then it is called as setter injection.

###### 

###### **9. What is Constructor injection ?**

**=>** IOC container uses parameterized constructor to create target spring bean class object and inject dependent spring bean class object/values to the bean properties of target spring bean class object.

In xml driven config. we need to use <constructor-ergs> , and in annotation driven config. we need to placed @Autowired on top of parametrized constructor.

Constructor injection is a dependency injection technique where the spring container passes required dependencies to a class through its constructor during object creation. This ensures that all mandatory dependencies are provided at instantiation , making the object fully initialized and immutable from the start.

###### 

###### **10. What is the difference of pool and cache ?**

**=>** Collection of same items is called as pool.

   Pool gives reusability of same items.

   where, Collection set of different items is called as cache.

   Cache gives reusability to different items .

   - To implement pool we takes the support of list collection.

   - To implement the cache we takes the support of map collection where every items (value) will be identified with different name (key).

###### 

###### **11. If we enable both setter injection and constructor injection on the same property with different values, can you tell  which injection value will be taken as the final value ?**

**=>** Since setter method executes followed by parametrized constructor we can say the setter injection value will be taken as final value.

###### 

###### **12. What is the difference between setter injection and constructor injection ?**

**=>** a. IOC container uses setter method of target spring bean class for injection activity.

   a. IOC container uses parametrized constructor of target spring bean class for creating target spring bean class obj and for injection activity



   b. In xml driven config, we need to use <property>tag for setter injection.

   b. In annotation driven config, we need to use <constructor-ergs>tag for constructor injection.



   c. In annotation driven config, we need to place @Autowired on top of setter method

   c. In annotation driven config, we need to place @Autowired on top of constructor



   d. To perform setter injection on "n" properties we need "n" setter methods

   d. To perform constructor injection on "n" properties we need only one constructor having "n" params



   e. Bit slow in the injection compare to constructor injection

   e. Bit faster in the injection compare to setter injection



   f. To perform setter injection on our choice "n" properties in all permutations and combinations then we need to place max of "n" setter methods

   f. For similar situation we need to take "n!" n no of overloaded constructors which is big number to consider.



   g. If spring bean properties are optional to participate in the injection then go for setter injection because for "n" properties we just "n" setter methods max

   g. If spring bean properties are mandatory  to participate in the injection then prefer working with constructor injection because by taking one no of para constructor with "n" params we can do complete injection on all the spring bean properties.

###### 

###### **13. Thumb rule to remember while developing spring app using xml driven configuration ?**

**=>**

###### 

###### **14. Thumb rule to remember while developing spring app using xml + annotation driven configuration ?**

**=>**

###### 

###### **15. Thumb rule for developing the  100% code driven configuration / java config approach ?**

**=>**

###### 

###### **16. What is  @Qualifier ?**

**=>** @Qualifier in Spring is used to resolve ambiguity when multiple beans of the same type are available for dependency injection.  It explicitly specifies which bean should be injected when Spring cannot determine the correct one automatically.

###### 

###### **17. What is Design Pattern ?**

**=>** Design pattern are bunch of rules that act as a best solution for recurring problems of application development.

Design pattern are the best practice to use programming language , technologies, framework effectively in application development.



###### 

###### **18. What is Factory pattern ?**

**=>** Factory pattern is a class that having static and non static factory method having logics to create and return one of the several related classes object based on the data that is being passed.

In JDBC programs most methods calls that are giving JDBC objects are factory patterns.

###### 

###### **19. What is the difference between factory method and factory pattern ?**

**=>** Architecture gives end to end plan to design and develop the application. While writing each section logics in certain architecture based application development, we use different design pattern to solve the reoccurring problems.

==> MVC is an architecture to develop java web application end to end

==>layered application means keeping different logics in different layers(classes/files) and making them participating in the communication.

ex:

==>while writing model layer logics we use Business Delegate, DAO and etc design patterns.

==>while writing view layer logics we use Composite view, view helper and etc design patterns.

==>while writing controller layer logics we use Front controller, Application controller and etc design patterns.



=>Architecture uses design pattern in different modules/layers of the application development.

###### 

###### **20. Principles of strategy design pattern ?**

**=>** ==>this is GOF pattern can be implemented in any OOP lang.

==>this pattern is very popular in spring programming because it gives set of principles towards designing classes of dependency management and we use dependency management a lot in spring programming.

==>strategy design pattern says while designing the classes of dependency management  should follow set of rules /principles which allows to design the classes as loosely coupled interchangeable parts.(we can change one dependent with another dependent without touching the source code of the target class)

==>The target and dependent classes of dependency management can be designed by using the following principles of strategy dp

###### 

###### **21. WHAT IS THE DIFFERENCE BETWEEN JAVABEAN AND SPRINGBEAN CLASS ?**

**=>** Java bean is a java class that having setter and getter methods, it acts as supporting/helper class having properties with setter and getters to pass multiple values across the multiple main classes of same project or different project over the network.

==>spring bean is normal java class whose object is created and managed by IOC container. spring bean class is business class having b.methods so, spring beans are used as the main classes of the project.



==>if project is designed by spring beans as the main classes then data among spring bean classes will be passed in the form of java bean class objects.



client app ==>java bean==>springbean1(monitoring logic)==>JavaBean==>springbean2(b.logic)==>JavaBean==>springbean3(peristence logic)

###### 

###### **22) What is the difference between eager/pre/early instantiation and lazy/late instantiation ?**

**=>** If the spring bean class obj is created the moment IOC container is created irrespective of whether the spring bean will be used or not is called pre instantiation. if no scope is defined the default scope is "singleton",

by default all singleton scope spring bean participates in eager instantiation and their objects will be places in the internal cache of IOC container.



==>if the IOC container is creating the spring bean class obj only when the need is there like when ctx.getBean() is called or when the injection process is started then it is called as lazy instantiation.



==>we can disable pre-instantiation using @Lazy(true) annotation by keeping with @Component or @Bean



==>other than "singleton " scope spring bean enabled with lazy instantiation by default.

###### 

###### **23. What is  spring bean scopes ?**

**=>** Spring Bean Scopes define the lifecycle and visibility of bean instances within the Spring IoC (Inversion of Control) container.  They determine how many instances of a bean are created and how long those instances live and are shared across the application.

###### 

###### **24. What is  @Scope("prototype") ?**

\*\*=>\*\*IOC container creates separate object for spring bean class for every context\_. get-Bean() call and start spring class object will not be placed in the internal cache of IOC container.

If spring bean class object state is changing time to time then it is recommended to take the scope as the prototype scope. So that for data change one new object will be created for the spring bean.

@Lazy(true) is applicable only for the singleton scope spring bean to disable pre instantiation on singleton scope spring bean . @Lazy(true) does not give effect on other scope spring bean because they are always enable with lazy instantiation.



###### **25. Why there is pre-instantiation only for singleton scope spring beans ?**

**=>** The singleton scope spring bean that are having pre-instantiation during the IOC container startup  will be maintained in the internal cache of IOC container having reusability across the multiple ctx.getbean() calls and across the multiple injections. so the singleton scope spring beans are having the pre-instantiation because the pre-instantiation objects will never be wasted.

###### 

###### **26. Properties files ?**

**=>** The text file that maintains the entries in the form of key=value pairs is called as properties file.

This file is also called as Resource Bundle file.

This file can have any extension but the recommended extension is .properties .

###### 

###### **27> What is the difference between @Value and @Autowired annotation ?**

**=>** To inject one spring bean class obj to another spring bean class obj HAS-A property takes the support of @Autowired(for injecting spring bean) 

==> To inject values collected from properties file/system properties to primitive/String spring bean properties

###### 

###### 

###### 

