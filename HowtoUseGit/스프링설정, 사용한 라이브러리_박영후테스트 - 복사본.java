!스프링 설정

@ 초기설정(pom.xml : class)

	1. 프로퍼티즈 : 멤버변수
		1) java version : 1.8
		2) springframework version : 5.0.7.RELEASE

	2. 디펜던시즈(사용라이브러리 artifactID:version) : import
		1) javax.servlet-api : 3.1.0
		2) junit : 4.12
		3) log4j : 1.2.17
	
@ 추가하는 라이브러리 (import 스프링 내장 클래스 | 외부의 클래스)

	1. lombok : 강력해진 로그기능, 생성자, getter/setter
		
		1) java -jar lombok.jar 로 실행하고 설치.
		2) 디펜던시
			# groupId, artifactId, version, ....
			# org.springframework, spring-test, 스프링버전 
			# org.projectlombok, lombok, 1.18.6 , provided(scope)

	2. HikariDataSource : dbcp (커넥션풀)
		
		1) pom.xml
			import : 스프링에 내장된 jdbc, tx? / HikariCP(2.7.8)
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-jdbc</artifactId>
				<version>${org.springframework-version}</version>
			</dependency>		
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-tx</artifactId>
				<version>${org.springframework-version}</version>
			</dependency>
			<dependency>
				<groupId>com.zaxxer</groupId>
				<artifactId>HikariCP</artifactId>
				<version>2.7.8</version>
			</dependency>

		2) root-context.xml : import 한 클래스 사용(객체생성)
			
			#1
			<bean id="hikariConfig" class="com.zaxxer.hikari.HikariConfig">
				<property name="driverClassName" value="net.sf.log4jdbc.sql.jdbcapi.DriverSpy"></property>
				<property name="jdbcUrl" value="jdbc:log4jdbc:oracle:thin:@localhost:1521:JAVA"></property>
				<property name="username" value="spring"></property>
				<property name="password" value="java"></property>
			</bean>
			#2
			<bean id="dataSource" class="com.zaxxer.hikari.HikariDataSource" destroy-method="close">
				<constructor-arg ref="hikariConfig" />
			</bean>
			
		3) jdbc에서 사용하는 로그의 설정
			
			#1
			<dependency>
				<groupId>org.bgee.log4jdbc-log4j2</groupId>
				<artifactId>log4jdbc-log4j2-jdbc4</artifactId>
				<version>1.16</version>
			</dependency>
			#2
			properties 파일을 리소스폴더에 등록

	3. junit 테스트.java 가져다 놓기
		
		junit 라이브러리 메이븐에서 잘 안먹히면, 따로 추가해주자
		
		jdbc 와 dbcp 테스트하기
		dao도 테스트할 것
		by soos frame...

	4. 스프링의 인코딩 필터 (web.xml)
		
		<filter>
			<filter-name>encoding</filter-name>
			<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
			<init-param>
				<param-name>encoding</param-name>
				<param-value>UTF-8</param-value>
			</init-param>
		</filter>

		<filter-mapping>
			<filter-name>encoding</filter-name>
			<servlet-name>appServlet</servlet-name>
		</filter-mapping>

	5. MyBatis 사용하기

		1) 라이브러리 등록 import
			<dependency>
				<groupId>org.mybatis</groupId>
				<artifactId>mybatis</artifactId>
				<version>3.4.6</version>
			</dependency>
			<dependency>
				<groupId>org.mybatis</groupId>
				<artifactId>mybatis-spring</artifactId>
				<version>1.3.2</version>
			</dependency>
		
		2) 객체 생성
			
			# 세션 팩토리(root-context.xml)
			<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
				<property name="dataSource" ref="dataSource"></property>
				<property name="configLocation" value="classpath:/mybatis-config.xml"/>
			</bean>
			
		3) mybatis-config.xml 작성(MyBatis 설정정보, 객체에 프로퍼티로 쓰임)
			
			<?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE configuration
			  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
			  "http://mybatis.org/dtd/mybatis-3-config.dtd">
			<configuration>
			   <typeAliases>
				   <typeAlias alias="지정이름" type="패키지.클래스"/>
			   </typeAliases>
			   <mappers>
				   <mapper resource="사용하는 mapper.xml의 경로"/>
			   </mappers>
			</configuration>

		4) 매퍼.xml과 매퍼의 인터페이스를 작성하고 Spring이 검색할 수 있도록 경로 설정.(root-context.xml)

			<context:component-scan base-package="sdo.md.mapper"/>	//DAO 인터페이스 패키지
			<mybatis-spring:scan base-package="sdo.md.mapper"/>		//mapper.xml 패키지

	