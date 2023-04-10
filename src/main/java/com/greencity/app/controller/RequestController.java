package com.greencity.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greencity.app.dto.CommonResponse;
import com.greencity.app.dto.PickupRequestDetailsResponse;
import com.greencity.app.dto.PickupRequestRequest;
import com.greencity.app.dto.PickupRequestStatusUpdateRequest;
import com.greencity.app.dto.PickupRequestSummaryResponse;
import com.greencity.app.dto.SummaryListRequest;
import com.greencity.app.service.RequestService;

@RestController
@RequestMapping("/api/pickup")
public class RequestController {
	
	private RequestService requestService;
	
	@PostMapping("/newRequest/")
	public ResponseEntity<CommonResponse<String>> createRequest(
			@RequestBody PickupRequestRequest pickupRequestRequest) {
		return new ResponseEntity<>(requestService.createRequest(pickupRequestRequest), HttpStatus.OK);
	}
	
	@PostMapping("/summaryList")
	public ResponseEntity<CommonResponse<List<PickupRequestSummaryResponse>>> getSummaryRequestList(
			@RequestBody SummaryListRequest summaryListRequest) {
		return new ResponseEntity<>(requestService.getSummaryRequestList(summaryListRequest), HttpStatus.OK);
	}
	
	@GetMapping("/request/{requestId}")
	public ResponseEntity<CommonResponse<PickupRequestDetailsResponse>> getPickupRequestDetails(
			@PathVariable int requestId) {
		return new ResponseEntity<>(requestService.getPickupRequestDetails(requestId), HttpStatus.OK);
	}

	@PutMapping("/request/statusUpdate")
	public ResponseEntity<CommonResponse<String>> updatePickupRequestStatus(
			@RequestBody PickupRequestStatusUpdateRequest pickupRequestUpdateRequest) {
		return new ResponseEntity<>(requestService.updatePickupRequestStatus(pickupRequestUpdateRequest), HttpStatus.OK);
	}
	
}

