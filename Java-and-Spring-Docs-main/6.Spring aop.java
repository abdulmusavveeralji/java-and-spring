Q1 -> What is Aspect-Oriented Programming?
A  -> Programming technique based on concept of an Aspect
	Aspect encapsulates cross-cutting logic
			"Cross-Cutting Concerns"
	"Concern" means logic / functionality
	Aspect can be reused at multiple locations

Q2 -> What is AOP Soultion?
A  -> Apply the Proxy design pattern
	There is logic inbetween main app and target object.

Q3 -> What are benefits of AOP?
A  -> Code for Aspect is defined in a single class
		1.   Much better than being scattered everywhere
		2.   Promotes code reuse and easier to change
	
	Business code in your application is cleaner
	
	Configurable
		1.   Based on configuration, apply Aspects selectively to different parts of app
		2.   No need to make changes to main application code ... very important

	Most common
		1.   logging
		2.   security, transactions

	Audit logging
		1.   who, what, when, where

	Exception handling
		1.   log exception and notify DevOps tean via SMS/email

	API managemennt
		1.   how many times has a method been called user
		2.   analytics: what are peak times? what is average load? what is top user?

Q4 -> What are the disadvantages of AOP?
A  -> 1.   Too many aspects and app flow is hard to follow
	2.   Minor performance cost for aspect execution (run-time weaving)

Q5 -> What is AOP Terminology?
A  -> Aspect:  module of code for a cross-cutting concern
	Advice:  What action is taken and when it should be applied
	Join Point:  When to apply code during program execution
	Pointcut:  A predicate expression for where advice should be applied

Q6 -> What are Advice types?
A  -> Before advice:  run before the method
	After finally advice: run after the method (finally)
	After returning advice: run after the method (success execution)
	After throwing advice: run after method (if exception thrown)
	Around advice: run before and after method

Q7 -> What is Weaving?
A  -> Connecting aspects to target objects to create an advised object
	Different types of weaving
		Compile-time, load-time or run-time
	Regarding performance: run-time weaving is the slowest

Q8 -> What are the two AOP leading Frameworks?
A  -> Spring AOP   and   AspectJ
	
			SPRING AOP
	1.   Spring provides AOP support
	2.   Key component of spring 
		Security, transactions, caching etc
	3.   Uses run-time weaving of aspects (proxy design pattern)
	4. 	 Its is a lightweigth AOP implementation


			ASPECTJ
	1.   Original AOP framework released in 2001
	2.   Provides complete support for AOP
	3.   Rich support for
		join points:  method-level, constructor, field
		code weaving:  compile-time, post compile-time and load-time

Q9 -> What are the advantages and disadvantages of Spring AOP?
A  -> Advantages
	1.	Simpler to use than AspectJ
	2.  uses proxy pattern
	3.  Can migrate to AspectJ when using @Aspect annotation

	Disadvantages:
	1.  Only supports method-level join points
	2.  Can only apply aspects to beans created by Spring app context
	3.  Minor performance cost for aspect execution (run-time weaving)

Q10 -> What are the advantages and disadvantages of AspectJ?
A 	-> Advantages:
	1.  Support all join points
	2.  Works with any POJO, not just beans from app context
	3.  Faster performance compared to Spring AOP
	4.  complete AOP support

	Disadvantages
	1.  Compile-time weaving requires extra compilation step
	2.  AspectJ pointcut syntax can become complex
	

Q11 -> What is a Pointcut Expression Language?
A	-> Spring AOP uses AspectJ's pointcut expression language
	Match on Method Name
		1.  Execution Pointcut:
		execution(modifiers-pattern? return-type-pattern declaring-type-pattern?
					method-name-pattern(param-pattern) throws-pattern?)
			
		Modifiers: (Spring AOP only supports public or *)
		Return type: void, boolean, String, List<>, ...
		Declaring type: the class name
		...
		
		The pattern is optional if it has "?"
		
		Examples:
			Match only addAccount() method in AccountDAO class
			@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
			
			Match any addAccount() method in any class
			@Before("execution(public void addAccount())")
			
			Match on method names (using wildcards)
			@Before("execution(public void add*())")
			
			Use wildcards on modifier and return type
			@Before("execution(* * processCreditCard*())")
			any modifier and any return
			
			Match on methods in a package
			@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
			
Q12 -> What are Parameter Pattern Wildcards?
A	-> For param-pattern
	1.	() - matches a method with no arguments
	2.	(*) - matches a method woth one argument of any type
	3.	(..) - matches a method with 0 or more arguments of any type
	
Q13 -> What are the benefits of Pointcut Declarations?
A	-> Easily reuse pointcut expressions
	Update pointcut in one location
	Can also share and combine pointcut expressions
	
Configuration:
	@Configuration
	@EnableAspectJAutoProxy
	@ComponentScan("com.luv2code.aopdemo")
	public class DemoConfig {
	
		
		
	}
	

	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


