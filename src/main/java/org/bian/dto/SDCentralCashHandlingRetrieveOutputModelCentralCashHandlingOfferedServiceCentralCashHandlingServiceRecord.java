package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecordCentralCashHandlingServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecord
 */
public class SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecord   {
  private String centralCashHandlingServiceType = null;

  private String centralCashHandlingServiceVersion = null;

  private String centralCashHandlingServiceDescription = null;

  private SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecordCentralCashHandlingServicePoliciesandGuidelines centralCashHandlingServicePoliciesandGuidelines = null;

  private String centralCashHandlingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return centralCashHandlingServiceType
  **/

  public String getCentralCashHandlingServiceType() {
    return centralCashHandlingServiceType;
  }

  public void setCentralCashHandlingServiceType(String centralCashHandlingServiceType) {
    this.centralCashHandlingServiceType = centralCashHandlingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return centralCashHandlingServiceVersion
  **/

  public String getCentralCashHandlingServiceVersion() {
    return centralCashHandlingServiceVersion;
  }

  public void setCentralCashHandlingServiceVersion(String centralCashHandlingServiceVersion) {
    this.centralCashHandlingServiceVersion = centralCashHandlingServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return centralCashHandlingServiceDescription
  **/

  public String getCentralCashHandlingServiceDescription() {
    return centralCashHandlingServiceDescription;
  }

  public void setCentralCashHandlingServiceDescription(String centralCashHandlingServiceDescription) {
    this.centralCashHandlingServiceDescription = centralCashHandlingServiceDescription;
  }


  /**
   * Get centralCashHandlingServicePoliciesandGuidelines
   * @return centralCashHandlingServicePoliciesandGuidelines
  **/

  public SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecordCentralCashHandlingServicePoliciesandGuidelines getCentralCashHandlingServicePoliciesandGuidelines() {
    return centralCashHandlingServicePoliciesandGuidelines;
  }

  public void setCentralCashHandlingServicePoliciesandGuidelines(SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecordCentralCashHandlingServicePoliciesandGuidelines centralCashHandlingServicePoliciesandGuidelines) {
    this.centralCashHandlingServicePoliciesandGuidelines = centralCashHandlingServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return centralCashHandlingServiceSchedule
  **/

  public String getCentralCashHandlingServiceSchedule() {
    return centralCashHandlingServiceSchedule;
  }

  public void setCentralCashHandlingServiceSchedule(String centralCashHandlingServiceSchedule) {
    this.centralCashHandlingServiceSchedule = centralCashHandlingServiceSchedule;
  }


}

