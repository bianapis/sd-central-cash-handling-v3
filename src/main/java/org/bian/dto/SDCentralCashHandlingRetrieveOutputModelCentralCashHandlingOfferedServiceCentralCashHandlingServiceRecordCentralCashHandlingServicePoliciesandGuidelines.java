package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecordCentralCashHandlingServicePoliciesandGuidelines
 */
public class SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecordCentralCashHandlingServicePoliciesandGuidelines   {
  private String centralCashHandlingServiceEligibility = null;

  private String centralCashHandlingServiceIntendedUses = null;

  private String centralCashHandlingServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return centralCashHandlingServiceEligibility
  **/

  public String getCentralCashHandlingServiceEligibility() {
    return centralCashHandlingServiceEligibility;
  }

  public void setCentralCashHandlingServiceEligibility(String centralCashHandlingServiceEligibility) {
    this.centralCashHandlingServiceEligibility = centralCashHandlingServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return centralCashHandlingServiceIntendedUses
  **/

  public String getCentralCashHandlingServiceIntendedUses() {
    return centralCashHandlingServiceIntendedUses;
  }

  public void setCentralCashHandlingServiceIntendedUses(String centralCashHandlingServiceIntendedUses) {
    this.centralCashHandlingServiceIntendedUses = centralCashHandlingServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return centralCashHandlingServicePricingandTerms
  **/

  public String getCentralCashHandlingServicePricingandTerms() {
    return centralCashHandlingServicePricingandTerms;
  }

  public void setCentralCashHandlingServicePricingandTerms(String centralCashHandlingServicePricingandTerms) {
    this.centralCashHandlingServicePricingandTerms = centralCashHandlingServicePricingandTerms;
  }


}

