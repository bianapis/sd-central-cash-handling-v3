/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CentralCashHandlingApiService {

	SDCentralCashHandlingActivateOutputModel activate(SDCentralCashHandlingActivateInputModel request);
	
	BQProjectionandAllocationCaptureOutputModel captureProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationCaptureInputModel request);
	
	BQTrackingandAllocationCaptureOutputModel captureTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationCaptureInputModel request);
	
	CRCentralCashAllocationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCentralCashAllocationCaptureInputModel request);
	
	SDCentralCashHandlingConfigureOutputModel configure(String sdReferenceId, SDCentralCashHandlingConfigureInputModel request);
	
	BQProjectionandAllocationControlOutputModel controlProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationControlInputModel request);
	
	BQTrackingandAllocationControlOutputModel controlTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationControlInputModel request);
	
	CRCentralCashAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCentralCashAllocationControlInputModel request);
	
	BQProjectionandAllocationExchangeOutputModel exchangeProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationExchangeInputModel request);
	
	BQTrackingandAllocationExchangeOutputModel exchangeTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationExchangeInputModel request);
	
	CRCentralCashAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCentralCashAllocationExchangeInputModel request);
	
	SDCentralCashHandlingFeedbackOutputModel feedback(String sdReferenceId, SDCentralCashHandlingFeedbackInputModel request);
	
	CRCentralCashAllocationInitiateOutputModel initiate(String sdReferenceId, CRCentralCashAllocationInitiateInputModel request);
	
	BQProjectionandAllocationInitiateOutputModel initiateProjectionandallocation(String sdReferenceId, String crReferenceId, BQProjectionandAllocationInitiateInputModel request);
	
	BQTrackingandAllocationInitiateOutputModel initiateTrackingandallocation(String sdReferenceId, String crReferenceId, BQTrackingandAllocationInitiateInputModel request);
	
	BQProjectionandAllocationRetrieveOutputModel retrieveProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTrackingandAllocationRetrieveOutputModel retrieveTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCentralCashAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCentralCashHandlingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCentralCashAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCentralCashAllocationUpdateInputModel request);
	
	BQProjectionandAllocationUpdateOutputModel updateProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationUpdateInputModel request);
	
	BQTrackingandAllocationUpdateOutputModel updateTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationUpdateInputModel request);
	
}
