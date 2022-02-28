package com.example.users.integration.api;

import com.example.users.integration.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "addressApi", url = "${api.address.url}")
public interface AddressApi {

    @GetMapping("/{cep}/json")
    AddressResponse findByCep(@PathVariable  String cep);
}
