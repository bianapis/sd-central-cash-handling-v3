package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription
 */
public class SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription   {
  private String centralCashHandlingServiceSubscriberReference = null;

  private String centralCashHandlingServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return centralCashHandlingServiceSubscriberReference
  **/

  public String getCentralCashHandlingServiceSubscriberReference() {
    return centralCashHandlingServiceSubscriberReference;
  }

  public void setCentralCashHandlingServiceSubscriberReference(String centralCashHandlingServiceSubscriberReference) {
    this.centralCashHandlingServiceSubscriberReference = centralCashHandlingServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return centralCashHandlingServiceSubscriberAccessProfile
  **/

  public String getCentralCashHandlingServiceSubscriberAccessProfile() {
    return centralCashHandlingServiceSubscriberAccessProfile;
  }

  public void setCentralCashHandlingServiceSubscriberAccessProfile(String centralCashHandlingServiceSubscriberAccessProfile) {
    this.centralCashHandlingServiceSubscriberAccessProfile = centralCashHandlingServiceSubscriberAccessProfile;
  }


}

