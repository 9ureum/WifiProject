package kr.ac.kopo.ctc.kopo02.domain;

public class WifiItem {

	private String id;
	private String installationLocationName;
	private String installationLocationDetails;
	private String installationCityName;
	private String installationDistrictName;
	private String installationFacilityType;
	private String serviceProviderName;
	private String wifiSsid;
	private String dateOfInstallation;
	private String roadNameAddress;
	private String lotNumberaddress;
	private String managementAgencyName;
	private String managementAgencyPhoneNumber;
	private String latitude;
	private String longitude;
	private String created;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInstallationLocationName() {
		return installationLocationName;
	}
	public void setInstallationLocationName(String installationLocationName) {
		this.installationLocationName = installationLocationName;
	}
	public String getInstallationCityName() {
		return installationCityName;
	}
	public String getInstallationLocationDetails() {
		return installationLocationDetails;
	}
	public void setInstallationLocationDetails(String installationLocationDetails) {
		this.installationLocationDetails = installationLocationDetails;
	}
	public void setInstallationCityName(String installationCityName) {
		this.installationCityName = installationCityName;
	}
	public String getInstallationDistrictName() {
		return installationDistrictName;
	}
	public void setInstallationDistrictName(String installationDistrictName) {
		this.installationDistrictName = installationDistrictName;
	}
	public String getInstallationFacilityType() {
		return installationFacilityType;
	}
	public void setInstallationFacilityType(String installationFacilityType) {
		this.installationFacilityType = installationFacilityType;
	}
	public String getServiceProviderName() {
		return serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}
	public String getWifiSsid() {
		return wifiSsid;
	}
	public void setWifiSsid(String wifiSsid) {
		this.wifiSsid = wifiSsid;
	}
	public String getDateOfInstallation() {
		return dateOfInstallation;
	}
	public void setDateOfInstallation(String dateOfInstallation) {
		this.dateOfInstallation = dateOfInstallation;
	}
	public String getRoadNameAddress() {
		return roadNameAddress;
	}
	public void setRoadNameAddress(String roadNameAddress) {
		this.roadNameAddress = roadNameAddress;
	}
	public String getLotNumberaddress() {
		return lotNumberaddress;
	}
	public void setLotNumberaddress(String lotNumberaddress) {
		this.lotNumberaddress = lotNumberaddress;
	}
	public String getManagementAgencyName() {
		return managementAgencyName;
	}
	public void setManagementAgencyName(String managementAgencyName) {
		this.managementAgencyName = managementAgencyName;
	}
	public String getManagementAgencyPhoneNumber() {
		return managementAgencyPhoneNumber;
	}
	public void setManagementAgencyPhoneNumber(String managementAgencyPhoneNumber) {
		this.managementAgencyPhoneNumber = managementAgencyPhoneNumber;
	}
	public String getLatitude() {
		return latitude;
	}
	public double getLatitudeToDouble() {
		return Double.parseDouble(latitude);
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public double getLongitudeToDouble() {
		return Double.parseDouble(longitude);
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

}
