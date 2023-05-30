# Spring_IOC

https://docs.google.com/document/d/1_Je45_6G2kP2XWU2pOBYOidMkfaX1Wpj/edit

# Spring is a container :
1)IoC container is represented by the interface. 
2) org.springframework.beans.factory.BeanFactory & org.springframework.context. ApplicationContext these two interfaces acts as the IoC container.

# We can resolve Ambiguity problem using "Type" & "index".
  By default SpringContainer assumes values are String,When String not find in program then he goes for order and resolve. Using type & index properties we can resolve constructor accordingly.
  
 # This two interface is used to implmenting bean life cycle 
  1)InitializingBean interface
  2)DisposableBean interface
  
 # Implmenting bean life cycle Using Annotations
   @PostConstruct
   @PreDestroy   (but upto java 1.8 they are used after that add dependancies)
   
 # Annotations for Autowiring:
  1)@Autowired
  2)@Qualifier
  
 # Stereotype Annotations:
    1)@Component
    2)@Value
