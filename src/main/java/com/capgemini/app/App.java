package com.capgemini.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.app.bean.Organization;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organization organization = (Organization) context.getBean("organization");

		System.out.println(organization.getOrgId());
		System.out.println(organization.getName());
		System.out.println(organization.getCities());
		System.out.println(organization.getBoardMembers());
		System.out.println(organization.getBranchManagers());
		System.out.println(organization.getDateOfEstablishment());
		System.out.println(organization.getShareValue());
		System.out.println(organization.isListed());
		System.out.println(organization.getIpAddresses());

		
		/*
		 * Organization o=new Organization(); Organization organization=new
		 * Organization(); System.out.println(o.hashCode());
		 * System.out.println(organization.hashCode());
		 */
	}
}
