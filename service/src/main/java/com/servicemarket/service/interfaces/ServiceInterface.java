package com.servicemarket.service.interfaces;

import com.servicemarket.service.dto.Service;

public interface ServiceInterface {

	//be careful with names
	String addService(Service srv);
	String deleteService(Integer serviceId);
	Service getServiceById(Integer id);
	Iterable<Service> getAllServices();
	String updateService(Service srv);
	
}
