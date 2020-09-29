/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CentralCashHandlingApiServiceImpl implements CentralCashHandlingApiService {

	public SDCentralCashHandlingActivateOutputModel activate(SDCentralCashHandlingActivateInputModel request){
		return JsonReader.read("activate-SDCentralCashHandlingActivateOutputModel.json",new TypeReference<SDCentralCashHandlingActivateOutputModel>(){});
	}
	
	public BQProjectionandAllocationCaptureOutputModel captureProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationCaptureInputModel request){
		return JsonReader.read("capture-BQProjectionandAllocationCaptureOutputModel.json",new TypeReference<BQProjectionandAllocationCaptureOutputModel>(){});
	}
	
	public BQTrackingandAllocationCaptureOutputModel captureTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationCaptureInputModel request){
		return JsonReader.read("capture-BQTrackingandAllocationCaptureOutputModel.json",new TypeReference<BQTrackingandAllocationCaptureOutputModel>(){});
	}
	
	public CRCentralCashAllocationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCentralCashAllocationCaptureInputModel request){
		return JsonReader.read("capture-CRCentralCashAllocationCaptureOutputModel.json",new TypeReference<CRCentralCashAllocationCaptureOutputModel>(){});
	}
	
	public SDCentralCashHandlingConfigureOutputModel configure(String sdReferenceId, SDCentralCashHandlingConfigureInputModel request){
		return JsonReader.read("configure-SDCentralCashHandlingConfigureOutputModel.json",new TypeReference<SDCentralCashHandlingConfigureOutputModel>(){});
	}
	
	public BQProjectionandAllocationControlOutputModel controlProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationControlInputModel request){
		return JsonReader.read("control-BQProjectionandAllocationControlOutputModel.json",new TypeReference<BQProjectionandAllocationControlOutputModel>(){});
	}
	
	public BQTrackingandAllocationControlOutputModel controlTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationControlInputModel request){
		return JsonReader.read("control-BQTrackingandAllocationControlOutputModel.json",new TypeReference<BQTrackingandAllocationControlOutputModel>(){});
	}
	
	public CRCentralCashAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCentralCashAllocationControlInputModel request){
		return JsonReader.read("control-CRCentralCashAllocationControlOutputModel.json",new TypeReference<CRCentralCashAllocationControlOutputModel>(){});
	}
	
	public BQProjectionandAllocationExchangeOutputModel exchangeProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationExchangeInputModel request){
		return JsonReader.read("exchange-BQProjectionandAllocationExchangeOutputModel.json",new TypeReference<BQProjectionandAllocationExchangeOutputModel>(){});
	}
	
	public BQTrackingandAllocationExchangeOutputModel exchangeTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationExchangeInputModel request){
		return JsonReader.read("exchange-BQTrackingandAllocationExchangeOutputModel.json",new TypeReference<BQTrackingandAllocationExchangeOutputModel>(){});
	}
	
	public CRCentralCashAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCentralCashAllocationExchangeInputModel request){
		return JsonReader.read("exchange-CRCentralCashAllocationExchangeOutputModel.json",new TypeReference<CRCentralCashAllocationExchangeOutputModel>(){});
	}
	
	public SDCentralCashHandlingFeedbackOutputModel feedback(String sdReferenceId, SDCentralCashHandlingFeedbackInputModel request){
		return JsonReader.read("feedback-SDCentralCashHandlingFeedbackOutputModel.json",new TypeReference<SDCentralCashHandlingFeedbackOutputModel>(){});
	}
	
	public CRCentralCashAllocationInitiateOutputModel initiate(String sdReferenceId, CRCentralCashAllocationInitiateInputModel request){
		return JsonReader.read("initiate-CRCentralCashAllocationInitiateOutputModel.json",new TypeReference<CRCentralCashAllocationInitiateOutputModel>(){});
	}
	
	public BQProjectionandAllocationInitiateOutputModel initiateProjectionandallocation(String sdReferenceId, String crReferenceId, BQProjectionandAllocationInitiateInputModel request){
		return JsonReader.read("initiate-BQProjectionandAllocationInitiateOutputModel.json",new TypeReference<BQProjectionandAllocationInitiateOutputModel>(){});
	}
	
	public BQTrackingandAllocationInitiateOutputModel initiateTrackingandallocation(String sdReferenceId, String crReferenceId, BQTrackingandAllocationInitiateInputModel request){
		return JsonReader.read("initiate-BQTrackingandAllocationInitiateOutputModel.json",new TypeReference<BQTrackingandAllocationInitiateOutputModel>(){});
	}
	
	public BQProjectionandAllocationRetrieveOutputModel retrieveProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProjectionandAllocationRetrieveOutputModel.json",new TypeReference<BQProjectionandAllocationRetrieveOutputModel>(){});
	}
	
	public BQTrackingandAllocationRetrieveOutputModel retrieveTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTrackingandAllocationRetrieveOutputModel.json",new TypeReference<BQTrackingandAllocationRetrieveOutputModel>(){});
	}
	
	public CRCentralCashAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCentralCashAllocationRetrieveOutputModel.json",new TypeReference<CRCentralCashAllocationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCentralCashHandlingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCentralCashHandlingRetrieveOutputModel.json",new TypeReference<SDCentralCashHandlingRetrieveOutputModel>(){});
	}
	
	public CRCentralCashAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCentralCashAllocationUpdateInputModel request){
		return JsonReader.read("update-CRCentralCashAllocationUpdateOutputModel.json",new TypeReference<CRCentralCashAllocationUpdateOutputModel>(){});
	}
	
	public BQProjectionandAllocationUpdateOutputModel updateProjectionandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProjectionandAllocationUpdateInputModel request){
		return JsonReader.read("update-BQProjectionandAllocationUpdateOutputModel.json",new TypeReference<BQProjectionandAllocationUpdateOutputModel>(){});
	}
	
	public BQTrackingandAllocationUpdateOutputModel updateTrackingandallocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandAllocationUpdateInputModel request){
		return JsonReader.read("update-BQTrackingandAllocationUpdateOutputModel.json",new TypeReference<BQTrackingandAllocationUpdateOutputModel>(){});
	}
	
}
