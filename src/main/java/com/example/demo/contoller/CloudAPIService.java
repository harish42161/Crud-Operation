package com.example.demo.contoller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{venderId}")
	public CloudVendor getCloudVendorDetails(String venderId)
	{
		return cloudVendor;
				//new CloudVendor("C1","Vendor 1","Address One","xxxx");		
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		this.cloudVendor=cloudVendor;
		return "Cloud Vender is CErated Successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		this.cloudVendor=cloudVendor;
		return "Cloud Vender is updated Successfully";
	}
	
	@DeleteMapping("{venderId}")
	public String deleteCloudVendorDetails(String venderId) {
		
		this.cloudVendor=null;
		return "Cloud Vender is deleted Successfully";
	}

}
