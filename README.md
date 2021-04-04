# spring-webflux

Note :- If you want all the benefits of reactive, async / non-blocking, you'll need to make the whole stack async / 
		non-blocking. JDBC is indeed inherently a blocking API, so you can't build a fully reactive
	 / non-blocking app if you need to access the database through JDBC.
	 
Seems currently Spring webflux support Mongodb, Redis, etc nosql reactive so instead of JPA
 use spring-boot-starter-data-mongodb-reactive .