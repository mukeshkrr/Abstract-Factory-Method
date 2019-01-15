# Abstract-Factory-Method
One of the Creational Design Patterns

Read complete article before going through coding. Check out the following link: http://www.tellmehow.co/abstract-factory-method-creational-design-pattern/

In this tutorial, I will explain the Abstract Factory method design pattern. Let say we have Many Interfaces and we have multiple implementations of the same interfaces. For example,

We have two Interfaces “Mobile” and “Laptop”. We have implementations as “Iphone”, “Samsung” and “NokiaLumia” for Mobile and“AppleMac”, “Asus” and “Compaq” for Laptop. If you want to create an object of Mobile or Laptop, You have to create Factory for those Interfaces.

Here we can have many factories. So, We create a Factory Producer, which produce an object of the required factory.

Once we have an object of the factory then, using factory we can create an object of Samsung/Iphone/NokiaLumia or AppleMac/Asus/Compaq.

Why Design Patterns important in Java?
http://www.tellmehow.co/why-design-patterns-in-java/

