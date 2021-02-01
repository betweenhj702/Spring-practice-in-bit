!������ ����

@ �ʱ⼳��(pom.xml : class)

	1. ������Ƽ�� : �������
		1) java version : 1.8
		2) springframework version : 5.0.7.RELEASE

	2. ���������(�����̺귯�� artifactID:version) : import
		1) javax.servlet-api : 3.1.0
		2) junit : 4.12
		3) log4j : 1.2.17
	
@ �߰��ϴ� ���̺귯�� (import ������ ���� Ŭ���� | �ܺ��� Ŭ����)

	1. lombok : �������� �αױ��, ������, getter/setter
		
		1) java -jar lombok.jar �� �����ϰ� ��ġ.
		2) �������
			# groupId, artifactId, version, ....
			# org.springframework, spring-test, ���������� 
			# org.projectlombok, lombok, 1.18.6 , provided(scope)

	2. HikariDataSource : dbcp (Ŀ�ؼ�Ǯ)
		
		1) pom.xml
			import : �������� ����� jdbc, tx? / HikariCP(2.7.8)
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

		2) root-context.xml : import �� Ŭ���� ���(��ü����)
			
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
			
		3) jdbc���� ����ϴ� �α��� ����
			
			#1
			<dependency>
				<groupId>org.bgee.log4jdbc-log4j2</groupId>
				<artifactId>log4jdbc-log4j2-jdbc4</artifactId>
				<version>1.16</version>
			</dependency>
			#2
			properties ������ ���ҽ������� ���

	3. junit �׽�Ʈ.java ������ ����
		
		junit ���̺귯�� ���̺쿡�� �� �ȸ�����, ���� �߰�������
		
		jdbc �� dbcp �׽�Ʈ�ϱ�
		dao�� �׽�Ʈ�� ��
		by soos frame...

	4. �������� ���ڵ� ���� (web.xml)
		
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

	5. MyBatis ����ϱ�

		1) ���̺귯�� ��� import
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
		
		2) ��ü ����
			
			# ���� ���丮(root-context.xml)
			<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
				<property name="dataSource" ref="dataSource"></property>
				<property name="configLocation" value="classpath:/mybatis-config.xml"/>
			</bean>
			
		3) mybatis-config.xml �ۼ�(MyBatis ��������, ��ü�� ������Ƽ�� ����)
			
			<?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE configuration
			  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
			  "http://mybatis.org/dtd/mybatis-3-config.dtd">
			<configuration>
			   <typeAliases>
				   <typeAlias alias="�����̸�" type="��Ű��.Ŭ����"/>
			   </typeAliases>
			   <mappers>
				   <mapper resource="����ϴ� mapper.xml�� ���"/>
			   </mappers>
			</configuration>

		4) ����.xml�� ������ �������̽��� �ۼ��ϰ� Spring�� �˻��� �� �ֵ��� ��� ����.(root-context.xml)

			<context:component-scan base-package="sdo.md.mapper"/>	//DAO �������̽� ��Ű��
			<mybatis-spring:scan base-package="sdo.md.mapper"/>		//mapper.xml ��Ű��

	