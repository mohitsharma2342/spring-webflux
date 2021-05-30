# spring-webflux

Spring WebFlux heavily uses two publishers :

Mono: Returns 0 or 1 element.

![image](https://user-images.githubusercontent.com/25693835/120096482-6cf98f80-c149-11eb-96cc-e0249dae51f0.png)

	
Flux: Returns 0…N elements. A Flux can be endless, meaning that it can keep emitting elements forever. Also it can return a sequence of elements and then send a completion notification when it has returned all of its elements.
	
![image](https://user-images.githubusercontent.com/25693835/120096501-7edb3280-c149-11eb-9c7b-e53e9c6bce15.png)
	

Note :- If you want all the benefits of reactive, async / non-blocking, you'll need to make the whole stack async / 
		non-blocking. JDBC is indeed inherently a blocking API, so you can't build a fully reactive
	 / non-blocking app if you need to access the database through JDBC.
	 
Seems currently Spring webflux support Mongodb, Redis, etc nosql reactive so instead of JPA
 use spring-boot-starter-data-mongodb-reactive .
