package com.mendonca.photoapp.api.users.shared;

import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		
		switch (response.status()) {
		case 400: 
			
			return new ResponseStatusException( HttpStatus.valueOf(response.status()));
		
		case 404:
			if(methodKey.contains("getAlbums")) {
				return new ResponseStatusException( HttpStatus.valueOf(response.status()),"not found");
			}
			break;
			
		default:
			return null;
		}
		
        return null;
	}

}
