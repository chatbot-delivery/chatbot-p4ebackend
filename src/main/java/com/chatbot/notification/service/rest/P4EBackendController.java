package com.chatbot.notification.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.notification.service.NotificationService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-01T22:33:25.097Z[GMT]")
@RestController
public class P4EBackendController {

	@Autowired
	NotificationService notificationService;

	@RequestMapping(value = "/fdmi/delivery", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<String> sendFDMIDeliveryMessage(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "userId", required = true) String userId) {
		System.out.println("UserId: " + userId);
		return new ResponseEntity<String>(notificationService.sendWhtsAppNotification(userId, "fdmi_delivery_notification_template"), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/taxandduties/delivery", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<String> sendTaxAndDutiesDeliveryMessage(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "userId", required = true) String userId) {
		System.out.println("UserId: " + userId);
		return new ResponseEntity<String>(notificationService.sendWhtsAppNotification(userId, "taxandduties_delivery_notification_template"), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/v1/deliverydates", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<String>> getAlternateDeliveryDates(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "trackingId", required = true) String trackingId,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "language", required = true) String language) {
		
		List<String> alternateDeliveryDates = new ArrayList<String>();
		if (language.equals("en-US")) {
			alternateDeliveryDates.add("27-Oct-2022");
			alternateDeliveryDates.add("28-Oct-2022");
			alternateDeliveryDates.add("29-Oct-2022");
		}else if (language.equals("nl-NL")) {
			alternateDeliveryDates.add("27-Okt-2022");
			alternateDeliveryDates.add("28-Okt-2022");
			alternateDeliveryDates.add("29-Okt-2022");
		}else if (language.equals("zh-CN")) {
			alternateDeliveryDates.add("2022 年 10 月 27 日");
			alternateDeliveryDates.add("2022 年 10 月 28 日");
			alternateDeliveryDates.add("2022 年 10 月 29 日");
		}else if (language.equals("ar")) {
			alternateDeliveryDates.add("27 أكتوبر 2022");
			alternateDeliveryDates.add("28 أكتوبر 2022");
			alternateDeliveryDates.add("29 أكتوبر 2022");
		}else {
			alternateDeliveryDates.add("27-Oct-2022");
			alternateDeliveryDates.add("28-Oct-2022");
			alternateDeliveryDates.add("29-Oct-2022");
		}
		
		return new ResponseEntity<List<String>>(alternateDeliveryDates, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/v1/pickuppoints", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<String>> getPickupPoints(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "trackingId", required = true) String trackingId,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "language", required = true) String language) {
		
		List<String> pickupPoints = new ArrayList<String>();
		pickupPoints.add("Jumbo");
		pickupPoints.add("Albert Heijn");
		pickupPoints.add("Van Haaren");
		
		return new ResponseEntity<List<String>>(pickupPoints, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/v1/alternateDeliveryAddresses", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<String>> getAlternateDeliveryAddresses(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "trackingId", required = true) String trackingId,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "language", required = true) String language) {
		
		List<String> deliveryAddresses = new ArrayList<String>();
		deliveryAddresses.add("Amsterdam");
		deliveryAddresses.add("Hoofdoorp");
		deliveryAddresses.add("Rotterdam");
		
		return new ResponseEntity<List<String>>(deliveryAddresses, HttpStatus.OK);
	}

}
