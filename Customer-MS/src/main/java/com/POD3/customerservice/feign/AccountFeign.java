package com.POD3.customerservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.POD3.customerservice.model.Account;
import com.POD3.customerservice.model.AccountCreationStatus;

@FeignClient(name = "account-ms", url = "${feign.url-account-service}")
public interface AccountFeign {

	@PostMapping("/createAccount/{customerId}")
	public AccountCreationStatus createAccount(@RequestHeader("Authorization") String token,
			@PathVariable String customerId, @RequestBody Account account);

	@GetMapping("/getAccounts/{customerId}")
	public List<Account> getCustomerAccount(@RequestHeader("Authorization") String token,
			@PathVariable String customerId);

}
