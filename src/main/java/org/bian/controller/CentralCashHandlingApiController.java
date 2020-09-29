/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class CentralCashHandlingApiController {

	@Autowired
	CentralCashHandlingApiService service;
	
	@Allocate.Activate
	public BianResponse<SDCentralCashHandlingActivateOutputModel> activate(@RequestBody BianRequest<SDCentralCashHandlingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("projectionandallocation")
	@Allocate.Capture
	public BianResponse<BQProjectionandAllocationCaptureOutputModel> captureProjectionandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProjectionandAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProjectionandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("trackingandallocation")
	@Allocate.Capture
	public BianResponse<BQTrackingandAllocationCaptureOutputModel> captureTrackingandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTrackingandAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTrackingandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Capture
	public BianResponse<CRCentralCashAllocationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCentralCashAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Configure
	public BianResponse<SDCentralCashHandlingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCentralCashHandlingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("projectionandallocation")
	@Allocate.Control
	public BianResponse<BQProjectionandAllocationControlOutputModel> controlProjectionandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProjectionandAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlProjectionandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("trackingandallocation")
	@Allocate.Control
	public BianResponse<BQTrackingandAllocationControlOutputModel> controlTrackingandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTrackingandAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlTrackingandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Control
	public BianResponse<CRCentralCashAllocationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCentralCashAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("projectionandallocation")
	@Allocate.Exchange
	public BianResponse<BQProjectionandAllocationExchangeOutputModel> exchangeProjectionandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProjectionandAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProjectionandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("trackingandallocation")
	@Allocate.Exchange
	public BianResponse<BQTrackingandAllocationExchangeOutputModel> exchangeTrackingandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTrackingandAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTrackingandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Exchange
	public BianResponse<CRCentralCashAllocationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCentralCashAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Feedback
	public BianResponse<SDCentralCashHandlingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCentralCashHandlingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Initiate
	public BianResponse<CRCentralCashAllocationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCentralCashAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("projectionandallocation")
	@Allocate.Initiate
	public BianResponse<BQProjectionandAllocationInitiateOutputModel> initiateProjectionandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProjectionandAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProjectionandallocation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("trackingandallocation")
	@Allocate.Initiate
	public BianResponse<BQTrackingandAllocationInitiateOutputModel> initiateTrackingandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTrackingandAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTrackingandallocation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("projectionandallocation")
	@Allocate.Retrieve
	public BianResponse<BQProjectionandAllocationRetrieveOutputModel> retrieveProjectionandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProjectionandallocation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("trackingandallocation")
	@Allocate.Retrieve
	public BianResponse<BQTrackingandAllocationRetrieveOutputModel> retrieveTrackingandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTrackingandallocation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Allocate.Retrieve
	public BianResponse<CRCentralCashAllocationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Allocate.RetrieveSD
	public BianResponse<SDCentralCashHandlingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Allocate.Update
	public BianResponse<CRCentralCashAllocationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCentralCashAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("projectionandallocation")
	@Allocate.Update
	public BianResponse<BQProjectionandAllocationUpdateOutputModel> updateProjectionandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProjectionandAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProjectionandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("trackingandallocation")
	@Allocate.Update
	public BianResponse<BQTrackingandAllocationUpdateOutputModel> updateTrackingandallocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTrackingandAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTrackingandallocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
